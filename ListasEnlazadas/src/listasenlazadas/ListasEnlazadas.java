/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Estudiante
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NodoEntero nodo1 = new NodoEntero(1, "uno");
        NodoEntero nodo2 = new NodoEntero(2, "dos");
        NodoEntero nodo3 = new NodoEntero(2, "tres");
        
        nodo1.setSig(nodo2);
        nodo2.setSig(nodo3);
        nodo3.setSig(null);
        
        nodo2.setAnt(nodo1);
        nodo3.setAnt(nodo2);
        
        
        
    }
}
