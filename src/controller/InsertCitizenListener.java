/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author sv_minhnn
 */
public class InsertCitizenListener implements ActionListener{
    private InsertCitizenView IC;

    public InsertCitizenListener(InsertCitizenView IC) {
        this.IC = IC;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Save")) {
            this.IC.InsertCitizen();
            System.out.println("Successfully Inserted!");
            
        }
        if (src.equals("Clear")) {
            this.IC.Clear();
            System.out.println("Cleared!");
            
        }
    }
}
