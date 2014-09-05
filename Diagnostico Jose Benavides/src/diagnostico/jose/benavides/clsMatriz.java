/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico.jose.benavides;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsMatriz {

    private int[][] matrix;

    @Override
    public String toString() {
        return "clsMatriz{" + "matrix=" + matrix + '}';
    }

    public void setMatriz(int n, int m) {

        matrix = new int[n][m];
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                matrix[f][c] = 1;
            }
        }

    }

    public void AsignarDatos(int num, int n, int m) {
        matrix = new int[n][m];
        Random rand = new Random();
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                matrix[f][c] = rand.nextInt(num);
            }
        }

    }

    public int Max(int n, int m) {
        int mayor = 0;
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                if (matrix[f][c] >= mayor) {
                    mayor = matrix[f][c];
                }
            }
        }
        return mayor;
    }

    public int Min(int n, int m) {
        int menor = 0;
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                if (matrix[f][c] <= menor) {
                    menor = matrix[f][c];
                }
            }
        }
        return menor;
    }

    public boolean Simetrica(int n, int m) {
        boolean Sim = false;
        int matrix2[][] = new int[n][m];

        if (n == m) {

            for (int f = 0; f < n; f++) {
                for (int c = 0; c < m; c++) {
                    matrix2[c][f] = matrix[f][c];
                }
            }
            for (int f = 0; f < n; f++) {
                for (int c = 0; c < m; c++) {
                    if (matrix[f][c] == matrix2[f][c]) {
                        Sim = true;
                    } else {
                        Sim = false;
                        break;
                    }
                }

            }

        } else {
            Sim = false;
        }
        //Imprimo la matriz y su "opuesta"
            System.out.println("Matriz");
            for (int f = 0; f < n; f++) {
                for (int c = 0; c < m; c++) {
                    System.out.print(matrix[f][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
            
            System.out.println("Matriz 2");
            for (int f = 0; f < n; f++) {
                for (int c = 0; c < m; c++) {
                    System.out.print(matrix2[f][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
        return Sim;
    }

}
