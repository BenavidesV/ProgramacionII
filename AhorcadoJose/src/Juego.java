
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Estudiante
 */
public class Juego extends javax.swing.JFrame {

    JButton[][] boton = new JButton[6][5];
    String palabras[];
    String incognita, mostrar;
    String[] raya;
    int partidas, victorias, fallos;
    double rendimiento;

    /**
     * Creates new form Juego
     */
    public Juego() {
        crearMatrizBotones();
        initComponents();
    }

    public void Ganar() {
        if (fallos < 6 && incognita.equalsIgnoreCase(mostrar)) {
            victorias++;
            lblProgreso.setIcon(new ImageIcon("Imagenes/correct.jpeg"));
            JOptionPane.showMessageDialog(null, "Ha ganado");
            btnResolver.setEnabled(false);
            Activar(false);

        }
    }

    public void crearMatrizBotones() {
        // SE GENERA LA MATRIZ DE BOTONES
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {


                if (i == 5 && j > 0) {
                    break;
                }

                //Generar matriz de botones
                boton[i][j] = new JButton();
                boton[i][j].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Comprobar((JButton) e.getSource());
                    }
                });

                boton[i][j].setBounds(5 + (50 * i), 15 + (50 * j), 39, 39);
                boton[i][j].setText("" + ((char) ((65 + cont))));
                boton[i][j].setEnabled(false);
                add(boton[i][j]);
                cont++;

                /*
                 * boton[5][0] = new JButton();
                 * boton[5][0].addActionListener(new ActionListener() {
                 *
                 * @Override public void actionPerformed(ActionEvent e) {
                 * Comprobar((JButton) e.getSource()); } });
                 */
                /*
                 * boton[5][0].setBounds(5 + (50 * 5), 15 + (50 * 0), 39, 39);
                 * boton[5][0].setText("Z"); boton[5][0].setEnabled(false);
                 * add(boton[5][0]);
                 */

            }
        }
    }

    public void Comprobar(JButton b) {
        boolean presente = false;

        for (int i = 0; i < incognita.length(); i++) {
            if (b.getText().equalsIgnoreCase((String.valueOf(incognita.charAt(i))))) {
                raya[i] = b.getText();
                presente = true;
            }

        }
        if (!presente) {
            fallos++;
        }
        Mostrar();
        b.setEnabled(false);
        Ganar();

    }

    //Este método almacena las palabras
    public String Palabras() {
        palabras = new String[20];
        palabras[0] = "Hola";
        palabras[1] = "Cola";
        palabras[2] = "Universo";
        palabras[3] = "Humano";
        palabras[4] = "Casero";
        palabras[5] = "ganador";
        palabras[6] = "melodia";
        palabras[7] = "caballo";
        palabras[8] = "campana";
        palabras[9] = "rio";
        palabras[10] = "alacran";
        palabras[11] = "Colateral";
        palabras[12] = "Universalmente";
        palabras[13] = "sobrehumano";
        palabras[14] = "Caseria";
        palabras[15] = "ganancia";
        palabras[16] = "melodias";
        palabras[17] = "caballero";
        palabras[18] = "campanada";
        palabras[19] = "rios";
        int n = (int) (Math.random() * 20);

        return palabras[n];

    }

    public void Activar(boolean a) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 5 && j > 0) {
                    break;
                }
                boton[i][j].setEnabled(a);
            }

        }
        /*
         * boton[5][0].setVisible(false); boton[5][0].repaint(); this.repaint();
         */

    }
    //Este método muestra el avance de la palabra y la cantidad de fallos

    public void Mostrar() {
        mostrar = "";
        for (int i = 0; i < raya.length; i++) {
            if (raya[i] == null) {
                raya[i] = "___ ";
            }

            mostrar += raya[i];

        }
        lblIncognita.setText(mostrar);
        System.out.println(mostrar);
        lbl1.setEnabled(false);
        lbl2.setEnabled(false);
        lbl3.setEnabled(false);
        lbl4.setEnabled(false);
        lbl5.setEnabled(false);
        lbl6.setEnabled(false);
        
//        lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_"+fallos+".jpg"));

        if (fallos == 6) {
            lbl6.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Perdió");
            lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_6.jpg"));
            Activar(false);

        }
        if (fallos >= 5) {
            lbl5.setEnabled(true);
            if (fallos == 5) {
                lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_5.jpg"));
            }
        }
        if (fallos >= 4) {
            lbl4.setEnabled(true);
            if (fallos == 4) {
                lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_4.jpg"));
            }

        }
        if (fallos >= 3) {
            lbl3.setEnabled(true);
            if (fallos == 3) {
                lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_3.jpg"));
            }
        }
        if (fallos >= 2) {
            lbl2.setEnabled(true);
            if (fallos == 2) {
                lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_2.jpg"));
            }
        }
        if (fallos >= 1) {
            lbl1.setEnabled(true);
            if (fallos == 1) {
                lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_1.jpg"));
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        lblProgreso = new javax.swing.JLabel();
        lblIncognita = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnResolver.setText("Ver solución");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        lblProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ahorcado_0.jpg"))); // NOI18N

        lblIncognita.setBackground(new java.awt.Color(102, 0, 0));
        lblIncognita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncognita.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        lblIncognita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIncognita, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnResolver, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEstadisticas, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(lblProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciar)
                            .addComponent(lblIncognita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEstadisticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResolver)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:

        lblProgreso.setIcon(new ImageIcon("Imagenes/ahorcado_0.jpg"));
        btnResolver.setEnabled(true);
        partidas++;
        fallos = 0;
        lblIncognita.setText("");
        incognita = Palabras();
        raya = new String[incognita.length()];

        Activar(true);
        Mostrar();

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // este boton muestra la solución y desactiva las letras
        lblIncognita.setText(incognita);
        Activar(false);
    }//GEN-LAST:event_btnResolverActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // funciona para mostrar el rendimiento
        rendimiento = (double) victorias * 100 / (double) partidas;
        Estadisticas est = new Estadisticas(this, true);
        est.ver(partidas, victorias, rendimiento);
        est.pack();
        est.setVisible(true);


    }//GEN-LAST:event_btnEstadisticasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lblIncognita;
    private javax.swing.JLabel lblProgreso;
    // End of variables declaration//GEN-END:variables
}
