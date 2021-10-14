package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={10,5,2,0,7,6,4};
        int s=0;
        int e=arr.length-1;
        mergeSort(arr,s,e);
        for (int x: arr) {
            System.out.print(x+" ");

        }
    }

    private static void mergeSort(int[] arr, int s, int e) {
        // base case
        if(s>=e) return;
        //rec case
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        megre(arr,s,e);
        return;

    }

    private static void megre(int[] arr, int s, int e) {
        int[] res=new int[arr.length];
        int i=s;
        int m=s+(e-s)/2;
        int j=m+1;
        int k=0;
        while(i<=m&&j<=e){
            if(arr[i]<arr[j])
                res[k++]=arr[i++];
            else
                res[k++]=arr[j++];
        }
        while(i<=m){
            res[k++]=arr[i++];
        }
        while(j<=e){
            res[k++]=arr[i++];
        }
        int l=0;
        for(int idx=s;idx<=e;idx++ ){
            arr[idx]=res[l++];
        }
        return;
    }

}
