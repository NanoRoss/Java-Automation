package Otros.Herencia;

public class Vehiculos {

    public String color;
    public boolean ascientos_cuero;
    public boolean aire;
    int ruedas;


    public Vehiculos(String color,Boolean cuero,Boolean Aire,int ruedas){  //CONSTRUCTOR
        this.color = color;
        this.ascientos_cuero = cuero;
        this.aire = Aire;
        this.ruedas = ruedas;
    }

    //Setters
    public void SetColor(String colorauto){
        this.color = colorauto;
    }
    public void SetBooleanAscientos(Boolean cuero){
        this.ascientos_cuero = cuero;
    }
    public void SetBooleanAire(Boolean tieneaire){
        this.aire = tieneaire;
    }
    public void SetRuedas(int ruedas){
        this.ruedas = ruedas;
    }


    //Getters
    public String ObtenerInfoVehiculo(){
        String info = "Color: "+color+" Aire: "+aire+" Ascientos cuero: "+ascientos_cuero+" Ruedas: "+ruedas;
        return info;
    }


}



