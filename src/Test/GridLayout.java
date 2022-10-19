/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nnminh322
 */
public class GridLayout extends JFrame {
    public GridLayout(){
        this.setTitle("Quan ly Dan cu");
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        FlowLayout flowLayout = new FlowLayout();
        this.setLayout(flowLayout);
        JButton insert = new JButton("Insert");        
        JButton show = new JButton("show");
        JButton delete = new JButton("delete");
        this.add(insert);
        this.add(show);
        this.add(delete);

        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new testview(); 
    }
    
}
