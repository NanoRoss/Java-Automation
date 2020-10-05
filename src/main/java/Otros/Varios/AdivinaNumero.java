
import java.util.*;

public class AdivinaNumero {

    public static void main(String args[]){
        //

        Scanner leer = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*100);
        System.out.println("Ingrese un numero entre 0 y 100: "+aleatorio);
        int numero = leer.nextInt();
        int intentos = 0;

        while (aleatorio != numero)
        {
            intentos = intentos +1;

           if (aleatorio < numero)
           {
            System.out.println("INCORRECTO!!! ES UN N° MENOR...TRY AGAIN: ");
            numero = leer.nextInt();

           }
           else
           {
               System.out.println("INCORRECTO!!! ES UN N° MAYOR...TRY AGAIN: ");
               numero = leer.nextInt();


           }


        }

        System.out.println("CORRECTO! Numero:" +aleatorio + " Resuelto en "+intentos+" Intentos");








        //


    }

}
