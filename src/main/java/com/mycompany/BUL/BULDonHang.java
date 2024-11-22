/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.BUL;
import com.mycompany.DAL.DALDonHang;
import com.mycompany.DTO.DonHang;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author linus
 */
public class BULDonHang {
    DALDonHang dalDonHang = new DALDonHang();
    
    public List<DonHang> layDonHang(){
        return dalDonHang.layDonHang();
    }
    
    public List<DonHang> layDonHangTheoMa(int MaDon){
        return dalDonHang.layDonHangTheoMa(MaDon);
    }
    
    public List<DonHang> layDonHangTheoMaKH(int MaKHQ){
        return dalDonHang.layDonHangTheoMaKH(MaKHQ);
    }
    
    public List<DonHang> layDonHangTheoDiaDiem(String DiaDiemQ){
        return dalDonHang.layDonHangTheoDiaDiem(DiaDiemQ);
    }
    
    public List<DonHang> layDonHangTheoNgay(String NgayQ){
        return dalDonHang.layDonHangTheoNgay(NgayQ);
    }
    
    public void themDonHang(DonHang donHang) throws SQLException{
        dalDonHang.themDonHang(donHang);
    }
    
    public void suaDonHang(DonHang donHang) throws SQLException{
        dalDonHang.suaDonHang(donHang);
    }
    
    public void xoaDonHang(int MaDH) throws SQLException{
        dalDonHang.xoaDonHang(MaDH);
    }
    
    public List<DonHang> locDonHang(String BienSoXe, String MaKhachHang, String DiaDiem, String TuNgay, String DenNgay) throws SQLException{
        return dalDonHang.locDonHang(BienSoXe, MaKhachHang, DiaDiem, TuNgay, DenNgay);
    }
}
