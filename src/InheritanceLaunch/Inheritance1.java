package InheritanceLaunch;
/// key POINTS
/// Constructor do not participate in the inheritance but the super key in the construcotr is the responsible for  the execution of the block

///  muiltple inheritance is not allowed in the inheritance
/// but the nuitiple heirachhical inhertance is allowed
class demo{
    demo(){
        System.out.println("this is the default construstor");
    }
}
class demo1 extends  demo{
    // super(); /// by default
    ///  here the demo block which can be executed by the super meethod
}
class demo3 extends  demo1{

}
public class Inheritance1
{
    public static void main(String[] args) {
        demo1 d = new demo1();
    }
}
