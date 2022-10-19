/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;

/**
 *
 * @author nnminh322
 */
public class Managers extends Citizen {
    private String account;
    private String password;

    public Managers(String account, String password, int HouseHoldBookNumber, String CitizenID, String FullName, int HouseNumber, String Street, String Ward, String District, String DateofBirth) {
        super(HouseHoldBookNumber, CitizenID, FullName, HouseNumber, Street, Ward, District, DateofBirth);
        this.account = account;
        this.password = password;
    }

    

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
