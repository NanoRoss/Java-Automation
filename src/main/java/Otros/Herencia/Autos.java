package Otros.Herencia;
import Otros.Herencia.Uso_Vehiculos;


public class Autos extends Vehiculos {  // Auto hereda de Vehiculo.

    private Boolean taxi;

    public Autos(String color,Boolean cuero,Boolean Aire,int ruedas,Boolean es_taxi){

        super(color, cuero, Aire, ruedas); // Llamo al metodo constructor del padre.
        this.taxi = es_taxi;
    }




    public String ObtenerInfoVehiculo(){ //Uso Polimorfimo para redefinir el metodo ObtenerInfoVehiculo(), pq cuando el objeto es un Auto(Clase Hija), agrege el boolean taxi.
        String info = "Color: "+super.color+" Aire: "+super.aire+" Ascientos cuero: "+super.ascientos_cuero+" Ruedas: "+super.ruedas +" es Taxy: " + taxi;
        return info;
    }



}