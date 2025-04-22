import java.util.*;
public class ConatinerWithMoreWater {
    public static void main(String args[]){
        Integer arr[] = {1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(BruteForce(list));
        System.out.println(Optimal(list));
    }

    static int BruteForce(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.size();i++){
            for(int j = i+1;j<arr.size();j++){
                int temp = (j-i)*Math.min(arr.get(i),arr.get(j));
                max = Math.max(max,temp);
            }
        }
        return max;
    }

    // two pointer approach
    static int Optimal(ArrayList<Integer> arr){
        int left = 0;
        int right = arr.size()-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int temp = (right-left)*Math.min(arr.get(left),arr.get(right));
            max = Math.max(temp,max);
            if(arr.get(left)<arr.get(right)){
                left++;
            }
            else{
                right--;
            } 
        }
        return max;
    }
}
