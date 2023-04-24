package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;
    public Student (String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
        Arrays.asList(
            new Student("Щелконогов Олександр", "301"),
            new Student("Козлан Анастасія", "301"),
            new Student("Коваленко Вікторія", "301"),
            new Student("Пащенко Ігор", "301"),
            new Student("Грекова Даша", "302"),
            new Student("Кушіль Віталій", "302"),
            new Student("Сіліверстов Максим", "302")
        )
    );

    public static ArrayList<Student> getStudents(String groupNumber) {
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students) {
            if (s.getGroupNumber().equals(groupNumber)) {
                stList.add(s);
            }
        }
        return stList;
    }
}
