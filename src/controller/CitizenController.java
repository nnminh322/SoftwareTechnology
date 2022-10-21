/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Interface.CitizenInterface;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public class CitizenController {

    public void Insert(int HouseHoldBookNumber, String CitizenID, String FullName, int HouseNumber, String Street, String Ward, String District, String DateofBirth) {
        Citizen ctz = new Citizen(HouseHoldBookNumber, CitizenID, FullName, HouseNumber, Street, Ward, District, DateofBirth);
        CitizenInterface.getInstance().insert(ctz);
        
    }
}
