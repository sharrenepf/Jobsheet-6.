import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // deklarasi variabel
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        // input
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = scanner.nextInt();

        
        if (jenisBuku.equals("kamus")) {
            diskon = 0.10; 
            if (jumlahBuku > 2) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07; 
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else if (jumlahBuku <= 3) {
                diskon += 0.01; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            }
        }

        // output
        System.out.printf("Total diskon yang diberikan: %.2f%%\n", diskon * 100);

        
        scanner.close();
    }
}
