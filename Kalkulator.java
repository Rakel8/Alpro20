import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                if (bil2 == 0) {
                    System.out.println("Pembagian dengan nol tidak diizinkan!");
                    return;
                }
                hasil = bil1 / bil2;
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }

        System.out.println("\nHasil: " + hasil);
    }
}
