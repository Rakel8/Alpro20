import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        System.out.print("Masukkan persentase diskon (%): ");
        double diskonPersen = input.nextDouble();

        double diskon = hargaBarang * (diskonPersen / 100);
        double hargaAkhir = hargaBarang - diskon;

        System.out.println("Harga awal: Rp" + hargaBarang);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Harga akhir: Rp" + hargaAkhir);
    }
}
