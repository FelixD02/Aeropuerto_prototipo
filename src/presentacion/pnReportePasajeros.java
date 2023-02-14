/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author juanfe
 */
public class pnReportePasajeros extends javax.swing.JPanel {

    /**
     * Creates new form pnPrincipal
     */
    public pnReportePasajeros() {
        initComponents();
        InitStyles();
        initGraph();
        
    }

    private void InitStyles() {
        lbTitulo.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
        lbTitulo.setForeground(Color.black);

        
    }
    
    private void initGraph(){
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setValue(100, "Mayores de Edad",""); //Cambiar 100 por el metodo de obtener numero mayores de edad
        data.setValue(100, "Menores de Edad",""); //Cambiar 100 por el metodo de obtener numero menores de edad
        
        JFreeChart graficoBarras = ChartFactory.createBarChart("Estadisticas de Edad", "Pasajeros", "Numero de Pasajersos", data);
        
        CategoryPlot plot = (CategoryPlot) graficoBarras.getPlot();
        plot.setBackgroundPaint( Color.WHITE );
        
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setBarPainter(new StandardBarPainter());
       
        
        
        ChartPanel pnGraficoBarras = new ChartPanel(graficoBarras);
        pnGraficoBarras.setPreferredSize(new Dimension(400,200));
        pnGraficoBarras.setMouseZoomable(false);
        pnGraficoBarras.setMouseWheelEnabled(false);
        pnBackground.add(pnGraficoBarras,BorderLayout.CENTER);
        
        repaint();
    }
   
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barRenderer1 = new org.jfree.chart.renderer.category.BarRenderer();
        pnBackground = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 380));

        pnBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnBackground.setMaximumSize(new java.awt.Dimension(500, 300));
        pnBackground.setMinimumSize(new java.awt.Dimension(400, 300));
        pnBackground.setPreferredSize(new java.awt.Dimension(400, 300));
        pnBackground.setLayout(new java.awt.BorderLayout());

        lbTitulo.setText("Reporte de Pasajeros");
        pnBackground.add(lbTitulo, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jfree.chart.renderer.category.BarRenderer barRenderer1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnBackground;
    // End of variables declaration//GEN-END:variables
}
