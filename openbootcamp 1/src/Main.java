public class Main {
    public static void main(String[] args) {
        //Primera Parte
        System.out.println(sumatoria(10,20 ,32));
        //Segunda Parte
        coche miCoche = new coche();
        miCoche.añadirPuertas();
        System.out.println(miCoche.cantidadDePuertas);
    }
    public static int sumatoria(int a, int b, int c) {
        return a + b + c;
    }

}

