public class Cliente extends Persona{

    boolean credito;

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return this.nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad () {
        return this.edad;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono () {
        return this.telefono;
    }

    public void setCredito (boolean credito) {
        this.credito = credito;
    }
    public boolean getCredito () {
        return this.credito;
    }
}
