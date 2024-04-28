/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrateur
 */
public class DB {
    
    public static Connection con = null;
    
    public static void loadConnection(){
    String url ="jdbc:mysql://localhost:3306/db";
    String root = "root";
    String pass = "";
    
    try{
        con = DriverManager.getConnection(url,root,pass);
        
        if (con != null){
            JOptionPane.showMessageDialog(null,"database est connécter");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"erreur l'hors du chargement de la database");
    }
    }
}
