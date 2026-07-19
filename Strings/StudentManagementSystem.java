public import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
 
/**
 * StudentManagementSystem.java
 * Menu-driven console application that manages Student records
 * using an ArrayList<Student> (Java Collections Framework).
 */
public class StudentManagementSystem {
 
    // Dynamic storage for student records
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int choice;
 
        do {
            printMenu();
            choice = readInt("Enter your choice: ");
 
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAllStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> sortStudents();
                case 7 -> countStudents();
                case 8 -> calculateGradeMenu();
                case 9 -> System.out.println("Exiting... Thank you for using Student Management System!");
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
 
        } while (choice != 9);
 
        sc.close();
    }
 
    // ---------------- MENU ----------------
    private static void printMenu() {
        System.out.println("\n========== Student Management System ==========");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Sort Students");
        System.out.println("7. Count Students");
        System.out.println("8. Calculate Grade");
        System.out.println("9. Exit");
        System.out.println("=================================================");
    }
 
    // ---------------- 1. ADD STUDENT ----------------
    private static void addStudent() {
        System.out.println("\n--- Add New Student ---");
 
        int id = readInt("Enter Student ID: ");
 
        // Prevent duplicate Student IDs
        if (findStudentById(id) != null) {
            System.out.println("Error: A student with ID " + id + " already exists!");
            return;
        }
 
        String name = readString("Enter Name: ");
        int age = readInt("Enter Age: ");
        String gender = readString("Enter Gender: ");
        String course = readString("Enter Course: ");
        String department = readString("Enter Department/Branch: ");
        int semester = readInt("Enter Semester: ");
        String mobile = readString("Enter Mobile Number: ");
        String email = readString("Enter Email Address: ");
        String address = readString("Enter Address: ");
        double marks = readDouble("Enter Marks: ");
 
        Student student = new Student(id, name, age, gender, course, department,
                semester, mobile, email, address, marks);
 
        studentList.add(student);
        System.out.println("Student added successfully! Grade assigned: " + student.getGrade());
    }
 
    // ---------------- 2. DISPLAY ALL STUDENTS ----------------
    private static void displayAllStudents() {
        System.out.println("\n--- All Student Records ---");
 
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
 
        System.out.printf("%-6s %-15s %-4s %-8s %-10s %-8s %-6s %-5s%n",
                "ID", "Name", "Age", "Gender", "Course", "Dept", "Marks", "Grade");
        System.out.println("---------------------------------------------------------------");
 
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
 
    // ---------------- 3. SEARCH STUDENT ----------------
    private static void searchStudent() {
        System.out.println("\n--- Search Student ---");
        System.out.println("1. Search by Student ID");
        System.out.println("2. Search by Student Name");
        int option = readInt("Enter your choice: ");
 
        if (option == 1) {
            int id = readInt("Enter Student ID to search: ");
            Student s = findStudentById(id);
            if (s != null) {
                s.display();
            } else {
                System.out.println("No student found with ID " + id);
            }
        } else if (option == 2) {
            String name = readString("Enter Student Name to search: ");
            boolean found = false;
            for (Student s : studentList) {
                if (s.getName().equalsIgnoreCase(name)) {
                    s.display();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No student found with name \"" + name + "\"");
            }
        } else {
            System.out.println("Invalid search option.");
        }
    }
 
    // ---------------- 4. UPDATE STUDENT ----------------
    private static void updateStudent() {
        System.out.println("\n--- Update Student ---");
        int id = readInt("Enter Student ID to update: ");
        Student s = findStudentById(id);
 
        if (s == null) {
            System.out.println("No student found with ID " + id);
            return;
        }
 
        int choice;
        do {
            System.out.println("\nWhat would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Course");
            System.out.println("4. Department");
            System.out.println("5. Mobile Number");
            System.out.println("6. Email");
            System.out.println("7. Address");
            System.out.println("8. Marks");
            System.out.println("0. Done Updating");
            choice = readInt("Enter your choice: ");
 
            switch (choice) {
                case 1 -> s.setName(readString("Enter new Name: "));
                case 2 -> s.setAge(readInt("Enter new Age: "));
                case 3 -> s.setCourse(readString("Enter new Course: "));
                case 4 -> s.setDepartment(readString("Enter new Department: "));
                case 5 -> s.setMobileNumber(readString("Enter new Mobile Number: "));
                case 6 -> s.setEmail(readString("Enter new Email: "));
                case 7 -> s.setAddress(readString("Enter new Address: "));
                case 8 -> {
                    s.setMarks(readDouble("Enter new Marks: "));
                    System.out.println("Grade updated to: " + s.getGrade());
                }
                case 0 -> System.out.println("Update completed.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
 
        System.out.println("Student record updated successfully!");
    }
 
    // ---------------- 5. DELETE STUDENT ----------------
    private static void deleteStudent() {
        System.out.println("\n--- Delete Student ---");
        int id = readInt("Enter Student ID to delete: ");
        Student s = findStudentById(id);
 
        if (s == null) {
            System.out.println("No student found with ID " + id);
            return;
        }
 
        studentList.remove(s);
        System.out.println("Student with ID " + id + " deleted successfully!");
    }
 
    // ---------------- 6. SORT STUDENTS ----------------
    private static void sortStudents() {
        System.out.println("\n--- Sort Students ---");
        System.out.println("1. Sort by Student ID");
        System.out.println("2. Sort by Student Name");
        System.out.println("3. Sort by Marks");
        int choice = readInt("Enter your choice: ");
 
        switch (choice) {
            case 1 -> studentList.sort(Comparator.comparingInt(Student::getStudentId));
            case 2 -> studentList.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
            case 3 -> studentList.sort(Comparator.comparingDouble(Student::getMarks).reversed());
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }
 
        System.out.println("Students sorted successfully!");
        displayAllStudents();
    }
 
    // ---------------- 7. COUNT STUDENTS ----------------
    private static void countStudents() {
        System.out.println("\nTotal number of students: " + studentList.size());
    }
 
    // ---------------- 8. CALCULATE GRADE (standalone utility) ----------------
    private static void calculateGradeMenu() {
        System.out.println("\n--- Calculate Grade ---");
        double marks = readDouble("Enter marks to calculate grade: ");
        String grade = Student.calculateGrade(marks);
        System.out.println("Grade for " + marks + " marks is: " + grade);
    }
 
    // ---------------- HELPER METHODS ----------------
    private static Student findStudentById(int id) {
        for (Student s : studentList) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }
 
    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid whole number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); // consume newline
        return value;
    }
 
    private static double readDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine(); // consume newline
        return value;
    }
 
    private static String readString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    
}
