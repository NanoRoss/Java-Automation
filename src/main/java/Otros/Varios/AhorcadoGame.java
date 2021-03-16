package Otros.Varios;
import java.util.Scanner;
public class AhorcadoGame {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int oportunidades =  7;
        boolean exito = false;
        System.out.println("Ingrese Palabra a Adivinar:");
        String palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        System.out.println("------------------------------------------");
        char[] PalabraArray = palabra.toCharArray();
        char[] PalabraArrayxAdivinar = new char[PalabraArray.length];
        for (int i = 0; i < PalabraArray.length; i++) {
            PalabraArrayxAdivinar[i] = '_';
        }
        System.out.println("Comienzo del Juego! Debe Adivinar la palabra: --->  "+String.valueOf(PalabraArrayxAdivinar));
        do{
            System.out.println("/Ingrese una letra para completar la palabra/   ");
            char letra = leer.next().charAt(0);
            letra = Character.toLowerCase(letra);
            boolean mach = false;
            for (int i = 0; i < PalabraArray.length; i++) {
                if (PalabraArray[i] == letra)
                {
                    PalabraArrayxAdivinar[i] = letra;
                    System.out.println("La palabra contiene la letra: -"+letra+"-"+"  ->"+String.valueOf(PalabraArrayxAdivinar));
                    System.out.println("------------------------------------------");
                    mach = true;
                }
            }
            if (mach == true){
                if (String.valueOf(PalabraArrayxAdivinar).toLowerCase().equalsIgnoreCase(palabra.toLowerCase())){
                    exito = true;
                    System.out.println("Adivinaste !! Very Good!  :)");
                }
            }
            else {
                oportunidades=oportunidades-1;
                System.out.println("NO MACH! :( Te quedan: "+oportunidades+" oportunidades! -> "+String.valueOf(PalabraArrayxAdivinar));
                System.out.println("------------------------------------------");
            }
        }
        while ((oportunidades>=1) && (exito == false)); //Si se evalúa como verdadero, comienza la siguiente iteración del ciclo.
    }
}