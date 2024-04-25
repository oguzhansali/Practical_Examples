package Week_1;
import java.util.Scanner;
public class aritmetik_islemler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A, B ve C sayılarını sırasıyla giriniz (örn: 5 6 7): ");
        String[] girdiler = input.nextLine().split(" ");

        double a = Double.parseDouble(girdiler[0]);
        double b = Double.parseDouble(girdiler[1]);
        double c = Double.parseDouble(girdiler[2]);

        double işlem = a + b * c - b;

        System.out.println("İşlem sonucu: " + işlem);
    }
}
