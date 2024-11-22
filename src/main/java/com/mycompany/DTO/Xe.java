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
public class Xe {
    private String BienSo;
    private int SoCho;
    private String LoaiXe;

    public Xe(String BienSo, int SoCho, String LoaiXe) {
        this.BienSo = BienSo;
        this.SoCho = SoCho;
        this.LoaiXe = LoaiXe;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public int getSoCho() {
        return SoCho;
    }

    public void setSoCho(int SoCho) {
        this.SoCho = SoCho;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }
    
    
}
