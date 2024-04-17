import java.util.Scanner;

public class MenuMakanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nMenu Makanan:");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Nasi Uduk");
            System.out.println("3. Mie Goreng");
            System.out.println("4. Kwetiaw");
            System.out.println("5. Keluar");

            System.out.print("Silakan pilih angka anda (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng!");
                    break;
                case 2:
                    System.out.println("Anda memilih Nasi Uduk!");
                    break;
                case 3:
                    System.out.println("Anda memilih Mie Goreng!");
                    break;
                case 4:
                    System.out.println("Anda memilih Kwetiaw!");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
