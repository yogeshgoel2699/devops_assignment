package com.invenio.java;

import jdk.jfr.Percentage;

public class Teacher extends StudentScoreCard{

    private String name;
    private long facultyCode;
    private String className;

    public Teacher() {
    }

    public Teacher(String name, long facultyCode, String className) {
        this.name = name;
        this.facultyCode = facultyCode;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(long facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void assignMarks(Student student, double[] marks)
    {
        student.setSubjectMarks(marks);
    }
    @Override
    public void viewScoreCard() {
        System.out.println("Name: " + getName());
        System.out.println("Faculty Code: " +getFacultyCode());
        for(Student s: StudentDB.getArrayStudentList()){
            double percentage = s.calculatePercentage(s.getSubjectMarks());
            if( percentage > 60)
            {
                System.out.println("Student Name: "+s.getName());
                int i = 0;
                for(Double marks:s.getSubjectMarks())
                {
                    System.out.println(Student.Subjects[i]+": "+marks);
                    i++;
                }
                System.out.println("Percentage : "+percentage);
            }
            System.out.println("");
        }
    }
}
