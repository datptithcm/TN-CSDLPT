/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tn_csdlpt.controller;

import com.ptithcm.tn_csdlpt.model.dto.ObjectAction;
import com.ptithcm.tn_csdlpt.service.BoDeService;
import com.ptithcm.tn_csdlpt.service.MonHocService;
import com.ptithcm.tn_csdlpt.view.FrmMain;
import com.ptithcm.tn_csdlpt.view.MessageBox;
import com.ptithcm.tn_csdlpt.view.PnlQuestionInfo;
import com.ptithcm.tn_csdlpt.view.PnlWorkSection;
import java.sql.Array;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class BoDeController {
    public static void renderData(FrmMain frmMain, PnlWorkSection pnlWorkSection) {
        try {
            pnlWorkSection.setObjectActions(new BoDeService().getAllQuestions());
            pnlWorkSection.fillDataTable(pnlWorkSection.getObjectActions());
            ((PnlQuestionInfo) pnlWorkSection.getPnlObjectInfo()).fillSubjectComboBox(new MonHocService().getAllSubjects());
            ((PnlQuestionInfo) pnlWorkSection.getPnlObjectInfo()).fillLevelComboBox(new BoDeService().getLevelList());
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }
    
    public static void save(List<ObjectAction> objectActions) {
//        Tạo array để truyền cho tham số tương ứng của sp
//        Array array = 
    }
}
