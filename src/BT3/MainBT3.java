/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Admin
 */

import java.text.SimpleDateFormat;

public class MainBT3 {
    public static void main(String[] args) throws Exception{
        QLSV dsSinhVien = new QLSV();
        SinhVien sv1 = new SinhVien("Phan Trọng Nghĩa", new SimpleDateFormat ("MM/dd/yyyy").parse("05/10/1998"), 7) {};
        SinhVien sv2 = new SinhVien("Huỳnh Van Khuyên", new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1995"), 8);
        SinhVien sv3 = new SinhVien("Ngô Quang Tiến", new SimpleDateFormat("MM/dd/yyyy").parse("04/01/1998"), 6);
        
        dsSinhVien.them(sv1);
        dsSinhVien.them(sv2);
        dsSinhVien.them(sv3);
        System.out.println("Danh Sách Sinh Viên :");
        dsSinhVien.inDS();
        System.out.println("\n");
        
        
        dsSinhVien.setSoSanh((ISoSanh) new SoSanhTheoDiem());
        dsSinhVien.sapXep();
        System.out.println("Danh Sách Sinh Viên So Sánh Theo Điểm:");
        dsSinhVien.inDS();
    }
}