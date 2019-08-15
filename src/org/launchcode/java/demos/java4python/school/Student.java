package org.launchcode.java.demos.java4python.school;



    public class Student {

        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public Student(String name, int studentId,
                       int numberOfCredits, double gpa) {
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }

        public Student(String name, int studentId) {
            this(name, studentId, 0, 0);
        }

        public String getName() {
            return name;
        }

        private void setName(String aName) {
            name = aName;
        }

        public int getStudentId() {
            return studentId;
        }

        private void setStudentId(int aStudentId) {
            studentId = aStudentId;
        }

        public int getNumberOfCredits() {
            return numberOfCredits;
        }

        private void setNumberOfCredits(int aNumberOfCredits) {
            numberOfCredits = aNumberOfCredits;
        }

        public double getGpa() {
            return gpa;
        }

        private void setGpa(double aGpa) {
            gpa = aGpa;
        }

    }


