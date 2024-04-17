import java.util.Scanner;

public class DidihAir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu air (°C): ");
        double suhuAir = input.nextDouble();

        if (suhuAir <= 0) {
            System.out.println("Air membeku menjadi es.");
        } else if (suhuAir < 100) {
            System.out.println("Air dalam keadaan cair.");
        } else {
            System.out.println("Air mendidih.");
        }
    }
}
