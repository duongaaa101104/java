/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.BUL;

import com.mycompany.DAL.DALTaiKhoan;
import com.mycompany.DTO.TaiKhoan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author linus
 */
public class BULTaiKhoan {
    DALTaiKhoan dalTaiKhoan = new DALTaiKhoan();
    
    public List<TaiKhoan> getListTaiKhoan(){
        return dalTaiKhoan.getListTaiKhoan();
    }
    
    public void themTaiKhoan(TaiKhoan taiKhoan) throws SQLException{
        dalTaiKhoan.themTaiKhoan(taiKhoan);
    }
    
    public void suaTaiKhoan(TaiKhoan acc) throws SQLException{
        dalTaiKhoan.suaTaiKhoan(acc);
    }
    
    public void xoaTaiKhoan(String taiKhoan) throws SQLException{
        dalTaiKhoan.xoaTaiKhoan(taiKhoan);
    }
    
    public List<TaiKhoan> timTaiKhoan(String TenDangNhapQ){
        return dalTaiKhoan.timTaiKhoan(TenDangNhapQ);
    }
}
