package Week_1.odev2;

import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        String username, password, feedback, new_password;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz :");
        username = input.nextLine();
        System.out.println("Kullanici şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("java") && password.equals("122333")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else if (!password.equals("122333")) {
            System.out.println("Şifreniz yanlış.");

            System.out.println("Şifrenizi değiştirmek istermisiniz?(evet/hayır)");
            feedback = input.nextLine();


            if (feedback.equals("evet")) {
                System.out.println("Yeni şifrenizi giriniz");
                new_password = input.nextLine();
                if (new_password.equals(new_password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre Oluşturuldu." + new_password);
                }

            } else {
                System.out.println("İşleminiz tamamlandı.");
            }

        }

    }


}
