package managingStaffs;

class FullTimeEmployees extends commonEmployees {


    private double bonus;

    public FullTimeEmployees(String name, int id, String KindOfStaff, double bonus) {
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
    public void showLine(){
        System.out.println(name +"           " + id + "              " + KindOfStaff + "        " + getSalary());
    }

}
