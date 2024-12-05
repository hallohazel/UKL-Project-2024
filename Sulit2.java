import java.util.Scanner;

public class Sulit2 { // Checker duplikat array
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: "); // Masukkan jumlah elemen array
        int n = hello.nextInt();
        int[] array = new int[n]; // Deklarasi array
        System.out.println("Masukkan elemen array:");  // Meminta input
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = hello.nextInt();
        }
        boolean AdaDuplikat = false; // Periksa elemen duplikat
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array yang memiliki elemen duplikat: " + array[i]);
                    AdaDuplikat = true;
                    break;
                }
            }
            if (AdaDuplikat) {
                break;
            }
        }

        if (!AdaDuplikat) {
            System.out.println("Array yang tidak memiliki elemen duplikat.");
        }
        hello.close();
    }
}