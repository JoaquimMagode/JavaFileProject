import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        File myObj = new File("filename.txt");
        try {
            if (myObj.createNewFile()){
                System.out.println("File Successfully Created");
            }else
            {
                System.out.println("File Already Exists");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}