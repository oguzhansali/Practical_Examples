package ödev1;
import java.util.Scanner; // kullanıcıdan veri alınması için scanner import edildi.

public class deneme1 {

    public static void main(String[] args) {// kodun çalıştırılamsı çin main bloğu eklendi.

        int kimya, mat, müzik, fizik, tarih, türkçe ; // değişkenler tanımlandı.

        Scanner input = new Scanner(System.in); // veri almaya yarayan scanner tanımlandı.

        System.out.printf("Kimya notunuzu giriniz: ");// kullanıcıdan veri girmesini siter.
        kimya = input.nextInt();// girilen bu değeri değişkene atar. Bu adımlar allttaki diğer değişkenler içinde geçerli.

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

        int total = (kimya + mat + müzik + fizik + tarih + türkçe);// değişkenlere atanan değerler toplanır.
        double result = total / 6; //Değişkenlerin ortlamasının tam sayı çıkmamasına karşın veri tipi değiştirildi.

        System.out.println("Not ortalamanız: " +  result);// Not ortalaması ekrana yazıldı.


        String situ;
        switch ((int) result / 10) { //10a bölerek 10 lar basamağındaki değer bir tam sayıya dönüştürülür
            case 10:// onlar basamağıdnaki sayılar case ile birlikte geçme durumunu belirtir.
            case 9:
            case 8:
            case 7:
            case 6:
                situ = "Başarıyla geçtiniz.";
                break;
            default:// 10 lar basamağı üstteki değerlerden biri değilse  bu durum çalışır ve aşağıdaki çıktı alınır.
                situ = "Başarısız.";
        }
        System.out.println(situ);// Sistem çıktısı ekrana yazdırılır.

    }

}
