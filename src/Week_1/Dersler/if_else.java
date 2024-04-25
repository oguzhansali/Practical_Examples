package Week_1.Dersler;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int yas,  kilo ;

        Scanner innput = new Scanner(System.in);

        System.out.println("Yasinizi Giriniz: ");
        yas = innput.nextInt();

        System.out.println("Kilonuzu Giriniz: ");
        kilo = innput.nextInt();

        if(yas <= 25){
            if(kilo<100 && kilo>30){
                System.out.println("Vucut olculeriniz uygundur.");

            }else{
                System.out.println("Vucut olculeriniz uygun degildir.");

                int var1 = 5;
                int var2 = 6;
                if((var2=1)==var1){
                    System.out.println(var2);
                }else{
                    System.out.println(++var2);
                }
            }
        }
    }
}
