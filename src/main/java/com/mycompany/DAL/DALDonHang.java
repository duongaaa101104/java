/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAL;
import com.mycompany.DTO.DonHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author linus
 */
public class DALDonHang {
    
    public List<DonHang> layDonHang(){
        try {
            List<DonHang> arr = new ArrayList<DonHang>();
            String query = "SELECT * FROM don_hang";
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int MaDon = rs.getInt("MaDon");
                int MaKH = rs.getInt("MaKH");
                String BienSo = rs.getString("BienSo");
                String DiemDi = rs.getString("DiemDi");
                String DiemDen = rs.getString("DiemDen");
                String NgayDi = rs.getString("NgayDi");
                String NgayVe = rs.getString("NgayVe");
                long Gia = rs.getLong("Gia");
                int TrangThai = rs.getInt("TrangThai");
                DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    
    public List<DonHang> layDonHangTheoMa(int MaDonQ){
        try {
            List<DonHang> arr = new ArrayList<DonHang>();
            String query = String.format("SELECT * FROM don_hang WHERE MaDon LIKE '%%%d%%'", MaDonQ);
            System.out.println(query);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int MaDon = rs.getInt("MaDon");
                int MaKH = rs.getInt("MaKH");
                String BienSo = rs.getString("BienSo");
                String DiemDi = rs.getString("DiemDi");
                String DiemDen = rs.getString("DiemDen");
                String NgayDi = rs.getString("NgayDi");
                String NgayVe = rs.getString("NgayVe");
                long Gia = rs.getLong("Gia");
                int TrangThai = rs.getInt("TrangThai");
                DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    public List<DonHang> layDonHangTheoDiaDiem(String DiaDiemQ){
        try {
            List<DonHang> arr = new ArrayList<DonHang>();
            String query = String.format("SELECT * FROM don_hang WHERE DiemDi LIKE '%%%s%%' or DiemDen LIKE '%%%s%%'", DiaDiemQ, DiaDiemQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int MaDon = rs.getInt("MaDon");
                int MaKH = rs.getInt("MaKH");
                String BienSo = rs.getString("BienSo");
                String DiemDi = rs.getString("DiemDi");
                String DiemDen = rs.getString("DiemDen");
                String NgayDi = rs.getString("NgayDi");
                String NgayVe = rs.getString("NgayVe");
                long Gia = rs.getLong("Gia");
                int TrangThai = rs.getInt("TrangThai");
                DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<DonHang> layDonHangTheoMaKH(int MaKHQ){
        try {
            List<DonHang> arr = new ArrayList<DonHang>();
            String query = String.format("SELECT * FROM don_hang WHERE MaKH=%d", MaKHQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int MaDon = rs.getInt("MaDon");
                int MaKH = rs.getInt("MaKH");
                String BienSo = rs.getString("BienSo");
                String DiemDi = rs.getString("DiemDi");
                String DiemDen = rs.getString("DiemDen");
                String NgayDi = rs.getString("NgayDi");
                String NgayVe = rs.getString("NgayVe");
                long Gia = rs.getLong("Gia");
                int TrangThai = rs.getInt("TrangThai");
                DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
        public List<DonHang> layDonHangTheoNgay(String NgayQ){
        try {
            List<DonHang> arr = new ArrayList<DonHang>();
            String query = String.format("SELECT * FROM don_hang WHERE NgayDi LIKE '%%%s%%' or NgayVe LIKE '%%%s%%'", NgayQ, NgayQ);
            Connector.openConnection();
            Statement stmt = Connector.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int MaDon = rs.getInt("MaDon");
                int MaKH = rs.getInt("MaKH");
                String BienSo = rs.getString("BienSo");
                String DiemDi = rs.getString("DiemDi");
                String DiemDen = rs.getString("DiemDen");
                String NgayDi = rs.getString("NgayDi");
                String NgayVe = rs.getString("NgayVe");
                long Gia = rs.getLong("Gia");
                int TrangThai = rs.getInt("TrangThai");
                DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
                arr.add(temp);
            }
            Connector.closeConnection();
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(DALDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void themDonHang(DonHang donHang) throws SQLException{
        String query = String.format("INSERT INTO don_hang (MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai) "
                + "VALUES('%d', '%s', '%s', '%s', '%s', '%s', '%d', '%d')",
                donHang.getMaKH(),
                donHang.getBienSo(),
                donHang.getDiemDi(),
                donHang.getDiemDen(),
                donHang.getNgayDi(),
                donHang.getNgayVe(),
                donHang.getGia(),
                donHang.getTrangThai());
        Connector.openConnection();
        Statement stmt = Connector.conn.createStatement();
        stmt.execute(query);
        Connector.closeConnection();
    }
    
    public void suaDonHang(DonHang donHang) throws SQLException{
        String query = String.format("UPDATE don_hang SET MaKH='%d', BienSo='%s', DiemDi='%s', DiemDen='%s', NgayDi='%s', NgayVe='%s', Gia='%d', TrangThai='%d' where MaDon=%d",
           donHang.getMaKH(),
           donHang.getBienSo(),
           donHang.getDiemDi(),
           donHang.getDiemDen(),
           donHang.getNgayDi(),
           donHang.getNgayVe(),
           donHang.getGia(),
           donHang.getTrangThai(),
           donHang.getMaDon());
        System.out.println(query);
       Connector.openConnection();
       Statement stmt = Connector.conn.createStatement();
       stmt.execute(query);
       Connector.closeConnection();
    }
    
    public void xoaDonHang(int MaDH) throws SQLException{
        String query = String.format("DELETE FROM don_hang where MaDon=%d", MaDH);
        Connector.openConnection();
        Statement stmt = Connector.conn.createStatement();
        stmt.execute(query);
        Connector.closeConnection();
    }
    
    
    public List<DonHang> locDonHang(String BienSoXe, String MaKhachHang, String DiaDiem, String TuNgay, String DenNgay) throws SQLException{
        List<DonHang> arr = new ArrayList<DonHang>();
        String template = "SELECT * FROM don_hang WHERE (";
  
        if (BienSoXe.equals("Tất cả")){
            BienSoXe = "BienSo";
            template += "BienSo = %s ";
        }
        else{
            BienSoXe = BienSoXe.split("-")[1];
            template += "BienSo = '%s' ";
        }
            
        if (MaKhachHang.equals("Tất cả")){
            MaKhachHang = "MaKH";
            template += "and MaKH = %s ";
        }
        else{
            MaKhachHang = MaKhachHang.split("-")[0];
            template += "and MaKH = '%s' ";
        }
        
        String DiaDiem2 = DiaDiem;
        if (DiaDiem.trim().equals("")){
            DiaDiem = "DiemDi";
            DiaDiem2 = "DiemDen";
            template += "and (DiemDi = %s or DiemDen = %s) and ";
        }
        else{
            template += "and (DiemDi like '%%%s%%' or DiemDen like '%%%s%%') and ";
        }
        
        if (TuNgay.trim().equals("")){
            TuNgay = "0001/01/01";
        }
        
        if (DenNgay.trim().equals("")){
            DenNgay = "9999/12/31";
        }
        
        template += "(NgayDi >= '%s' and NgayDi <= '%s' or NgayVe >= '%s' and NgayVe <= '%s'))";
        String query = String.format(template, BienSoXe, MaKhachHang, DiaDiem, DiaDiem2, TuNgay, DenNgay, TuNgay, DenNgay);
        System.out.println(query);
        Connector.openConnection();
        Statement stmt = Connector.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()){
            int MaDon = rs.getInt("MaDon");
            int MaKH = rs.getInt("MaKH");
            String BienSo = rs.getString("BienSo");
            String DiemDi = rs.getString("DiemDi");
            String DiemDen = rs.getString("DiemDen");
            String NgayDi = rs.getString("NgayDi");
            String NgayVe = rs.getString("NgayVe");
            long Gia = rs.getLong("Gia");
            int TrangThai = rs.getInt("TrangThai");
            DonHang temp = new DonHang(MaDon, MaKH, BienSo, DiemDi, DiemDen, NgayDi, NgayVe, Gia, TrangThai);
            arr.add(temp);
        }
        Connector.closeConnection();
        return arr;
    }
}
