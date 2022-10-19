/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Interface.CitizenInterface;
import java.util.List;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public class Test {
    public static void main(String[] args) {
        Citizen newctz = new Citizen(2, "01234567890", "Min", 3, "PM", "PM", "HBT", "2002-04-09");
        CitizenInterface.getInstance().insert(newctz);
        List<Citizen> list = CitizenInterface.getInstance().show();
    }
}
