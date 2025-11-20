package ExceptionHandling;

public class Palidrome {
    public static void main(String[] args) {
        String str = "prakash";
        int j = str.length()-1;
        int i=0;
        Boolean palidr = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                palidr = false;
                break;
            }
            i++;
            j--;

        }
        if(palidr){
            System.out.println(str +" is palidrome"
            );
        }else{
            System.out.println(str +" not a plaidrome");
        }
    }

}
