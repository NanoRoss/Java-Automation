package ClasesObjetos_Basicos;


public class Auto {


    public static void main(String args[]){

        Vehiculos Auto1 = new Vehiculos(4500,200,"Rojo","Auto");
        Vehiculos Auto2 = new Vehiculos(5000,250,"Azul","Auto");

        System.out.println("---Objeto Auto 1---");
        Auto1.Arrancar();
        Auto1.Acelerar();
        Auto1.Acelerar();
        Auto1.Acelerar();
        System.out.println("---Objeto Auto 2---");
        Auto2.Arrancar();
        Auto2.Acelerar();
        Auto2.Acelerar();
        Auto2.Acelerar();

        Auto1.Descripcion_Vehiculo();
        Auto2.Descripcion_Vehiculo();
        Auto2.SetColor("Violeta");
        Auto2.Descripcion_Vehiculo();

    }


    }

