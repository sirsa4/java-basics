import calculator.Calc;
import calculator.Calculator;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

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
        //Person class instance
       /* Person john = new Person("John", "Doe");

        *//*john.printPersonInformation();
        System.out.println(john.getHobby());*//*

        //Add 2 new hobbies using the set method(setHobby) in Person class
        john.setHobby(new Hobbies("football",4.5));
        john.setHobby(new Hobbies("basket",3.5));

        //Get all hobbies in john instance using get method(getHobby) in Person class
        ArrayList<Hobbies> johnHobbies = john.getHobby();

        //Each hobby item in array can be found with index postion using using built in ArrayList class, get()
        Hobbies firstHobby = johnHobbies.get(0);
        Hobbies secondHobby = johnHobbies.get(1);

        //Simple print out value of each array using the getName() inside Hobbies class
        System.out.println("firstHobby:"+firstHobby.getName() + " Rating: "+ firstHobby.getRating() + " secondHobby: "+ secondHobby.getName()+ " Rating: "+ secondHobby.getRating());

        //Value can be printed out quicker without storing each array item in its own variable
        System.out.println("hobby 1 onw-linw: "+johnHobbies.get(0).getName());
        System.out.println("hobby 2 one-line: "+johnHobbies.get(1).getName());

        //with for loop
        for(int i = 0; i < johnHobbies.size(); i++){
            //variable to store each array item
            Hobbies johnEachHobby = johnHobbies.get(i);

            System.out.println("Student: "+john.getFirstName() + "Hobbies: "+johnEachHobby.getName() + "\t Rating"+johnEachHobby.getRating());*/

        /*-----------------Loops-----------------------------------*/

        /*------For loop-----*/
        //for loop class instance without constructor
       /* ForLoop forloop = new ForLoop();

        //method to run for loop which increments
        forloop.increase();
        System.out.println();
        forloop.decrease();*/

        /*--------While loop-----------*/
        //WhileLoop instance object
      /*  WhileLoop whileloop = new WhileLoop();

        //Both methods called
        whileloop.increase();

        System.out.println();

        whileloop.decrease();*/

        /*---------do while loop------*/
      /*  DoWhileLoop doWhile = new DoWhileLoop();

        //methods called
        doWhile.increase();

        System.out.println();

        doWhile.decrease();*/

        /*-----------Scanner class basic practice------------*/
        //scanner instance
      /*  ScannerBasic scanner = new ScannerBasic();

        //method in class called the instance
        scanner.nameAgeScanner();*/

        /*-------------Calculator------------------*/
        //Instance of calculator
        Calculator calculator = new Calculator();

        //method which runs the simple calculator
        calculator.runCalculator();

    }

}
