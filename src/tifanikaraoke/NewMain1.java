/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tifanikaraoke;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LABKOM01-RPL26
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JTextField nama, pilihRoom, harga, jam, total;
        JLabel lblnama, lblroom, lblharga, lbljam, lbldiskon, lbltotal;
        JButton btnOk, btnBatal;
        JPanel panel1, panel2;
        
        lblnama = new JLabel("Nama Pelanggan : ");
        lblroom = new JLabel("Pilih Room : ");
        lblharga = new JLabel("Harga : ");
        lbljam = new JLabel("Lama Sewa : ");
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));
        panel1.add(lblnama);
        panel1.add(lblroom);
        panel1.add(lblharga);
        panel1.add(lbljam);
        
        nama = new JTextField(50);
        pilihRoom = new JTextField(2);
        harga = new JTextField(12);
        jam = new JTextField(2);
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5,1));
        panel2.add(lblnama);
        panel2.add(lblroom);
        panel2.add(lblharga);
        panel2.add(lbljam);
    }
    
}
