package Otros.Varios;

//https://www.youtube.com/watch?v=zbVm3o9cJ8o&t=66s
//Desde donde hasta donde se da una suma que de x número?


import org.testng.annotations.Test;

public class SumaEnArrays {


    public void sumarEnArray(int numero){

        int ArregloEntero[] = {6,7,5,4,3,1,2,3,5,6,7,9,0,0,1,2,4,1,2,3,5,1,2};
        for (int i=0;i<ArregloEntero.length;i++) { System.out.println("El Arreglo en la posiciopn "+i+" Tiene el valor: "+ArregloEntero[i]);}

        int suma = 0;
        int posicion_inicial = 0;
        int posicion_Mach= 0;

        for (int i=0;i<ArregloEntero.length;i++) {

            for (int j=i++;j<ArregloEntero.length;j++){
                suma = suma + ArregloEntero[i] + ArregloEntero[j];

                if (suma == 13){
                    System.out.println("Entre: " + i + "y: " +j +"hay mach!" );
                    break;
                }


            }



        }

    }


    @Test
    public void Ejecuto_sumarEnArray(){
        sumarEnArray(13);
    }





}
