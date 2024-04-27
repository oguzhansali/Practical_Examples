package Week_1.odev3;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        //Degiskenler tanımlandı.
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        int n = inp.nextInt();
        while (n >= 1) {//Girilen degerden 1 e ulaşsana kadar satırlar yazdıırldı.
            int k = 1;
            while (k <= 2 * n - 1) {//Satırlarda ollması istenılen yıldızlar olusturuldu.
                System.out.print("*");
                k++;//Yeni k degeri olustu.
            }
            System.out.println();
            n--;//n sayısı azaltılarak satır atlaması yapıldı.
        }
    }
}
