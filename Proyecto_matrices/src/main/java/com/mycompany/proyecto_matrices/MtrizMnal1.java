
package com.mycompany.proyecto_matrices;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class MtrizMnal1 extends javax.swing.JFrame {
    private int currentRow = 0;
    private int currentCol = 0;
    private int matrixSize = 0;
    private int[][] matriz;
   
    
    
    public MtrizMnal1() {
        initComponents();
        btngenerar2.setEnabled(false);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtrasMtrizMnal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttamaño2 = new javax.swing.JTextField();
        txtvalores = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmatriz2 = new javax.swing.JTable();
        btngenerar2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cbxMenu3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese los valores enteros de la matriz:");

        btnAtrasMtrizMnal.setText("Atras");
        btnAtrasMtrizMnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasMtrizMnalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Digite el tamaño de la matriz entre 2 y 5");

        txttamaño2.setText("0");
        txttamaño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttamaño2ActionPerformed(evt);
            }
        });

        txtvalores.setText("0");
        txtvalores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvaloresActionPerformed(evt);
            }
        });

        tblmatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblmatriz2);

        btngenerar2.setText("GENERAR");
        btngenerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerar2ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxMenu3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hallar la determinante", "Hallar la transpuesta", "Hallar la inversa", "Nueva matriz automatica", "Nueva matriz manual" }));
        cbxMenu3.setEnabled(false);
        cbxMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttamaño2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtvalores, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btngenerar2)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtrasMtrizMnal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttamaño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtvalores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btngenerar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(btnAtrasMtrizMnal)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(cbxMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btnAtrasMtrizMnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasMtrizMnalActionPerformed
        // TODO add your handling code here:
        Proyecto_Matrices2 pm2 = new Proyecto_Matrices2();
        pm2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasMtrizMnalActionPerformed

    private void txtvaloresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvaloresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvaloresActionPerformed

    private void btngenerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerar2ActionPerformed
        // TODO add your handling code here:
        if (matriz != null) {
            mostarmatriz(matriz, matrixSize);
            cbxMenu3.setEnabled(true);
        }
    }
    
    public void mostarmatriz(int matriz[][], int n) {
        DefaultTableModel modelo = (DefaultTableModel)tblmatriz2.getModel();
        modelo.setRowCount(n);
        modelo.setColumnCount(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tblmatriz2.setValueAt(matriz[i][j], i, j);
            }
        }
    }//GEN-LAST:event_btngenerar2ActionPerformed

    private void txttamaño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttamaño2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttamaño2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            // Only get matrix size if it hasn't been set yet
            if (matrixSize == 0) {
                matrixSize = Integer.parseInt(txttamaño2.getText());
                
                if (matrixSize < 2 || matrixSize > 5) {
                    JOptionPane.showMessageDialog(this, "El tamaño debe estar entre 2 y 5");
                    return;
                }
                
                // Initialize matrix and table
                matriz = new int[matrixSize][matrixSize];
                DefaultTableModel modelo = new DefaultTableModel(matrixSize, matrixSize);
                tblmatriz2.setModel(modelo);
                
                // Clear the value textfield for next input
                txtvalores.setText("");
                JOptionPane.showMessageDialog(this, "Tamaño de matriz establecido. Ingrese los valores uno por uno.");
                return;
            }
            
            // Get the current value to insert
            int valor = Integer.parseInt(txtvalores.getText());
            
            // Store the value in the matrix
            matriz[currentRow][currentCol] = valor;
            
            // Update the table cell
            tblmatriz2.setValueAt(valor, currentRow, currentCol);
            
            // Move to next position
            currentCol++;
            if (currentCol >= matrixSize) {
                currentCol = 0;
                currentRow++;
            }
            
            // Clear the input field
            txtvalores.setText("");
            
            // Check if matrix is complete
            if (currentRow >= matrixSize) {
                JOptionPane.showMessageDialog(this, "¡Matriz completada!");
                btngenerar2.setEnabled(true);
                btnGuardar.setEnabled(false);
                txttamaño2.setEnabled(false);
                txtvalores.setEnabled(false);
                return;
            }
            
            // Show next position to fill

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numérico válido");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMenu3ActionPerformed
        // TODO add your handling code here:
       int n = tblmatriz2.getRowCount();
        int[][] matriz = obtenerMatrizDeTabla();
        
        int Menu2 = cbxMenu3.getSelectedIndex();
    if(Menu2 == 0){
        int determinante = calcularDeterminante(matriz);
        Determinante de = new Determinante();
        de.setDeter(determinante);
        de.setVisible(true);
        
    } else if(Menu2 == 1){
        int[][] transpuesta = transponerMatriz(matriz, n);
        Transpuesta trn = new Transpuesta();
        trn.mostrarTranspuesta(transpuesta, n);  // Nuevo método que crearemos
        trn.setVisible(true);
        
    } else if (Menu2 == 2){
        double[][] inversa = calcularInversa(matriz);
            if (inversa != null) {
                Inversa inv = new Inversa();
                inv.mostrarInversa(inversa, n);
                inv.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "La matriz no tiene inversa (determinante = 0)");
            }
    }else if (Menu2 == 3){
        Matriz_automatica2 ma2 = new Matriz_automatica2();
        ma2.setVisible(true);
    }else if (Menu2 == 4){
        Matriz_manual2 mml2 = new Matriz_manual2();
        mml2.setVisible(true);
    }
    }//GEN-LAST:event_cbxMenu3ActionPerformed
