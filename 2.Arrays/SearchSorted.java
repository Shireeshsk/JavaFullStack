public class SearchSorted {
    public static boolean Staircasesearch(int arr[][],int key){
        int col = 0,row = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                return true;
            }
            else if(key>arr[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int mat[][] ={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(Staircasesearch(mat,10));
    }
}
