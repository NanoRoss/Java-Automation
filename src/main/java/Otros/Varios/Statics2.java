package Otros.Varios;

import org.testng.annotations.Test;

public class Statics2 {

    public void VerCambios(){
        Statics obj1 = new Statics();
        System.out.println("En Obj1 el valor de A es: "+obj1.a+" y el valor de B: "+ obj1.b);
        System.out.println("En Obj1 el contador es: "+obj1.cont);
        System.out.println("Seteo A (ESTATICO) = 50 Y B (NO ESTATICO) = 60 EN EL OBJ1");
        obj1.a=50;
        obj1.b=60;
        Statics obj2 = new Statics();

        System.out.println("En Obj2 el valor de A es: "+obj2.a+" y el valor de B: "+ obj2.b);
        System.out.println("En Obj1 el valor de A es: "+obj1.a+" y el valor de B: "+ obj1.b);
        System.out.println("En Obj2 el contador es: "+obj2.cont);
        System.out.println("En Obj1 el contador es: "+obj1.cont);
        Statics obj3 = new Statics();
        System.out.println("En Obj2 el contador es: "+obj2.cont);
        System.out.println("En Obj1 el contador es: "+obj1.cont);
        System.out.println("En Obj3 el contador es: "+obj3.cont);


    }



    @Test
    public void TestMetohd(){
        VerCambios();
    }





}
