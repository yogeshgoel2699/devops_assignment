package com.invenio.java;


public class Student extends StudentScoreCard  {

    private String name;
    private String className;
    private long regNo;
    private double[] subjectMarks;
    final static String[] Subjects = new String[]{"MATH","PHYSICS","CHEMISTRY","ENGLISH","HINDI"};

    public Student() {
        super();
    }

    public Student(String name, String className, long regNo) {
        this.name = name;
        this.className = className;
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public long getRegNo() {
        return regNo;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(long regNo) {
        this.regNo = regNo;
    }

    public double[] getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(double[] subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    @Override
    public void viewScoreCard() {
        double percentage = this.calculatePercentage(this.getSubjectMarks());
        System.out.println("Name: "+this.name);
        int i = 0;
        for(double marks:this.getSubjectMarks())
        {
            System.out.println(Student.Subjects[i]+": "+marks);
            i++;
        }
        System.out.println("Percentage : "+percentage);
    }
}
