import java.lang.String;

class Student
{
    int id;
    demo name;
    int marks;
}

public class Array {
    
    public static void main(demo[] args) {
        
        //here we will create an object of student class and use it to store the value
        //but we r creating multiple so we have to create multiple objects so we r taking refernce variable and calling the object and storing the value

        Student s1= new Student();
        s1.id=1;
        s1.name="ABC";
        s1.marks=77;


        Student s2= new Student();
        s2.id=2;
        s2.name="XYZ";
        s2.marks=88;


        Student s3= new Student();
        s3.id=3;
        s3.name="PQR";
        s3.marks=99;


        Student s4= new Student();
        s4.id=4;
        s4.name="EFG";
        s4.marks=55;


        Student s5 = new Student();
        s5.id=5;
        s5.name="LMN";
        s5.marks=66;


        Student s6= new Student();
        s6.id=6;
        s6.name="STU";
        s6.marks=44;


        //here we cant just sysout and call the s1
        // System.out.println(s1);
        //the above will give some weird output

        // so if we want to then
        // System.out.println(s1.name +" :" + s1.marks);
        //the above will give the output but what if we want multiple outputs

        // so now we have creataed a objext fir multiple students but now we have to create a array to assign it manually
        Student students[]= new  Student[6];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        students[4]=s5;
        students[5]=s6;


        //this is the normal for loop method we have also used enhanced for loop method
        for(int i =0; i<students.length;i++)
        {
            //here we cant just give the refernece variable like s1 i have given here, we have to give the main refernce variable object as shown below
            // System.out.println(s1.name + " " + s1.marks);

            //here we have used the array object refernce variable and [i] is taken bcoz of for loop ad we have taken i her
            System.out.println(students[i].name + " " + students[i].marks);
        }


        //either of both the method we can use the above one is normal for loop method and the below one is enhanced for loop method

        //or we have another method which we have done below too
        for(Student n: students) //here we have tooked student as we r taking the object from student array not from int , what the return type u have to write that only if student write student and if int write int only
        {
            System.out.println(n.name+ " "+ n.marks);
        }




        int num[]= new int[4];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;


        //this is we r printing with normal for loop method,but what is we need to do it more better easy and enhanced way,see next method
        // for(int i=0; i<num.length;i++)
        // {
        //     System.out.println(num[i]);
        // }



        //u can either above method or below method, above one is normal method and the below one is enhanced method




        //the next method enhanced for loop method
        //this type of loop is also known as for each loop in other languages so we call it for each loop but in java it is known only as enhanced for loop
        for(int n: num)
        {
            System.out.println(n);
        }
//this method we can do for students too we have donme it please see above



    }
}
