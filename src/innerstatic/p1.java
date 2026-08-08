
public class p1 {
    // static void factorial(int i,int val){
    //     if(i == 0){
    //         System.out.println(val);
    //         return;
    //     }
    //     factorial(i-1, val*i);
    // }
    static int factorial(int n){
        if(n ==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
     int n =3;
    //  int val =1;
     System.out.println(factorial(n));

    }
}