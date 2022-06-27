import classBasic.PrivateStudent;
import classBasic.Student;
import constructor.Person;
import dataTypes.DataTypes;

public class Main {
    public static void main(String[] args) {
      /*  DataTypes data = new DataTypes();
        DataTypes.types();*/

        /*Basic class setup */
       /* Student student1 = new Student();

        student1.firstName = "Mario";
        student1.lastName = "Mario";
        student1.age = 22;
        student1.studentID = "1325";

        student1.studentInformation();

        Student student2 = new Student("Luigi","Mario",23,"3258");
        student2.studentInformation();*/

        //class instance of PrivateStudent. This class is fully encapsulated
  /*      PrivateStudent ryu = new PrivateStudent();

        //set private variables using each variable setter method
        ryu.setFirstName("Ryu"); //firstName setter method
        ryu.setLastName("Yoo"); //lastName setter method
        ryu.setAge(57);
        ryu.setStudentID("student4554");
        ryu.setBirthdayNumber("21076448533");

        //getter methods to get value of each private variable
        System.out.println("First name: "+ryu.getFirstName());
        System.out.println("Last name: "+ ryu.getLastName());
        System.out.println("Age: "+ryu.getAge());
        System.out.println("Student ID: "+ryu.getStudentID());
        System.out.println("Birthday number: "+ryu.getBirthdayNumber());*/

        /*--------encapsulated constructor-------------*/
        Person john = new Person("John", "Doe");

        john.setFirstName("Louis");

        john.printPersonInformation();
    }
}