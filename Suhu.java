import java.util.Scanner;

public class Suhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih konversi yang ingin dilakukan:");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Kelvin");
        System.out.println("3. Fahrenheit ke Celcius");
        System.out.println("4. Fahrenheit ke Kelvin");
        System.out.println("5. Kelvin ke Celcius");
        System.out.println("6. Kelvin ke Fahrenheit");
        System.out.print("Masukkan pilihan Anda (1-6): ");

        int pilihan = input.nextInt();

        System.out.print("Masukkan nilai suhu: ");
        double nilaiSuhu = input.nextDouble();

        double hasilKonversi;

        switch (pilihan) {
            case 1:
                hasilKonversi = nilaiSuhu * 9.0 / 5.0 + 32.0;
                System.out.println(nilaiSuhu + "°C sama dengan " + hasilKonversi + "°F");
                break;
            case 2:
                hasilKonversi = nilaiSuhu + 273.15;
                System.out.println(nilaiSuhu + "°C sama dengan " + hasilKonversi + "K");
                break;
            case 3:
                hasilKonversi = (nilaiSuhu - 32.0) * 5.0 / 9.0;
                System.out.println(nilaiSuhu + "°F sama dengan " + hasilKonversi + "°C");
                break;
            case 4:
                hasilKonversi = (nilaiSuhu - 32.0) * 5.0 / 9.0 + 273.15;
                System.out.println(nilaiSuhu + "°F sama dengan " + hasilKonversi + "K");
                break;
            case 5:
                hasilKonversi = nilaiSuhu - 273.15;
                System.out.println(nilaiSuhu + "K sama dengan " + hasilKonversi + "°C");
                break;
            case 6:
                hasilKonversi = (nilaiSuhu - 273.15) * 9.0 / 5.0 + 32.0;
                System.out.println(nilaiSuhu + "K sama dengan " + hasilKonversi + "°F");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
