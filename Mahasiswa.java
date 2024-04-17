import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Biodata Mahasiswa");

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan tanggal lahir: ");
        String tanggalLahir = input.nextLine();

        System.out.println("\nBiodata Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }
}
