/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        System.out.println("Successfully Inserted!");
    }
}
