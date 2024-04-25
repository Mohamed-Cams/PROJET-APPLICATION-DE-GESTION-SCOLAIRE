/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Administrateur
 */
public class DB {
    
    public static Connection con = null;
    
    public static void loadConnection(){
    String url ="http://localhost/phpmyadmin/index.php?route=/database/structure&db=db";
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
