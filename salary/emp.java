import java.util.Scanner;

public class emp {
        public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of Employees");
        num = scn.nextInt();
        scn.nextLine();

        Employee[] employees = new Employee[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Enter the name of the Employee" + " " + (i + 1));
            String name = scn.nextLine();
            System.out.println("Enter role of the Employee" + " " + (i + 1));
            String role = scn.nextLine();
            System.out.println("Enter number of hours worked");
            int NoOfHours = scn.nextInt();
            System.out.println("Enter Rate per hour");
            int ratePerHour = scn.nextInt();
            scn.nextLine();
            employees[i] = new Employee(name, role, NoOfHours, ratePerHour);
        }
        scn.close();
        for (int j = 0; j < num; j++) {

            System.out.println("Name: " + employees[j].name);
            System.out.println("Salary of the employe : " + employees[j].salary);
            System.out.println(" ");
        }

    }

}
