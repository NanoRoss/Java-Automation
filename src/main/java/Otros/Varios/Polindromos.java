package Otros.Varios;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.lang.reflect.Array;

//Ejercicios de Programacion: Calcular si una palabra es Capicua o no.

public class Polindromos {

    @Test
    public void Test_PalabraCapicua() {
        String Palabra = "123321";
        Boolean Resultado = EsPalabraCapicua(Palabra);
        if (Resultado == true) {
            System.out.println("La palabra: " + Palabra + " ES Capicua");
        } else {
            System.out.println("La palabra: " + Palabra + " NO es Capicua");
        }
    }

    public boolean EsPalabraCapicua(String Palabra) {
        char[] PalabraArray = Palabra.toCharArray();
        int ContadorInverso = PalabraArray.length;
        int ContadorMach = 0;

        for (int i = 0; i < PalabraArray.length; i++) {
            System.out.println("Posicion: " + i + " Letra: " + PalabraArray[i]);
            ContadorInverso = ContadorInverso - 1;

            if(PalabraArray[i]==PalabraArray[ContadorInverso]){
                ContadorMach = ContadorMach + 1;
                System.out.println("MACH!");
            }
        }
        if (ContadorMach==PalabraArray.length){
            return true;
        }
        else{ return false;
        }
    }
}
