package arr;

import java.util.*;

public class Triplets {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,15};
        int t=18;
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=n-3;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int currSum=arr[i];
                currSum+=arr[j];
                currSum+=arr[k];
                if(currSum==t){
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    //System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                    //System.out.println();
                    j++;
                    k--;
                }else if(currSum>t){
                    k--;
                }else{
                    j++;
                }
            }

        }
        for (List list: res) {
            System.out.println(list);

        }




    }
}
