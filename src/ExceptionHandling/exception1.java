package ExceptionHandling;

/*
 Excepion hadling main topic
 -> we can use many catch blocks but try block shoukd be must
 -> after the exception occured the after that line in the try block not get executed
 -> we can give the exception 1 st last give the parent heiracy Exception that only valid if we give muiltiple exceptions
 -> throw keyword is nothing but the return keyword which is used in the catch block
 -> after that throw jvm not excetue any line afer that
 -> throwa keyword used in the method line if we doesnt handled the exception in using try and catch it will help to catch the ecxeption
 -> in the hearchy the first jvm chcek while the object creation if it created the try catch if not check the class next if any etended class in the stack
-> fianlly is always run when the exception catched or not
 */
public class exception1 {
    public static void main(String[] args) {
        ///  USING THE TRY + CATCH
//        try{
//            int a = 10/0;
//        } catch (Exception e) {
//            System.out.println("it shows the exception is : "+e);
//        }
        try {
            int[] arr = new int[3];
            System.out.println(arr[-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("goes array Out of bound");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
