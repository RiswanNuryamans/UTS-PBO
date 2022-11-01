/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Soal5Bank {
    int saldo = 100000;
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
        System.out.println("Simpan uang: Rp."+jumlah);
        getsaldo();
    }
    public void ambilUang(int jumlah){
      System.out.println("Ambil uang: Rp."+jumlah);
      if(saldo >= jumlah){
          saldo -= jumlah;
          
          getsaldo();
      } else {
          System.out.println("Saldo Tidak Cukup");
          getsaldo();
      }
    }
    public void getsaldo(){
        System.out.println("Sisa saldo saat ini: Rp."+saldo);
    }
}
