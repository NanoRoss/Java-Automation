package Tests.Learning;
import javax.swing.*;
import java.util.Scanner;


public class IngresoDatosConsola {

    public static void main(String args[]){

        //Con clase Scanner
        Scanner IngresarDatos = new Scanner(System.in); //Recibe como parametro la consola del sistema donde se va a introducir el dato.
        System.out.println("Ingresar Nombre: ");
        String dato = IngresarDatos.nextLine(); //Metodo Estatico NextLine.
        System.out.println("Tu Nombre es: "+dato);
        //Con clase JOptionPane
        String edad = JOptionPane.showInputDialog("Ingresar Edad: "); //No se requiere instanciar ya que showInputDialog no es Estatico.
        System.out.println("Tu Edad es: " + edad);
        //Parseo Edad a Entero
        int edad_entero = Integer.parseInt(edad);
        System.out.println("Tu Edad es: " + edad_entero +" El año proximo vas a cumplir: "+ (edad_entero+1));

        System.out.println("12345678/*123456789/*123456789/*");

    }

}