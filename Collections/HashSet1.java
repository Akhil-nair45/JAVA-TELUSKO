package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();   // here we have written hashset because set is a class and hashset is the method, like in list we can use array list, but collection can use everything as it is the parent
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(6);

        for(int n:nums)
        {
            System.out.println(n);
        }
    }
}
//here it will return output in ascending format

