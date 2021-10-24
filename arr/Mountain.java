package arr;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
        int n=arr.length;
         int largest=0;
         for(int i=1;i<=n-2;){
             if(arr[i]> arr[i-1] && arr[i]>arr[i+1]){
                 // do some work
                 int cnt=1;
                 int j=i;
                 // cnt backwards (left)
                 while(j>=1 && arr[j]>arr[j-1]){
                     j--;
                     cnt++;
                 }
                 //cnt forward (right)
                 while(i<=n-2 && arr[i]>arr[i+1]){
                     i++;
                     cnt++;
                 }
                 largest=Math.max(largest,cnt);

             }else{
                 i++;
             }
         }
        System.out.println(largest);

    }
}
