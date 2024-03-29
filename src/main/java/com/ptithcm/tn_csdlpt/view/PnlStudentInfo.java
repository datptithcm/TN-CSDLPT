/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tn_csdlpt.view;

import com.ptithcm.tn_csdlpt.entity.BoDe;
import com.ptithcm.tn_csdlpt.entity.Lop;
import com.ptithcm.tn_csdlpt.entity.MonHoc;
import com.ptithcm.tn_csdlpt.model.dto.ObjectAction;
import java.awt.Cursor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MINHDAT
 */
public class PnlStudentInfo extends javax.swing.JPanel {
    private int idCauHoi;
    
    /**
     * Creates new form PnlQuestionInfo
     */
    public PnlStudentInfo() {
        this.idCauHoi = 0;
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

        jPanel1 = new javax.swing.JPanel();
        btnResetForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        comboboxClass = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(400, 624));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResetForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/reset.png"))); // NOI18N
        btnResetForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetFormMouseClicked(evt);
            }
        });
        btnResetForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        btnResetForm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
        jPanel1.add(btnResetForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin sinh viên");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 582));

        jLabel2.setText("Tên:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Địa chỉ :");

        jLabel5.setText("Họ:");

        jLabel11.setText("Mã sinh viên:");

        jLabel12.setText("Lớp");

        comboboxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgaySinh))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTen))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi)
                            .addComponent(comboboxClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtHo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNgaySinh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(330, 330, 330))
        );

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetFormMouseClicked
        reset();
    }//GEN-LAST:event_btnResetFormMouseClicked

    
    //hàm này dùng để reset
    public void reset() {
        txtMaSV.setText("");
        comboboxClass.setSelectedIndex(0);
        txtHo.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
    }
    
    //hàm này dùng để đẩy dữ liệu lên combobox
    public void fillLopComboBox(List<Lop> khoa) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addAll(khoa);
        comboboxClass.setModel(model);
        comboboxClass.setSelectedIndex(0);
    }
    
    //hàm này dùng để xác định item được chọn 
     public void setSelectedKhoaItem(String maLop) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboboxClass.getModel();
        for (int i = 0; i < model.getSize(); ++i) {
            Lop lop = (Lop) model.getElementAt(i);
            if (lop.getMaLop().equals(maLop)) {
                comboboxClass.setSelectedItem(lop);
                break;
            }
        }
    }
    
    
    
    
    
//    Getters and setters
    
    public JComboBox<String> getComboboxClass() {
        return comboboxClass;
    }

    public JTextField getTxtTen() {
        return txtTen;
    }

    public void setTxtTen(JTextField txtTen) {
        this.txtTen = txtTen;
    }

    public void setComboboxClass(JComboBox<String> comboboxClass) {
        this.comboboxClass = comboboxClass;
    }

    public JTextField getTxtDiaChi() {
        return txtDiaChi;
    }

    public void setTxtDiaChi(JTextField txtDiaChi) {
        this.txtDiaChi = txtDiaChi;
    }

    public JTextField getTxtHo() {
        return txtHo;
    }

    public void setTxtHo(JTextField txtHo) {
        this.txtHo = txtHo;
    }

    public JTextField getTxtMaSV() {
        return txtMaSV;
    }

    public void setTxtMaSV(JTextField txtMaSV) {
        this.txtMaSV = txtMaSV;
    }

    public JTextField getTxtNgaySinh() {
        return txtNgaySinh;
    }

    public void setTxtNgaySinh(JTextField txtNgaySinh) {
        this.txtNgaySinh = txtNgaySinh;
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnResetForm;
    private javax.swing.JComboBox<String> comboboxClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
