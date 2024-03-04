package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
 class Student {
    private int studentId;
    private String name;
    private String ssn;
    private double gpa;
    public final int SCHCODE = 34958;
    public Student(){
    }
    public int getStudentId() {
        return  studentId;
    }
    public void setStudentId(int x) {
        studentId = x;
    }
}