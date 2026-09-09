package Constructors;

class One{
    public One(){
      //  this(10);
        System.out.println("Default constructor");

    }

    // this is used to call the default constructor from parameterized constructor
    // this is used to call the anotheir construcotr of the same class 


    /*
    Super ---> Super is used to call the parent constructor
    which may extends the object class
     */
    public One(int a) {
        super();
        System.out.println("Parameterized constructor");
    }
    public One(int a, int b) {
        this(10);
        System.out.println("Parameterized constructor with two parameters");
    }
}
public class practice1 {
   public static void main(String[] args) {
     One one = new One(10,20);
   }

    
}
