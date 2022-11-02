public class Trabajador extends Persona{
    double salario;

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
    public void setSalario (double salario) {
        this.salario = salario;
    }
    public double getSalario () {
        return this.salario;
    }
}
