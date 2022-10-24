/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.DeleteCitizenListener;
import controller.UpdateCitizenListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
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
public final class UpdateCitizenView extends JFrame {

    private Citizen ctz;
    private JButton jButton_Find;
    private JButton jButton_Delete;
    private JTextField jText_CitizenID;
    private JTextField jText_newHouseHoldBookNumber;
    //private JTextField jText_newCitizenId;
    private JTextField jText_newFullName;
    private JTextField jText_newHouseNumber;
    private JTextField jText_newStreet;
    private JTextField jText_newWard;
    private JTextField jText_newDistrict;
    private JTextField jText_newDateofBirth;

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
    private JLabel jLabel_deduce1;
    private JLabel jLabel_deduce2;
    private JLabel jLabel_deduce3;
    private JLabel jLabel_deduce4;
    private JLabel jLabel_deduce5;
    private JLabel jLabel_deduce6;
    private JLabel jLabel_deduce7;
    private JLabel jLabel_deduce8;

    private JPanel jPanel_first;
    private JPanel jPanel_second;
    private JPanel jPanel_label;
    private JPanel jPanel_oldCitizen;
    private JPanel jPanel_newCitizen;
    private JPanel jPanel_Citizen;
    private JPanel jPanel_deduce;

    public UpdateCitizenView() {
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Update Citizen");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        ActionListener ac = new UpdateCitizenListener(this);

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
        jPanel_oldCitizen = new JPanel(new GridLayout(8, 1));
        jLabel_HouseHoldBookNumber = new JLabel("");
        jLabel_CitizenID = new JLabel("");
        jLabel_FullName = new JLabel("");
        jLabel_HouseNumber = new JLabel("");
        jLabel_Street = new JLabel("");
        jLabel_Ward = new JLabel("");
        jLabel_District = new JLabel("");
        jLabel_DateofBirth = new JLabel("");

        jPanel_oldCitizen.add(jLabel_HouseHoldBookNumber);
        jPanel_oldCitizen.add(jLabel_CitizenID);
        jPanel_oldCitizen.add(jLabel_FullName);
        jPanel_oldCitizen.add(jLabel_HouseNumber);
        jPanel_oldCitizen.add(jLabel_Street);
        jPanel_oldCitizen.add(jLabel_Ward);
        jPanel_oldCitizen.add(jLabel_District);
        jPanel_oldCitizen.add(jLabel_DateofBirth);

        jPanel_deduce = new JPanel(new GridLayout(8, 1));
        jLabel_deduce1 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce2 = new JLabel("", JLabel.CENTER);
        jLabel_deduce3 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce4 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce5 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce6 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce7 = new JLabel("=>", JLabel.CENTER);
        jLabel_deduce8 = new JLabel("=>", JLabel.CENTER);

        jPanel_deduce.add(jLabel_deduce1);
        jPanel_deduce.add(jLabel_deduce2);
        jPanel_deduce.add(jLabel_deduce3);
        jPanel_deduce.add(jLabel_deduce4);
        jPanel_deduce.add(jLabel_deduce5);
        jPanel_deduce.add(jLabel_deduce6);
        jPanel_deduce.add(jLabel_deduce7);
        jPanel_deduce.add(jLabel_deduce8);

//        jPanel_newCitizen_East = new JPanel(new GridLayout(8, 1));
        jPanel_newCitizen = new JPanel(new GridLayout(8, 1));
        jText_newHouseHoldBookNumber = new JTextField();
        jText_newFullName = new JTextField();
        jText_newHouseNumber = new JTextField();
        jText_newStreet = new JTextField();
        jText_newWard = new JTextField();
        jText_newDistrict = new JTextField();
        jText_newDateofBirth = new JTextField();
        jPanel_newCitizen.add(jText_newHouseHoldBookNumber);
        jPanel_newCitizen.add(jLabel_CitizenID);
        jPanel_newCitizen.add(jText_newFullName);
        jPanel_newCitizen.add(jText_newHouseNumber);
        jPanel_newCitizen.add(jText_newStreet);
        jPanel_newCitizen.add(jText_newWard);
        jPanel_newCitizen.add(jText_newDistrict);
        jPanel_newCitizen.add(jText_newDateofBirth);

        jPanel_Citizen = new JPanel(new GridLayout(1, 2));
        jPanel_Citizen.add(jPanel_oldCitizen);
        jPanel_Citizen.add(jPanel_deduce);
        jPanel_Citizen.add(jPanel_newCitizen);
//        jPanel_newCitizen.add(jPanel_data, BorderLayout.WEST);
//        jPanel_newCitizen.add(jPanel_newCitizen, BorderLayout.EAST);
        //jPanel_newCitizen.add(jPanel_newCitizen_Center, BorderLayout.CENTER);
        //jPanel_newCitizen.add(jPanel_newCitizen_East, BorderLayout.EAST);

//        
        jButton_Delete = new JButton("Update");
        jButton_Delete.addActionListener(ac);

        jPanel_second.add(jPanel_label, BorderLayout.WEST);
        //jPanel_second.add(jPanel_data, BorderLayout.CENTER);
        jPanel_second.add(jButton_Delete, BorderLayout.SOUTH);
        jPanel_second.add(jPanel_Citizen, BorderLayout.CENTER);
//        
        this.add(jPanel_first, BorderLayout.NORTH);
        //this.add(jPanel_second, BorderLayout.CENTER);

    }

    public void showCitizen() {
        this.add(jPanel_second, BorderLayout.CENTER);
        this.setVisible(true);
    }

//    public static void main(String[] args) {
//        new DeleteCitizenView();
//    }
}
