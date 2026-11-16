import java.util.Scanner;

interface Academic {
    void setAcademicDetails();
    void displayAcademicDetails();
}

interface Sports {
    void setSportsDetails();
    void displaySportsDetails();
}

class Student implements Academic, Sports {
    String course;
    double marks;
    String sport;

    public void setAcademicDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        course = sc.nextLine();
        System.out.print("Enter academic marks: ");
        marks = sc.nextDouble();
    }

    public void setSportsDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sport name: ");
        sport = sc.nextLine();
    }

    public void displayAcademicDetails() {
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    public void displaySportsDetails() {
        System.out.println("Sport: " + sport);
    }

    public void displayCombinedDetails() {
        System.out.println("\n--- Combined Student Information ---");
        displayAcademicDetails();
        displaySportsDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAcademicDetails();
        s.setSportsDetails();

        System.out.println("\n--- Academic Details ---");
        s.displayAcademicDetails();

        System.out.println("\n--- Sports Details ---");
        s.displaySportsDetails();

        s.displayCombinedDetails();
    }
}
