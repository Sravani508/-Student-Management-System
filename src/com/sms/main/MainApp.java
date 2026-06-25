package com.sms.main;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    Student s = new Student();
                    System.out.print("Name: ");
                    s.setName(sc.nextLine());
                    System.out.print("Email: ");
                    s.setEmail(sc.nextLine());
                    System.out.print("Course: ");
                    s.setCourse(sc.nextLine());
                    System.out.print("Marks: ");
                    s.setMarks(sc.nextDouble());

                    System.out.println(
                            dao.addStudent(s)
                                    ? "✅ Student Added"
                                    : "❌ Failed"
                    );
                }

                case 2 -> {
                    List<Student> list = dao.getAllStudents();
                    list.forEach(st ->
                            System.out.println(
                                    st.getId() + " | " +
                                    st.getName() + " | " +
                                    st.getEmail() + " | " +
                                    st.getCourse() + " | " +
                                    st.getMarks()
                            )
                    );
                }

                case 3 -> {
                    Student s = new Student();
                    System.out.print("ID: ");
                    s.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("New Name: ");
                    s.setName(sc.nextLine());
                    System.out.print("New Email: ");
                    s.setEmail(sc.nextLine());
                    System.out.print("New Course: ");
                    s.setCourse(sc.nextLine());
                    System.out.print("New Marks: ");
                    s.setMarks(sc.nextDouble());

                    System.out.println(
                            dao.updateStudent(s)
                                    ? "✅ Updated"
                                    : "❌ Failed"
                    );
                }

                case 4 -> {
                    System.out.print("ID to delete: ");
                    int id = sc.nextInt();
                    System.out.println(
                            dao.deleteStudent(id)
                                    ? "🗑 Deleted"
                                    : "❌ Failed"
                    );
                }

                case 5 -> {
                    System.out.println("👋 Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("❌ Invalid choice");
            }
        }
    }
}
