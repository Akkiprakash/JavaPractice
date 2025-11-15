package InheritanceLaunch;
///
///
/// EVERY parent class extends the object class
/// cyclic inheritance is not allowed in the java
class parent{ // extends object class

}
class child extends parent{

}

///  there are the 3 main types of inheritance levels they are
/// 1) inherited Method
/// 2) overridden method
/// 3) specailized method
/// EXAMPLE

class college{
    void institue1(){
        System.out.println("this is the ims block");
    }
    void institue2(){
        System.out.println("this is the institue 2");
    }
}
class college2 extends college{
    void institue1(){
        System.out.println("this is the my block");
    }
    void institte3(){
        System.out.println("this is the college 2 block");
    }
}
public class Inhertitance2 {
    public static void main(String[] args) {
//        child ch = new child();
        college2 clg = new college2();
        clg.institte3(); /// SPECISLZED METHOD
        clg.institue1(); /// OVERIDDEN METHOD
        clg.institue2(); /// INHERITED METHOD
    }
}
