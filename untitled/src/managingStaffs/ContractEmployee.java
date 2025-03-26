package managingStaffs;

public class ContractEmployee extends commonEmployees {
    private double bonus;

    public ContractEmployee(String name, int id, String KindOfStaff, double bonus) {
        Employee(name, id, KindOfStaff);
        this.bonus = bonus;
    }


    @Override
    void showInforOfStaff(String name, int id, String KindOfStaff) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Kind of Staff: " + KindOfStaff);
        System.out.println("Bonus: " + bonus);
    }
    @Override
    double getSalary() {
        return MIN_SALARY + bonus;
    }

   void ShowlateSalary() {
        System.out.println("Contract Employee Salary: ");
        calculateSalary();
    }
}
