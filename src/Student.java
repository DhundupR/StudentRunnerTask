public class Student {

        // instance variables
        private String name;
        private int age;
        private double gpa;

        // constructor
        public Student(String studentName, int studentAge, double studentGPA) {
            name = studentName;
            age = studentAge;
             gpa = studentGPA;
        }

        // method that introduces the Cat
        public void introduce() {
            System.out.println("Hello my name is " + name);
            if (age<18) {
                System.out.println("I will soon be an Adult.");
            } else {
                System.out.println("I am a student.");
            }

        }

        // method that prints Cat info
        public void printStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gpa: " + gpa);
        }
    }

