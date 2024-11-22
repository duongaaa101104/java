/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAL;

import com.mycompany.DTO.Xe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author linus
 */
public class DALXe {
    public List<Xe> layXe(){
        try {
            List<Xe> arr = new ArrayList<Xe>();
            String query = "SELECT * FROM xe";
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String BienSo = rs.getString("BienSo");
                int SoCho = rs.getInt("SoCho");
                String LoaiXe = rs.getString("LoaiXe");
                Xe temp = new Xe(BienSo, SoCho, LoaiXe);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Xe> layXeTheoBienSo(String BienSoQ){
        try {
            List<Xe> arr = new ArrayList<Xe>();
            String query = String.format("SELECT * FROM xe WHERE BienSo = '%s'", BienSoQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String BienSo = rs.getString("BienSo");
                int SoCho = rs.getInt("SoCho");
                String LoaiXe = rs.getString("LoaiXe");
                Xe temp = new Xe(BienSo, SoCho, LoaiXe);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Xe> layXeTheoLoaiXe(String LoaiXeQ){
        try {
            List<Xe> arr = new ArrayList<Xe>();
            String query = String.format("SELECT * FROM xe WHERE LoaiXe LIKE %s + '%'", LoaiXeQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String BienSo = rs.getString("BienSo");
                int SoCho = rs.getInt("SoCho");
                String LoaiXe = rs.getString("LoaiXe");
                Xe temp = new Xe(BienSo, SoCho, LoaiXe);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Xe> layXeTheoSoCho(int SoChoQ){
        try {
            List<Xe> arr = new ArrayList<Xe>();
            String query = String.format("SELECT * FROM xe WHERE SoCho=%s", SoChoQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String BienSo = rs.getString("BienSo");
                int SoCho = rs.getInt("SoCho");
                String LoaiXe = rs.getString("LoaiXe");
                Xe temp = new Xe(BienSo, SoCho, LoaiXe);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void themXe(Xe xe){
        try {
            String query = String.format("INSERT INTO xe VALUES('%s', '%d', '%s')",
                    xe.getBienSo(),
                    xe.getSoCho(),
                    xe.getLoaiXe());
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            stmt.execute(query);
            Connector.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void suaXe(Xe xe){
        try {
            String query = String.format("UPDATE xe SET SoCho=%d, LoaiXe=%s where BienSo=%s",
                    xe.getSoCho(),
                    xe.getLoaiXe(),
                    xe.getBienSo());
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Connector.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void xoaXe(Xe xe){
        try {
            String query = String.format("DELETE FROM xe where BienSo=%s", xe.getBienSo());
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Connector.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DALXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
