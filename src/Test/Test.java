/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Interface.CitizenInterface;
import java.util.List;
import model.Citizen;
import view.InsertCitizenView;

/**
 *
 * @author nnminh322
 */
public class Test {
    public static void main(String[] args) {
//        Citizen newctz = new Citizen(3, "123456", "ccc", 20, "Ngọc Lập", "Thanh Miện ", "HD", "2000-06-09");
//        CitizenInterface.getInstance().insert(newctz);
//        List<Citizen> list = CitizenInterface.getInstance().show();
          InsertCitizenView insertView = new InsertCitizenView();
          System.out.println("Da xong InsertView");
    }
}
