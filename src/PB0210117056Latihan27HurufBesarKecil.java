
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama     : Firman Ardhiansyah
 *         Kelas    : IF-2 (PB02)
 *         NIM      : 10117056
 *  DESKRIPSI : Program ini menampilkan huruf kapital kecil dan besar
 */
public class PB0210117056Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine = lebih dari 1 kata

        hBesar = kalimat.toUpperCase();
        hKecil = kalimat.toLowerCase();

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hBesar);
        System.out.println("Huruf Kecil : " + hKecil);
    }

}
