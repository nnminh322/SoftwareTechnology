/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Interface.CitizenInterface;
import java.text.SimpleDateFormat;

/**
 *
 * @author nnminh322
 */
public class Citizen {

    private int HouseHoldBookNumber;
    private String CitizenID;
    private String FullName;
    private int HouseNumber;
    private String Street;
    private String Ward;
    private String District;
    private String DateofBirth;

    public Citizen(int HouseHoldBookNumber, String CitizenID, String FullName, int HouseNumber, String Street, String Ward, String District, String DateofBirth) {
        this.HouseHoldBookNumber = HouseHoldBookNumber;
        this.CitizenID = CitizenID;
        this.FullName = FullName;
        this.HouseNumber = HouseNumber;
        this.Street = Street;
        this.Ward = Ward;
        this.District = District;
        this.DateofBirth = DateofBirth;
    }
    
    public Citizen(){
        super();
    }

    public int getHouseHoldBookNumber() {
        return HouseHoldBookNumber;
    }

    public void setHouseHoldBookNumber(int HouseHoldBookNumber) {
        this.HouseHoldBookNumber = HouseHoldBookNumber;
    }

    public String getCitizenID() {
        return CitizenID;
    }

    public void setCitizenID(String CitizenID) {
        this.CitizenID = CitizenID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int HouseNumber) {
        this.HouseNumber = HouseNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String Ward) {
        this.Ward = Ward;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }
    
    
    @Override
    public String toString(){
        return "Citizen [HouseHoldBookNumber = " + HouseHoldBookNumber +", CitizenId = "+CitizenID+", FullName = "+ FullName+", HouseNumber = "+ HouseNumber+", Street = "+Street+", Ward = "+Ward +", District = "+District+", DateofBirth = "+ DateofBirth;
    }
    
    public void Insert(Citizen ctz){
        CitizenInterface.getInstance().insert(ctz);
    }
    
}
