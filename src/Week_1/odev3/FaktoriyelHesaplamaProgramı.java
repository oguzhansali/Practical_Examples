package Week_1.odev3;

import java.util.Scanner;

public class FaktoriyelHesaplamaProgramı {
    public static void main(String[] args) {
        int n,r;
        int nfak=1;
        int rfak=1;
        int i=1;
        int farkfak=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        n= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        r = inp.nextInt();

        do {


            int fark= n - r ;

            for (i =1; i<=n; i++){
                nfak*=i;
            }
            for (i=1; i<=r; i++){
                rfak*=i;
            }
            for ( i =1; i<=fark; i++){
                farkfak*=i;

            }
            int komb= nfak/(rfak*farkfak);
            System.out.println(n + " Kombinasyon " + r +" 'nin sonucu " + komb + " dur.");
        }while (n>=i && r>=i );



    }
}
