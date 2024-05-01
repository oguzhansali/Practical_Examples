package Week_2.ÖğrenciNotSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix,Teacher courseTeacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.courseTeacher=courseTeacher;

    }

    public  void addTeacher(Teacher courseTeacher){
        if (this.prefix.equals(courseTeacher.branch)){
            this.courseTeacher=courseTeacher;
            System.out.println("İşlem Başarılı.");
        }else {
            System.out.println(courseTeacher.name + " Akademisyen bu dersi vermiyor.");
        }
    }

    public void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name + " dersinin Akademisyeni  " + courseTeacher.name);
        }else {
            System.out.println(this.name + " dersine akademiseten atanmamıştır.");
        }
    }

}
