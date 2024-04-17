import java.util.Scanner;

public class PositifNegatif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positif = 0;
        int negatif = 0;
        int zero = 0;

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = input.nextInt();

        System.out.print("Masukkan angka-angka: ");
        for (int i = 1; i <= jumlahAngka; i++) {
            double angka = input.nextDouble();

            if (angka > 0) {
                positif++;
            } else if (angka < 0) {
                negatif++;
            } else {
                zero++;
            }
        }

        System.out.println("Bilangan Positif: " + positif);
        System.out.println("Bilangan Negatif: " + negatif);
        System.out.println("Bilangan Nol: " + zero);
    }
}
