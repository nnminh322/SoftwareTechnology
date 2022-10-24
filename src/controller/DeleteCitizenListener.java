/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.DeleteCitizenView;

/**
 *
 * @author nnminh322
 */
public class DeleteCitizenListener implements ActionListener{
    
    private DeleteCitizenView deleteCitizenView;

    public DeleteCitizenListener(DeleteCitizenView deleteCitizenView) {
        this.deleteCitizenView = deleteCitizenView;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Find")) {
            deleteCitizenView.showCitizen();
            
        }
        if (src.equals("Delete")) {
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
