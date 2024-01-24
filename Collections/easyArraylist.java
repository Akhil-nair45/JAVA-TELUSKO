package Collections;

import java.lang.reflect.Array;
import java.util.List;

public class easyArraylist {
    public static void main(String[] args) {
        List<Integer> nums = Array.asList(1,2,4,5);
        System.out.println(nums);
        for(int i=0; i<nums.size();i++)
        {
            sout(nums.get(i));
        }
//both above and below will give output above is normal and below is enhanced for loop
        for(int n : nums)
        {
            sout(n);
        }

        //or u can use this method for each

        nums.forEach(n-> Sout(n)); //this will also give the same output as above two
    }
} 
