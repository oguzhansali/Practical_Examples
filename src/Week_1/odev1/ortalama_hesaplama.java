
package Week_1.odev1;

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
        int sonuc = toplam /6 ;
        String avarage = (sonuc>60) ? "Başarıyla Geçtiniz. Ortalamanız : " + sonuc  : "Başarısız. Ortalamanız : " + sonuc ;
        System.out.println(avarage);







    }
}
