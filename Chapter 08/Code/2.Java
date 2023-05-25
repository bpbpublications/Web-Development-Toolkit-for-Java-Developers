package studentinformation;

import java.util.Scanner;

public class StudentInformation {

     public static void main(String[] args) {

        StudentBean s1=new StudentBean();
        String input;

        Scanner in= new Scanner(System.in);

        System.out.println("Enter Student ID :");
        input=in.nextLine();
        s1.setId(input);

        System.out.println("Enter Student Name :");
        input=in.nextLine();
        s1.setName(input);

        System.out.println("Enter Enrolled Program Name :");
        input=in.nextLine();
        s1.setProgram(input);

        System.out.println("Enter Semester :");
        s1.setSemester(in.nextInt());

        System.out.println("Enter Marks of Java :");
        s1.setMarks1(in.nextDouble());

        System.out.println("Enter Marks of Php :");
        s1.setMarks2(in.nextDouble());

        System.out.println("Enter Marks of .Net :");
        s1.setMarks3(in.nextDouble());

        System.out.println("Student Details");
        System.out.println("----------------");

        System.out.println("Student ID :" +s1.getId());
        System.out.println("Student Name :" +s1.getName());
        System.out.println("Student Enrolled Program :" +s1.getProgram());
        System.out.println("Student Semester :" +s1.getSemester());
        System.out.println("Student Marks of Java :" +s1.getMarks1());
        System.out.println("Student Marks of Php  :" +s1.getMarks2());
        System.out.println("Student Marks of .Net :" +s1.getMarks3());
    }
}
