package ClasesObjetos_Basicos;

import java.util.Scanner;

public class Vehiculos {

    private int Peso;
    private int VelocidadMaxima;
    private int VelocidadActual;
    private boolean Es_vehiculo; //Encapsulo con el modificador de acceso private a que solo se pueda modificar desde la clase padre.
    private String Color;
    private String Tipo;

    public Vehiculos( int peso,int velocidadMaxima,String color,String tipo) { //Constructor de la clase Vehiculos

        this.Peso = peso;
        this.VelocidadMaxima = velocidadMaxima;
        this.Color = color;
        VelocidadActual = 0;
        this.Tipo = tipo;
        this.Es_vehiculo = true;
    }

    public void Arrancar()
    {
        System.out.println("Se arranco el Vechiculo de tipo: "+Tipo);
    }

    public void Acelerar()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Velocidad de Aceleracion para el "+Tipo);
        int velocidaddeaceleracion = scanner.nextInt();

        VelocidadActual = VelocidadActual + velocidaddeaceleracion;
        if (VelocidadActual<VelocidadMaxima)
        {
            System.out.println("Se Acelero y la velocidad Ahora para el "+ Tipo+" : "+(VelocidadActual));
        }
        else
        {
            VelocidadActual = VelocidadMaxima;
            System.out.println("Se Alcanzo la velodicad Maxima para el "+ Tipo+" : "+ VelocidadActual);
        }
    }

    public void SetColor(String color){
        Color = color;
    }

    public String GetColor(){
        return Color;
    }

    public void Descripcion_Vehiculo(){
        String Descripcion_Vehiculo = ("El Vehiculo de tipo: "+Tipo+" tiene un peso de "+Peso+"kg, Una Maxima de "+VelocidadMaxima+"km, y Llego a una velocidad de "+VelocidadActual+"km, y es de color "+Color);
        System.out.println(Descripcion_Vehiculo);
    }



}
