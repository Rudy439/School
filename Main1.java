package sk.kosickaakademia.mato.school;

import java.awt.print.Book;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
    public class Main {
        public static void main(String[] args) {
            String pattern = "MM/dd/yyyy";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            Student[] students;
            students = initStudents();
            Book b1 = new Book("Do neznama","Velky spisovatel");
            Book b2 = new Book("Chram matky bozej","Victor Hugo");
            Sport s1 = new Sport("Wresling","martial art");
            Sport s2 = new Sport("Skating");
            Sport s3 = new Sport("Muatai", "Martial art");
            Sport s4 = new Sport("Box", "Martial art");
            Movie m1 = new Movie("Titanic",1998);
            Movie m2 = new Movie("60 Seconds",2020);
            Art a1 = new Art("3D modeling", "Digital");
            Art a2 = new Art("Photographing");
            Art a3 = new Art("Web design", "Digital");
            Animal an1 = new Animal("Cat", "Cezar");
            Animal an2 = new Animal("Dog", "Kelly");
            Animal an3 = new Animal("Lizard", "Jozo");
            Animal an4 = new Animal("Parrot", "Alex");


            students[0].addHobby(s2);
            students[0].addHobby(b2);
            students[0].addHobby(a2);
            students[2].addHobby(m1);
            students[2].addHobby(s3);
            students[8].addHobby(s1);
            students[8].addHobby(a3);

            students[5].addHobby(an1);
            students[5].addHobby(an2);
            students[5].addHobby(an3);
            students[5].addHobby(an4);
            students[5].addHobby(a3);
            students[5].addHobby(s3);
            for (int i = 0; i < students.length; i++){
                System.out.println(students[i].getFirstName()+ " " +students[i].getLastName()+" hobbies:");
                students[i].printHobbies();
                System.out.println();
                System.out.println();
            }
        }
        private static void sortAllStudentsGPAvgASC(Student[] students) {
            for (int i = 0; i < students.length-1; i++) {
                for (int j = 0; j < students.length - 1 - i; j++) {
                    if (students[i].getGrades().getGPAvg()>students[i+1].getGrades().getGPAvg()){
                        Student temp = students[j];
                        students[j] = students[j+1];
                        students[j+1] = temp;
                    }
                }
            }
        }
        private static void printStudentsWhereAverageLE2 (Student[] students) {
            int length = students.length;
            System.out.println("Student with great Grade-Point Average: ");
            System.out.println();
            for (int i = 0; i < length; i++){
                double avg = students[i].getGrades().getGPAvg();
                if (avg <= 2.0){
                    System.out.println(students[i].toString());
                }
            }
        }
        private static void printN1Students(Student[] students) {
            int length = students.length;
            System.out.println("1.N students:");
            System.out.println();
            for (int i = 0; i < length; i++){
                if (students[i].getClassName()==ClassName.N1){
                    System.out.println(students[i].getFirstName()+" "+students[i].getLastName());
                }
            }
        }
        private static void printFullNameAndAge(Student[] students) {
            System.out.println("All Students: ");
            System.out.println();
            DateFormat y = new SimpleDateFormat("yyyy");
            DateFormat m = new SimpleDateFormat("MM");
            DateFormat d = new SimpleDateFormat("dd");
            for (int i = 0; i < students.length; i++){
                Date date = students[i].getDOB();
                Date actualDate = new Date();
                String year = y.format(date);
                String month = m.format(date);
                String day = d.format(date);
                String actualYear = y.format(actualDate);
                String actualMonth = m.format(actualDate);
                String actualDay = d.format(actualDate);
                int approxAge = Integer.parseInt(actualYear) - Integer.parseInt(year);
                int rightAge = 0;
                if (Integer.parseInt(actualMonth) > Integer.parseInt(month)){
                    rightAge = approxAge;
                }
                else if (Integer.parseInt(actualMonth) < Integer.parseInt(month)){
                    rightAge = approxAge - 1;
                }
                else{
                    if (Integer.parseInt(actualDay) < Integer.parseInt(day)) {
                        rightAge = approxAge -1;
                    }
                    else if (Integer.parseInt(actualDay) >= Integer.parseInt(day)) {
                        rightAge = approxAge;
                    }
                }
                System.out.println(day + " " + month + " " + year);
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " " + rightAge);
            }
        }
        private static void printMillenials(Student[] students){
            System.out.println("Millenial students: ");
            System.out.println();
            DateFormat dateFormat = new SimpleDateFormat("yyyy");
            for (int i = 0; i < students.length; i++){
                Date dates = students[i].getDOB();
                String years = dateFormat.format(dates);
                int age = 2020-Integer.parseInt(years);
                if (Integer.parseInt(years) >= 2000){
                    System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " " + age);
                }
            }
        }
        private static Student[] initStudents() {
            Student[] s = new Student[10];
            Student s1 = new Student("Jozef", "Procko", new Grades(2, 3,5), ClassName.N2, 150, createDOB("1996-11-04"));
            s[0] = s1;
            Student s2 = new Student("Robert", "Dolny", new Grades(1,1,2), ClassName.N3, 750, createDOB("1995-05-01"));
            s[1] = s2;
            s[2] = s3;
            Student s4 = new Student("Alex", "Tročko", new Grades(3,1,1), ClassName.N2, 0, createDOB("1997-04-12"));
            s[3] = s4;
            Student s5 = new Student("Denisa", "Kovacova", new Grades(3, 1, 3), ClassName.N3, 560, createDOB("1993-11-06"));
            s[4] = s5;
            Student s6 = new Student("Milan", "Kover", new Grades(2,2,2), ClassName.N1, 300, createDOB("1994-06-03"));
            s[5] = s6;
            Student s7 = new Student("Hedviga", "Balla", new Grades(1, 1, 1), ClassName.N3,1400, createDOB("1995-04-25"));
            s[6] = s7;
            Student s8 = new Student("Stefan", "Jakab", new Grades(5, 5, 5), ClassName.N1, 950, createDOB("1992-02-15"));
            s[7] = s8;
            Student s9 = new Student("Marcel", "Lenart", new Grades(2,3,1),ClassName.N2, 0, createDOB("1994-07-31"));
            s[8] = s9;
            Student s10 = new Student("Dalibor", "Zicha", new Grades(1,1,1), ClassName.N3, 2100, createDOB("1996-04-25"));
            s[9] = s10;
            return s;
        }
        private static Date createDOB(String dateOfBirth) {
            Date dOB = null;
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}