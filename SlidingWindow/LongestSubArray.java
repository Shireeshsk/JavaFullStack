// variable window type problem 
// longest subarray where sum<=num
import java.util.*;
public class LongestSubArray {
    public static void main(String args[]){
        int arr[] = {2,5,1,10,10};
        int num = 14;
        System.out.println(bruteforce(arr, num));
        System.out.println(BetterslidingWindow(arr, num));
    }

    // tc O(n)
    public static List<Integer> bruteforce(int arr[], int num ){
        List<Integer> res = new ArrayList<>();
        int maxlen = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                List<Integer> temp = new ArrayList<>();
                for(int k = i;k<=j;k++){
                    sum += arr[k];
                    temp.add(arr[k]);
                }
                if(sum<=num && temp.size()>=maxlen){
                    maxlen = temp.size();
                    res = new ArrayList<>(temp);
                }
            }
        }
        return res;
    }

    // tc O(2N) => O(N)
    public static int BetterslidingWindow(int arr[],int num){
        int l = 0,sum=0,maxlen = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            while(sum>num){
                sum -= arr[l];
                l++;
            }
            maxlen = Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }

    //tc O(N)
    public static int Optimal(int arr[],int num){
        int l = 0,sum=0,maxlen = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            if(sum>num){
                sum -= arr[l];
                l++;
            }
            maxlen = Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
