package Otros.Varios;

import org.testng.annotations.Test;

public class MultiplicoSinSigno {

    @Test
    public void MultiplicoSinSigno_Test() {

        System.out.println("Resultado de la Multiplicacion: " + Multiplico(-2,3));
    }

    public int Multiplico(int a, int b){
        int resultado = 0;

        for (int i=0; i<Math.abs(b);i++){
        resultado = resultado + Math.abs(a);
        }

        int valor_absoluto_de_a = Math.abs(a);
        int valor_absoluto_de_b = Math.abs(b);

        if (valor_absoluto_de_a==a && valor_absoluto_de_b==b ){
            return resultado;

        }
        else if (valor_absoluto_de_a!=a && valor_absoluto_de_b!=b ){
            return resultado;
        }
        else {
            resultado = resultado - (resultado+resultado);
            return resultado;
        }


    }





}
