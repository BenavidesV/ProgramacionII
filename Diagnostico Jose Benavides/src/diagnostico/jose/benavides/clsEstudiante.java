/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico.jose.benavides;

import java.util.Date;

/**
 *
 * @author Jose E Esta clase clase se creo para almacenar los datos de un
 * estudiante
 */
public class clsEstudiante {
    //Declaro los atributos de la clase

    private String nombre;
    /**
     * Lo identifica como persona
     */
    private int cedula;//Para tener un unico ID que lso refiere al registro Nacional
    private int telefono;//Para comunicarse en caso de necesidad
    private char sexo;//Para datos estadísticos
    private Date fechaNacimiento;//Para validar los servicios disponibles para la persona

    //@Deprecated funciona para señalar algo que ya esta descontinuado 
    public clsEstudiante(String nombre, int cedula, int telefono, char sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = new Date();
    }

    @Override
    public String toString() {
        return "clsEstudiante{" + "nombre=" + nombre + ", cedula=" + cedula
                + ", telefono=" + telefono + ", sexo=" + sexo + ", edad=" + +'}';
    }

    /**
     * Constructor de la clase que inicializa los valores por medio 
     * del constructor
     * @param nombre
     * @param cedula
     * @param telefono
     * @param sexo
     * @param fechaNacimiento 
     */
    public clsEstudiante(String nombre, int cedula, int telefono, char sexo, Date fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = new Date();
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    /**
     * @return the edad
     */
}
