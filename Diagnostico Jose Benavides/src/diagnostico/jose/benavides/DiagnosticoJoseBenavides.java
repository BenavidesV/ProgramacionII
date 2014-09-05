/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico.jose.benavides;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class DiagnosticoJoseBenavides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0, n, m, num;
        String frase = "";
        char prueba = 'w';
        double p = 2345.2514;
        float p1 = 3154;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Eliminar espacios en blanco");
            System.out.println("2. Mostrar la frase al reves");
            System.out.println("3. Mostrar las variables declaradas");
            System.out.println("4. Mostrar las variables del arreglo");
            System.out.println("5. Ver estudiante");
            System.out.println("6. Ver Matriz");

            opcion = teclado.nextInt();
            switch (opcion) {

                //Eliminar espacios en blanco
                case 1:
                    System.out.println("Escriba la frase que desea evaluar");
                    teclado = new Scanner(System.in);
                    frase = teclado.nextLine();
                    clsFrase inv = new clsFrase(frase);

                    System.out.println("Frase inicial >> " + frase);
                    System.out.println("Frase sin espacios >> " + inv.SinEspacios());
                    System.out.println("Numero de espacios eliminados= "
                            + inv.cuenta() + "\n");
                    break;
                case 2:
                    System.out.println("Escriba la frase que desea evaluar");
                    teclado = new Scanner(System.in);
                    frase = teclado.nextLine();
                    clsFrase invertir = new clsFrase(frase);

                    /**
                     * Muestra la información de salida*
                     */
                    System.out.println("Inverso " + invertir.reverso());
                    break;
                case 3:
                    System.out.print("Frase "+frase + "  " +"Opcion "+ opcion +
                            "\n" + prueba
                            + "  >> " + p + "  <<" + p1);
                    System.out.println();
                    break;

                case 4:
                    char arreglo[] = new char[6];
                    arreglo[0] = 'a';
                    arreglo[1] = 'b';
                    arreglo[2] = 'c';
                    arreglo[3] = 'd';
                    arreglo[4] = 'e';
                    arreglo[5] = 'f';

                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Posición " + i + " =" + arreglo[i]);
                    }
                    System.out.println();

                    break;

                case 5:
                    clsEstudiante est = new clsEstudiante("Jose", 206520952,
                            24601421, 'M');

                    System.out.println("Nombre " + est.getNombre());
                    System.out.println("Cedula " + est.getCedula());
                    System.out.println("Tel " + est.getTelefono());
                    System.out.println("Sexo " + est.getSexo());
                    System.out.println("Edad " + est.getFechaNacimiento());
                    System.out.println();

                    est.setSexo('F');
                    est.setNombre("Juana");
                    

                    System.out.println("Nombre " + est.getNombre());
                    System.out.println("Cedula " + est.getCedula());
                    System.out.println("Tel " + est.getTelefono());
                    System.out.println("Sexo " + est.getSexo());
                    System.out.println("Edad " + est.getFechaNacimiento());
                    System.out.println();
                    break;
                    
                case 6:
                    teclado = new Scanner(System.in);

                    System.out.println("Digite el número de filas");
                    n = teclado.nextInt();

                    System.out.println("Digite el número de columnas");
                    m = teclado.nextInt();
                    clsMatriz mat = new clsMatriz();
                    
                    System.out.println(mat.toString());

                    //Se pide al usuario el numero límite máximo para la matriz
                    System.out.println("Digite el número límite máximo");
                    num = teclado.nextInt();
                    
                    mat.AsignarDatos(num, n, m);

                    System.out.println("El máximo valor de la matriz es "
                            + mat.Max(n, m)+"\n");

                    System.out.println("El mínimo valor de la matriz es "
                            + mat.Min(n, m)+"\n");
                    
                    if (mat.Simetrica(n, m)== true) {
                        System.out.println("La matriz es SIMETRICA"+"\n");
                    } else {
                        System.out.println("La matriz NO es simétrica"+"\n");
                    }
                

            }

        } while (opcion <= 6);
    }
}
