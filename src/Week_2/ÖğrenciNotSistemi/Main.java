package Week_2.ÖğrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ercan Değermenci", "111112222333", "MAT");
        Teacher t2 = new Teacher("Semra Öz", "111111111222", "FZK");
        Teacher t3 = new Teacher("Ali Kemal", "114445566", "KMY");

        Course mat = new Course("Matematik ", "MAT101", "MAT",t1);
        Course fizik = new Course("Fizik", "FZK101", "FZK",t2);
        Course kimya = new Course("Kimya", "KMY101", "KMY",t3);

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Oğuzhan SALİ", "426", "4", mat, fizik, kimya);
        s1.addBulkExamNore(100,20,60);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Samet T.", "429", "4", mat, fizik, kimya);
        s2.addBulkExamNore(100,80,70);
        s2.printNote();
        s2.isPass();

        Student s3 = new Student("Gökhan M.", "427", "4", mat, fizik, kimya);
        s3.addBulkExamNore(50,20,80);
        s3.printNote();
        s3.isPass();
    }

}
