package Week_2.MaasHesaplama;

public class Employee {
    //Nitelikler tanımlandı.
    String name;//Çalışan Adı.
    double salary;//Maaş.
    double workHours;//Çalışma Saati.
    int hireYear;//Toplam çalışma yılı.

    double bonus;
    double tax;
    double raiseSalary;
    double taxBonus;
    double totalSalary;
//  Kurucu metod olusturuldu.
    Employee(String name, double salary, int workHous, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHous;
        this.hireYear = hireYear;


    }
//Alınan maaşa göre kesinti yapılacak vergi miktarı hesabı.
    void tax() {
        if (this.salary > 0 && this.salary < 1000) {
            this.tax = this.salary;
        } else {
            this.tax = this.salary * 0.03;
        }

    }
    //Çalışma süresi 40 saatin üzerinde alacağı  extra ücret.
    void bonus(){
        if (this.workHours>40){
            this.bonus=(this.workHours-40)*30;
        }else {
            this.bonus=0;
        }

    }

    //Toplam çalışma yılına göre alacağı zam fiyatı.
    void raiseSalary(){
        if (2021-this.hireYear>10){
            this.raiseSalary=this.salary*0.05;
        }
        else if (2021-this.hireYear<20&&2021-this.hireYear>9){
            this.raiseSalary=this.salary*0.1;

        }else {
            this.raiseSalary=this.salary*0.15;
        }

    }
//Maaşında vergi ve bonuslar eklenince elde edilen tutar.
    double taxBonus (){
        return  this.taxBonus=this.salary+this.bonus-this.tax;
    }
//Bütün vergi bonus ve maaş artışları ile oluşan toplam maaş.
    double totalSalary(){
        return  this.totalSalary =this.salary+this.bonus+this.raiseSalary-this.tax;
    }


//Çalışana ait veirler ekrana yazdırılmıştır.
    void  string(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı: "+ this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :  " + this.taxBonus);
        System.out.println("Toplam Maaş: " + this.totalSalary);
    }


}
