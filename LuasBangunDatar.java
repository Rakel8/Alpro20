import java.util.Scanner;

public class LuasBangunDatar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilMenu();

        int pilihan = input.nextInt();

        while (pilihan != 0) {
            prosesPilihan(pilihan, input);

            tampilMenu();

            pilihan = input.nextInt();
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
    }

    private static void tampilMenu() {
        System.out.println("\n====================");
        System.out.println("MENU HITUNG LUAS");
        System.out.println("====================");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Lingkaran");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void prosesPilihan(int pilihan, Scanner input) {
        switch (pilihan) {
            case 1:
                hitungLuasPersegi(input);
                break;
            case 2:
                hitungLuasPersegiPanjang(input);
                break;
            case 3:
                hitungLuasLingkaran(input);
                break;
            case 0:
                System.out.println("Keluar dari program...");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungLuasPersegi(Scanner input) {
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
    }

    private static void hitungLuasPersegiPanjang(Scanner input) {
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }

    private static void hitungLuasLingkaran(Scanner input) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luas);
    }
}
