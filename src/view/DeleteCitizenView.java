/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.DeleteCitizenListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public final class DeleteCitizenView extends JFrame {

    private Citizen ctz;
    private JButton jButton_Find;
    private JButton jButton_Delete;
    private JTextField jText_CitizenID;
    private JLabel jLabel_input;
    private JLabel jLabel_HouseHoldBookNumber;
    private JLabel jLabel_CitizenID;
    private JLabel jLabel_FullName;
    private JLabel jLabel_HouseNumber;
    private JLabel jLabel_Street;
    private JLabel jLabel_Ward;
    private JLabel jLabel_District;
    private JLabel jLabel_DateofBirth;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel_first;
    private JPanel jPanel_second;
    private JPanel jPanel_label;
    private JPanel jPanel_data;

    public DeleteCitizenView() {
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Delete Citizen");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        ActionListener ac = new DeleteCitizenListener(this);

        jPanel_first = new JPanel(new BorderLayout());
        jLabel_input = new JLabel("CitienID: ", JLabel.CENTER);
        jText_CitizenID = new JTextField();
        jButton_Find = new JButton("Find");
        jButton_Find.addActionListener(ac);
        jPanel_first.add(jLabel_input, BorderLayout.WEST);
        jPanel_first.add(jText_CitizenID, BorderLayout.CENTER);
        jPanel_first.add(jButton_Find, BorderLayout.EAST);

        jPanel_second = new JPanel(new BorderLayout());
//
        jPanel_label = new JPanel(new GridLayout(8, 1));
        jLabel1 = new JLabel("HouseHoldBookNumber: ", JLabel.CENTER);
        jLabel2 = new JLabel("CitizenID: ", JLabel.CENTER);
        jLabel3 = new JLabel("FullName: ", JLabel.CENTER);
        jLabel4 = new JLabel("HouseNumber: ", JLabel.CENTER);
        jLabel5 = new JLabel("Street: ", JLabel.CENTER);
        jLabel6 = new JLabel("Ward: ", JLabel.CENTER);
        jLabel7 = new JLabel("District: ", JLabel.CENTER);
        jLabel8 = new JLabel("DateofBirth: ", JLabel.CENTER);
        jPanel_label.add(jLabel1);
        jPanel_label.add(jLabel2);
        jPanel_label.add(jLabel3);
        jPanel_label.add(jLabel4);
        jPanel_label.add(jLabel5);
        jPanel_label.add(jLabel6);
        jPanel_label.add(jLabel7);
        jPanel_label.add(jLabel8);
//
        jPanel_data = new JPanel(new GridLayout(8, 1));
        jLabel_HouseHoldBookNumber = new JLabel("");
        jLabel_CitizenID = new JLabel("");
        jLabel_FullName = new JLabel("");
        jLabel_HouseNumber = new JLabel("");
        jLabel_Street = new JLabel("");
        jLabel_Ward = new JLabel("");
        jLabel_District = new JLabel("");
        jLabel_DateofBirth = new JLabel("");

        jPanel_data.add(jLabel_HouseHoldBookNumber);
        jPanel_data.add(jLabel_CitizenID);
        jPanel_data.add(jLabel_FullName);
        jPanel_data.add(jLabel_HouseNumber);
        jPanel_data.add(jLabel_Street);
        jPanel_data.add(jLabel_Ward);
        jPanel_data.add(jLabel_District);
        jPanel_data.add(jLabel_DateofBirth);
//        
        jButton_Delete = new JButton("Delete");
        jButton_Delete.addActionListener(ac);

        jPanel_second.add(jPanel_label, BorderLayout.WEST);
        jPanel_second.add(jPanel_data, BorderLayout.CENTER);
        jPanel_second.add(jButton_Delete, BorderLayout.SOUTH);
//        
        this.add(jPanel_first, BorderLayout.NORTH);
        //this.add(jPanel_second, BorderLayout.CENTER);

    }
    
    public void showCitizen(){
        this.add(jPanel_second, BorderLayout.CENTER);
        this.setVisible(true);
    }

//    public static void main(String[] args) {
//        new DeleteCitizenView();
//    }
}
