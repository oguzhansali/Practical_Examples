package Week_2.Practices;

import java.util.Scanner;

public class PalindromikKelimeBulma {

    static boolean isPalindrom(String str){
        int i =0;//Kelimenin ilk karakteri için indis belirlendi.
        int j=str.length()-1;//Başlangıçta kelimenin son harfi için indis belirlendi.
        while (i<j){//Kelimenin başından sonuna doğru kontrol edilir.
            if (str.charAt(i)!=str.charAt(j)){//karakterler karşılaştırılır.
                return false;//Karakterler eşit değilse false döndürülür.
            }
            //indisler ileri geri hareket ettirilir.
            i++;
            j--;
        }
        //Döngüden çıkılırsa true kabul edilir ve kelime pandromik kabul edilir.
        return true;
    }
    //isPalindrom metodu çağrılarak kelimenin palindrom olup olmadığı kontrol edilir.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz:");
        String word = input.nextLine();
        if (isPalindrom(word)){//Kelime palindrom kelimeyse ekrana yazdırılır.
            System.out.println(word+" palindrom bir kelimedir..");
        }else {//Kelime palindrom kelime değilse ekrana yazdırılır.
            System.out.println(word+ " palindrom bir kelime değildir.");
        }

    }
}
