package classBasic;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public String studentID;

    public Student(){

    }

    public Student(String firstName, String lastName, int age, String studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentID = studentID;
    }

    public void studentInformation(){
        System.out.println("Student name: " + this.firstName + " " + this.lastName + " \n Age: "+ this.age + "\n StudentID: "+ this.studentID);
    }

}
