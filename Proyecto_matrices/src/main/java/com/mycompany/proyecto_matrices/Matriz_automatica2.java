
package com.mycompany.proyecto_matrices;


import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Matriz_automatica2 extends javax.swing.JFrame {

  
     
    private int tamaño;
    private int [][] randomMatriz;
    private int [][] oldMatriz;


    public Matriz_automatica2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public void settamaño(int n){
    this.tamaño = n;
    }
    public void generarMatrizAleatoria(){
        randomMatriz = new int [tamaño][tamaño];
        DefaultTableModel modelo = (DefaultTableModel) tblMatrizaleGenerate.getModel();
        if (modelo.getRowCount() != tamaño || modelo.getColumnCount() != tamaño) {
            System.out.println("generate if1");
            modelo.setRowCount(tamaño);
            modelo.setColumnCount(tamaño);
        }
        
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                 System.out.println("generate "+j);
                int valorAleatorio = rand.nextInt(25);
                tblMatrizaleGenerate.setValueAt(valorAleatorio, i, j);  // Muestra en la tabla
                randomMatriz[i][j] = valorAleatorio;
            }
        }
    }
    
    private int[][] obtenerMatrizDeTabla(javax.swing.JTable tabla) {
        int[][] matriz = new int[tamaño][tamaño];
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    Object valor = tabla.getValueAt(i, j);
                    if (valor != null) {
                        matriz[i][j] = Integer.parseInt(valor.toString());
                    } else {
                        matriz[i][j] = 0;
                    }
                }
            }
            return matriz;
    }
    private void mostrarResultado(int[][] resultado, javax.swing.JTable tablaDestino) {
        DefaultTableModel modelo = (DefaultTableModel) tablaDestino.getModel();
        modelo.setRowCount(tamaño);
        modelo.setColumnCount(tamaño);
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                modelo.setValueAt(resultado[i][j], i, j);
            }
        }
    }
    private int[][] sumarMatrices(int[][] m1, int[][] m2) {
        int[][] resultado = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }
    private int[][] restarMatrices(int[][] m1, int[][] m2) {
        int[][] resultado = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                resultado[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return resultado;
    }
    private int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        int[][] resultado = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < tamaño; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultado;
    }
    
      /**
     * @return the oldMatriz
     */
    public int[][] getOldMatriz() {
        return oldMatriz;
    }

    /**
     * @param oldMatriz the oldMatriz to set
     */
    public void setOldMatriz(int[][] oldMatriz) {
        this.tamaño = oldMatriz.length;  
        this.oldMatriz = oldMatriz;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGenerarm3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizSuma = new javax.swing.JTable();
        btnMultipli1 = new javax.swing.JButton();
        btnResta1 = new javax.swing.JButton();
        btnSuma1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizaleGenerate = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatrizMultiplicacion = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatrizrResta = new javax.swing.JTable();
        btnAtrasAutomatic = new javax.swing.JButton();
        btnAtrasManual = new javax.swing.JButton();
        lbltamaño = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        btnGenerarm3.setText("Generar");
        btnGenerarm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarm3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Oprima generar, para obtener una nueva matriz con datos aleatorios.");

        tblMatrizSuma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizSuma);

        btnMultipli1.setText("Multiplicación");
        btnMultipli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipli1ActionPerformed(evt);
            }
        });

        btnResta1.setText("Resta");
        btnResta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResta1ActionPerformed(evt);
            }
        });

        btnSuma1.setText("Suma");
        btnSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuma1ActionPerformed(evt);
            }
        });

        tblMatrizaleGenerate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizaleGenerate);

        tblMatrizMultiplicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMatrizMultiplicacion);

        tblMatrizrResta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatrizrResta);

        btnAtrasAutomatic.setText("Hacia la automatica");
        btnAtrasAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAutomaticActionPerformed(evt);
            }
        });

        btnAtrasManual.setText("Hacia la manual");
        btnAtrasManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasManualActionPerformed(evt);
            }
        });

        lbltamaño.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultipli1)
                            .addComponent(btnGenerarm3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma1)
                            .addComponent(btnResta1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtrasManual)
                    .addComponent(btnAtrasAutomatic)
                    .addComponent(lbltamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbltamaño))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarm3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtrasAutomatic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtrasManual)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResta1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultipli1)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuma1ActionPerformed
        /*int[][] matrizAle = obtenerMatrizDeTabla(tblMatrizale2);
        int[][] resultado = sumarMatrices(matrizMenu, matrizAle);
        mostrarResultado(resultado, tblMatrizs1);*/

            int[][] resultado = sumarMatrices(randomMatriz, oldMatriz);
            mostrarResultado(resultado, tblMatrizSuma);
    }//GEN-LAST:event_btnSuma1ActionPerformed

    private void btnAtrasAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAutomaticActionPerformed
        // TODO add your handling code here:
        Menu2 m2 = new Menu2();
        m2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasAutomaticActionPerformed

    private void btnAtrasManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasManualActionPerformed
        // TODO add your handling code here:
        MtrizMnal1 mm1 = new MtrizMnal1();
        mm1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasManualActionPerformed

    private void btnGenerarm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarm3ActionPerformed
         
            generarMatrizAleatoria();
        
    }//GEN-LAST:event_btnGenerarm3ActionPerformed

    private void btnResta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResta1ActionPerformed
        // TODO add your handling code here:
        int[][] matrizAle = obtenerMatrizDeTabla(tblMatrizaleGenerate);
        int[][] resultado = restarMatrices(randomMatriz, oldMatriz);
        mostrarResultado(resultado, tblMatrizrResta);
    }//GEN-LAST:event_btnResta1ActionPerformed

    private void btnMultipli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipli1ActionPerformed
        int[][] matrizAle = obtenerMatrizDeTabla(tblMatrizaleGenerate);
        int[][] resultado = multiplicarMatrices(randomMatriz, oldMatriz);
        mostrarResultado(resultado, tblMatrizMultiplicacion);
    }//GEN-LAST:event_btnMultipli1ActionPerformed
    
    
    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz_automatica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz_automatica2().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasAutomatic;
    private javax.swing.JButton btnAtrasManual;
    private javax.swing.JButton btnGenerarm3;
    private javax.swing.JButton btnMultipli1;
    private javax.swing.JButton btnResta1;
    private javax.swing.JButton btnSuma1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lbltamaño;
    private javax.swing.JTable tblMatrizMultiplicacion;
    private javax.swing.JTable tblMatrizSuma;
    private javax.swing.JTable tblMatrizaleGenerate;
    private javax.swing.JTable tblMatrizrResta;
    // End of variables declaration//GEN-END:variables

}
