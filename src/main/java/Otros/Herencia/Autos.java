package Herencia;

public class Autos extends Vehiculos  {  // Auto hereda de Vehiculo.

    private Boolean taxi;

    public Autos(String color,Boolean cuero,Boolean Aire,int ruedas,Boolean es_taxi){

        super(color, cuero, Aire, ruedas); // Llamo al metodo constructor del padre.
        this.taxi = es_taxi;
    }

    public Boolean Auto_es_taxy(){
       return this.taxi;
    }








}