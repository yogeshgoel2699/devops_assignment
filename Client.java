package com.invenio.java;

public class Client {
    public static void main(String[] args) {

        /*add Student in Database*/
        Student s1 = new Student("Ram","10th",111);
        Student s2 = new Student("Suresh","11th",112);
        Student s3 = new Student("Mahesh","12th",113);
        StudentDB.addStudent(s1);
        StudentDB.addStudent(s2);
        StudentDB.addStudent(s3);

        Student student1 = StudentDB.getStudent(111);
        Student student2 = StudentDB.getStudent(112);
        Student student3 = StudentDB.getStudent(113);
        Teacher teacher = new Teacher("Rashid",100001,"10th");
        teacher.assignMarks(student1,new double[]{95.5,89.9,45,97,30});
        teacher.assignMarks(student2,new double[]{100,100,100,87,90});
        teacher.assignMarks(student3,new double[]{33,33.9,35,37,30});
        /*teacher can view marks of students*/
        teacher.viewScoreCard();
        /*student can view their marks*/
        student3.viewScoreCard();
    }
}
