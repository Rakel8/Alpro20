import java.util.Scanner;

public class Kelulusan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char jenisKelamin;
        int tinggiBadan;

        do {
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = Character.toUpperCase(input.next().charAt(0));

            if (jenisKelamin != 'P' && jenisKelamin != 'L') {
                System.out.println("Jenis kelamin tidak valid (masukkan P/L).");
            }
        } while (jenisKelamin != 'P' && jenisKelamin != 'L');

        System.out.print("Masukkan tinggi badan (cm): ");
        tinggiBadan = input.nextInt();

        String hasil;

        if (jenisKelamin == 'P') {
            hasil = tinggiBadan >= 160 ? "Anda (Perempuan) lulus seleksi kerja." : "Perempuan tidak memenuhi syarat kelulusan (tinggi badan minimum 160 cm).";
        } else {
            hasil = tinggiBadan >= 165 ? "Anda (Laki-laki) lulus seleksi kerja." : "Laki-laki tidak memenuhi syarat kelulusan (tinggi badan minimum 165 cm).";
        }

        System.out.println(hasil);
    }
}
