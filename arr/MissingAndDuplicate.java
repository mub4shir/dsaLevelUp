package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingAndDuplicate {
    public static void main(String[] args) {
        int[] arr= {4, 1, 3, 4, 5};
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(Integer i :arr){
            if(map.get(i)==null)
                map.put(i,1);
            else
                System.out.println("Repeating = " + i);
        }
        for (int i = 1; i <=n ; i++) {
            if(map.get(i)==null)
                System.out.println("Missing = " + i);
        }

        boolean[] check= new boolean[n];

        int repeatingNum=-1;
        for(int i=0;i<n;i++){
            if(check[arr[i]-1]==true){
                repeatingNum=arr[i];
            }else{
                check[arr[i]-1]=true;
            }
        }
        int missing=-1;
        for (int i = 0; i < n; i++) {
            if(!check[i]){
                missing=i+1;
            }
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(repeatingNum);
        arrayList.add(missing);
        System.out.println(arrayList);
        for (boolean x: check) {
            System.out.print(x + " ");
        }
    }


}



