/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_matrices;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yulie
 */
public class Matriz_manual2 extends javax.swing.JFrame {

    /**
     * Creates new form Matriz_manual2
     */
    private int tamaño;
    private int[][] manualMatriz;
    private int[][] oldMatriz;
    private int currentRow = 0;
    private int currentCol = 0;

    public Matriz_manual2() {
        initComponents();
        this.setLocationRelativeTo(null);
        // Deshabilitar botones inicialmente
        initializeButtonStates();
    }

    private void initializeButtonStates() {
        // Al inicio, solo el botón Generar está habilitado
        btnGenerarm3.setEnabled(true);

        // Los demás botones empiezan deshabilitados
        btnGuardarm2.setEnabled(false);
        btnSuma2.setEnabled(false);
        btnResta2.setEnabled(false);
        btnMultipli2.setEnabled(false);
        txtIngreseM.setEnabled(false);

        // Establece el valor inicial del campo de texto
        txtIngreseM.setText("0");

        // Establece el mensaje inicial
        jLabel1.setText("Presione Generar para comenzar");
    }

    public void settamaño(int n) {
        this.tamaño = n;
    }

   

    /**
     * @param oldMatriz the oldMatriz to set
     */
    public void setOldMatriz(int[][] oldMatriz) {
        this.tamaño = oldMatriz.length;
        this.oldMatriz = oldMatriz;
    }

    // Actualiza el método generarMatrizVacia
    private void generarMatrizVacia() {
        System.out.println(this.tamaño);
        try {
            tblMatrizmn2.setModel(new DefaultTableModel(this.tamaño, this.tamaño));
            // Crear una nueva matriz vacía con el tamaño especificado
            manualMatriz = new int[tamaño][tamaño];
            // Limpiar la tabla (establecer todos los valores a null)

            // Reiniciar los contadores de posición
            currentRow = 0;
            currentCol = 0;

            // Habilitar los controles necesarios
            btnGuardarm2.setEnabled(true);
            txtIngreseM.setEnabled(true);
            txtIngreseM.setText("0");

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    tblMatrizmn2.setValueAt(null, i, j);
                }
            }

