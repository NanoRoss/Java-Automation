package Otros.Varios;
import java.util.*;

public class sumaConsecutiva {

    public static void main(String args[]) {
        int resultado = SumarConsecutivamente_1();
        System.out.println("El resultado de la suma Consecutiva es: " + resultado);
        System.out.println("------------");
        float resultado_gaus = SumarConsecutivamente_Gaus();
        System.out.println("El resultado de la suma Consecutiva es: " + resultado_gaus);
    }


    public static int SumarConsecutivamente_1(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para sumar consecutivamente: ");
        int numero = leer.nextInt();

        int suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static float SumarConsecutivamente_Gaus(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para sumar consecutivamente segun Gaus: ");
        int numero = leer.nextInt();

        float suma = ((float)(numero+1)/2)*numero;
        return suma;
    }


}


