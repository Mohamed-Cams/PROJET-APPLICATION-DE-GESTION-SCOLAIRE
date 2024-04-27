/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import javax.swing.*;
import com.login.BeanUser;
import com.database.DB;
import java.sql.*;
/**
 *
 * @author Administrateur
 */
public class Bal {
    
    public void insertDataSiugnup(BeanUser beanobj){
        try{
            String query = "insert into user values(null,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,beanobj.getUser());
            ps.setString(2,beanobj.getEmail());
            ps.setString(3,beanobj.getPass());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"vous êtes inscrit avec succes");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public void insertDataSiugnup2(BeanUser beanobj){
        try{
            String query = "insert into etudiant_user values(null,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,beanobj.getUser());
            ps.setString(2,beanobj.getEmail());
            ps.setString(3,beanobj.getPass());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"vous êtes inscrit avec succes");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public boolean checkLogin(String email,String pass){
        boolean b = false;
        try{
            String query = "select email,password from user where email = '"+email+"' AND password ='"+pass+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null, "email ou pass invalid essayer encore ..");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null," "+e);
        }
        return b;
    }
    public boolean checkLogin2(String email,String pass){
        boolean b = false;
        try{
            String query = "select email,password from etudiant_user where email = '"+email+"' AND password ='"+pass+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null, "email ou pass invalid essayer encore ..");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null," "+e);
        }
        return b;
    }
}
