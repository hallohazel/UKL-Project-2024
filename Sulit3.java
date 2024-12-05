import java.util.Scanner;

public class Sulit3 { // Penghitung Frekuensi Setiap Elemen dalam Array
    public static void main(String[] args) {
        Scanner hzl = new Scanner(System.in); // Membaca inputan user
        System.out.print("Masukkan jumlah elemen array: "); // Memasukkan jumlah elemen array
        int n = hzl.nextInt();
        int[] array = new int[n
        ]; // Membaca elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = hzl.nextInt();
        }
        for (int i = 0; i < n; i++) { // Menghitung frekuensi elemen
            int c = 1; // Minimal muncul sekali
            if (array[i] != -1) { // Memastikan elemen yang sudah dihitung tidak diproses ulang
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        c++;
                        array[j] = -1; // Menandai elemen yang sudah dihitung
                    }
                }
                System.out.println(array[i] + " muncul " + c + " kali");
            }
        }
        hzl.close();
    }
}