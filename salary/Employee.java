class Employee {
    String name;
    String role;
    int salary;
    int NoOfHours;
    int salaryPerHour;

    public Employee(String name, String role, int NoOfHours, int salaryPerHour) {
        this.role = role;
        this.NoOfHours = NoOfHours;
        this.salaryPerHour = salaryPerHour;
        this.name = name;
        this.salary = salaryCaluculator();
    }

    public int salaryCaluculator() {
        return salaryPerHour * NoOfHours;

    }

}