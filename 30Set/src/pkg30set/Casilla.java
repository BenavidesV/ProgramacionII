/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30set;

/**
 *
 * @author Estudiante
 */
public class Casilla {
    String color;

    public Casilla(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color.substring(0);
    }
    
}
