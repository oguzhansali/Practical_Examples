package Week_1.odev3;

import java.util.Scanner;

public class girilen_sayiyakadar_çiftsayibulma {
    public static void main(String[] args) {
        int k ;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        k = input.nextInt();
        int i = 1;
        while (i<=k){
            i++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
