package InheritanceLaunch;

///  in polymorphism emans it have to come woth a is a realation ship
/// it contians the upcating and the downcasting also
/// without the over riding we cant archive the ppolymorphism
/// it is applicable on the specailized method only
/// incase we use inherit and overrden method we dont want to use the overriding option

class A{
    void ant(){
        System.out.println("A class ant");
    }
    void ent(){
        System.out.println(" A class ent");
    }
}
class B extends  A{
    void ant(){
        System.out.println("this is the B class");
    }
    void ent(){
        System.out.println(" b class ent");
    }
}
class C extends A{
    void ant(){
        System.out.println("htis is the C class");
    }
    void ent(){
        System.out.println(" C class ent");
    }
}

public class polyoveridng {
    public static void main(String[] args) {
        A a = new A();
        a.ant();
        a.ent();
        B b = new B();
        b.ant();
        b.ent();
        C c = new C();
        c.ant();
        c.ent();

        System.out.println("**********************************");

        parent1.display(a);
        parent1.display(b);
        parent1.display(c);
    }
}
