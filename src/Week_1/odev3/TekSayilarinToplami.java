package Week_1.odev3;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int i;
        int sum =0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir sayi giriniz :");
            i = input.nextInt();
            if (i%2==0&&i%4==0){
                sum+=i;

            }

        }while(i%2==0);
        System.out.println(sum);



    }
}
