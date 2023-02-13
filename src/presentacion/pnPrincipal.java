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
public class pnPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form pnPrincipal
     */
    public pnPrincipal() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        lbTitulo.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
        lbTitulo.setForeground(Color.black);
        lbLineaTexto1.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto1.setForeground(Color.black);
        lbLineaTexto3.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto3.setForeground(Color.black);
        lbLineaTexto4.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto4.setForeground(Color.black);
        lbLineaTexto5.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto5.setForeground(Color.black);
        lbLineaTexto6.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto6.setForeground(Color.black);
        lbLineaTexto7.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto7.setForeground(Color.black);
        lbLineaTexto8.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto8.setForeground(Color.black);
        lbLineaTexto9.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto9.setForeground(Color.black);
        lbLineaTexto10.putClientProperty("FlatLaf.styleClass", "large");
        lbLineaTexto10.setForeground(Color.black);
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel();
        lbLineaTexto1 = new javax.swing.JLabel();
        lbLineaTexto3 = new javax.swing.JLabel();
        lbLineaTexto4 = new javax.swing.JLabel();
        lbLineaTexto10 = new javax.swing.JLabel();
        lbLineaTexto9 = new javax.swing.JLabel();
        lbLineaTexto8 = new javax.swing.JLabel();
        lbLineaTexto7 = new javax.swing.JLabel();
        lbLineaTexto6 = new javax.swing.JLabel();
        lbLineaTexto5 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        pnBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnBackground.setMinimumSize(new java.awt.Dimension(750, 430));
        pnBackground.setPreferredSize(new java.awt.Dimension(750, 430));

        lbLineaTexto1.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto1.setText("Controle y Administre de forma optima y facil el flujo de Vuelos en un Aeropuerto.");

        lbLineaTexto3.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto3.setText("Esta herramienta le permitirá llevar un control completo y detallado de su Aeropuerto,");

        lbLineaTexto4.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto4.setText("tendrá acceso a herramientas especiales para tareas específicas, como lo son:");

        lbLineaTexto10.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto10.setText("• Reportes de las Aerolineas");

        lbLineaTexto9.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto9.setText("• Reportes de los Pasajeros");

        lbLineaTexto8.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto8.setText("• Reportes de los Vuelos");

        lbLineaTexto7.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto7.setText("• Edición de Vuelos ya existentes");

        lbLineaTexto6.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto6.setText("• Cancelacion de Vuelos");

        lbLineaTexto5.setForeground(new java.awt.Color(0, 0, 0));
        lbLineaTexto5.setText("• Registro de Vuelos");

        lbTitulo.setText("Sistema de Manejo de Aeropuertos");

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLineaTexto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLineaTexto3, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
                        .addGap(157, 157, 157))
                    .addComponent(lbLineaTexto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLineaTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLineaTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLineaTexto3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLineaTexto4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLineaTexto5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(lbLineaTexto6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(lbLineaTexto7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(lbLineaTexto8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(lbLineaTexto9, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLineaTexto10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbLineaTexto1;
    private javax.swing.JLabel lbLineaTexto10;
    private javax.swing.JLabel lbLineaTexto3;
    private javax.swing.JLabel lbLineaTexto4;
    private javax.swing.JLabel lbLineaTexto5;
    private javax.swing.JLabel lbLineaTexto6;
    private javax.swing.JLabel lbLineaTexto7;
    private javax.swing.JLabel lbLineaTexto8;
    private javax.swing.JLabel lbLineaTexto9;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnBackground;
    // End of variables declaration//GEN-END:variables
}
