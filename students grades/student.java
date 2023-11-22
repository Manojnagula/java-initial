import java.util.Scanner;

public class student {
    int marks;
    String grade;

    public student(int marks) {
        this.marks = marks;
        this.grade = Grade();
    }

    public String Grade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80 && marks < 90) {
            return "B";
        } else if (marks >= 70 && marks < 80) {
            return "C";
        } else if (marks >= 60 && marks < 70) {
            return "D";
        } else if (marks >= 50 && marks < 60) {
            return "E";
        } else if (marks >= 40 && marks < 50) {
            return "F";
        } else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = scn.nextInt();
        student stu1 = new student(marks);
        System.err.println("Grade of the student is :  "+stu1.grade);
        scn.close();
    }
}
