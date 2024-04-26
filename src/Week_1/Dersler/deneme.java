import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = scanner.nextInt();

        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }

    // Faktoriyel hesaplama methodu
    public static int faktoriyel(int n) {
        if (n == 0)
            return 1;
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
