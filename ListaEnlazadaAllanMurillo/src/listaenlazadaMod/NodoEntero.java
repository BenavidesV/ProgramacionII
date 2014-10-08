/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaenlazadaMod;

import java.util.Objects;

/**
 *
 * @author Allan
 */
public class NodoEntero {
    
    private int entero;
    private String nombre;
    private NodoEntero sig;//-> Un atributo del mismo tipo
    
    public NodoEntero() {
        this.entero = 0;
        this.nombre = "";
        this.sig = null;
    }
    
    public NodoEntero(int entero, String nombre) {
        this.entero = entero;
        this.nombre = nombre;
        this.sig = null;
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

    @Override
    public String toString() {
        return "NodoEntero{" + "entero=" + entero + ", nombre=" + nombre + '}' + " -> " + this.sig;
    }
    
    //nodo1.equals(nodo2) = true/false;
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodoEntero other = (NodoEntero) obj;
        if (this.entero != other.entero) {
            return false;
        } 
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
