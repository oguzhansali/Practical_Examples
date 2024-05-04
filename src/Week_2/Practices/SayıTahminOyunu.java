package Week_2.Practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;//Tahmin sayıları saklanır.
        int selected;//Kullanıcıdan alınan sayı.
        int[] wrong = new int[3];//Kullanıcı hakkını saklamak için kullanılacak dizi.
        boolean isWin = false;//Kazanılıp kaybedildiğini kontrol eder.
        boolean isWrong = false;//Tahminin doğru olup olmadığı kontrol edilir.


        while (right < 3) {//Kullanıcıdan alınan verilerin hatalı olması durumunda 3 hak verilir.
            System.out.println("Tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {//Girilen sayının 0 ve 100 arasında olması durumunda girilen sayının doğruluğu kontrol edilir.
                System.out.println("Lütfen 0 ve 100 arrasında bir değer giriniz.");
                if (isWrong) {
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hakkınız " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.printf("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {//Eğer  girilen sayı gizli sayıya eşitse sonuç ekrana yazdırılır.
                System.out.println("Tebrikler, tahmininiz doğru.Sayınız : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected < number) {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }

                wrong[right++]=selected;//Girilen her girişten sonra haklar düşürülür.
                System.out.println("Geriye kaaln tahmin hakkınız : "+ (3-right));

            }
        }

        if (!isWin){//Kaybetme durumunda çıktılar.
            System.out.println("Kaybettiniz!");
            if (!isWrong){
                System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
            }
        }


    }
}
