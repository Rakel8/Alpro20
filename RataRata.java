import java.util.Scanner;

public class RataRata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahData;
        double total = 0;

        System.out.print("Masukkan jumlah data yang ingin dihitung rata-ratanya: ");
        jumlahData = input.nextInt();

        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            double data = input.nextDouble();
            total += data;
        }

        if (jumlahData > 0) {
            double rataRata = total / jumlahData;
            System.out.println("Rata-rata dari " + jumlahData + " data adalah: " + rataRata);
        } else {
            System.out.println("Tidak ada data yang dimasukkan.");
        }
    }
}
