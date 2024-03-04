/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo;

/**
 *
 * @author Impressão
 */
public class SuperCalculadoraSwing extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalculadoraSwing
     */
    public SuperCalculadoraSwing() {
        initComponents();
        painelValores.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valorCalcular = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        painelValores = new javax.swing.JPanel();
        lblDiv2 = new javax.swing.JLabel();
        lblElevCubo = new javax.swing.JLabel();
        lblRaizQuad = new javax.swing.JLabel();
        lblRaizCub = new javax.swing.JLabel();
        lblValAbs = new javax.swing.JLabel();
        resultadoRestopor2 = new javax.swing.JLabel();
        resultadoElevadoCubo = new javax.swing.JLabel();
        resultadoRaizQuadrada = new javax.swing.JLabel();
        resultadoRaizCubica = new javax.swing.JLabel();
        resultadoValorAbsoluto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Informe um valor:");

        valorCalcular.setModel(new javax.swing.SpinnerNumberModel());

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculator_5439139.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculadoraG.png"))); // NOI18N

        lblDiv2.setText("Resto da Divisão por 2");
        lblDiv2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        lblElevCubo.setText("Elevado ao Cubo");
        lblElevCubo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        lblRaizQuad.setText("Raiz Quadrada");
        lblRaizQuad.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        lblRaizCub.setText("Raiz Cúbica");
        lblRaizCub.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        lblValAbs.setText("Valor Absoluto");
        lblValAbs.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        resultadoRestopor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoRestopor2.setText("0");
        resultadoRestopor2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        resultadoElevadoCubo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoElevadoCubo.setText("0");
        resultadoElevadoCubo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        resultadoRaizQuadrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoRaizQuadrada.setText("0");

        resultadoRaizCubica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoRaizCubica.setText("0");
        resultadoRaizCubica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        resultadoValorAbsoluto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoValorAbsoluto.setText("0");
        resultadoValorAbsoluto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                resultadoRaizQuadradaComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout painelValoresLayout = new javax.swing.GroupLayout(painelValores);
        painelValores.setLayout(painelValoresLayout);
        painelValoresLayout.setHorizontalGroup(
            painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelValoresLayout.createSequentialGroup()
                        .addComponent(lblDiv2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(245, 245, 245))
                    .addGroup(painelValoresLayout.createSequentialGroup()
                        .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElevCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValAbs)
                            .addComponent(lblRaizCub)
                            .addComponent(lblRaizQuad))
                        .addGap(29, 29, 29)
                        .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultadoRestopor2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(resultadoElevadoCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultadoRaizQuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultadoRaizCubica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultadoValorAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelValoresLayout.setVerticalGroup(
            painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValoresLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiv2)
                    .addComponent(resultadoRestopor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElevCubo)
                    .addComponent(resultadoElevadoCubo))
                .addGap(18, 18, 18)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizQuad)
                    .addComponent(resultadoRaizQuadrada))
                .addGap(18, 18, 18)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizCub)
                    .addComponent(resultadoRaizCubica))
                .addGap(18, 18, 18)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValAbs)
                    .addComponent(resultadoValorAbsoluto))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(painelValores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(valorCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCalcular))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valorCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoRaizQuadradaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_resultadoRaizQuadradaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoRaizQuadradaComponentHidden

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        painelValores.setVisible(true);
        int valor = Integer.parseInt(valorCalcular.getValue().toString());
        int resDiv2 = valor%2;
        float resElevCub = (float) Math.pow(valor, 3);
        float resRaizQuad = (float) Math.sqrt(valor);
        float resRaizCub = (float) Math.cbrt(valor);
        int valAbs = Math.abs(valor);
        
        resultadoRestopor2.setText(Integer.toString(resDiv2));
        resultadoElevadoCubo.setText(String.format("%.2f", resElevCub));
        resultadoRaizQuadrada.setText(String.format("%.2f", resRaizQuad));
        resultadoRaizCubica.setText(String.format("%.2f", resRaizCub));
        resultadoValorAbsoluto.setText(Integer.toString(valAbs));


    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalculadoraSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDiv2;
    private javax.swing.JLabel lblElevCubo;
    private javax.swing.JLabel lblRaizCub;
    private javax.swing.JLabel lblRaizQuad;
    private javax.swing.JLabel lblValAbs;
    private javax.swing.JPanel painelValores;
    private javax.swing.JLabel resultadoElevadoCubo;
    private javax.swing.JLabel resultadoRaizCubica;
    private javax.swing.JLabel resultadoRaizQuadrada;
    private javax.swing.JLabel resultadoRestopor2;
    private javax.swing.JLabel resultadoValorAbsoluto;
    private javax.swing.JSpinner valorCalcular;
    // End of variables declaration//GEN-END:variables
}