package Week_1.Dersler;

import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        sayi = input.nextInt();

        System.out.println();
        while (sayi<=15555 ){
            sayi++;
            if(sayi % 2 == 0){
                break;
            }
            System.out.println(sayi);
        }

    }
}
