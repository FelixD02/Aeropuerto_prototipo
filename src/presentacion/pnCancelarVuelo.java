/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.awt.Color;

/**
 *
 * @author juanfe
 */
public class pnCancelarVuelo extends javax.swing.JPanel {

    /**
     * Creates new form pnPrincipal
     */
    public pnCancelarVuelo() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        lbTitulo.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
        lbTitulo.setForeground(Color.black);
        lbID.putClientProperty("FlatLaf.styleClass", "large");
        lbID.setForeground(Color.black);
        lbAerolinea.putClientProperty("FlatLaf.styleClass", "large");
        lbAerolinea.setForeground(Color.black);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btCancelarVuelo = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbAerolinea = new javax.swing.JLabel();
        txtAerolinea = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        pnBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnBackground.setMinimumSize(new java.awt.Dimension(750, 430));
        pnBackground.setPreferredSize(new java.awt.Dimension(750, 430));

        lbTitulo.setText("Cancelación de un Vuelo");

        btCancelarVuelo.setBackground(new java.awt.Color(255, 255, 255));
        btCancelarVuelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btCancelarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarVuelo.setText("Cancelar");
        btCancelarVuelo.setBorder(null);
        btCancelarVuelo.setBorderPainted(false);
        btCancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVueloActionPerformed(evt);
            }
        });

        lbID.setText("Id:");

        lbAerolinea.setText("Aerolinea:");

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                        .addGap(96, 96, 96))
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                                .addComponent(lbAerolinea, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID)
                            .addComponent(txtAerolinea, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(471, 471, 471))))
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addComponent(btCancelarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(471, 471, 471))
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAerolinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAerolinea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btCancelarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarVueloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarVuelo;
    private javax.swing.JLabel lbAerolinea;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextField txtAerolinea;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}