            // Actualizar el mensaje para el usuario
            actualizarIndicadorPosicion();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al generar la matriz: " + e.getMessage());
        }
    }

    private void guardarValor() {
        try {
            if (manualMatriz == null) {
                JOptionPane.showMessageDialog(this, "Primero debe generar la matriz");
                return;
            }

            // Validar que la posición actual sea válida
            if (currentRow >= tamaño || currentCol >= tamaño) {
                JOptionPane.showMessageDialog(this, "La matriz ya está completa");
                return;
            }

            // Obtener el valor del TextField
            String valorTexto = txtIngreseM.getText().trim();
            if (valorTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un valor");
                return;
            }

            int valor = Integer.parseInt(valorTexto);

            // Guardar el valor en la matriz y mostrarlo en la tabla
            manualMatriz[currentRow][currentCol] = valor;
            tblMatrizmn2.setValueAt(valor, currentRow, currentCol);

            // Avanzar a la siguiente posición
            currentCol++;
            if (currentCol >= tamaño) {
                currentCol = 0;
                currentRow++;
            }

            // Limpiar el campo de entrada
            txtIngreseM.setText("0");

            // Verificar si la matriz está completa
            if (currentRow >= tamaño) {
                JOptionPane.showMessageDialog(this, "¡Matriz completada!");
                habilitarBotonesOperaciones();
                txtIngreseM.setEnabled(false);
                btnGuardarm2.setEnabled(false);
                jLabel1.setText("Matriz completada. Puede realizar operaciones.");
            } else {
                actualizarIndicadorPosicion();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese un número válido");
        }
    }

    private void llenarMatrizManual() {

        if (txtIngreseM.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor.");
            return; // Salir del método si el campo está vacío
        }

        int valor = Integer.parseInt(txtIngreseM.getText());

        // Store the value in the matrix
        manualMatriz[currentRow][currentCol] = valor;
        // Update the table cell
        tblMatrizmn2.setValueAt(valor, currentRow, currentCol);

        if (currentCol >= tamaño - 1 && currentRow >= tamaño - 1) {
            habilitarBotonesOperaciones();
        }
        currentCol++;
        if (currentCol >= tamaño) {
            currentCol = 0;
            currentRow++;
        }

        txtIngreseM.setText("");
    }

    // Actualiza el método actualizarIndicadorPosicion
    private void actualizarIndicadorPosicion() {
        if (currentRow < tamaño) {
            // Mostrar la posición actual (sumamos 1 para mostrar números naturales en lugar de índices)
            jLabel1.setText(String.format("Ingrese el valor para la posición [%d,%d] de la matriz",
                    currentRow + 1, currentCol + 1));
        }
    }

// Método auxiliar para verificar si la matriz está completa
    private boolean isMatrizCompleta() {
        if (manualMatriz == null) {
            return false;
        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (tblMatrizmn2.getValueAt(i, j) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    // El resto de los métodos (sumarMatrices, restarMatrices, multiplicarMatrices) permanecen igual
    // Modifica el método generarmatriz existente
    public int[][] generarmatriz(int n) {
        try {
            if (manualMatriz == null) {
                manualMatriz = new int[tamaño][tamaño];
            }

            // Obtener el valor actual
            int valor = Integer.parseInt(txtIngreseM.getText());

            // Guardar el valor en la posición actual
            manualMatriz[currentRow][currentCol] = valor;

            // Actualizar la tabla
            tblMatrizmn2.setValueAt(valor, currentRow, currentCol);

            // Mover a la siguiente posición
            currentCol++;
            if (currentCol >= tamaño) {
                currentCol = 0;
                currentRow++;
            }

            // Limpiar el campo de entrada
            txtIngreseM.setText("0");

            // Verificar si la matriz está completa
            if (currentRow >= tamaño) {
                JOptionPane.showMessageDialog(this, "¡Matriz completada!");
                btnGenerarm3.setEnabled(false);
                btnGuardarm2.setEnabled(false);
                txtIngreseM.setEnabled(false);
                habilitarBotonesOperaciones();
                return manualMatriz;
            }

            // Actualizar el indicador de posición
            actualizarIndicadorPosicion();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numérico válido");
        }

        return manualMatriz;
    }

    private void habilitarBotonesOperaciones() {
        // Solo habilita los botones si tanto la matriz actual (manualMatriz) 
        // como la matriz anterior (oldMatriz) existen
        if (manualMatriz != null && oldMatriz != null) {
            btnSuma2.setEnabled(true);
            btnResta2.setEnabled(true);
            btnMultipli2.setEnabled(true);
            jLabel1.setText("Matriz completada. Puede realizar operaciones.");
        } else {
            btnSuma2.setEnabled(false);
            btnResta2.setEnabled(false);
            btnMultipli2.setEnabled(false);
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
        try {
            DefaultTableModel modelo = new DefaultTableModel(tamaño, tamaño);
            tablaDestino.setModel(modelo);

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    modelo.setValueAt(resultado[i][j], i, j);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar el resultado: " + e.getMessage());
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatrizmulti2 = new javax.swing.JTable();
        btnAtrasAutomatic = new javax.swing.JButton();
        btnAtrasManual = new javax.swing.JButton();
        btnGenerarm3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatrizr2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizs2 = new javax.swing.JTable();
        btnMultipli2 = new javax.swing.JButton();
        btnResta2 = new javax.swing.JButton();
        btnSuma2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizmn2 = new javax.swing.JTable();
        txtIngreseM = new javax.swing.JTextField();
        btnGuardarm2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tblMatrizmulti2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMatrizmulti2);

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

        btnGenerarm3.setText("Generar");
        btnGenerarm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarm3ActionPerformed(evt);
            }
        });

        tblMatrizr2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatrizr2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Oprima guardar, para guardar los datos en la matriz");

        tblMatrizs2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizs2);

        btnMultipli2.setText("Multiplicación");
        btnMultipli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipli2ActionPerformed(evt);
            }
        });

        btnResta2.setText("Resta");
        btnResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResta2ActionPerformed(evt);
            }
        });

        btnSuma2.setText("Suma");
        btnSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuma2ActionPerformed(evt);
            }
        });

        tblMatrizmn2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizmn2);

        txtIngreseM.setText("0");
        txtIngreseM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngreseMActionPerformed(evt);
            }
        });

        btnGuardarm2.setText("Guardar");
        btnGuardarm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarm2ActionPerformed(evt);
            }
        });

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
                            .addComponent(btnMultipli2)
                            .addComponent(btnGenerarm3)
                            .addComponent(btnSuma2)
                            .addComponent(btnResta2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtIngreseM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtrasAutomatic)
                            .addComponent(btnAtrasManual))
                        .addGap(223, 223, 223))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnGuardarm2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIngreseM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarm2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarm3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtrasAutomatic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtrasManual)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResta2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultipli2)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuma2ActionPerformed
        // TODO add your handling code here:
        if (manualMatriz != null && oldMatriz != null) {
            int[][] resultado = sumarMatrices(manualMatriz, oldMatriz);
            mostrarResultado(resultado, tblMatrizs2);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe generar y guardar la matriz primero",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuma2ActionPerformed

    private void btnAtrasManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasManualActionPerformed
        // TODO add your handling code here:
        MtrizMnal1 mm1 = new MtrizMnal1();
        mm1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasManualActionPerformed

    private void btnAtrasAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAutomaticActionPerformed
        // TODO add your handling code here:
        Menu2 m2 = new Menu2();
        m2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasAutomaticActionPerformed

    private void btnGuardarm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarm2ActionPerformed
        // TODO add your handling code here:
        //guardarValor();
        llenarMatrizManual();
    }//GEN-LAST:event_btnGuardarm2ActionPerformed

    private void btnGenerarm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarm3ActionPerformed
        generarMatrizVacia();
        // Después de generar la matriz vacía, el botón Generar se deshabilita
        btnGenerarm3.setEnabled(false);
    }//GEN-LAST:event_btnGenerarm3ActionPerformed

    private void btnResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResta2ActionPerformed
        // TODO add your handling code here:
        if (manualMatriz != null && oldMatriz != null) {
            int[][] resultado = restarMatrices(manualMatriz, oldMatriz);
            mostrarResultado(resultado, tblMatrizr2);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe generar y guardar la matriz primero",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnResta2ActionPerformed

    private void btnMultipli2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipli2ActionPerformed
        // TODO add your handling code here:
        if (manualMatriz != null && oldMatriz!= null) {
            int[][] resultado = multiplicarMatrices(manualMatriz, oldMatriz);
            mostrarResultado(resultado, tblMatrizmulti2);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe generar y guardar la matriz primero",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMultipli2ActionPerformed

    private void txtIngreseMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngreseMActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        guardarValor();
    }//GEN-LAST:event_txtIngreseMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Matriz_manual2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz_manual2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz_manual2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz_manual2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz_manual2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasAutomatic;
    private javax.swing.JButton btnAtrasManual;
    private javax.swing.JButton btnGenerarm3;
    private javax.swing.JButton btnGuardarm2;
    private javax.swing.JButton btnMultipli2;
    private javax.swing.JButton btnResta2;
    private javax.swing.JButton btnSuma2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblMatrizmn2;
    private javax.swing.JTable tblMatrizmulti2;
    private javax.swing.JTable tblMatrizr2;
    private javax.swing.JTable tblMatrizs2;
    private javax.swing.JTextField txtIngreseM;
    // End of variables declaration//GEN-END:variables
}
