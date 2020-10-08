package Otros.Tutorial_PildorasInformaticas;

import java.util.Scanner;

public class Uso_Empleado {

    public static void main(String[] args) {

        Scanner IngresarDatos = new Scanner(System.in); //Recibe como parametro la consola del sistema donde se va a introducir el dato.

        System.out.println("Ingrese Cantidad de Usuarios a Crear");
        String cantidad_usuarios = IngresarDatos.nextLine(); //Metodo Estatico NextLine.
        int cantidad_usuarios_int = Integer.parseInt(cantidad_usuarios);

        Empleado Empleados[] = new Empleado[cantidad_usuarios_int]; //Creo un Array de Empleados

        for (int e = 0; e <= cantidad_usuarios_int -1 ; e++) {
            int num_Empleado = e+1;
            System.out.println("Ingrese el Nombre del Empleado N° "+num_Empleado);
            String Nombre = IngresarDatos.nextLine();
            System.out.println("Ingrese el Sueldo Base del Empleado"+num_Empleado);
            String Sueldo_String = IngresarDatos.nextLine();
            int Sueldo_int = Integer.parseInt(Sueldo_String);
            Empleados[e] = new Empleado(Nombre, Sueldo_int);
            System.out.println("Ingrese el % de aumento para el Empleado N° "+Empleados[e].ObtenerId()+" luego de 1 año de trabajo");
            String porcentajeAumento = IngresarDatos.nextLine(); //Metodo Estatico NextLine.
            int porcentajeAumento_int = Integer.parseInt(porcentajeAumento);
            Empleados[e].SubirSueldo(porcentajeAumento_int);
        }

        Empleado Empleado_2do_Constructor = new Empleado("2do Constructor");
        System.out.println(Empleado_2do_Constructor.ObtenerId());
        System.out.println(Empleado_2do_Constructor.ObtenerNombre());
        System.out.println(Empleado_2do_Constructor.ObtenerFechaAlta());
        System.out.println(Empleado_2do_Constructor.ObtenerSueldo_Inicial());
        System.out.println(Empleado_2do_Constructor.ObtenerSueldo_Aumentado());
        System.out.println("//////////");

        for (int i = 0; i <= cantidad_usuarios_int -1 ; i++) {
            System.out.println("El Empleado: " +
                    Empleados[i].ObtenerNombre() +
                    " ID: "+
                    Empleados[i].ObtenerId()+
                    " tiene un sueldo base de: " +
                    Empleados[i].ObtenerSueldo_Inicial() +
                    "$" + " y su fecha de ingreso fue: " +
                    Empleados[i].ObtenerFechaAlta() +
                    " Luego de un año recibira un aumento de:"+
                    Empleados[i].Obtenerporcentaje()
                    +"% y su sueldo será de: " +
                    Empleados[i].ObtenerSueldo_Aumentado()+
                    "$--------------------------------");
        }



    }

}

