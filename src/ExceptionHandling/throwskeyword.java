package ExceptionHandling;

/*
Thows -> means the providing the manual Exception
-> Throws doest contains any keyword
->throw new ExceptionType("message");
No next line executes in that method
Control immediately goes to the nearest catch block
If no catch block → JVM handles it → program stops
-- > try catch cant exists directly inside the class

 */

// thow inside the try

//class demo{
//    void show(){
//        try{
//            System.out.println("a");
//            throw new Exception();
//            System.out.println("in b"); // cant be exetues any more
//        }
//        catch (Exception e ) {
//            System.out.println("reinning");
//        }
//    }
//}

 ///  exception inside the catch using the throw
class demo{
    void show(){
        try{
            int a = 10/0;
        }
        catch (Exception e ){
            System.out.println("this is catch");
         //   throw new ArithmeticException();
            System.out.println("this is invalid exception");
        }
        finally {
            System.out.println("in a finally block");
            throw new RuntimeException();
//            System.out.println("in fiannly block");
        }
    }
}


public class throwskeyword {
    public static void main(String[] args) {

    }
}
