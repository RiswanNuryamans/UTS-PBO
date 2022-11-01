/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Soal5Bank bnk = new Soal5Bank();
        
        System.out.println("Selamat Datang di Bank ABC");
        bnk.getsaldo();
        bnk.simpanUang(500000);
        bnk.ambilUang(690000);
    }
    
}
