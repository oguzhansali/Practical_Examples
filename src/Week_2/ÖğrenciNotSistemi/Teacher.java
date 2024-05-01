package Week_2.ÖğrenciNotSistemi;

public class Teacher {
    String name;
    String mbphnumber;
    String branch;


    Teacher(String name, String mbphnumber, String branch){
        this.name=name;
        this.mbphnumber=mbphnumber;
        this.branch=branch;

    }
    void print(){
        System.out.println("ADI: " + this.name);
        System.out.println("Tel No :" + this.mbphnumber);
        System.out.println("Branşı : " + this.branch);
    }

}
