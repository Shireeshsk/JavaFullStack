import java.io.*;
public class Basic1{
    public static void main(String args[]){
        File file = new File("C:/Users/dell/OneDrive/Desktop/JAVA/9.File_Handling/Secret_message");
        if(file.exists()){
            System.out.println("file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else{
            System.out.println("file does not exists");
        }

    }
}