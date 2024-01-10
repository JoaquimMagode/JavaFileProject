import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            FileWriter myObj = new FileWriter("fileNamed.txt");
            myObj.write("Hello Guys I'm Writting now");
            myObj.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}