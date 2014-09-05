/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico.jose.benavides;

/**
 *
 * @author Jose E
 */
public class clsFrase {
    

    private String cadena;
//Método constructor
    public clsFrase(String cadena) {
        this.cadena = cadena;
    }
//Muestra el inverso del String
    public String reverso() {
        String retorno="";
       
        for (int i = getCadena().length()-1; i >= 0; i--) {
            retorno+=getCadena().charAt(i);
        }        
        return retorno; 
        }
//Calcula el número de inicidencias de una palabra
    public int cuenta(){
    int cont=0;
        for (int i = 0; i <=getCadena().length(); i++) {
            if (getCadena().startsWith(" ",i)==true){
            cont++;
            }
        }
    return cont;
    }
    
//Crea la frase sin espacios
    public String SinEspacios(){
    String re="";
        for (int i = 0; i <getCadena().length(); i++) {
            if (getCadena().charAt(i)!=' '){
            re+=getCadena().charAt(i);
            }
        }
    return re;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
