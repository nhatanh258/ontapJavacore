package managingStaffs;

abstract class commonEmployees {
    public enum ConfigKinds {
        FULL_TIME("FULL_TIME"),
        PART_TIME("PART_TIME");
        private final String key;

        // Constructor
        ConfigKinds(String key) {
            this.key = key;
        }


        // Getter để lấy giá trị string
        public String getKey() {
            return key;
        }
    }

    final double MIN_SALARY = 3000.0;
    String name;
    int id;
    String KindOfStaff;


    public void Employee(String name, int id, String KindOfStaff) {// được phép kế thừa
        this.name = name;
        this.id = id;
        this.KindOfStaff = KindOfStaff;
    }

    final void calculateSalary() {// phuong thuc nay chi co mot tai day khong the ghi de ra cai khac
        // dma bao noi dung duoc naht quan va khong bi thya doi khi in ra cho tung nhan vien
        System.out.println("Employee ID : " + id + ", Name: " + name);
        System.out.println("Salary: " + getSalary() + " \n ");
        System.out.println("Kind of Staff: " + KindOfStaff + "\n");
    }

    abstract void showInforOfStaff(String name, int id, String KindOfStaff);

    abstract double getSalary();

}
