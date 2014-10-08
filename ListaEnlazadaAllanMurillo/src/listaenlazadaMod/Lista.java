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
public class Lista {

    NodoEntero topeLista;

    public Lista() {
        this.topeLista = null;
    }

    public void insertar(int numero, String nombre) {
        NodoEntero nodo = new NodoEntero(numero, nombre);
        InsertarOrdenadamente(nodo);
    }

    public void insertar(NodoEntero nodo) {
        if (vacia()) {
            topeLista = nodo;
        } else {
            NodoEntero actual = topeLista;

            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nodo);
        }
    }

    public int TamanoLista() {
        NodoEntero recorrido = topeLista;
        int cont = 0;
        while (recorrido != null) {
            cont++;
            recorrido = recorrido.getSig();
        }
        return cont;
    }

    public NodoEntero FinLista() {
        NodoEntero recorrido = topeLista;
        while (recorrido.getSig() != null) {
            recorrido = recorrido.getSig();
        }
        return recorrido;
    }

    public void InsertarOrdenadamente(NodoEntero nodo) {
        if (vacia()) {
            topeLista = nodo;
        } else {
            NodoEntero actual = topeLista;
            NodoEntero temporal = topeLista;

            while (actual != null) {
                if(nodo.getEntero()>topeLista.getEntero()){
                    topeLista.setSig(nodo);
                       
                }



            }
        }



    }

    public void eliminar(int entero, String nombre) {
        NodoEntero nodo = new NodoEntero(entero, nombre);
        eliminar(nodo);
    }

    public void eliminar(NodoEntero nodo) {
        if (vacia()) {
            return;
        } else {
            NodoEntero actual = topeLista;
            NodoEntero anterior = null;
            while (!actual.equals(nodo)) {
                anterior = actual;
                //Ya perdi el anterior
                actual = actual.getSig();
                if (actual == null) {
                    return;
                }
            }
            if (anterior != null) {
                anterior.setSig(actual.getSig());
            } else if (topeLista.getSig() == null) {
                topeLista = null;
            } else {
                topeLista = topeLista.getSig();
            }

        }
    }

    public void mostrar() {
        //public String mostrar(){
        System.out.println(topeLista);
        //return topeLista.toString();
    }

    public boolean vacia() {
        return topeLista == null;
    }
}
