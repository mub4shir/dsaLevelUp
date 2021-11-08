package binarysearch;

public class FrequencyCount {
    public static void main(String[] args) {
        int[]  arr={0,1,1,1,1,2,2,2,2,2,3,4,4,5,10};
        int key =2;
        int n=arr.length;
        int low =lowerBound(arr,n,key);
        int high =upperBound(arr,n,key);
        System.out.println(high-low+1);
    }

    private static int lowerBound(int[] arr, int n, int key) {
        int s=0;
        int e=n-1;
        int res=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==key){
                res=m;
                e=m-1;
            }
            else if(key>arr[m]) s=m+1;
            else e=m-1;
        }
    return res;
    }
    private static int upperBound(int[] arr, int n, int key) {
        int s=0;
        int e=n-1;
        int res=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==key){
                res=m;
                s=m+1;
            }
            else if(key>arr[m]) s=m+1;
            else e=m-1;
        }
        return res;
    }


}
