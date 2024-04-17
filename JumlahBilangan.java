import java.util.Scanner;

public class JumlahBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas atas bilangan bulat positif: ");
        int batasAtas = input.nextInt();

        int total = 0;

        for (int i = 0; i <= batasAtas; i++) {
            total += i;
        }

        System.out.println("Jumlah bilangan bulat positif dari 0 sampai " + batasAtas + " adalah: " + total);
    }
}
