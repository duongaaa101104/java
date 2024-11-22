/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DTO;

/**
 *
 * @author linus
 */
public class DonHang {
    private int MaDon;
    private int MaKH;
    private String BienSo;
    private String DiemDi;
    private String DiemDen;
    private String NgayDi;
    private String NgayVe;
    private long Gia;
    private int TrangThai;
    
    public DonHang() {
    
    }

    public DonHang(int MaDon, int MaKH, String BienSo, String DiemDi, String DiemDen, String NgayDi, String NgayVe, long Gia, int TrangThai) {
        this.MaDon = MaDon;
        this.MaKH = MaKH;
        this.BienSo = BienSo;
        this.DiemDi = DiemDi;
        this.DiemDen = DiemDen;
        this.NgayDi = NgayDi;
        this.NgayVe = NgayVe;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
    }
    
    public DonHang(int MaDon, int MaKH, String BienSo, String DiemDi, String DiemDen, String NgayDi, String NgayVe, long Gia, String TrangThai) {
        this.MaDon = MaDon;
        this.MaKH = MaKH;
        this.BienSo = BienSo;
        this.DiemDi = DiemDi;
        this.DiemDen = DiemDen;
        this.NgayDi = NgayDi;
        this.NgayVe = NgayVe;
        this.Gia = Gia;
        if (TrangThai == "Đang xử lý"){
            this.TrangThai = 0;
        }
        else if (TrangThai == "Đã xác nhận"){
            this.TrangThai = 1;
        }
        else if (TrangThai == "Đã nhận xe"){
            this.TrangThai = 2;
        }
        else if (TrangThai == "Đã thanh toán"){
            this.TrangThai = 3;
        }
        else{
            this.TrangThai = 4;
        }
    }

    public int getMaDon() {
        return MaDon;
    }

    public void setMaDon(int MaDon) {
        this.MaDon = MaDon;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public String getDiemDi() {
        return DiemDi;
    }

    public void setDiemDi(String DiemDi) {
        this.DiemDi = DiemDi;
    }

    public String getDiemDen() {
        return DiemDen;
    }

    public void setDiemDen(String DiemDen) {
        this.DiemDen = DiemDen;
    }

    public String getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(String NgayDi) {
        this.NgayDi = NgayDi;
    }

    public String getNgayVe() {
        return NgayVe;
    }

    public void setNgayVe(String NgayVe) {
        this.NgayVe = NgayVe;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public int getTrangThai() {
        return TrangThai;
    }
    
    public String getTrangThaiString() {
        if (this.TrangThai == 0){
            return "Đang xử lý";
        }
        else if (this.TrangThai == 1){
            return "Đã xác nhận";
        }
        else if (this.TrangThai == 2){
            return "Đã nhận xe";
        }
        else if (this.TrangThai == 3){
            return "Đã thanh toán";
        }
        return "Khác";
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
