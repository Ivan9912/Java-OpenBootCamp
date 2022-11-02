public class Main {
    public static void main(String[] args) {
//Para practicar la encapsulación:
//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

    Persona data1 = new Persona();
    data1.setNombre("Denis");
    data1.setEdad(28);
    data1.setTelefono(1125252525);

    System.out.println("El nombre del usuario es: " + data1.getNombre() + ".");
    System.out.println("Su edad es de: " + data1.getEdad() + " años.");
    System.out.println("Su número de contacto es: +54 9 " + data1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad () {
        return edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono () {
        return telefono;
    }
}