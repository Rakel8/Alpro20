import java.util.Scanner;

public class JumlahHuruf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.next();

        int jumlahHuruf = 0;

        for (char huruf : kata.toCharArray()) {
            if (Character.isLetter(huruf)) {
                jumlahHuruf++;
            }
        }

        System.out.println("Jumlah huruf dalam kata \"" + kata + "\": " + jumlahHuruf);
    }
}
