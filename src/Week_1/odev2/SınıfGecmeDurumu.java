package Week_1.odev2;

import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String[] args) {
        //Değişkenler tanımlanarak kullanıcıdan bu bilgiler alınmıştır.
        int a, b, c, d,  e;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        a= input.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        b = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        c = input.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        d = input.nextInt();
        System.out.println("Müzik notunuzu giriniz : ");
        e = input.nextInt();
        double total = 0;
        double count = 0;
        //Kosul bloğu oluşturularak gerekli şartların sağlanması incelendi.
        if(a>=0 && a<=100){
            total+=a;
            count++;
        }else {
            System.out.println("Geçersiz Matematik Notu girdiniz!");
        }
        if(b>=0&&b<=100){
            total+=b;
            count++;
        }else {
            System.out.println("Geçersiz Fizik Notu Girdiniz!");
        }
        if(c>=0&&c<=100){
            total+=c;
            count++;

        }else {
            System.out.println("Geçersiz Türkçe Notu Girdiniz!");
        }
        if(d>=0&&d<=100){
            total+=d;
            count++;
        }else{
            System.out.println("Geçersiz Kimya Notu Girdiniz!");
        }
        if(e>=0&&e<=100){
            total+=e;
            count++;
        }else{
            System.out.println("Geçersiz Müzik Notu Girdiniz!");
        }
//Oortalama hesaplandı.
        double result = total/count;
        String avarage = (result>55)?"Basarıyla gectiniz.Notunuz : " + result : "Başarısız.Notunuz : " + result;
        System.out.println(avarage);





    }
}
