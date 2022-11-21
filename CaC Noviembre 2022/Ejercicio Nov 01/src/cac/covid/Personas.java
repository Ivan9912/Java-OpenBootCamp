package cac.covid;

public class Personas {
    private Double temperatura;
    private String nombre;
    private String dni;
    public Personas(String nombre, String dni, Double temperatura){
        this.nombre = nombre;
        this.dni = dni;
        this.temperatura = temperatura;
    }
    public void setTemperatura(Double temp) {
        this.temperatura = temp;
    }
    public Double getTemperatura() {
        return temperatura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
}
// Sets para tenerlos por si fuera el caso de usarlos.