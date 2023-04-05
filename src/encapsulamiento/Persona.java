package encapsulamiento;

/**
 * Esta clase representa una persona dentro del sistema
 *
 * @author Alegre Llantoy, Andres Stefano
 */
public class Persona {

    private String dni;
    private String nombre;
    private double peso;

    public Persona(String dni, String nombre, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Esta funcion retorna el dni de la persona
     *
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Esta funcion permite encapsular el dni de la persona
     *
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Esta funcion retorna el nombre de la persona
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Esta funcion permite encapsular el nombre de la persona
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esta funcion retorna el peso de la persona
     *
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Esta funcion permite encapsular el peso de la persona
     *
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
