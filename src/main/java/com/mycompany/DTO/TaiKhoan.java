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
public class TaiKhoan {
    
    String TenDangNhap;
    String MatKhau;
    String Loai;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String TenDangNhap, String MatKhau, String Loai) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Loai = Loai;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }
    
    
}
