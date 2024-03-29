/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tn_csdlpt.view;

import javax.swing.JLabel;

/**
 *
 * @author MINHDAT
 */
public class PnlManageBar extends javax.swing.JPanel {

    /**
     * Creates new form b */
    public PnlManageBar() {
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

        btnAdd = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        btnUndo = new javax.swing.JLabel();
        btnRedo = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        btnExportFile = new javax.swing.JLabel();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/plus.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setName("Add"); // NOI18N
        add(btnAdd);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/edit.png"))); // NOI18N
        btnUpdate.setText("Chỉnh sửa");
        btnUpdate.setEnabled(false);
        btnUpdate.setName("Update"); // NOI18N
        add(btnUpdate);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setEnabled(false);
        btnDelete.setName("Delete"); // NOI18N
        add(btnDelete);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/save.png"))); // NOI18N
        btnSave.setText("Ghi");
        btnSave.setEnabled(false);
        btnSave.setName("Save"); // NOI18N
        add(btnSave);

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/undo.png"))); // NOI18N
        btnUndo.setText("Undo");
        btnUndo.setEnabled(false);
        btnUndo.setName("Undo"); // NOI18N
        add(btnUndo);

        btnRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/redo.png"))); // NOI18N
        btnRedo.setText("Redo");
        btnRedo.setEnabled(false);
        btnRedo.setName("Redo"); // NOI18N
        add(btnRedo);

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/reload.png"))); // NOI18N
        btnReload.setText("Reload");
        btnReload.setName("Reload"); // NOI18N
        btnReload.setVerifyInputWhenFocusTarget(false);
        add(btnReload);

        btnExportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/export.png"))); // NOI18N
        btnExportFile.setText("Xuất file");
        btnExportFile.setName("Export file"); // NOI18N
        add(btnExportFile);
    }// </editor-fold>//GEN-END:initComponents

    public void disableManageButtons(String btnName) {
        switch (btnName) {
            case "Add":
            case "Update":
            case "Delete":
                btnSave.setEnabled(true);
                btnUndo.setEnabled(true);
                btnRedo.setEnabled(false);
                switch (btnName) {
                    case "Add":
                    case "Update":
                        btnUpdate.setEnabled(true);
                        btnDelete.setEnabled(true);
                        break;
                    case "Delete":
                        btnUpdate.setEnabled(false);
                        btnDelete.setEnabled(false);
                        break;
                }
                break;
            case "Save":
                btnSave.setEnabled(false);
                break;
            case "Undo":
            case "Redo":
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
                btnSave.setEnabled(true);
                switch (btnName) {
                    case "Undo":
                        btnRedo.setEnabled(true);
                        break;
                    case "Redo":
                        btnUndo.setEnabled(true);
                        break;
                }
                break;
            case "Reload":
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);
                btnSave.setEnabled(false);
                btnUndo.setEnabled(false);
                btnRedo.setEnabled(false);
                break;
            case "Selected row":
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
                break;
            default:
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);
                btnSave.setEnabled(false);
                btnUndo.setEnabled(false);
                btnRedo.setEnabled(false);
        }
    }
    
//    Getters and setters
    public JLabel getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JLabel btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JLabel getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JLabel btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JLabel getBtnExportFile() {
        return btnExportFile;
    }

    public void setBtnExportFile(JLabel btnExportFile) {
        this.btnExportFile = btnExportFile;
    }

    public JLabel getBtnReload() {
        return btnReload;
    }

    public void setBtnReload(JLabel btnReload) {
        this.btnReload = btnReload;
    }

    public JLabel getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JLabel btnSave) {
        this.btnSave = btnSave;
    }

    public JLabel getBtnUndo() {
        return btnUndo;
    }

    public void setBtnUndo(JLabel btnUndo) {
        this.btnUndo = btnUndo;
    }

    public JLabel getBtnRedo() {
        return btnRedo;
    }

    public void setBtnRedo(JLabel btnRedo) {
        this.btnRedo = btnRedo;
    }
    
    public JLabel getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JLabel btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnExportFile;
    private javax.swing.JLabel btnRedo;
    private javax.swing.JLabel btnReload;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnUndo;
    private javax.swing.JLabel btnUpdate;
    // End of variables declaration//GEN-END:variables
}
