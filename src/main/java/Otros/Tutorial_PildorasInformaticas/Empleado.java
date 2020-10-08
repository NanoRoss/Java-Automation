package Otros.Tutorial_PildorasInformaticas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    //Variables de clase con sus modificadores de acceso.
    private String nombre;
    private double sueldo_inicial;
    private Date fecha;
    private int porcentajeAumento;
    private double sueldo_Actual;
    private int id;
    private static int idSiguiente=1; //Variable estatica, solo es de la clase Empleado,si la misma se instancia esta variable no se copia en los objetos.


    public Empleado(String nom, double suel){ //Constructor de la clase Empleado.

    nombre = nom; //Lo paso por parametro cuando instancio un Objeto de tipo Empleado.
    sueldo_inicial=suel; //Lo paso por parametro cuando instancio un Objeto de tipo Empleado.

    GregorianCalendar calendario = new GregorianCalendar();
    fecha = calendario.getTime();

    id = idSiguiente;
    idSiguiente++;

    }

    public Empleado(String nom){ //2do Constructor de la clase Empleado (Sobrecarga).

        this(nom,1);//El 2do Constructor no recibe sueldo por parametro, pero setea por default 1.

        GregorianCalendar calendario = new GregorianCalendar();
        fecha = calendario.getTime();
        id = idSiguiente;
        idSiguiente++;

    }




    //GETTERS:

    public String ObtenerNombre(){  //Metodo Getter
        return nombre;
    }

    public int ObtenerId(){  //Metodo Getter
        return id;
    }

    public Double ObtenerSueldo_Inicial(){  //Metodo Getter
        return sueldo_inicial;
    }

    public Double ObtenerSueldo_Aumentado(){  //Metodo Getter
        return sueldo_Actual;
    }

    public Date ObtenerFechaAlta(){  //Metodo Getter
        return fecha;
    }

    public int Obtenerporcentaje(){  //Metodo Getter
        return porcentajeAumento;
    }

    //SETTERS

    public void SubirSueldo(int porcentaje){
        porcentajeAumento = porcentaje;
        double aumento =  sueldo_inicial * porcentaje/100;
        sueldo_Actual= sueldo_inicial+aumento;
    }







    }


