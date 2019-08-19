package org.launchcode.java.demos.java4python.school;



    public class Student {
        private static int nextStudentId = 1;
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

        public Student(String name) {
            this(name, nextStudentId);
            nextStudentId++;
        }

        public void addGrade(int courseCredits, double grade) {
            numberOfCredits += courseCredits;
            double qualityScore = (gpa * numberOfCredits) + courseCredits * grade ;
            gpa = qualityScore/numberOfCredits;

        }

        public String getGradeLevel() {
            if (numberOfCredits < 30){
                return "Freshman";
            }
            else if (numberOfCredits < 60){
                return "Sophomore";
            }
            else if (numberOfCredits < 90){
                return "Junior";
            }
            else {
                return "Senior";
            }
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
            Student theStudent = (Student) o;
            return theStudent.getStudentId()==getStudentId();

        }
        public String toString(){
            return name + " (Gpa: " + gpa + " Number of credits: " + numberOfCredits +")";
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


