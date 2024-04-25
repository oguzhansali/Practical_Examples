package Week_1.odev2;

import java.util.Scanner;

public class burcbulan_program {
    public static void main(String[] args) {
        int day;
        String months ;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum ayınızı giriniz : ");
        months = input.nextLine();
        System.out.println("Doğum gününüzü giriniz : ");
        day = input.nextInt();

        if (months.equals("ocak")){
            if(day>=1 && day<=21){
                System.out.println("Oğlak Burcusunuz.");
            } else if (day>21 && day<31) {
                System.out.println("Kova Burcusunuz.");
            }

        } else if (months.equals("şubat")) {
            if(day<=19 && day>=1 ){
                System.out.println("Kova Burcusunuz.");
            } else if (day>19&& day<=29) {
                System.out.println("Balık Burcusunuz.");
            }

        }else if (months.equals("mart")){
            if(day>=1 && day<=20) {
                System.out.println("Balık Burcusunuz.");
            } else if (day>20 && day<31) {
                System.out.println("Koç Burcusunuz.");
            }
        } else if (months.equals("nisan")) {
            if (day>=1 && day<=20){
                System.out.println("Koç Burcusunuz.");
            } else if (day>20 && day<=30) {
                System.out.println("Boğa Burcusunuz.");
            }

        } else if (months.equals("mayıs")) {
            if (day>=1 && day<=21){
                System.out.println("Boğa Burcusunuz.");
            } else if (day>21 && day<=31) {
                System.out.println("İkizler Burcusunuz.");
            }

        } else if (months.equals("haziran")) {
            if (day>=1 && day<=22){
                System.out.println("İkizler Burcusunuz.");
            } else if (day>22 && day<=30) {
                System.out.println("Yengeç Burcusunuz.");
            }

        } else if (months.equals("temmuz")) {
            if (day>=1 && day<=22) {
                System.out.println("Yengeç Burcusunuz.");
            } else if (day>22 && day<=31) {
                System.out.println("Aslan Burcusunuz.");
            }

        } else if (months.equals("ağustos")) {
            if (day>=1 && day<=22){
                System.out.println("Aslan Burcusunuz.");
            } else if (day>22 && day<=31) {
                System.out.println("Başak Burcusunuz.");
            }

        } else if (months.equals("eylül")) {
            if (day>=1 && day<=22){
                System.out.println("Başak Burcusunuz.");
            } else if (day>22 && day<=30) {
                System.out.println("Terazi Burcusunuz.");
            }

        } else if (months.equals("ekim")) {
            if (day>=1 && day<=22){
                System.out.println("Terazi Burcusunuz.");
            } else if (day>22 && day<=31) {
                System.out.println("Akrep Burcusunuz.");
            }

        } else if (months.equals("kasım")) {
            if (day>=1 && day<=21){
                System.out.println("Akrep Burcusunuz.");
            } else if (day>=21 && day<=30) {
                System.out.println("Yay Burcusunuz.");
            }

        } else if (months.equals("aralık")) {
            if (day>=1 && day<=21){
                System.out.println("Yay Burcusunuz.");
            } else if (day>=21 && day<=31) {
                System.out.println("Oğlak Burcusunuz.");
            }

        }else {
            System.out.println("Doğum ayınızı  karakterler küçük olacak şekilde tekrar giriniz.");
        }


    }


    }

