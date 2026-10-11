package main;

import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    void display() {
        System.out.printf("ID: %d, Name: %s, Marks: %.1f%n", id, name, marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for Student " + (i + 1));

            System.out.print("ID: ");
            students[i].id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            students[i].name = input.nextLine();

            System.out.print("Marks: ");
            students[i].marks = input.nextDouble();
            System.out.println();
        }

        System.out.println("===== Student Information =====");
        for (Student student : students) {
            student.display();
        }

        Student topper = students[0];
        double totalMarks = students[0].marks;
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
            totalMarks += students[i].marks;
        }

        System.out.println();
        System.out.println("===== Top Student =====");
        topper.display();

        System.out.printf("%nAverage Marks: %.1f%n", totalMarks / students.length);
        input.close();
    }
}
