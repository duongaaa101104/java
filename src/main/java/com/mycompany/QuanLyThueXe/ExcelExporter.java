/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.QuanLyThueXe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author linus
 */
public class ExcelExporter {

    public ExcelExporter() {
    }
    
    public static void process(JTable table, String path, String TongThu, String TongNo) throws FileNotFoundException, IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet(); //WorkSheet
        Row row = sheet.createRow(2); //Row created at line 3
        TableModel model = table.getModel(); //Table model


        Row headerRow = sheet.createRow(0); //Create row at line 0
        for(int headings = 0; headings < model.getColumnCount(); headings++){ //For each column
            headerRow.createCell(headings).setCellValue(model.getColumnName(headings));//Write column name
        }

        for(int rows = 0; rows < model.getRowCount(); rows++){ //For each table row
            for(int cols = 0; cols < table.getColumnCount(); cols++){ //For each table column
                row.createCell(cols).setCellValue(model.getValueAt(rows, cols).toString()); //Write value
            }

            //Set the row to the next one in the sequence 
            row = sheet.createRow((rows + 3)); 
        }
        row = sheet.createRow((model.getRowCount() + 3));
        row.createCell(0).setCellValue("Tổng thu");
        row.createCell(1).setCellValue(TongThu);
        row.createCell(2).setCellValue("VND");
        
        row = sheet.createRow((model.getRowCount() + 4));
        row.createCell(0).setCellValue("Tổng nợ");
        row.createCell(1).setCellValue(TongNo);
        row.createCell(2).setCellValue("VND");
        
        wb.write(new FileOutputStream(path));//Save the file     
    }    
    
}