/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Admin
 */
public class MainBai2 {
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();        
        HangHoa hh1 = new HangHoa("Điện Thoại Oppo", 4000000, "Điện Thoại Oppo A5 2020");
        HangHoa hh2 = new HangHoa("Điện Thoại Iphone", 4500000, "Iphone 7");
        HangHoa hh3 = new HangHoa("Tivi", 2000000, "Tivi SamSung");
        HangHoa hh4 = new HangHoa("Điện Thoại Samsung", 12000000, "Samsung Note10");
        gh1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("Giỏ Hàng 1");
        gh1.them(hh4);
        gh1.inDS();
        System.out.println("\nTổng Tiền :" + gh1.tinhTienHang() + "\nTiền phải trả: " + gh1.tinhTienTra());
        gh2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("Giỏ Hàng 2");
        gh2.them(hh2);
        gh2.them(hh2);
        gh2.them(hh3);
        gh2.inDS();
        System.out.println("\nTổng Tiền :" + gh2.tinhTienHang() + "\nTiền phải trả: " + gh2.tinhTienTra());
        
    }
}