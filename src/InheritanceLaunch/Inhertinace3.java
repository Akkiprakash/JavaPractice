package InheritanceLaunch;
//

///  displaying the types and the modifers in the overidden method in the inheritannce


///  the accesebitlity of the inheritance will bw the
/// public protected default private
/// the top to down the accesability is decreased
/// we cant change the return type from the paretn classs to the child class
/// Example  : which the pareNT(VOID TYPE) but the child has (REETURN TYPe)
/// then the type mismatch and the compiler shows the error
/// but WE can Inhertit the types and using the anotheier inherited parent or the child class
/// with the using the refrence type



class Plane{
    public void fly(){
        System.out.println("this is fly");
    }
}
class Aeroplane extends CargoPlane {


}
class Animal{
     private void run(){ // we can use hte public toa cces any wheere
         System.out.println("animal is running");
     }
    public Aeroplane flying(){ // coveriant return types
         ///  where there is a (is a)) relationship

        System.out.println("tiger is hinting");
        Aeroplane aeroplane = new Aeroplane();
        return aeroplane;
    }
}
class Tiger extends Animal{ ///  the showing the child visibility should be more or equal compare to the parrent then only it accpes
       public void run(){
            System.out.println("the tiger is running");
       }
//       public Aeroplane flying(){
//           System.out.println("tiger is hinting");
//           Aeroplane aeroplane = new Aeroplane();
//           return aeroplane;
//       }

//    public int run(){ /// we cant use the diff type Inncorect return Type
//        System.out.println("running");
//        return 10;
//    }
}
public class Inhertinace3 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.flying();
    }
}
