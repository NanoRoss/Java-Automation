package Herencia;
import Herencia.*;

import java.util.Scanner;

public class Uso_Vehiculos {


    public static void main(String[] args) {

        Scanner IngresarDatos = new Scanner(System.in); //Recibe como parametro la consola del sistema donde se va a introducir el dato.
        int opcion_int;
        Boolean menuoptions;

        do {
                System.out.println("Ingrese la opcion para el tipo de Vehiculo que quiere crear:");
                System.out.println("INGRESE 1 para Vehiculo Comun (Clase Padre)");
                System.out.println("INGRESE 2 para Auto (Clase Hija)");
                String opcion_string = IngresarDatos.nextLine(); //Metodo Estatico NextLine.
                opcion_int = Integer.parseInt(opcion_string);

                if (opcion_int>0 && opcion_int<=2){
                    menuoptions = true;
                }
                else {
                    menuoptions = false;
                }

                switch(opcion_int) {
                    case 1:
                        Vehiculos Ve1 = new Herencia.Vehiculos("Azul",true,true,4);
                        System.out.println(Ve1.ObtenerInfoVehiculo());
                        break;
                    case 2:
                        Autos Au1= new Autos("Amarillo",false,false,4,true);
                        Autos Au2= new Autos("Azul",true,true,4,false);
                        System.out.println(Au1.ObtenerInfoVehiculo()+", es Taxy: "+Au1.Auto_es_taxy());
                        System.out.println(Au2.ObtenerInfoVehiculo()+", es Taxy: "+Au2.Auto_es_taxy());
                        break;
                }
        }
        while (menuoptions==false);


    }
}
