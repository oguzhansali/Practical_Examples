package Week_1.odev2;

import java.util.Scanner;

public class ucak_bileti_fiyati {
    public static void main(String[] args) {
        double mesafe,normaltutar,yasindirimi1,yasindirimi2,yasindirimi3,gidisdonusindirim,indirimlitutar1,indirimlitutar2,indirimlitutar3;
        int yas,yolculluk_tipi;

        Scanner input = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi giriniz : ");
        mesafe = input.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz:\n1=Tek Yön\n2=Gidiş Dönüş");
        yolculluk_tipi = input.nextInt();


        normaltutar = mesafe*0.10;
        yasindirimi1=normaltutar*0.5;
        yasindirimi2=normaltutar*0.1;
        yasindirimi3=normaltutar*0.3;
        gidisdonusindirim=0.2;
        indirimlitutar1= normaltutar-yasindirimi1;
        indirimlitutar2=normaltutar-yasindirimi2;
        indirimlitutar3=normaltutar-yasindirimi3;

        if (yas>0&&yas<12){
            if (yolculluk_tipi==2&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar - yasindirimi1 - indirimlitutar1*gidisdonusindirim)+"TL");

            }else if(yolculluk_tipi==1&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar-yasindirimi1)+"TL");
            }
        } else if (yas>=12 && yas<=24) {
            if (yolculluk_tipi==2&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar - yasindirimi2-indirimlitutar2*gidisdonusindirim)+"TL");
            }else if (yolculluk_tipi==1&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar-yasindirimi2)+"TL");
            }
            
        } else if (yas>=65) {
            if (yolculluk_tipi==2&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar-yasindirimi3-indirimlitutar3*gidisdonusindirim)+"TL");

            }else if (yolculluk_tipi==1&&mesafe>0){
                System.out.println("Toplam Tutar : " + (normaltutar-yasindirimi3)+"TL");
            }

        }else if (yas>24 && yas< 65){
            System.out.println("Toplam Tutar : " + normaltutar+"TL");

        }if(mesafe<0 || yas<0){
            System.out.println("Girdiler Hatalı");

        } else if (yolculluk_tipi!=1 && yolculluk_tipi!=2) {
            System.out.println("Yolculuk Tipi Hatalı.");

        }

        


    }
}
