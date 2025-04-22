import java.util.*;
public class Solution{
    public static int Fixedpoint(int arr[],int left,int right){
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(arr[mid]==mid){
            // return mid;
            int res = Fixedpoint(arr,left,mid-1);
            if(res==-1){
                return mid;
            }
            else{
                return res;
            }
        }
        if(arr[mid] > mid){
            return Fixedpoint(arr,left,mid-1);
        }
        return Fixedpoint(arr,mid+1,right);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Fixedpoint(arr,0,len-1));
        sc.close();
    }
}