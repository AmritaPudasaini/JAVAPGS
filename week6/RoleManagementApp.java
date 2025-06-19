enum Role {
    ADMIN,
    MODERATOR,
    USER,
    GUEST
}
class User {
    String username;
    Role role;
    User(String username, Role role) {
        this.username = username;
        this.role = role;
    }
    void checkPermissions() {
        switch (role) {
            case ADMIN:
                System.out.println(username + " has full access.");
                break;
            case MODERATOR:
                System.out.println(username + " can moderate content.");
                break;
            case USER:
                System.out.println(username + " can create and comment.");
                break;
            case GUEST:
                System.out.println(username + " can only view content.");
                break;
        }
    }
    boolean hasAccessTo(String feature) {
        if (role == Role.ADMIN) return true;
        if (feature.equals("moderation") && role == Role.MODERATOR) return true;
        if (feature.equals("create") && (role == Role.USER || role == Role.MODERATOR || role == Role.ADMIN)) return true;
        return feature.equals("view");
    }
}
public class RoleManagementApp {
    public static void main(String[] args) {
        User u1 = new User("Amrita", Role.ADMIN);
        User u2 = new User("Bikash", Role.USER);
        User u3 = new User("Rita", Role.GUEST);

        u1.checkPermissions();
        u2.checkPermissions();
        u3.checkPermissions();

        System.out.println("\nAccess Check:");
        System.out.println("Can Amrita access moderation? " + u1.hasAccessTo("moderation"));
        System.out.println("Can Rita access create? " + u3.hasAccessTo("create"));
    }
}
