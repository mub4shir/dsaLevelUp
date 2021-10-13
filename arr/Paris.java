package arr;

import java.util.HashSet;
import java.util.Set;

public class Paris {
    public static void main(String[] args) {
        int[] arr={10,5,2,3,-6,9,11};
        int s=4;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(s-arr[i]))
                System.out.println(s-arr[i]+ " "+arr[i]);
            set.add(arr[i]);
        }
        

    }
}
