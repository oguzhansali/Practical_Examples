
package ödev1;

import java.util.Scanner;

public class ortalama_hesaplama {
    public static void main(String[] args) {
        int kimya, mat, müzik, fizik, tarih, türkçe ;

        Scanner input = new Scanner(System.in);

        System.out.printf("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.printf("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.printf("Müzik notunuzu giriniz: ");
        müzik = input.nextInt();

        System.out.printf("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.printf("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.printf("Türkçe notunuzu giriniz: ");
        türkçe = input.nextInt();

        int toplam = (kimya + mat+müzik + fizik + tarih+ türkçe);
        double sonuc = toplam /6 ;

        System.out.println("Not ortalamanız: " +  sonuc);

        if(sonuc >= 60){
            System.out.println("Başarıyla geçtiniz.");

        }else{
            System.out.println("Başarısız.");
        }



    }
}
