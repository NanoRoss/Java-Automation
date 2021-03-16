package Otros.Varios;

import org.testng.annotations.Test;

public class PasarVariable {

//Objetivo: Intercambiar valores entre 2 variables sin usar un Aux


@Test
    public void IntercambiarValores_Test(){
    IntercambiarValores(2,3);
    }


public void IntercambiarValores(int A,int B){
    System.out.println("El Valor actual de A es "+A);
    System.out.println("El Valor actual de B es "+B);
    B=B+A;
    A=B-A;
    B=B-A;
    System.out.println("El Nuevo Valor de A es "+A);
    System.out.println("El Nuevo Valor de B es "+B);
}




}
