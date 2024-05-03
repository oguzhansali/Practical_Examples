package Week_2.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSıralama {
    //List adındaki dizide girilen sayıları dizideki değerlerin hepsini gezerek sıralar ve yazdırır.
    public static void siralamaList(int[] list){
        Arrays.sort(list);
        System.out.print("Sıralama:");
        for (int sayi:list){
            System.out.print(sayi + " ");
        }
        System.out.println();
    }
    //Kullanıcıdan alınan dizi boyutu kadar verı alması sağlanır.
    public static int[] sayiAl (){
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu : ");
        int boyut = input.nextInt();
        int[]list = new int[boyut];
        for (int i=0; i<boyut;i++){
            System.out.print((i+1)+ ". Sayıyı giriniz: ");
            list[i]=input.nextInt();
        }
        return list;
    }

    //Dizideki sayıları başka metoddan çağrılarak ekrana yazdırılır.
    public static void main(String[] args) {
       int[] list = sayiAl();
       siralamaList(list);

    }
}
