/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tn_csdlpt.view;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class PnlReportDangKiThi extends javax.swing.JPanel {

    /**
     * Creates new form pnlReportDangKiThi
     */
    public PnlReportDangKiThi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainReport = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        txtFromDate = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.BorderLayout());

        mainReport.setLayout(new java.awt.BorderLayout());
        add(mainReport, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Từ Ngày :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 22, -1, -1));

        jLabel2.setText("Đến Ngày:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 20, 75, -1));

        btnPrint.setText("In Báo Cáo");
        jPanel2.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        txtEndDate.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 153, -1));

        txtFromDate.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(txtFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 156, -1));

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnPrint() {
        return btnPrint;
    }

    public void setBtnPrint(JButton btnPrint) {
        this.btnPrint = btnPrint;
    }

    public JDateChooser getTxtEndDate() {
        return txtEndDate;
    }

    public void setTxtEndDate(JDateChooser txtEndDate) {
        this.txtEndDate = txtEndDate;
    }

    public JDateChooser getTxtFromDate() {
        return txtFromDate;
    }

    public void setTxtFromDate(JDateChooser txtFromDate) {
        this.txtFromDate = txtFromDate;
    }



    public JPanel getMainReport() {
        return mainReport;
    }

    public void setMainReport(JPanel mainReport) {
        this.mainReport = mainReport;
    }
    
    
    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainReport;
    private com.toedter.calendar.JDateChooser txtEndDate;
    private com.toedter.calendar.JDateChooser txtFromDate;
    // End of variables declaration//GEN-END:variables
}
