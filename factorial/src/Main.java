public class Main {
    public static void main(String[] args) {
        //Ejemplo de recursividad con una funcion factorial.

        System.out.println(factorial (8));
    }
    public static int factorial (int numero) {
        int resultado;
        if (numero == 1){
            return 1;
        }
        resultado = factorial (numero - 1) * numero;
        return resultado;
    }
}