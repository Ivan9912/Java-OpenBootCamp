public class Main {
    public static void main(String[] args) {

//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

        Cliente dataclientes = new Cliente();
        dataclientes.setNombre("Ivan");
        dataclientes.setEdad(27);
        dataclientes.setTelefono(1152525252);
        dataclientes.setCredito(true);

        System.out.println("El nombre del cliente es: ¡" + dataclientes.getNombre() + "!.");
        System.out.println("La edad del cliente es: " + dataclientes.getEdad() + " años.");
        System.out.println("El telefono de contacto es: +54 9 " + dataclientes.getTelefono() + " AR.");
        System.out.println("¿El cliente tiene acceso de un credito? T/F? (" + dataclientes.getCredito() + ").");
    }
}

