package Week_2.Homework;

public class DizideOrtalamaBulma {
    public static void main(String[] args) {
        int[] list = {2,3,4,5,6};//Dizi oluşturuldu.
        double sum=0;//Toplam başlangıç 0 tanımlandı.
//Liste içindeki  indeksler teker teker gezilerek toplama işlemi sum değerine atandı ve sum değerinin harmonik ortalaması alındı.
        for (int i = 0; i< list.length;i++){
            sum+=(1.0/list[i]);
        }
        double avarage= list.length/sum;
        System.out.println(avarage);
    }
}
