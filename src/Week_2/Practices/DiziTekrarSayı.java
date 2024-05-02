package Week_2.Practices;

public class DiziTekrarSayı {

    static boolean isFind(int[] arr,int value){//Daha önce tekrar eden sayı dizi içine eklendimi kontrol eder.
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {1, 2, 2, 3, 4, 5, 6, 7, 10, 10,3};//Dizi oluşturuldu.
        int[] duplicate = new int[list.length];//Aynı eleman tekrar edilip edilmediğini kontrol edeceğimiz dizi.
        int startIndeks = 0;//Başlangıç indisi  kabul edildi.

        for (int i = 0; i < list.length; i++) {//Dizi içindeki her indisi kontrol eder.
            if (list[i]%2==0){//Dizideki indeksteki sayıların çift sayı olduğnu kontrol eder.
                for (int j = i+1; j < list.length; j++) {//Dış indisten sonraki indisi kontrol ederek gider.
                    if (list[i] == list[j]) {//Eğer bir sayı 2 kez kullanılmışsa iç ve dış göndüde duplicate dizisine eklenir.
                        if (!isFind(duplicate,list[i])){
                            duplicate[startIndeks++] = list[i];
                        }


                    }

                }
            }


        }
        //Eğer  duplicate dizisi içindeki sayılar 0 dan farklı ise ekrana yazdırılır.
        for (int value : duplicate){
            if (value!=0){
                System.out.print(value + " ");
            }
        }


    }

}
