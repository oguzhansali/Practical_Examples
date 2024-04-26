package Week_1.Dersler;

import java.util.Scanner;

public class ornek_while {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Bir sayi giriniz: ");
            sayi = input.nextInt();
        }while (sayi>0);
    }
}
