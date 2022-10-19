/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nnminh322
 */
public class testGridLayout extends JFrame {
    public testGridLayout(){
        this.setTitle("Quan ly Dan cu");
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        GridLayout gridLayout = new GridLayout(4,4);
        this.setLayout(gridLayout);
//        JButton insert = new JButton("Insert");        
//        JButton show = new JButton("show");
//        JButton delete = new JButton("delete");
//        this.add(insert);
//        this.add(show);
//        this.add(delete);
        for (int i = 0; i < 20; i++) {
            JButton button = new JButton(i+"");
            this.add(button);
        }

        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new testGridLayout(); 
    }
    
}
