/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import com.database.DB;
import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Administrateur
 */
public class Homebal {
    
    public List<Homebean> LoadData(){
        List<Homebean> list = new ArrayList<Homebean>();
        try{
            String query = "select * from etudiant";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                String sexe = rs.getString("Sexe");
                String age = rs.getString("age");
                String filiere = rs.getString("filiere");
                String metier = rs.getString("metier");
                String note = rs.getString("note");
                String remediation = rs.getString("remediation");
                
                Homebean bean = new Homebean(id,prenom,nom,sexe,age,filiere,metier,note,remediation);
                list.add(bean);
                
            }
        }catch (SQLException e){
        JOptionPane.showInternalMessageDialog(null,""+e);
    }
            return list;
    }
    
    public List<Homebean1> LoadData1(){
        List<Homebean1> list = new ArrayList<Homebean1>();
        try{
            String query = "select * from cours";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nom_prof = rs.getString("nom_prof");
                String cours = rs.getString("cours");
                String salle = rs.getString("salle");
                String jour = rs.getString("jour");
                String metier1 = rs.getString("metier");
                String filiere1 = rs.getString("filiere");
                String promo = rs.getString("promo");
                
                Homebean1 bean = new Homebean1(id,nom_prof,cours,salle,jour,metier1,filiere1,promo);
                list.add(bean);
                
            }
        }catch (SQLException e){
        JOptionPane.showInternalMessageDialog(null,""+e);
    }
            return list;
    }
   
    public void insert(Homebean homebean){
        
        try{
            String query = "insert into etudiant values(null,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, homebean.getPrenom());
            ps.setString(2, homebean.getNom());
            ps.setString(3, homebean.getSexe());
            ps.setString(4, homebean.getAge());
            ps.setString(5, homebean.getFiliere());
            ps.setString(6, homebean.getMetier());
            ps.setString(7, homebean.getNote());
            ps.setString(8, homebean.getRemediation());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Enregistrement Réussi ");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null," "+e);
        }
    }
    
     public void insert1(Homebean1 homebean){
        
        try{
            String query = "insert into cours values(null,?,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, homebean.getNom_prof());
            ps.setString(2, homebean.getCours());
            ps.setString(3, homebean.getSalle());
            ps.setString(4, homebean.getJour());
            ps.setString(5, homebean.getMetier());
            ps.setString(6, homebean.getFiliere());
            ps.setString(7, homebean.getPromo());
  
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Enregistrement Réussi ");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null," "+e);
        }
    }
    
    public Homebean returnAllDataToTextField(int id){
    Homebean bean = null;
    try{
        String query = "select * from etudiant where id = "+id;
        PreparedStatement ps = DB.con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
                int ids = rs.getInt("id");
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                String sexe = rs.getString("Sexe");
                String age = rs.getString("age");
                String filiere = rs.getString("filiere");
                String metier = rs.getString("metier");
                String note = rs.getString("note");
                String remediation = rs.getString("remediation");
                
                bean = new Homebean(ids,prenom,nom,sexe,age,filiere,metier,note,remediation);
                
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,""+e);
    }
        return bean;  
}
    
   public Homebean1 returnAllDataToTextField1(int id){
    Homebean1 bean = null;
    try{
        String query = "select * from cours where id = "+id;
        PreparedStatement ps = DB.con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
                String nom_p = rs.getString("nom_prof");
                String cours = rs.getString("cours");
                String salle = rs.getString("salle");
                String jour = rs.getString("jour");
                String metier1 = rs.getString("metier");
                String filiere1 = rs.getString("filiere");
                String promo = rs.getString("promo");
                
                bean = new Homebean1(id,nom_p,cours,salle,jour,metier1,filiere1,promo);
                
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,""+e);
    }
        return bean;  
}
 
    public void updateData(Homebean bean){
        try{
            String query = "update etudiant set prenom = ?, nom = ?, sexe = ?, age = ?, filiere = ?, metier = ?, note = ?, remediation = ? where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, bean.getPrenom());
            ps.setString(2, bean.getNom());
            ps.setString(3, bean.getSexe());
            ps.setString(4, bean.getAge());
            ps.setString(5, bean.getFiliere());
            ps.setString(6, bean.getMetier());
            ps.setString(7, bean.getNote());
            ps.setString(8, bean.getRemediation());
            ps.setInt(9,bean.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "le contenu a été mis a jour");
          }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public void updateData1(Homebean1 bean){
        try{
            String query = "update cours set nom_prof = ?, cours = ?, salle = ?, jour = ?, metier = ?, filiere = ?, promo = ? where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, bean.getNom_prof());
            ps.setString(2, bean.getCours());
            ps.setString(3, bean.getSalle());
            ps.setString(4, bean.getJour());
            ps.setString(5, bean.getMetier());
            ps.setString(6, bean.getFiliere());
            ps.setString(7, bean.getPromo());
            ps.setInt(8,bean.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "le contenu a été mis a jour");
          }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public void deleteRecord(int id){
        
        try{
            String query = "delete from etudiant  where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"un eleve a été supprimer");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,""+e);
        }
            
    }
    
    public void deleteRecord1(int id){
        
        try{
            String query = "delete from cours  where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"un eleve a été supprimer");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,""+e);
        }
            
    }
}
