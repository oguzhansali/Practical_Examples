package Week_1.Dersler;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        int password;
        boolean askPassword = true;

        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Parolanızı giriniz : ");
            password = input.nextInt();
            if (password == 123){
                System.out.println("Doğru");
                askPassword = false;
            }else {
                System.out.println("Yanlış");
            }
            System.out.println();
        }while (askPassword);

    }
}