public double[][] calcularInversa(int[][] matriz) {
    int n = matriz.length;
    double[][] matrizAmpliada = new double[n][2*n];
    double[][] inversa = new double[n][n];
    
    // Verificar si tiene inversa
    if (calcularDeterminante(matriz) == 0) {
        return null;
    }
    
    // Crear matriz ampliada [A|I]
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrizAmpliada[i][j] = matriz[i][j];
            matrizAmpliada[i][j + n] = (i == j) ? 1 : 0;
        }
    }
    
    // Gauss-Jordan
    for (int i = 0; i < n; i++) {
        // Hacer pivote = 1
        double pivote = matrizAmpliada[i][i];
        for (int j = 0; j < 2*n; j++) {
            matrizAmpliada[i][j] /= pivote;
        }
        
        // Hacer ceros en la columna
        for (int k = 0; k < n; k++) {
            if (k != i) {
                double factor = matrizAmpliada[k][i];
                for (int j = 0; j < 2*n; j++) {
                    matrizAmpliada[k][j] -= factor * matrizAmpliada[i][j];
                }
            }
        }
    }
    
    // Extraer la inversa
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            inversa[i][j] = matrizAmpliada[i][j + n];
        }
    }
    
    return inversa;
}
   
    
    public int[][] generarmatriz(int n){
        
        int size = Math.min(n, 6); 
    int [][] matriz = new int[size][size];
    int valor = Integer.parseInt(txtvalores.getText());
    
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            matriz[i][j] = valor;
        } 
    }
    return matriz;
    }
    private int[][] obtenerMatrizDeTabla() {
    int n = tblmatriz2.getRowCount();
    int[][] matriz = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriz[i][j] = Integer.parseInt(tblmatriz2.getValueAt(i, j).toString());
        }
    }
    return matriz;
}
    public static int calcularDeterminante(int[][] matriz) {
        int n = matriz.length;
        if (n == 1) {
            return matriz[0][0];
        }
        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
        int determinante = 0;
        for (int i = 0; i < n; i++) {
            determinante += Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(obtenerMenor(matriz, 0, i));
        }
        return determinante;
        
    }
    
    public static int[][] obtenerMenor(int[][] matriz, int fila, int columna) {
        int n = matriz.length;
        int[][] menor = new int[n - 1][n - 1];
        for (int i = 0, m = 0; i < n; i++) {
            if (i == fila) continue;
            for (int j = 0, nCol = 0; j < matriz[i].length; j++) {
                if (j == columna) continue;
                menor[m][nCol++] = matriz[i][j];
            }
            m++;
        }
        return menor;
    }
   
    public int[][] transponerMatriz(int[][] matriz, int n) {
    int[][] transpuesta = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            transpuesta[i][j] = matriz[j][i];
        }
    }
    return transpuesta;
    }
    private void resetMatrix() {
        matrixSize = 0;
        currentRow = 0;
        currentCol = 0;
        matriz = null;
        btngenerar2.setEnabled(false);
        btnGuardar.setEnabled(true);
        txttamaño2.setEnabled(true);
        txtvalores.setEnabled(true);
        txttamaño2.setText("0");
        txtvalores.setText("0");
        DefaultTableModel modelo = new DefaultTableModel();
        tblmatriz2.setModel(modelo);
    }
    
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
            java.util.logging.Logger.getLogger(MtrizMnal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MtrizMnal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MtrizMnal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MtrizMnal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MtrizMnal1().setVisible(true);
            }
        });
    }
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasMtrizMnal;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btngenerar2;
    private javax.swing.JComboBox<String> cbxMenu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmatriz2;
    private javax.swing.JTextField txttamaño2;
    private javax.swing.JTextField txtvalores;
    // End of variables declaration//GEN-END:variables
}
