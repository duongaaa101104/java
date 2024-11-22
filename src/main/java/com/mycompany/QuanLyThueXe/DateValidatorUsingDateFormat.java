/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.QuanLyThueXe;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author linus
 */
public class DateValidatorUsingDateFormat implements DateValidator {
    private String dateFormat;
 
    public DateValidatorUsingDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
 
    @Override
    public int isValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return 0;
        }
        return 1;
    }
}
