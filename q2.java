package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


abstract class Person {
    public int adharID;
    public String name;
    public String address;
    public int phone;
    public String profession;

    public Person(int adharID, String name, String address, int phone, String profession) {
        this.adharID = adharID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profession = profession;
    }

    public abstract String register(String UID);

    public abstract String perform(String duty);

    public abstract String include(String service);

    public abstract String like(String item);
}

class Student extends Person {
    public String studentID;
    public String major;
    public int year;
    public int semester;
    public String college;
    public int grade;

    public Student(int adharID, String name, String address, int phone, String profession,
                   String studentID, String major, int year, int semester, String college, int grade) {
        super(adharID, name, address, phone, profession);
        this.studentID = studentID;
        this.major = major;
        this.year = year;
        this.semester = semester;
        this.college = college;
        this.grade = grade;
    }

    @Override
    public String register(String course) {
        return "Student " + getName() + " has registered for the course: " + course;
    }

    public int getGrade(String course) {
        return grade;
    }

    public String attend(String className) {
        return getName() + " is attending " + className;
    }

    public String learn() {
        return getName() + " is learning.";
    }

    public String getName() {
        return name;
    }

    @Override
    public String perform(String duty) {
        return "";
    }

    @Override
    public String include(String service) {
        return "";
    }

    @Override
    public String like(String item) {
        return "";
    }
}

class Staff extends Person {
    public String empID;
    public String empRole;
    public String empDept;
    public float empSalary;
    public int empExperience;

    public Staff(int adharID, String name, String address, int phone, String profession,
                 String empID, String empRole, String empDept, float empSalary, int empExperience) {
        super(adharID, name, address, phone, profession);
        this.empID = empID;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
    }

    @Override
    public String register(String UID) {
        return "Staff " + getName() + " has registered with UID: " + UID;
    }

    public String attend(String duty) {
        return getName() + " is attending " + duty;
    }

    public String getPromotion() {
        return getName() + " has been promoted.";
    }

    public int getSalary() {
        return (int) empSalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String perform(String duty) {
        return "";
    }

    @Override
    public String include(String service) {
        return "";
    }

    @Override
    public String like(String item) {
        return "";
    }
}

class PGStudent extends Student {
    public String rollNo;
    public String specialization;

    public PGStudent(int adharID, String name, String address, int phone, String profession,
                     String studentID, String major, int year, int semester, String college, int grade,
                     String rollNo, String specialization) {
        super(adharID, name, address, phone, profession, studentID, major, year, semester, college, grade);
        this.rollNo = rollNo;
        this.specialization = specialization;
    }

    public void submitThesis() {
        System.out.println(getName() + " has submitted the thesis.");
    }

    public String getName() {
        return super.getName(); 
    }
}

class Faculty extends Staff {
    public String facultySpecialization;
    public String section;
    public int noOfStudents;
    public String qualification;

    public Faculty(int adharID, String name, String address, int phone, String profession,
                   String empID, String empRole, String empDept, float empSalary, int empExperience,
                   String facultySpecialization, String section, int noOfStudents, String qualification) {
        super(adharID, name, address, phone, profession, empID, empRole, empDept, empSalary, empExperience);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.noOfStudents = noOfStudents;
        this.qualification = qualification;
    }

    public String teach(String course) {
        return getName() + " is teaching " + course;
    }

    public String assess(int studentGrade) {
        return getName() + " is assessing a student with grade " + studentGrade;
    }

    public String getName() {
        return super.getName();
    }
}

class Technician extends Staff {
    public String techType;

    public Technician(int adharID, String name, String address, int phone, String profession,
                      String empID, String empRole, String empDept, float empSalary, int empExperience,
                      String techType) {
        super(adharID, name, address, phone, profession, empID, empRole, empDept, empSalary, empExperience);
        this.techType = techType;
    }

    public String maintain(String lab) {
        return getName() + " is maintaining the " + lab + " lab.";
    }

    public String install(String system) {
        return getName() + " is installing the " + system + " system.";
    }

    public String getName() {
        return super.getName();
    }
}

public class JavaApplication1 {
    public static void main(String[] args) {

        Student student = new Student(123456789, "John Doe", "123 Main St", 987654321, "Student",
                "S123456", "Computer Science", 2, 1, "XYZ College", 85);

        Staff staff = new Staff(987654321, "Alice Smith", "456 Elm St", 123456789, "Staff",
                "E987654", "Manager", "HR", 55000.0f, 5);

        PGStudent pgStudent = new PGStudent(1122334455, "Jane Doe", "789 Oak St", 555555555, "Student",
                "S987654", "Biochemistry", 1, 2, "ABC College", 90, "R56789", "Biotechnology");

        Faculty faculty = new Faculty(555555555, "Professor Johnson", "101 University Ave", 111111111, "Faculty",
                "F123456", "Professor", "Computer Science", 80000.0f, 10,
                "Machine Learning", "A", 50, "Ph.D. in Computer Science");

        Technician technician = new Technician(444444444, "Techie Tom", "222 Lab St", 222222222, "Technician",
                "T987654", "Lab Technician", "Physics", 45000.0f, 3, "Electronics");

        System.out.println(student.register("CSE101"));
        System.out.println(student.attend("Computer Science class"));
        System.out.println(staff.attend("Staff meeting"));
        pgStudent.submitThesis();
        System.out.println(faculty.teach("Machine Learning"));
        System.out.println(technician.maintain("Physics"));
    }
}
