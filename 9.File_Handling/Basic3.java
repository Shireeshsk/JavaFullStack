import java.io.*;
public class Basic3 {
    public static void main(String args[]){
        try{
            FileReader fr = new FileReader("sunny.txt");
            int data = fr.read();
            while(data != -1){
                System.out.print((char)data);
                data = fr.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
