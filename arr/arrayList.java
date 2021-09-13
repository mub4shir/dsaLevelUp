package arr;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) throws Exception {
        //ArrayList<Integer> arr =new ArrayList<Integer>(Arrays.asList(1,2,10,12,15));
        int[][] arr={{1,2,3,},{4,5,6},{7,8,9,10},{11,12}};
        arr[0][0] +=10;
        for (int i = 0; i <arr.length ; i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
