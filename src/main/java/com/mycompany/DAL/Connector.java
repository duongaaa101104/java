/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAL;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author linus
 */
public class Connector {
    public static Connection conn = null;
    private static String user = "root";
    private static String password = "123456";


    public static void openConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connector.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ql_thuexe", Connector.user, Connector.password);
            //System.out.println("Ket noi CSDL thanh cong");
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public static void closeConnection(){
        try{
            Connector.conn.close();
//            System.out.println("Dong ket noi CSDL thanh cong");
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    
}
