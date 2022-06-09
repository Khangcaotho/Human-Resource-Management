/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author KhangCao
 */
public class ChuyenDoi {
    static DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    //Chuyển đổi từ String->Date
    public static Date Getdate(String ngay){
         try {
             return df.parse(ngay);
         } catch (ParseException ex) {
             System.out.println("Lỗi ngày");
         }
         return null;
    }
    //Chuyển từ Date-> String
    public static String GetNgay(Date date){
        return df.format(date);
    }
    //Chuyển đổi định dạng số double->String
    public static String DinhDangSo(double so){
       return NumberFormat.getNumberInstance().format(so);
    }
    //Chuyển từ String->double
    public static double ChuyenSangSo(String chuSo) {
        try{
        return NumberFormat.getNumberInstance().parse(chuSo).doubleValue();
    }catch (ParseException ex){
            System.out.println("Lỗi chuyển số");
            return 0;
}
}
}
