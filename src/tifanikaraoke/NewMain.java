/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tifanikaraoke;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM01-RPL26
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int tipeRoom,harga = 0,jam, total, diskon;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Karaoke Syariah");
        System.out.println("Nama Pelanggan : ");
        nama = keyboard.nextLine();
        System.out.println("==============Daftar Room==============");
        System.out.println("=======1. Room Small = Rp.55000========");
        System.out.println("=======2. Room Medium = Rp.70000=======");
        System.out.println("=======3. Room Large = Rp.120000=======");
        System.out.println("=======4. Room Family = Rp.150000======");
        System.out.println("Pilih Room :");
        tipeRoom = keyboard.nextInt();
        
        if(tipeRoom==1){
            System.out.println("Room Small");
            harga = 55000;
        }else if(tipeRoom==2){
            System.out.println("Room Medium");
            harga = 70000;
        }else if(tipeRoom==3){
            System.out.println("Room Large");
            harga = 120000;
        }else if(tipeRoom==4){
            System.out.println("Room Family");
            harga = 150000;
        }else {
            System.out.println("Room yang anda masukkan tidak tersedia");
        }
        
        System.out.println("Harga Room : " + harga);
        System.out.println("Lama Sewa");
        jam = keyboard.nextInt();
        
        
        //output
        System.out.println("Karaoke Syariah");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Room : " + tipeRoom);
        System.out.println("Harga Room : " + harga);
        System.out.println("Lama Sewa : " + jam);
        
        if(jam>3){
            diskon = harga * jam * 1111/10000;
            total = harga * jam - diskon;
            System.out.println("Anda Mendapat diskon 11.11% karena menyewa room diatas 3 jam");
            System.out.println("Total Harga : " + total);
        }else{
            total = harga * jam;
            System.out.println("Total Harga : " + total);
        }
        
        if(jam>3){
            diskon = harga * jam * 1111/10000;
            total = harga * jam - diskon;
            JOptionPane.showMessageDialog(null, "Nama Pelanggan : " + nama
                + "\n Room : " + tipeRoom
                + "\n Harga Room : " + harga
                + "\n Lama Sewa : " + jam
                + "\n Anda Mendapat diskon 11.11% karena menyewa room diatas 3 jam"
                + "\n Total Harga : " + total);
        }else{
            total = harga * jam;
            JOptionPane.showMessageDialog(null, " Nama Pelanggan : " + nama
                + "\n Room : " + tipeRoom
                + "\n Harga Room : " + harga
                + "\n Lama Sewa : " + jam
                + "\n Anda Mendapat diskon 11.11% karena menyewa room diatas 3 jam"
                + "\n Total Harga : " + total);
        }
        
        
    }
    
}
