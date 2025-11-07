package launchStatic;

import java.sql.Struct;
import java.util.logging.XMLFormatter;

///  this is the staic part 1
class Student{
    int id;
    String name;

     int count; // INSATANCE variables cant be the static
    /// we cant acces the instance variables in the static block

    static String city;
    {
        System.out.println("this is the java intialization block");
       // count++; // it excutes bfore the constructor
        // we can excute the common if we using the muiltiple constructors then we can use
        // block it can be count ++ in every object creatiom
        //SECNARIO
        // IF WE HAVE THE 100 CONSTRUCTORS WE DONT WANT TO INTIALIZE THE 100 TIMES IN EVERY CONSTRUCTORE
        ///  WE CAN USE THE JAVA INTILALIZER ALSO IN THAT WE CAN USE THE COUNT

    }
    Student(){
        System.out.println("Default construcotr");
    }
    Student(int id,String name){
        this.id=id;
        this.name = name;
//        count++;
        ///  in this case we used the only this constrcuotr count
        ///  if we use dont use the count in the second cotnrcuor then the count can t be increased

        ///  if we intiliaze then we have to use the java INTILAZIER to implemnt the count
        ///  hiw many objects we created OUTSIDE THE STACK AND THE MEMORY AREA INSIDE THE HEAP
    }
    Student(String name){
        this.name = name;
    }
    static {
        System.out.println("this is the Static block");

    }
//    static int counts(){
//        return count++;
//    }
    void display(){
        disp("city");
        System.out.println("id : " + id);
        System.out.println("name :" + name);
    }
    static void disp(String city){
        System.out.println("this is the banglore");
    }
}
public class Staticdemo {
    public static void main(String[] args) {
        Student.disp("city");
        Student st = new Student(1,"akki");
//        st.display();
        System.out.println("count is : "+ st.count);
        Student st1 = new Student(2,"sai");
        System.out.println("count is : "+ st1.count);
//        st1.display();
        //System.out.println(Student.counts());
        Student st3 = new Student(3,"Srikanth");
        System.out.println("count is : "+ st3.count);

        Student st2 = new Student("akki");
        System.out.println(st2.count);

    }
}
