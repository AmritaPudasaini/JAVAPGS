import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandlingExample{
    public static void main(String[] args) {
        try {
            File file=new File("test_new_file.txt");
            if (file.createNewFile()){
                System.out.println("file created:"+file.getName());
            }else{
            System.out.println("file already exist");
            }

            FileWriter fileWriter=new FileWriter("test_new_file.txt");
            fileWriter.write("this is java programming\n");
            fileWriter.write("this is java programming\n");
            fileWriter.write("this is java programming\n");
            fileWriter.close();

            File fileObj=new File("test_new_file.txt");
            Scanner scanner=new Scanner(fileObj);
            while (scanner.hasNextLine()){
                String value=scanner.nextLine();
                System.out.println(value);
            }
            scanner.close();

            // if(fileObj.delete()){
            //     System.out.println("file deleted:"+fileObj.getName());
            // }else{
            //     System.out.println("failed to delete");
            // }

        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
        }
    }
}