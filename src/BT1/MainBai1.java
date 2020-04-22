/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Admin
 */
public class MainBai1 {
    public static void main(String[] args) {
        Context PT1 = new Context();
        PT1.setTinhToan(new Cong());
        System.out.println("Ket Qua : 75 + 12 = " + PT1.tinh(75, 12));
        Context PT2 = new Context();
        PT2.setTinhToan(new Tru());
        System.out.println("Ket Qua : 54 - 78 = " + PT2.tinh(54, 78));
    }

}