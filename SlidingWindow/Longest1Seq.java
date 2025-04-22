public class Longest1Seq {
    public static int Mysol(int arr[],int num){
        int count = 0,maxlen = 0;
        for(int r =0;r<arr.length;r++){
            if(arr[r]==1){
                count++;
                maxlen = Math.max(maxlen,count);
            }
            else {
                if(num>0){
                    count++;
                    num--;
                    maxlen = Math.max(maxlen,count);
                    continue;
                }
                count =0;
            }
        }
        return maxlen;
    }

    public static int correct(int arr[],int num){
        int z =0,maxlen =0,l =0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]==0){
                z++;
            }
            if(z>num){
                if(arr[l]==0){
                    z--;
                }
                l++;
            }
            if(z<=num){
                maxlen = Math.max(maxlen,r-l+1);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,0,0,0,1};
        int num = 3;
        System.out.println(Mysol(arr, num));
        System.out.println(correct(arr, num));
    }
}
