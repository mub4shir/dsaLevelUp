package binarysearch;

public class R2 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int key =2;
        System.out.println(rotatedSearch(arr,key));
    }
    private static int rotatedSearch(int[] arr, int key){
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==key) return m;
            if(arr[s]<=arr[m]){
                if(key>=arr[s] && key<=arr[m]){
                    e=m-1;
                }else {
                    s=m+1;
                }
            }else{
                if(key>=arr[m]&&key<=arr[e]){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
}
