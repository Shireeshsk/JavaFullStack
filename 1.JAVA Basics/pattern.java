import java.util.*;
public class pattern {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("SQUARE");
        for(int i = 0;i<4;i++){
            System.out.println("* * * *");
        }
        System.out.println();
        System.out.println();
        System.out.println("PYRAMID");
        for(int i = 1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("INVERTED HALF PYRAMID");
        for(int i = 1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("INVERTED HALF PYRAMID using numbers");
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int k = (int) 'A';
        System.out.println("INVERTED HALF PYRAMID using characters");
        for(int i = 1;i<=4;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)(k+j)+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("INVERTED HALF PYRAMID using characters");
        for(int i = 1;i<=4;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)(k)+" ");
                k++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("FLOYD'S Triangle pattern");
        int sk = 1;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(sk+" ");
                sk++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("INVERTED HALF-PYRAMID with Numbers pattern");
        for(int i = 0;i<5;i++){
            for(int j = 1;j<=5-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("HOLLOW RECTANGLE: ");
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("INVERTED AND ROTATED HALF PYRAMID : ");
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=4-i;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("0-1 TRIANGLE :");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1");
                }
                else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("BUTTERFLY :");
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=2*(4-i);j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 4;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=2*(4-i);j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("SOLID RHOMBUS :");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=(5-i);j++){
                System.out.print(" ");
            }
            System.out.print("* * * * *");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("HOLLOW RHOMBUS :");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            if(i==1 || i==5){
                System.out.print("* * * * *");
            }
            else{
                System.out.print("*       *");
            }
            System.out.println(); 
        }
        System.out.println();
        System.out.println();
        System.out.println("DIAMOND :");
        for(int i = 1;i<=4;i++){
            for(int j =1 ;j<=(4-i);j++){
                 System.out.print("  ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 4;i>=1;i--){
            for(int j =1 ;j<=(4-i);j++){
                 System.out.print("  ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}