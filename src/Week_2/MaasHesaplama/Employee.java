package Week_2.MaasHesaplama;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;
    double taxBonus;
    double totalSalary;

    Employee(String name, double salary, int workHous, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHous;
        this.hireYear = hireYear;


    }

    void tax() {
        if (this.salary > 0 && this.salary < 1000) {
            this.tax = this.salary;
        } else {
            this.tax = this.salary * 0.03;
        }

    }

    void bonus(){
        if (this.workHours>40){
            this.bonus=(this.workHours-40)*30;
        }else {
            this.bonus=0;
        }

    }
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

    double taxBonus (){
        return  this.taxBonus=this.salary+this.bonus-this.tax;
    }

    double totalSalary(){
        return  this.totalSalary =this.salary+this.bonus+this.raiseSalary-this.tax;
    }



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
