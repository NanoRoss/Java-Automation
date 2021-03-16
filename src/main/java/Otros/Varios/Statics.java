package Otros.Varios;

public class Statics {

    protected static int a;
    protected static int cont;
    protected int b;


    static {              //Constructor Bloque Estatico

    }

    public Statics() {   //Constructor Clasico
        a = 10;
        b = 1;
        cont = cont+1;
    }

    public static void staticFuncion(){
        System.out.println("Soy una funcion Estatica");
    }
    public void nonStaticFuncion(){
        System.out.println("Soy una funcion NO Estatica");
    }


}
