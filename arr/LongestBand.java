package arr;

import java.util.HashSet;
import java.util.Set;

public class LongestBand {
    public static void main(String[] args) {
        int[] arr= {1,9,3,0,18,5,2,4,10,7,12,6};
        int n=arr.length;
        Set<Integer> s=new HashSet<>();
        for (int x: arr) s.add(x);
        //for(int x: s) System.out.print(x+" ");
        int largestLen=1;
        // iterate over the arr
        for(int element: s){
            int parent = element-1;
            if(!s.contains(parent)){
                // find entire band / chain starting from element
                int nextNo= element+1;
                int cnt=1;
                while(s.contains(nextNo)){
                    nextNo++;
                    cnt++;
                }
                if(cnt > largestLen) largestLen=cnt;
            }
        }
        System.out.println(largestLen);
    }
}
