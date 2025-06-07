public class JavaStringExample {
    public static void main(String[] args) {
        String name = "java";
        String name2 = "java";
        String text = new String("test");
        String text2 = new String("java");
        String newText = "this is java";  // Corrected from 'tgis is java'
        int number = 34;

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(newText.indexOf("is"));

        // concat
        String firstName = "Tom";
        String lastName = "Shah";
        System.out.println(firstName + " " + lastName);

        // comparison
        System.out.println(name == name2);      // true (string pool)
        System.out.println(text == text2);      // false (new keyword creates different objects)

        System.out.println(name.equals(name2)); // true
        String sentence = "this is java class";
        System.out.println(sentence.substring(4, 7)); // " is"
    }
}

