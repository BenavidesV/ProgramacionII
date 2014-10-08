/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazadaMod;

/**
 *
 * @author Allan
 */
public class ListaEnlazadaMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NodoEntero nodoZ = new NodoEntero();
        NodoEntero nodoB = new NodoEntero(2, "Uno");
        NodoEntero nodoA = new NodoEntero(1, "Uno");
        System.out.println(nodoA.equals(nodoB));
        
        /*
        Z->
          B->
            A->
               null
        A->
            B->
              Z-> 
                 null
         */
        //Z->B->A->Z;
        /*nodoZ.setSig(nodoB);
        nodoB.setSig(nodoA);
        System.out.println(nodoZ);
        */
        //A->B->Z->null
        //nodoB.setSig(nodoZ);
        //nodoA.setSig(nodoB);
        //System.out.println(nodoA);
        /*
         NodoEntero nodoD = new NodoEntero(21, "Dos.Uno");
         nodoA.setSig(nodoB);
         NodoEntero nodoC = new NodoEntero(3, "Tres");
         nodoB.setSig(nodoC);
         nodoB.setSig(nodoD);
         nodoD.setSig(nodoC);
         nodoB.setSig(nodoC);
         nodoD.setSig(null);
         System.out.println(nodoA);
         System.out.println(nodoB);
         System.out.println(nodoC);
         System.out.println(nodoD);

         ListaNodoEntero lista = new ListaNodoEntero();
         if (!lista.vacia()) {
         lista.mostrar();
         }
         lista.insertar(1,"Uno");
         lista.mostrar();
         lista.insertar(2,"Dos");
         lista.mostrar();
         lista.insertar(3,"Tres");
         lista.mostrar();
         lista.insertar(4,"Cuatro");
         lista.mostrar();
         */
        
        Lista lista = new Lista();
        lista.mostrar();
        lista.insertar(8, "ocho");
        lista.insertar(10, "diez");
        lista.insertar(4, "cuatro");
        lista.insertar(7, "siete");
        lista.insertar(3, "tres");
        lista.insertar(5, "cinco");
        
        lista.mostrar();
        
        
        
        
        
        
        
        
    }

    //int -> int -> int
}
