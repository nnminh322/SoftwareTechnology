/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.DeleteCitizenView;
import view.HomeView;
import view.InsertCitizenView;
import view.UpdateCitizenView;

/**
 *
 * @author nnminh322
 */
public class HomeListener implements ActionListener{
    
    private HomeView homeView;

    public HomeListener(HomeView homeView) {
        this.homeView = homeView;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Insert")) {
            new InsertCitizenView();
            
        }
        if (src.equals("Delete")) {
            new DeleteCitizenView();
        }
        
        if (src.equals("Update")) {
            new UpdateCitizenView();
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
