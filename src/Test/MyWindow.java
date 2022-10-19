/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import javax.swing.JFrame;

/**
 *
 * @author nnminh322
 */
public class MyWindow extends JFrame {

    public MyWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void showWindow() {
        this.setVisible(true);
    }

    public void showWindow(String title) {
        this.setTitle(title);
        this.setVisible(true);

    }

    public void showWindow(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);

    }

    public void showWindow(String title, int width, int height, int widthlocal, int heightlocal) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(widthlocal, heightlocal);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showWindow("", 600, 400, 500, 250);

    }
}
