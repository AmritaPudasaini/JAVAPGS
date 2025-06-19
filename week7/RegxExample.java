import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxExample{
    public static void main(String[] args) {
        String text="this is java";
        Pattern pattern=Pattern.compile("java");
        Matcher match=pattern.matcher(text);

        if(match.find()){
            System.out.println("matched");
        }else{
            System.out.println("not found");
        }

    }
}