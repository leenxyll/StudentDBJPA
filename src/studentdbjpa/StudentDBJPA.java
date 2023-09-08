/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdbjpa;

import java.util.List;
import model.Student;

/**
 *
 * @author kotchanika
 */
public class StudentDBJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Student std1 = new Student(1, "Pinzel", 4.00);
//        Student std2 = new Student(2, "krittin", 3.76);
//        Student std3 = new Student(3, "tonnam", 3.08);
//        StudentTable.insertStudent(std1);
//        StudentTable.insertStudent(std2);
//        StudentTable.insertStudent(std3);
        
        Student std;
        std = StudentTable.findStudentById(1);
        if (std != null) {
            std.setName("Jack");
            StudentTable.removeStudent(std);
//            StudentTable.updateStudent(std);
       }
       //List<Student> stdList = StudentTable.findStudentByName("Marry"); 
       List<Student> stdList = StudentTable.findAllStudent();
       printAllStudent(stdList);
    }
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }   
}
