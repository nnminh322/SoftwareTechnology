/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.sql.*;
import constand.ConnectionToXampp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public class CitizenInterface implements Interface<Citizen> {

    public static CitizenInterface getInstance() {
        return new CitizenInterface();
    }

    @Override
    public List<Citizen> show() {
        List<Citizen> listCitizen = new ArrayList<Citizen>();
        ResultSet result = null;
        try {
            Connection conn = ConnectionToXampp.getConnection();

            Statement st = conn.createStatement();
            
            String sql = "SELECT * FROM Citizen";
            
            System.out.println("ban da thuc thi: " + sql);

            result = st.executeQuery(sql);
            
            while(result.next()){
                int HouseHoldBookNumber = result.getInt("HouseHoldBookNumber");
                String CitizenID = result.getString("CitizenID");
                String FullName = result.getString("FullName");
                int HouseNumber = result.getInt("HouseNumber");
                String Street = result.getString("Street");
                String Ward = result.getString("Ward");
                String District = result.getString("District");
                String DateofBirth =result.getString("DateofBirth");
                
                Citizen ctz = new Citizen(HouseHoldBookNumber, CitizenID, FullName, HouseNumber, Street, Ward, District, DateofBirth);
                listCitizen.add(ctz);
            }
            
            constand.ConnectionToXampp.close(conn);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(CitizenInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for(Citizen i : listCitizen){
            System.out.println(i.toString());
        }
        return listCitizen;
        
    }

    @Override
    public int insert(Citizen t) {
        int result = 0;
        PreparedStatement pst = null;
        try {
            Connection conn = ConnectionToXampp.getConnection();
           
            String sql = "INSERT INTO Citizen(HouseHoldBookNumber, CitizenID, FullName, HouseNumber, Street, Ward, District, DateofBirth) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            
            pst = conn.prepareStatement(sql);
            pst.setInt(1, t.getHouseHoldBookNumber());
            pst.setString(2, t.getCitizenID());
            pst.setString(3, t.getFullName());
            pst.setInt(4, t.getHouseNumber());
            pst.setString(5, t.getStreet());
            pst.setString(6, t.getWard());
            pst.setString(7, t.getDistrict());
            pst.setString(8, t.getDateofBirth());
           
            System.out.println("ban da thuc thi: " + sql);
            System.out.println(t.getHouseNumber());

            result = pst.executeUpdate();

            constand.ConnectionToXampp.close(conn);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(CitizenInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int update(Citizen t) {
        int result = 0;
        try {
            Connection conn = ConnectionToXampp.getConnection();

            Statement st = conn.createStatement();

            String sql = "UPDATE `Citizen` SET `HouseHoldBookNumber`='"+t.getHouseHoldBookNumber()+"',`FullName`='"+t.getFullName()+"',`HouseNumber`='"+t.getHouseHoldBookNumber()+"',`Street`='"+t.getStreet()+"',`Ward`='"+t.getWard()+"',`District`='"+t.getDistrict()+"',`DateofBirth`='"+t.getDateofBirth()+"' WHERE CitizenID = "+t.getCitizenID();

            System.out.println("ban da thuc thi: " + sql);

            result = st.executeUpdate(sql);

            constand.ConnectionToXampp.close(conn);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(CitizenInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int delete(Citizen t) {
        int result = 0;
        try {
            Connection conn = ConnectionToXampp.getConnection();

            Statement st = conn.createStatement();

            String sql = "DELETE FROM `Citizen` WHERE CitizenID =" + t.getCitizenID();
            
            System.out.println("ban da thuc thi: " + sql);

            result = st.executeUpdate(sql);

            constand.ConnectionToXampp.close(conn);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(CitizenInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int search(Citizen t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
