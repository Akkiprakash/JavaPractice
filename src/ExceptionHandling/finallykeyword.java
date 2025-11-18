package ExceptionHandling;

/*
-> we can acces the global variables inside and the outside
-> if we define inside hte block then we cant acces ouside the block
-> finally keywords works internally whether catch is caught or not
 */
public class finallykeyword {
    public static void main(String[] args) {
        int b =10;
        try{
            System.out.println("connection esthablsied");
            int a = 10/5;
            System.out.println("it works no error");
        }
        catch (Exception e){
            System.out.println("cant be the 0");
        }
        finally {
            System.out.println(b);
            System.out.println("connection terminated");
        }
    }
}
