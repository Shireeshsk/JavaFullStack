import java.util.*;
public class PairSum {
    static boolean sum(ArrayList<Integer> arr, int target){
        int left = 0;
        int right = arr.size() -1;
        while(left<right){
            int temp = (arr.get(left)+arr.get(right));
            if(temp==target){
                return true;
            }
            else if(temp>target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Integer arr[] = {1,2};
        int tar= 4;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(sum(list,tar));
    }
}
