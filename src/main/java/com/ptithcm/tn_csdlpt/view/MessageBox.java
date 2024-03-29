/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tn_csdlpt.view;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MINHDAT
 */
public class MessageBox {
    public static void showErrorBox(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
     public static void showErrorBox(Component parentComponent, String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showWarningBox(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }
    
    public static void showInformationBox(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showConfirmSuccessBox(String title, String message) {
        ImageIcon imageIcon = new ImageIcon(MessageBox.class.getResource("/icons/32x32/success.png").getPath());
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.OK_OPTION, imageIcon);
    }
}
