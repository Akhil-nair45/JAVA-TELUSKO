package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList1 {
  public static void main(String[] args) {
    Collection<Integer> nums = new ArrayList<Integer>();  //here we are using collection but if we want to fetch data bases on index value we can do it with the help of list 
    nums.add(5);
    nums.add(2);
    nums.add(4);
    nums.add(6);
    nums.add(7);
    nums.add(8);

    for(int n : nums)
    {
      int num =(Integer)n;
      System.out.println(num*2);
    }

  }
}