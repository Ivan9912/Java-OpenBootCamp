import cac.covid.Personas;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList <Personas> ListaPersonas = new ArrayList<>();
        ArrayList <String> personasSinSintomas = new ArrayList<>();
        ArrayList <String> personasConSintomas = new ArrayList<>();
        String sci = "\nPersonas que ingresaron: ";
        String ci = "Personas que no ingresaron: ";

        personasSinSintomas.add(sci);
        personasConSintomas.add(ci);

        Main.ddbb(ListaPersonas);

        for (Personas persona : ListaPersonas) {
            String cadena ="Nombre: " + persona.getNombre() + ", con el DNI: " + persona.getDni() + ". Y tiene : " + persona.getTemperatura()+ " C.";
            if (persona.getTemperatura() >= 37.0 ){
                personasConSintomas.add(cadena);
            }else {
                personasSinSintomas.add(cadena);
            }
        }
        //Personas hola = new Personas("hola", "estoy cansado", 45.0);
        //hola.setDni("15.365.498");
        //System.out.println("esta es una prueba..." + hola.getDni());
        int personasIngreso = (personasSinSintomas.size() - 1);
        int personasNoIngreso = (personasConSintomas.size() - 1);
        int totalPersonas = ListaPersonas.size();

        String scf = "("  + personasIngreso + "/" + totalPersonas + ") personas ingresaron al encuentro de programadores.\n";
        String cf = "(" + personasNoIngreso + "/" + totalPersonas + ") personas fueron derivados a un hospuital por posible sintoma de covid.";

        personasSinSintomas.add(scf);
        personasConSintomas.add(cf);
        personasSinSintomas.forEach(System.out::println);
        personasConSintomas.forEach(System.out::println);
    }
    private static void ddbb(ArrayList<Personas> list){
        list.add(new Personas("Juan Rodriguez", "32.456.542", 35.5));
        list.add(new Personas("Julian Martinto", "35.437.553", 38.0));
        list.add(new Personas("Adriana Guzmán", "37.687.356", 34.2));
        list.add(new Personas("Luz Romero", "39.543.545", 35.6));
        list.add(new Personas("Gabriel Serrano", "95.487.145", 38.9));
        list.add(new Personas("Gastón Cordary", "38.366.246", 37.1));
        list.add(new Personas("Micaela Ayala", "42.123.354", 36.0));
        list.add(new Personas("Cristián Schwartz", "5.554.211", 40.5));
        list.add(new Personas("Camila Smith", "41.687.348", 41.0));
        list.add(new Personas("Exequiel Villadeluz", "38.989.355", 36.8));
        list.add(new Personas("Nora Gómez", "40.653.788", 37.7));
    }
}