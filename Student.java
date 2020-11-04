package sk.kosickaakademia.mato.school;

import java.util.Date;
public class Student {
public static void main(String[]args){
        private String firstName;
        private String lastName;
        private ClassName className;
        private int salary;
        private Grades grades;
        private Date DOB;
        private Hobby[] hobbies;
        private int countHobbies;

        public Student(String firstName, String lastName, Grades grades, ClassName className, int salary, Date DOB){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grades = grades;
            this.className = className;
            this.salary = salary;
            this.DOB = DOB;
            hobbies = new Hobby[5];
            countHobbies = 0;
        }
        public void setSalaray(int salary) {
            this.salary = salary;
        }
        public String getFirstName() {
            return firstName;
        }
        public Date getDOB() {
            return DOB;
        }
        public String getLastName() {
            return lastName;
        }
        public ClassName getClassName() {
            return className;
        }
        public int getSalaray() {
            return salary;
        }
        public Grades getGrades() {
            return grades;
        }
        public void setDOB(Date DOB) {
            this.DOB = DOB;
        }
        public String toString() {
            return firstName+" "+lastName+" "+getGrades().getGPAvg();
        }
        public void addHobby (Hobby newHobby){
            if(countHobbies == hobbies.length){
                System.out.println("Not allowed more than 5 hobbies.");
                return;
            }
            hobbies[countHobbies++] = newHobby;
        }
        public void printHobbies(){
            for (int i = 0; i < countHobbies; i++){
                System.out.print(hobbies[i].getName()+" ");
                if (hobbies[i] instanceof Book){
                    System.out.println("written by "+((Book)hobbies[i]).getAuthor());
                }
                if (hobbies[i] instanceof Movie){
                    System.out.println(((Movie) hobbies[i]).getYear());
                }
                if (hobbies[i] instanceof Sport){
                    if(((Sport) hobbies[i]).getType() == null)
                        System.out.println();
                    else
                        System.out.println(" - "+((Sport)hobbies[i]).getType());
                }
                if (hobbies[i] instanceof Art){
                    if (((Art) hobbies[i]).getType()==null)
                        if (((Art) hobbies[i]).getType() == null)
                            return;
                        else
                            System.out.println(" - "+((Art) hobbies[i]).getType());
                }
                if (hobbies[i] instanceof Animal){
                    if (((Animal) hobbies[i]).getNickname() == null)
                        return;
                    else
                        System.out.println(" - "+((Animal) hobbies[i]).getNickname());
                }
            }
            System.out.println();
        }
    }
}