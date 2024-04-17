import java.util.Scanner;

public class KonversiWaktu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih konversi yang ingin dilakukan:");
        System.out.println("1. Detik ke Menit");
        System.out.println("2. Detik ke Jam");
        System.out.println("3. Menit ke Detik");
        System.out.println("4. Menit ke Jam");
        System.out.println("5. Jam ke Menit");
        System.out.println("6. Jam ke Detik");
        System.out.print("Masukkan pilihan Anda (1-6): ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                konversiDetikKeMenit(input);
                break;
            case 2:
                konversiDetikKeJam(input);
                break;
            case 3:
                konversiMenitKeDetik(input);
                break;
            case 4:
                konversiMenitKeJam(input);
                break;
            case 5:
                konversiJamKeMenit(input);
                break;
            case 6:
                konversiJamKeDetik(input);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void konversiDetikKeMenit(Scanner input) {
        System.out.print("Masukkan jumlah detik: ");
        double detik = input.nextDouble();

        double menit = detik / 60;
        System.out.println(detik + " detik sama dengan " + menit + " menit");
    }

    private static void konversiDetikKeJam(Scanner input) {
        System.out.print("Masukkan jumlah detik: ");
        double detik = input.nextDouble();

        double jam = detik / 3600;
        System.out.println(detik + " detik sama dengan " + jam + " jam");
    }

    private static void konversiMenitKeDetik(Scanner input) {
        System.out.print("Masukkan jumlah menit: ");
        double menit = input.nextDouble();

        double detik = menit * 60;
        System.out.println(menit + " menit sama dengan " + detik + " detik");
    }

    private static void konversiMenitKeJam(Scanner input) {
        System.out.print("Masukkan jumlah menit: ");
        double menit = input.nextDouble();

        double jam = menit / 60;
        System.out.println(menit + " menit sama dengan " + jam + " jam");
    }

    private static void konversiJamKeMenit(Scanner input) {
        System.out.print("Masukkan jumlah jam: ");
        double jam = input.nextDouble();

        double menit = jam * 60;
        System.out.println(jam + " jam sama dengan " + menit + " menit");
    }

    private static void konversiJamKeDetik(Scanner input) {
        System.out.print("Masukkan jumlah jam: ");
        double jam = input.nextDouble();

        double detik = jam * 3600;
        System.out.println(jam + " jam sama dengan " + detik + " detik");
    }
}
