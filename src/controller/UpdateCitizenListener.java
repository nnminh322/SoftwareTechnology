/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.UpdateCitizenView;

/**
 *
 * @author nnminh322
 */
public class UpdateCitizenListener implements ActionListener{
    
    private UpdateCitizenView updateCitizenView;

    public UpdateCitizenListener(UpdateCitizenView updateCitizenView) {
        this.updateCitizenView = updateCitizenView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        
        if (src.equals("Find")) {
            updateCitizenView.showCitizen();
        }
        
        if (src.equals("Update")) {
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
