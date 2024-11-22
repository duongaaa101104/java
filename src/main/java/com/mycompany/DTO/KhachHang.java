/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DTO;
import com.mycompany.BUL.BULDonHang;
import com.mycompany.DTO.DonHang;
import java.util.List;
/**
 *
 * @author linus
 */
public class KhachHang {
    private int MaKH;
    private String HoTen;
    private long SDT;
    private String DiaChi;
    private int SoLanDatXe;

    public KhachHang(int MaKH, String HoTen, long SDT, String DiaChi, int SoLanDatXe) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.SoLanDatXe = SoLanDatXe;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public long getSDT() {
        return SDT;
    }

    public void setSDT(long SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSoLanDatXe(int SoLanDatXe) {
        BULDonHang bul = new BULDonHang();
        List<DonHang> res = bul.layDonHangTheoMaKH(this.getMaKH());
        this.SoLanDatXe = res.size();
    }
    
    public int getSoLanDatXe(){
        this.setSoLanDatXe(SoLanDatXe);
        return this.SoLanDatXe;
    }
}
