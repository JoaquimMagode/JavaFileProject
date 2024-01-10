import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

    File myObj = new File("filename.txt");
    if(myObj.exists()){
        System.out.println("File Name: "+myObj.getName());
        System.out.println("Path: "+myObj.getAbsolutePath());
        System.out.println("Writteble: "+myObj.canWrite());
        System.out.println("Readable: "+myObj.canRead());
        System.out.println("File size in bytes: "+myObj.length());
    }

      /*
        File myObj = new File("filename.pdf");
        try {
            if (myObj.createNewFile()){
                System.out.println("File Successfully Created");
            }else
            {
                System.out.println("File Already Exists");
                if (myObj.exists()){
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
*/
    }
}