/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author sv_minhnn
 */
public class InsertCitizen extends JFrame {
    public InsertCitizen(){
        this.setTitle("Insert Cititzen");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(new GridLayout(8, 1));
        JLabel HouseHoldBookNumber = new JLabel("HouseHoldBookNumber",JLabel.CENTER);        
        JLabel CitizenID = new JLabel("CitizenID",JLabel.CENTER);
        JLabel FullName = new JLabel("FullName",JLabel.CENTER);
        JLabel HouseNumber = new JLabel("HouseNumber",JLabel.CENTER);
        JLabel Street = new JLabel("Street",JLabel.CENTER);
        JLabel Ward = new JLabel("Ward",JLabel.CENTER);
        JLabel District = new JLabel("District",JLabel.CENTER);
        JLabel DateofBirth = new JLabel("DateofBirth",JLabel.CENTER);
        jPanel_label.add(HouseHoldBookNumber);        
        jPanel_label.add(CitizenID);
        jPanel_label.add(FullName);
        jPanel_label.add(HouseNumber);
        jPanel_label.add(Street);
        jPanel_label.add(Ward);
        jPanel_label.add(District);
        jPanel_label.add(DateofBirth);

        JPanel jPanel_textfield = new JPanel();
        jPanel_textfield.setLayout(new GridLayout(8,1));
        JTextField text1 = new JTextField();        
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        JTextField text4 = new JTextField();
        JTextField text5 = new JTextField();
        JTextField text6 = new JTextField();
        JTextField text7 = new JTextField();
        JTextField text8 = new JTextField();
        jPanel_textfield.add(text1);
        jPanel_textfield.add(text2);
        jPanel_textfield.add(text3);
        jPanel_textfield.add(text4);
        jPanel_textfield.add(text5);
        jPanel_textfield.add(text6);
        jPanel_textfield.add(text7);
        jPanel_textfield.add(text8);
      
        JPanel jPanel_control = new JPanel();
        jPanel_control.setLayout(new FlowLayout());
        JButton save = new JButton("Save");
        JButton back = new JButton("Back");
        JButton clear = new JButton("Clear");
        jPanel_control.add(back);
        jPanel_control.add(clear);
        jPanel_control.add(save);
        
        this.add(jPanel_label, BorderLayout.WEST);
        this.add(jPanel_textfield,BorderLayout.CENTER);
        this.add(jPanel_control, BorderLayout.SOUTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new InsertCitizen();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
