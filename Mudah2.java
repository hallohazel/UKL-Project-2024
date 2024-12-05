import java.util.Scanner;

public class Mudah2 { // Checker ganjil genap
    public static void main(String[] args) {
        Scanner hzl = new Scanner(System.in);
        System.out.print("Masukkan bilangan: "); // Meminta input user

        if (hzl.hasNextInt()) {
            int bilangan = hzl.nextInt();
            
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
            }
        } else {
            System.out.println("Masukkan bilangan bulat! ");
        }
        
        hzl.close();
    }
}