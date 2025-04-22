public class BinaryString {
    public static void printBinaryStrings(int n,int lastp,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1, 0, str+'0');
        if(lastp ==0){
            printBinaryStrings(n-1, 1, str+'1');
        }
    }
    public static void main(String args[]){
        printBinaryStrings(3, 0,"");
    }
}
