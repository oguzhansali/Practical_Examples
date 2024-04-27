package Week_1.odev3;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        //Degıskenler tanımlandı.
        Scanner inp = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int deneme = 3;
        float bakiye = 1500f;
//Kullanıcıdan giriş bilgileri istenildi.
        do {
            System.out.print("Kullanıcı adınızı giriniz: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parolanızı giriniz:");
            sifre = inp.nextLine();
//Doğru veriler girilirse giriş yapıldı.
            if (kullaniciAdi.equals("oguzhan") && sifre.equals("oguzhan61")) {
                System.out.println("Hoşgeldiniz.");
                System.out.println();
//Doğru girişte kullanılacak işlem seçtirildi.
                while (true) {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz:");
                    System.out.println("1- Para yatırma\n2- Para Çekme\n3- Bakiye Sorgula\n4- Çıkış yap");
                    System.out.print("İşleminiz:");
                    int secim = inp.nextInt();
//Seçime göre işlemler yaptırıldı.
                    switch (secim) {
                        case 1://Para yatırılarak mevcut bakiye üzerine eklenmesi sağlandı.
                            System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                            float yatirilanMiktar = inp.nextFloat();
                            bakiye += yatirilanMiktar;
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case 2://Para çekme işleminde cekilecek miktar bakiyede mevcutsa çekim işemi gerçekleştirildi.
                            System.out.print("Çekmek istediğiniz miktarı giriniz:");
                            float cekilenMiktar = inp.nextFloat();
                            if (cekilenMiktar <= bakiye) {//Çekilen miktar bakiyeden düşürüldü.
                                bakiye -= cekilenMiktar;
                                System.out.println("Bakiyeniz : " + bakiye);
                            } else {//Bakiyenin yetersizliğinde uyarı veirldi.
                                System.out.println("Yetersiz bakiye!");
                            }
                            break;
                        case 3://Hesaptaki mevcut bakiye gösterildi.
                            System.out.println("Şuanki bakiyeniz : " + bakiye);
                            break;
                        case 4://Hesapttan çıkış yaptırıldı.
                            System.out.println("BAŞARIYLA ÇIKIŞ YAPILDI.");
                            return; // Programı sonlandır
                        default://İstenilen işemlerden biri girilmezse uyarı verildi.
                            System.out.println("Lütfen geçerli bir seçenek giriniz.");
                    }
                }
            } else {//Kullanıcı verileri yanlış girilmişse deneme sayısı 3 olacak şekilde deneme yaptırılır.
                deneme--;
                System.out.println("Kullanıcı bilgileri yanlış.");
                if (deneme == 0) {//Deneme sayısı 0 a ulaştıgında hesap bloke edilir.
                    System.out.println("3 kez hatalı giriş yapıldığından hesabınız bloke edilmiştir. Lütfen müşteri hizmetlerine başvurunuz.");
                    return; // Programı sonlandır
                } else {//deneme 0 a ulaşmadan giriş sağlanırsa kalan deneme  hakkı gösterilir.
                    System.out.println("Kalan hakkınız: " + deneme);
                }
            }
        } while (deneme > 0);
    }
}
