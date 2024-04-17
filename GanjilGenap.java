import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ganjil = 0;
        int genap = 0;
        int nol = 0;

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = input.nextInt();

        System.out.print("Masukkan angka-angka: ");
        for (int i = 1; i <= jumlahAngka; i++) {
            int angka = input.nextInt();

            if (angka == 0) {
                nol++;
            } else if (angka % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }

        System.out.println("Jumlah bilangan ganjil: " + ganjil);
        System.out.println("Jumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan nol: " + nol);
    }
}
