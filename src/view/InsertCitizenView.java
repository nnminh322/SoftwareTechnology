package view;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import model.Citizen;

/**
 *
 * @author sv_minhnn
 */
public class InsertCitizenView extends JFrame {
    private Citizen ctzInsert;
    private JButton Save;    
    private JButton Clear;
    private JButton Back;
    private JTextField text1;
    private JTextField text3;
    private JTextField text2;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;

    
    public InsertCitizenView(){
        this.ctzInsert = new Citizen();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Insert Cititzen");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        ActionListener ac = new InsertCitizenListener(this);

        
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
         text1 = new JTextField();        
         text2 = new JTextField();
         text3 = new JTextField();
         text4 = new JTextField();
         text5 = new JTextField();
         text6 = new JTextField();
         text7 = new JTextField();
         text8 = new JTextField();
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
        Save = new JButton("Save");
        Save.addActionListener(ac);
        Back = new JButton("Back");
        Back.addActionListener(ac);
        Clear = new JButton("Clear");
        Clear.addActionListener(ac);
        jPanel_control.add(Back);
        jPanel_control.add(Clear);
        jPanel_control.add(Save);
        
        
        
        this.add(jPanel_label, BorderLayout.WEST);
        this.add(jPanel_textfield,BorderLayout.CENTER);
        this.add(jPanel_control, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void InsertCitizen(){
        int HouseHoldBookNumber = Integer.parseInt(text1.getText());
        String CitizenID = text2.getText();
        String FullName = text3.getText();
        int HouseNumber = Integer.parseInt(text4.getText());
        String Street = text5.getText();
        String Ward = text6.getText();
        String District = text7.getText();
        String DateodBirth = text8.getText();
        ctzInsert.setHouseHoldBookNumber(HouseHoldBookNumber);
        ctzInsert.setCitizenID(CitizenID);
        ctzInsert.setFullName(FullName);
        ctzInsert.setHouseHoldBookNumber(HouseNumber);
        ctzInsert.setStreet(Street);
        ctzInsert.setWard(Ward);
        ctzInsert.setDistrict(District);
        ctzInsert.setDateofBirth(DateodBirth);
//        System.out.println(text1.getText()+text2.getText());
        ctzInsert.Insert(ctzInsert);
    }
    
    public void Clear(){
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
        text7.setText("");
        text8.setText("");

    }
}
