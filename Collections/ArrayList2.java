package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        
        List<Integer> nums= new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(6);

        System.out.println(nums.get(4));
        System.out.println(nums.indexOf(4)); // it will help us to identify the index of 4 in array
        for(int n:nums)
        {
            int num =(Integer)n;
            System.out.println(num*2);
        }
    }
}
