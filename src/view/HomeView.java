/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.HomeListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public class HomeView extends JFrame {

    private Citizen ctz;
    private JButton jButton_insert;
    private JButton jButton_delete;
    private JButton jButton_update;

    public HomeView() {
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Quan ly dan cu");
        this.setSize(500, 750);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener ac = new HomeListener(this);

        JPanel jPanel_control = new JPanel(new FlowLayout());
        jButton_insert = new JButton("Insert");
        jButton_insert.addActionListener(ac);
        jButton_update = new JButton("Update");
        jButton_update.addActionListener(ac);
        jButton_delete = new JButton("Delete");
        jButton_delete.addActionListener(ac);
        jPanel_control.add(jButton_insert);
        jPanel_control.add(jButton_update);
        jPanel_control.add(jButton_delete);
        
        this.add(jPanel_control, BorderLayout.NORTH);
        

    }
}
