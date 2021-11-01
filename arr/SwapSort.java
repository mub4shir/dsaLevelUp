package arr;

import java.util.ArrayList;
import java.util.List;

public class SwapSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,8,2,3,5,1};
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i] !=arr[arr[i]-1]){
                int tmp=arr[i];
                arr[arr[i]-1]=arr[i];
                arr[i]=tmp;

            }else{
                    i++;
            }
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        List<Integer> mis=new ArrayList<>();
        List<Integer> dup=new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if(arr[j]!=j+1) {
                mis.add(j + 1);
                dup.add(arr[j]);
            }
        }
        System.out.println(mis);
        System.out.println(dup);

    }
}
