package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparator1 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Intger>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(22);
        nums.add(44);
        nums.add(66);
        nums.add(88);
        nums.add(99);

        Collections.sort(nums, com;)
    }
}
