package Week_2.MaasHesaplama;

public class Main {
    //Maas Hesaplama.
    public static void main(String[] args) {
        Employee employee = new Employee("Oğuzhan",5000,50,1995);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.taxBonus();
        employee.totalSalary();
        employee.taxBonus();
        employee.string();
    }


}
