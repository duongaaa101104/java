/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAL;

import com.mycompany.DTO.TaiKhoan;
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
public class DALTaiKhoan {
    
    public List<TaiKhoan> getListTaiKhoan(){
        try {
            List<TaiKhoan> arr = new ArrayList<TaiKhoan>();
            String query = "SELECT * FROM tai_khoan";
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String TenDangNhap = rs.getString("TenDangNhap");
                String MatKhau = rs.getString("MatKhau");
                String Loai = rs.getString("Loai");
                TaiKhoan temp = new TaiKhoan(TenDangNhap, MatKhau, Loai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
    public List<TaiKhoan> timTaiKhoan(String TenDangNhapQ){
        try {
            List<TaiKhoan> arr = new ArrayList<TaiKhoan>();
            String query = String.format("SELECT * FROM tai_khoan WHERE TenDangNhap LIKE '%%%s%%'", TenDangNhapQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String TenDangNhap = rs.getString("TenDangNhap");
                String MatKhau = rs.getString("MatKhau");
                String Loai = rs.getString("Loai");
                TaiKhoan temp = new TaiKhoan(TenDangNhap, MatKhau, Loai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
    public void themTaiKhoan(TaiKhoan taiKhoan) throws SQLException{
        String query = String.format("INSERT INTO tai_khoan VALUES('%s', '%s', '%s')",
                taiKhoan.getTenDangNhap(),
                taiKhoan.getMatKhau(),
                taiKhoan.getLoai());
        Connector.openConnection();
        Statement stmt = Connector.conn.createStatement();
        stmt.execute(query);
        Connector.closeConnection();
    }
    
    public void xoaTaiKhoan(String taiKhoan) throws SQLException{
        String query = String.format("DELETE FROM tai_khoan where TenDangNhap='%s'", taiKhoan);
        Connector.openConnection();
        Statement stmt = Connector.conn.createStatement();
        stmt.execute(query);
        Connector.closeConnection();
    }
    
    public void suaTaiKhoan(TaiKhoan acc) throws SQLException{
        String query = String.format("UPDATE tai_khoan SET MatKhau='%s', Loai='%s' where TenDangNhap='%s'",
                acc.getMatKhau(),
                acc.getLoai(),
                acc.getTenDangNhap());
       Connector.openConnection();
       Statement stmt = Connector.conn.createStatement();
       stmt.execute(query);
       Connector.closeConnection();
    }
    
}
