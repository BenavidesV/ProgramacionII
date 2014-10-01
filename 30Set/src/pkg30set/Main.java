/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30set;

/**
 *
 * @author Jose E
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casilla[][] matriz = new Casilla[3][3];


        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                String color = "negro";// Color color=Color.BLANCO
                if (f % 2 == 0 && c % 2 == 0) {
                    color = "blanco";//color=Color.BLANCO
                }
                if (f % 2 != 0 && c % 2 != 0) {
                    color = "blanco";
                }
                //LOS DOS IF LOS PUEDO IMPLEMENTAR CON UN OR
                matriz[f][c]=new Casilla(color);
                

            }
        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + "\t");

            }
            System.out.println();

        }

    }
}
