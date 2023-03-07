/**
 * Persona
 */
public class Persona {
    private String DNI,nombre,apellido;
    private int edad;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getDNI() {
        return DNI;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}