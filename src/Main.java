import classBasic.Student;
import dataTypes.DataTypes;

public class Main {
    public static void main(String[] args) {
      /*  DataTypes data = new DataTypes();
        DataTypes.types();*/

        Student student1 = new Student();

        student1.firstName = "Mario";
        student1.lastName = "Mario";
        student1.age = 22;
        student1.studentID = "1325";

        student1.studentInformation();

        Student student2 = new Student("Luigi","Mario",23,"3258");
        student2.studentInformation();
    }
}