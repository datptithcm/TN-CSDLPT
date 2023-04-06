/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tn_csdlpt.service;

import com.ptithcm.tn_csdlpt.entity.BoDe;
import com.ptithcm.tn_csdlpt.repository.BoDeRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class BoDeService {
    
    public List<BoDe> getAllQuestions() throws SQLException {
        return toBoDe(new BoDeRepository().findAll());
    }
    
    public List<String> getLevelList() throws SQLException {
        return new BoDeRepository().getLevelList();
    }
    
    public List<BoDe> toBoDe(List<Object> objects) {
        List<BoDe> questions = new ArrayList<>();
        objects.forEach(object -> questions.add((BoDe) object));
        return questions;
    }
}