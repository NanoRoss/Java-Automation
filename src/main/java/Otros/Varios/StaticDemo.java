package Otros.Varios;

public class StaticDemo {
    public static void main(String args[]) {
        Estudiante obj1 = new Estudiante();
        obj1.showData();
        Estudiante obj2 = new Estudiante();
        obj2.showData();
    }
}
    class Estudiante {
        int a; // inicializado a cero
        static int b; // inicializado a cero solo cuando la clase no está cargada para cada objeto creado.

        Estudiante() {
                b++; // Constructor incrementa la variable estática b
        }

        public void showData() {
            System.out.println("Valor de a =" + a);
            System.out.println("Valor de b =" + b);
        }

}
