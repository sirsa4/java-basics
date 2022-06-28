package constructor;

import classInClass.Hobbies;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;

    //hobbies using built in class ArrayList and initialized as empty array. Set/get methods below are used control values in the array
    private ArrayList<Hobbies> hobby = new ArrayList<>();


    public Person(){

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //method to print person information
    public void printPersonInformation(){
        System.out.println("First name: "+this.firstName + "\n" + "Last name: "+this.lastName);
    }

    //set and get method hobby arrayList
    //sethobby: Here the class is used the type in the parameters. other setMethods below have String, int for example in their parameters
    public void setHobby(Hobbies hobby){
        //add() method is a method inside ArrayList class
        this.hobby.add(hobby);
    }
    //get hobbies: In get method, copy of ArrayList hobby is returned. This is to avoid allowing possibility of changing items in array with this method. So it only returns a copy of the original hobby ArrayList
    public ArrayList<Hobbies> getHobby(){
        return new ArrayList<>(hobby);
    }

    /*-----------Code below this line is Not Important/relevant for hobby ArrayList------------------------*/
    //set methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //get methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
