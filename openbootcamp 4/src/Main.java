public class Main {
    public static void main(String[] args) {

//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

        Cliente dataCliente = new Cliente();
        dataCliente.setNombre("Ivan");
        dataCliente.setEdad(27);
        dataCliente.setTelefono(1152525252);
        dataCliente.setCredito(true);

        System.out.println("El nombre del cliente es: ¡" + dataCliente.getNombre() + "!.");
        System.out.println("La edad del cliente es: " + dataCliente.getEdad() + " años.");
        System.out.println("El telefono de contacto es: +54 9 " + dataCliente.getTelefono() + " AR.");
        System.out.println("¿El cliente tiene acceso de un credito? T/F? (" + dataCliente.getCredito() + ").");
        System.out.println("-----------------------------------------");


        Trabajador dataTrabajador = new Trabajador();
        dataTrabajador.setNombre("Denis");
        dataTrabajador.setEdad(28);
        dataTrabajador.setTelefono(1125252525);
        dataTrabajador.setSalario(150.60);

        System.out.println("El nombre del cliente es: ¡" + dataTrabajador.getNombre() + "!.");
        System.out.println("La edad del cliente es: " + dataTrabajador.getEdad() + " años.");
        System.out.println("El telefono de contacto es: +54 9 " + dataTrabajador.getTelefono() + " AR.");
        System.out.println("El salario percibido mensualmente por el cliente en su labor es de: " + dataTrabajador.getSalario() + "$ AR.");
    }
}

