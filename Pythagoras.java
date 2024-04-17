import java.util.Scanner;

public class Pythagoras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi alas (cm): ");
        double alas = input.nextDouble();

        System.out.print("Masukkan panjang sisi tinggi (cm): ");
        double tinggi = input.nextDouble();

        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);

        System.out.println("Panjang sisi miring: " + sisiMiring + " cm");
    }
}
