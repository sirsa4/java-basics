package scanner;

import java.util.Scanner;

public class ScannerBasic {
    //name and age variable are used to store user input from console
    String name;
    String age;
    boolean retry = false;


    public void nameAgeScanner(){

        //try catch block makes it easier to avoid program crashing when exceptions happen
        try {
            //instance of built in Scanner class from java lib. "System.in" is for getting input user types on keyboard
            Scanner scanner = new Scanner(System.in);

            //Normal printout statement which is just a question
            System.out.println("Hello. What is your name?");

            //After question. name variable now will store whatever user typed before pressing enter to continue program
             name = scanner.nextLine();

             //second print out asking another question
            System.out.println("Ok, what about your age?");

            //Now age variable stores the second round of user input
            age = scanner.nextLine();

            //age has to be number. So here new int variable "ageInt" is created and it parses number strings in "age" variable to actual number.
            int ageInt = Integer.parseInt(age);

            //if statement checking if user is less than 18 years being getting reply of not being allowed to drink
            if(ageInt < 18){

                //Nesten if statement to check only if user is 17 years. It is to avoid reply saying "1 years old" 😐
                if(ageInt == 17){
                  System.out.println("I'm sorry "+name +". You are are "+ ageInt + " years old. That is " + (18 - ageInt)+ " year too young to drink. You must be 18 years old to be allowed to buy drink" );

                  //scanner closes if condition is met and return makes the printout outside the does not run aswell
                  scanner.close();
                  return;
                }
                //print out for all ages below 17
                System.out.println("I'm sorry "+name +". You are are "+ (18 - ageInt)+ " years too young to drink. You must be 18 years old to be allowed to buy drink" );
            }

            //print out for success. age 18 and over
            System.out.println("Alright, "+name +" you are "+ageInt+" years and are allowed to drink 😀");

            //scanner closes when program ends
            scanner.close();

        }catch (Exception e){
            //in catch block all exceptions are captured with Exception class
            System.out.println("Something went wrong 😂");
        }
    }
}
