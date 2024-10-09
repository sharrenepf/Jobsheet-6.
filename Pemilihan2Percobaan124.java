import java.util.Scanner;

public class Pemilihan2Percobaan124 {
    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        // Logika untuk menentukan tahun kabisat
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0 && tahun % 400 == 0) {
                System.out.println(tahun + " termasuk tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
        
        // Menutup scanner
        input.close();
    }
}
