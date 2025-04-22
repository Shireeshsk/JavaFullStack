public class Strings {
    public static String substring(String str,int si, int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr +=str.charAt(i);
        }
        return substr;

    }
    
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
//         char arr[] = {'a','b','c','d'};
//         String str = "abcd";
//         String str1 = new String("xyz");

//         // strings are immutable

//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter your name :");
//         String name = sc.nextLine();
//         System.out.println(name);
//         System.out.println(name.length());

//         //concatenation
//         String firstname = "shireesh ";
//         String lastname = "kumar";
//         String fullname = firstname + lastname;
//         System.out.println(fullname);
//         System.out.println(fullname.charAt(5));

//         //equals

//         String s1 = "sunny";
//         String s2 = "sunny";
//         String s3 = new String("sunny");
//         String s4 = new String("sunny");
//         if(s1 == s2){
//             System.out.println("both are equal");
//         }
//         else{
//             System.out.println("not equal");
//         }

//         if(s1 == s3){
//             System.out.println("both are equal");
//         }
//         else{
//             System.out.println("not equal");
//         }

//         if(s4 == s3){
//             System.out.println("both are equal");
//         }
//         else{
//             System.out.println("not equal");
//         }

//         System.out.println(s1.equals(s2));
//         System.out.println(s1.equals(s3));
//         System.out.println(s4.equals(s3));

//         //substring

//         String sk = "HelloWorld";
//         System.out.println(sk.substring(0,5));
//         System.out.println(substring(sk, 0, 5));

        // //string compare

        // String fruits[] = {"apple","mango","banana"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //    if(largest.compareTo(fruits[i]) < 0){
        //     largest = fruits[i];
        //    }
        // }
        // System.out.println(largest);

        //uppercase and append

        String stat = "hi, i am shireesh";
        System.out.println(touppercase(stat));

    }
}
