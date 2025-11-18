package ExceptionHandling;


import java.util.Scanner;

class BelowAgeLimit extends Exception {
    public BelowAgeLimit(String key) {
        super(key);
    }
}
class OverAgeLimit extends Exception{
    OverAgeLimit(String key){
        super(key);
    }
}
class Age {
    private int age;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly eneter the age : ");
        age = sc.nextInt();
    }

    public void verify() throws BelowAgeLimit, OverAgeLimit  {
        if (age >= 18 && age <= 60){
            System.out.println("click to get the liscence");
        }else if (age < 18) {
            BelowAgeLimit ble = new BelowAgeLimit("Invalid age entered");
            System.out.println(ble.getMessage());
            throw ble;
        }
        else {
            OverAgeLimit ole = new OverAgeLimit("Your time was over ! pleae take rest");
            System.out.println(ole.getMessage());
            throw ole;
        }
    }
}

class Finalbox {
    public void result() {
        Age age = new Age();
        try {
            age.input();
            age.verify();
        }
        catch (BelowAgeLimit | OverAgeLimit e){
            System.out.println("enter again");
            try {
                age.input();
                age.verify();
            }
            catch (BelowAgeLimit | OverAgeLimit e1){
                System.out.println("go and come tommorow");
            }
        }
    }
}

public class Exception3 {
    public static void main(String[] args) {
        Finalbox fb = new Finalbox();
        fb.result();
    }
}
