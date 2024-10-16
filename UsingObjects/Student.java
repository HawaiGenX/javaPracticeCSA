public class Student{
public String firstName;
public String lastName;
public int  actScore;
public int grade;
public boolean isGraduated;


//Constructor
public Student(String firstName, String lastName, int actScore, int grade, boolean isGraduated){
    this.firstName = firstName;
    this.lastName = lastName;
    this.actScore = actScore;
    this.grade = grade;
    this.isGraduated = isGraduated;
}

//Storing object (instantiation)
public static void main(String[]args){
    Student myStudent = new Student("Jully ", "Johnston", 1700, 11, false);
    System.out.print(myStudent.firstName);
    System.out.println(myStudent.lastName);
    System.out.println(myStudent.actScore);
    System.out.println(myStudent.grade);
    System.out.println(myStudent.isGraduated);
    

}
}