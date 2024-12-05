import java.util.Scanner;

public class Sedang2 { // Penghitung Volume Tabung

    public static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
    public static double luasLingkaran(double jariJari){
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
        return luasLingkaran;
    }
    public static void main(String[] args) {
        Scanner hzl = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = hzl.nextDouble();
        
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = hzl.nextDouble();
         
        double volume = hitungVolume(jariJari, tinggi);
        System.out.println("Volume tabung adalah: " + volume + " kubik\n============================================\nTerima kasih telah menggunakan program ini :D ");
        
        hzl.close();
    }
}