import java.util.Scanner;

public class VolumeBangunRuang {

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
        System.out.println("MENU HITUNG VOLUME");
        System.out.println("====================");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Volume Balok");
        System.out.println("3. Volume Tabung");
        System.out.println("4. Volume Kerucut");
        System.out.println("5. Volume Bola");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void prosesPilihan(int pilihan, Scanner input) {
        switch (pilihan) {
            case 1:
                hitungVolumeKubus(input);
                break;
            case 2:
                hitungVolumeBalok(input);
                break;
            case 3:
                hitungVolumeTabung(input);
                break;
            case 4:
                hitungVolumeKerucut(input);
                break;
            case 5:
                hitungVolumeBola(input);
                break;
            case 0:
                System.out.println("Keluar dari program...");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungVolumeKubus(Scanner input) {
        System.out.print("Masukkan sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume);
    }

    private static void hitungVolumeBalok(Scanner input) {
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok: " + volume);
    }

    private static void hitungVolumeTabung(Scanner input) {
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + volume);
    }

    private static void hitungVolumeKerucut(Scanner input) {
        System.out.print("Masukkan jari-jari alas kerucut: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        double volume = (1.0/3) * Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume kerucut: " + volume);
    }

    private static void hitungVolumeBola(Scanner input) {
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        double volume = (4.0/3) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola: " + volume);
    }
}
