import java.util.Scanner;

class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double br) {
        length = l;
        breadth = br;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();

        System.out.println("Enter length of rectangle:");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of rectangle:");
        double br = sc.nextDouble();

        System.out.println("Enter base of triangle:");
        double b = sc.nextDouble();
        System.out.println("Enter height of triangle:");
        double h = sc.nextDouble();

        Shape c = new Circle(r);
        Shape rect = new Rectangle(l, br);
        Shape t = new Triangle(b, h);

        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Triangle: " + t.calculateArea());

        sc.close();
    }
}
