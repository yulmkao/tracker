package ru.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Petya Petrov");
        student.setGroup("841-21");
        student.setEnrollment(new Date());

        System.out.println(student.getName() + " was enrolled in group " + student.getGroup() + " on " + student.getEnrollment());
    }
}
