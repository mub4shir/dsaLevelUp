package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={10,5,2,0,7,6,4};
        int n=arr.length;
        quickSort(arr,0,n-1);

        for (int x:arr) {
            System.out.print(x+" ");
        }
    }

    private static void quickSort(int[] arr, int s, int e) {
        // base case
        if(s>=e) return;
        //rec case
        int p=partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }

    private static int partition(int[] arr, int s, int e) {

        int pivot=arr[e];
        int i=s-1;
        for (int j = s; j < e; j++) {
            if(arr[j]<pivot){
                i++;
                int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
            }
        }

        int tmp2 =arr[i+1];
            arr[i+1]=arr[e];
            arr[e]=tmp2;
        return i+1;
    }
}
