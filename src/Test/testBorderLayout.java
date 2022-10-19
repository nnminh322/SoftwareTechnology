/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nnminh322
 */
public class testBorderLayout extends JFrame {
    public testBorderLayout(){
        this.setTitle("Quan ly Dan cu");
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        JButton insert = new JButton("Insert");        
        JButton show = new JButton("show");
        JButton delete = new JButton("delete");
        this.add(insert,BorderLayout.NORTH);
        this.add(show,BorderLayout.EAST);
        this.add(delete,BorderLayout.CENTER);
        

        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new testBorderLayout(); 
    }
    
}
