package Week_1.odev3;
import java.util.Scanner;

public class YıldızlarIleUcgenYapımı {
    public static void main(String[] args) {
        //Degısken atandı.Veri alindi.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = input.nextInt();
//Ucgenin ust kismi olusuturldu.
        int i = 1;
        while (i <= n) {//n degerıne kadar satır sayısı olusturuldu.
            int j = 1;
            while (j <= n - i) {//Yildiza kadar olan bosluklar olusuturldu.
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {//Kac yildiz olacagi hesaplandi.
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;//i arttirilarak bu islem devam kosul saglanana kadar ıslem devam ettıırldı.
        }
//Ucgenın alt kismi olusutuldu.
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
