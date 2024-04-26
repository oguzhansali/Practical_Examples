package Week_1.odev2;

import java.util.Scanner;

public class HavaSıcakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz: ");
        heat = input.nextInt();
        
        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat>=5 && heat<=15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
                       
        } else if (heat>15 && heat<=25) {
            System.out.println("Pikniğe gidebilirsiniz.");
            
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
