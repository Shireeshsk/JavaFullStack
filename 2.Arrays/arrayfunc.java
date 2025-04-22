public class arrayfunc {
    public static void update(int marks[],int nonchangable){
        nonchangable = 10;
        for(int i = 0;i<marks.length;i++){
            marks[i] += 1;
     
        }
    }
    public static void main(String args[]){
        int marks [] = {97,98,99};
        int nonchangable=5;
        update(marks,nonchangable);
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println(nonchangable);
    }
    
}
