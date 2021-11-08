package binarysearch;

public class BS {
    public static void main(String[] args) {
        int[] arr= {1,2,10,11,19,28,29};
        int key =19;
        System.out.println(binarySearch(arr,key));
    }

    private static int binarySearch(int[] arr, int key) {
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==key) return m;
            if(key<arr[m]) h=m-1;
            else l=m+1;
        }
        return -1;
    }

}
