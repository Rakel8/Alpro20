import java.util.Scanner;

public class Bulan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor bulan (1-12): ");
        int bulanNumber = input.nextInt();

        if (bulanNumber < 1 || bulanNumber > 12) {
            System.out.println("Nomor bulan tidak valid!");
            return;
        }

        String[] bulanNama = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                               "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama bulan: " + bulanNama[bulanNumber - 1]);
    }
}
