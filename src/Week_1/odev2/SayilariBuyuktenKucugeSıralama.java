package Week_1.odev2;

import java.util.Scanner;

public class SayilariBuyuktenKucugeSıralama {
    public static void main(String[] args) {
        //Degıskenler tanımlanarak kullanıcıdan bu degıskenlerın gırılmesı ıstenmıstır.
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı  giriniz.");
        a = input.nextInt();
        System.out.println("2.Sayıyı giriniz.");
        b = input.nextInt();
        System.out.println("3.Sayıyı giriniz.");
        c = input.nextInt();
//Kosul blogu oluşturularak sayıları sıralama işlemi yapıldı.
        if(a<b && a<c){
            if(b<c){
                System.out.println(a + "<"+ b + "<" + c);
            }else{
                System.out.println(a + "<"+ c + "<" + b);
            }
        } else if (b<a && b<c) {
            if(a<c){
                System.out.println(b + "<"+ a + "<" + c);
            }else{
                System.out.println(b + "<"+ c + "<" + a);
            }

        }else if (c<a && c<b){
            if (a<b){
                System.out.println(c + "<"+ a + "<" + b);
            }else{
                System.out.println(c + "<"+ b + "<" + a);
            }
        }


    }
}
