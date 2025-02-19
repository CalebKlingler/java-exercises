package org.launchcode.java.demos.java4python.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private int courseId;
    private int numberOfCredits;
    private ArrayList<Student> studentRoster;

    public Course(String courseName, int courseId, int numberOfCredits, ArrayList<Student> studentRoster){
        this.courseName = courseName;
        this.numberOfCredits = numberOfCredits;
        this.studentRoster = studentRoster;
        this.courseId = courseId;
    }

    public Course (String courseName, int courseId, int numberOfCredits){
        this(courseName, courseId, numberOfCredits, null );
    }

    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o == null){
            return false;
        }
        if (o.getClass() != getClass()){
            return false;
        }
        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }

    public String toString(){
        return courseName + " (Course ID: " + courseId + "Number of Credits: " + numberOfCredits + ")";
    }
    private void addStudent(Student aStudent){
        studentRoster.add(aStudent);
    }
    public String getCourseName(){
        return courseName;
    }
    private void setCourseName(String aCourseName){
        courseName = aCourseName;
    }
    public int getCourseId(){
        return courseId;
    }
    private void setCourseId(int aCourseId){
        courseId = aCourseId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    public ArrayList<Student> getStudentRoster(){
        return studentRoster;
    }
    private void setStudentRoster(ArrayList<Student> aStudentRoster){
        studentRoster = aStudentRoster;
    }
}
