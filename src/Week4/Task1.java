package Week4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Person nedim = new Person("Nedim", "Orahovacka 30");
        Person jusa = new Person("jusa", "Dobrinja");

        System.out.println(nedim);
        System.out.println(jusa);

        Student olli = new Student("Olli", "Blabla");
        System.out.println(olli);
        System.out.println(olli.getCredits());

        olli.study();

        System.out.println(olli.getCredits());

        Teacher mirza = new Teacher("Mirza", "Burch", 5000);
        System.out.println(mirza);

        List<Person> people = new ArrayList<>();
        people.add(nedim);
        people.add(jusa);
        people.add(olli);
        people.add(mirza);

        System.out.println("################");
        printDepartment(people);

        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        circle.displayInfo();

        Person becir = new Person("Becir", "Burch", 20, "Bosnia");
        System.out.println(becir);

        Student fadil = new Student("Fadil", "Burch", 20, "Bosnia", 12313);
        System.out.println(fadil);

        fadil.setGrades(6);
        System.out.println(fadil);
        fadil.setGrades(7);
        System.out.println(fadil);

    }

    public static void printDepartment(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

}


class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //If only 2 arguments are passed, the constructor above is chosen

    public Person(String name, String address, int age, String country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address +"\nAge: " + age + "\nCountry: " + country;
    }
}

class Student extends Person {
    private int credits;
    private int student_id;
    private List<Integer> grades;

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(int grade) {
        if (grade >= 6 && grade <= 10) {
            this.grades.add(grade);
        } else
            System.out.println("Bad input.");
    }

    public int getCredits() {
        return credits;
    }

    public Student(String name, String address) {
        super(name, address);
    }

    public Student(String name, String address, int age,String country, int student_id) {
        super(name, address, age, country);
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public void study() {
        this.credits++;
    }

    public String toString() {
        return super.toString() + "\nCredits: " + this.credits+"\nGrades: "+grades;
    }
}

class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + this.salary;
    }
}

class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public void displayInfo() {
        System.out.println("The color of the shape is: " + color);
        System.out.println("Fill Type: " + fillType);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
    }
}

enum FillType {
    FILLED, NOT_FILLED
}
