package ExceptionHandling;


import java.util.Scanner;

class MyException extends  Exception{
 public MyException(String mesge){
     super(mesge);
 }
}
class Atm{
    private int accNo =12;
    private int password = 1234;

    int pass;
    int accno;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the accno");
        accno = sc.nextInt();
        System.out.println("enter the password");
        pass = sc.nextInt();
    }
    void result() throws MyException{
        if(accno ==  accNo && pass == password){
            System.out.println("matched");
        }
        else {
           // System.out.println("not matched");
            MyException ice = new MyException("invalid credintials");
            System.out.println(ice.getMessage());
            throw ice;

        }
    }
}
class Bank{
    void balance(){
        Atm atm = new Atm();
        try {
            atm.input();
            atm.result();
        }
        catch (MyException e){
            System.out.println("try again !");
            try {
                atm.input();
                atm.result();
            }
            catch (MyException e1){
            System.out.println("try again !");
                try {
                    atm.input();
                    atm.result();
                }
                catch (MyException e2){
            System.out.println("your pin was blocked please contact the bank");
                }
            }
        }
    }
}
public class exception2 {
    public static void main(String[] args) {
       Bank bank =  new Bank();
       bank.balance();
    }
}
