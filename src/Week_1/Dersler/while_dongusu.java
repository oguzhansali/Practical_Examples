package Week_1.Dersler;

import java.util.Scanner;

public class while_dongusu {
    public static void main(String[] args) {
        int password;
        boolean ispasswordSucsess = false;

        while (!ispasswordSucsess){
            Scanner input = new Scanner(System.in);
            System.out.print("Şifre Giriniz: ");
            password = input.nextInt();
            if(password ==123){
                System.out.println("Giriş Başarılı.");
                ispasswordSucsess =true;
                System.out.println();

            }else{
                System.out.println("Şifre hatalı.");

            }
        }
    }
}
