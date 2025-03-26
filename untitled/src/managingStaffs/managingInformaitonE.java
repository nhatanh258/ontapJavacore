package managingStaffs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class managingInformaitonE {
    Scanner input = new Scanner(System.in);
    public int choose = 0;
    List<commonEmployees> employees = new ArrayList<commonEmployees>();

    public managingInformaitonE() {
        do {
            dispalyScreen();
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    searchStaff();
                    break;
                case 3:
                    viewSalaryById();
                    break;
                case 4:
                    viewAllTableStaffs();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choose != 0);
    }


    public void dispalyScreen() {
        System.out.println("Welcome to the Information Management System");
        System.out.println("1. Add new staff");
        System.out.println("2. Search staff");
        System.out.println("3. View salary by id");
        System.out.println("4. View all table staffs");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // method of managers
    public void addStaff() {
        System.out.println("Choose type of staff: ");
        System.out.println("1. Full-time staff");
        System.out.println("2. Contract staff");
        int typeStaff = input.nextInt();
        input.nextLine();
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Enter your ID ");
        int id = input.nextInt();

        if (typeStaff == 1) {
            System.out.println("Enter bonus of main staff");
            int bonus = input.nextInt();
            commonEmployees.ConfigKinds kind = commonEmployees.ConfigKinds.FULL_TIME;
            FullTimeEmployees newMainEmployees = new FullTimeEmployees(name, id, String.valueOf(kind), bonus);
            employees.add(newMainEmployees);
            System.out.println("successfully !");
        } else {
            System.out.println("Enter bonus of sub staff");
            int bonus = input.nextInt();
            commonEmployees.ConfigKinds kind = commonEmployees.ConfigKinds.PART_TIME;
            ContractEmployee newContractEmployees = new ContractEmployee(name, id, String.valueOf(kind), bonus);
            employees.add(newContractEmployees);
            System.out.println("successfully !");
        }
    }

    public void searchStaff() {
        System.out.println("Nhap id to find staff !");
        int id = input.nextInt();
        commonEmployees employee = findingEmployById(id);
        if (employee != null) {
            employee.showInforOfStaff(employee.name, employee.id, employee.KindOfStaff);
        } else {
            System.out.println("No staff found with this ID.");
        }
    }

    public void viewSalaryById() {
        System.out.println("Nhap id to view salary!");
        int id = input.nextInt();
        commonEmployees employee = findingEmployById(id);
        if (employee != null) {
            System.out.println("Salary of " + employee.name + ": " + employee.getSalary());
        } else {
            System.out.println("No staff found with this ID.");
        }
    }

    public void viewAllTableStaffs() {
        if (employees.isEmpty()) {
            System.out.println("No staffs in the table.");
        } else {
            System.out.println("All staffs in the table:");
            System.out.println(" id                 name                 type               salary");
            for (commonEmployees employee : employees) {
                System.out.printf("%-20d %-20s %-20s %-20.2f%n", employee.id, employee.name, employee.KindOfStaff, employee.getSalary());
            }
        }
    }

    public commonEmployees findingEmployById(int id) {
        for (commonEmployees employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }


}
