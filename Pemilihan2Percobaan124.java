import java.util.Scanner;

public class Pemilihan2Percobaan124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        boolean kabisat = false;

        // Logika penentuan tahun kabisat
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {

            } else {
                kabisat = true;
            }
        }

        if (kabisat) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }

        input.close();
    }
}
