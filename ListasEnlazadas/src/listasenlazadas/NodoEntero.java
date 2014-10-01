/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Estudiante
 */
public class NodoEntero {
    private int entero;
    private String nombre;
    private NodoEntero sig;
    private NodoEntero ant;

    public NodoEntero() {
        
    }
    

    public NodoEntero getAnt() {
        return ant;
    }

    public void setAnt(NodoEntero ant) {
        this.ant = ant;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoEntero getSig() {
        return sig;
    }

    public void setSig(NodoEntero sig) {
        this.sig = sig;
    }

    public NodoEntero(int entero, String nombre) {
        this.entero = entero;
        this.nombre = nombre;
    }
    
    
}
