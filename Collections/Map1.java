package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();  //we can also use hashtable for synchronization, the same like thread

        students.put("navin",10);
        students.put("reddy",15);
        students.put("polly",16);
        students.put("dwayne",13);
        students.put("navin",55);  //here we can see that the value is updated but the key reamins the same because key us unique and value can be changed now the output will be navin=55

        System.out.println(students); //here also we are not getting the data in sequence
        System.out.println(students.get("reddy"));  //getting value from name
        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : "+students.get(key));
        }
    }
}
