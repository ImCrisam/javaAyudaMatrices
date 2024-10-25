
package com.mycompany.proyecto_matrices;

import java.util.Random;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Menu2 extends javax.swing.JFrame {

    private int deter;
    private int trans;
    
    public Menu2() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmatriz = new javax.swing.JTable();
        btngenerar = new javax.swing.JButton();
        txttamaño = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxMenu3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(583, 292));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Digite el tamaño de la matriz entre 2 y 5");

        btnAtras2.setText("Atras");
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });

        tblmatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblmatriz);

        btngenerar.setText("Generar");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        txttamaño.setText("0");
        txttamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttamañoActionPerformed(evt);
            }
        });
        txttamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttamañoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Elija que desea hacer con la matriz:");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btngenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras2)
                    .addComponent(cbxMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        // TODO add your handling code here:
        Proyecto_Matrices2 pm2 = new Proyecto_Matrices2();
        pm2.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        int n = Integer.parseInt(getTxtTamaño().getText());
        if (n > 1 && n < 6){
        int[][] matriz = generarmatriz(n);
        mostarmatriz(matriz, n);
        cbxMenu3.setEnabled(true);
        }else{
            cbxMenu3.setEnabled(false);
        }  
    }//GEN-LAST:event_btngenerarActionPerformed

    private void txttamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttamañoActionPerformed
    

    }//GEN-LAST:event_txttamañoActionPerformed

    private void txttamañoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttamañoKeyReleased

    private void cbxMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMenu3ActionPerformed
        // TODO add your handling code here:
    int n = Integer.parseInt(getTxtTamaño().getText());
    
    // Obtener la matriz actual de la tabla
    int[][] matriz = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriz[i][j] = Integer.parseInt(tblmatriz.getValueAt(i, j).toString());
        }
    }
    
    // Calcular determinante
    int determinante = calcularDeterminante(matriz);
    
    // Calcular transpuesta
    int[][] transpuesta = transponerMatriz(matriz, n);
    
    double [][] inversa = calcularInversa (matriz);
    
    int Menu2 = cbxMenu3.getSelectedIndex();
    if(Menu2 == 0){
        Determinante de = new Determinante();
        de.setDeter(determinante);
        de.setVisible(true);
        
    } else if(Menu2 == 1){
        Transpuesta trn = new Transpuesta();
        trn.mostrarTranspuesta(transpuesta, n);  // Nuevo método que crearemos
        trn.setVisible(true);
        
    } else if (Menu2 == 2){
        Inversa inv = new Inversa();
        inv.mostrarInversa(inversa, n);
        inv.setVisible(true);
        
    }else if (Menu2 == 3){
        Matriz_automatica2 ma2 = new Matriz_automatica2();
        ma2.setOldMatriz(matriz);
        ma2.setVisible(true);
    }else if (Menu2 == 4){
        Matriz_manual2 mml2 = new Matriz_manual2();
        mml2.setVisible(true);
        mml2.setOldMatriz(matriz); //guarda la matriz en la otra vistal
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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
        
        
    }
    
    
    public int[][] generarmatriz(int n){
        
       
    Random rand = new Random();
  
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(25); // Números aleatorios entre 0 y 24
            }
        }
        return matriz;
    }
    public void mostarmatriz(int matriz[][], int n){
        DefaultTableModel modelo = (DefaultTableModel)tblmatriz.getModel();
        modelo.setRowCount(n);
        modelo.setColumnCount(n);
        for ( int i=0 ; i<n ; i++){
            for ( int j=0 ;j<n;j++){
                tblmatriz.setValueAt(matriz[i][j], i, j);
            }
        }
        
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
    

    public void setTxtTamaño(JTextField txttamaño) { 
    this.txttamaño = txttamaño; 
}
    public JTextField getTxtTamaño() { 
    return txttamaño; 
} 
    public javax.swing.JTable getTblmatriz() {
    return tblmatriz;
}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btngenerar;
    private javax.swing.JComboBox<String> cbxMenu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmatriz;
    private javax.swing.JTextField txttamaño;
    // End of variables declaration//GEN-END:variables
}
