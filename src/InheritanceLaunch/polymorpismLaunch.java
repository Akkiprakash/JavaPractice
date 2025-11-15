package InheritanceLaunch;


///  OOPS CONTAINS THE 4 PILLORS THEY ARE
/// INHERITANCE INEHRITE THE PARENT CLASS TO THE CHILD CLASS
/// POLYMORPHISM ONE TO MANY OVERLOADING AND THE OVERRIDING
///  ABSTRACTION
/// ENCAPSULATION
/// //USING THE GETTERS AND THE SETTERS METHOD FOR THE PRIVATTE VARIABLES
class Areoplane{
    public void takeoff(){
        System.out.println("the areoplane is taking off");
    }
    public void landing(){
        System.out.println("this is landing");
    }
}
class CargoPlane extends Areoplane{
    public void takeoff(){
        System.out.println("the CArgoplane is taking off");
    }
    public void fly(){
        System.out.println("this cargoplane is fly");
    }
}
class Fighterplane extends Areoplane{
    public void takeoff(){
        System.out.println("the fighterPalne is taking off");
    }
    public void fly(){
        System.out.println("the FighterPlane is fly");
    }
}
public class polymorpismLaunch {
    public static void main(String[] args) {
        ///  if we use the parent type refernce then it is called as the upcasting

        ///  we can archieve hte inheritance of the
        //1)INHERITED METHOD
        // 2) OVERDIDE METHOD
        Areoplane plane = new CargoPlane();
        plane.landing();
        plane.takeoff();
        ///  downcasting means the temporary the converting the parent reference to the child reference
    ((CargoPlane) plane).fly(); //downcastting
    ///  we can acces the fly in the CargoPlane.......
        Areoplane fighterplane = new Fighterplane();
        fighterplane.landing();
        fighterplane.takeoff();
    }
}
