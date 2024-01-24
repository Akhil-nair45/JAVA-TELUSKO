package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) { //also u can use collection here as collection is extended by set and list and queue, so we can write collection instead of them
          Set<Integer> nums = new TreeSet<Integer>();   // here we have written treeset as we want the data in sorted format as we are not getting the data in sorted format in Hashset
        nums.add(53);
        nums.add(42);
        nums.add(32);
        nums.add(25);
        nums.add(75);
        nums.add(66);

        for(int n:nums)
        {
            System.out.println(n);
        }
    }
}
//here u can see that the output will be in sorted format

