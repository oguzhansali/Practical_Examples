package Week_2.ÖğrenciNotSistemi;

public class Student {
    String name,stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;

    boolean isPass;

    Student ( String name,String stuNo,String classes, Course mat, Course fizik,Course kimya){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.avarage=0.0;
        this.isPass=false;



    }
    public void addBulkExamNore(int mat,int fizik,int kimya){
        if (mat>=0&&mat<=100){
            this.mat.note=mat;
        }
        if (fizik>=0&&fizik<=100){
            this.fizik.note=fizik;
        }
        if (kimya>=0&&kimya<=100){
            this.kimya.note=kimya;
        }

    }


    public void isPass(){
        this.avarage=(this.mat.note+this.fizik.note+this.kimya.note)/3.0;
        if (avarage>=55){
            System.out.println( "Ortalamanız : " +  avarage + "\n Sınıfı geçtiniz.");
        }else {

            System.out.println("Ortalamanız : " + avarage + "\n Sınıf Tekrarı.");
        }
    }



    public void printNote(){
        System.out.println("=======================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }







}
