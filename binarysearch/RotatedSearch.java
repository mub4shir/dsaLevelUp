package binarysearch;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr={7,9,10,1,2,3,4,5,6};
        int element =4;
        int idx =minElement(arr);
        int res1=binarySearch(arr, 4,0,idx-1);
        int res2=binarySearch(arr,4,idx,arr.length-1);
        if(res1>=0) System.out.println(res1);
        System.out.println(res2);
    }

    private static int  minElement(int[] arr) {
        int n=arr.length;
        int s=0;
        int e=n-1;
        int pivot=-1;
        while(s<=e){
            if(arr[s]<=arr[e]) return s;
            int m = s+(e-s)/2;
            int next= (m+1) % n;
            int prev= (m-1+n)%n;
            if(arr[m]<arr[prev]&&arr[m]<arr[next]) pivot=m;
            if(arr[s]<=arr[m]) s=m+1;
            else if(arr[e]>=arr[m]) e=m-1;
        }
        return pivot;
    }
    private static int binarySearch(int[] arr, int key, int s, int e ){
        int n=arr.length;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==key) return m;
            else if(key>arr[m]) s=m+1;
            else e=m-1;
        }
        return -1;
    }
}

