import java.io.*;
public class Basic2 {
    public static void main(String args[]){
        try{
            FileWriter fr = new FileWriter("sunny.txt");
            fr.write("my name is shireesh kumar \n uday is erripuk");
            fr.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
