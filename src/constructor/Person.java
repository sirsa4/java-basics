package constructor;

public class Person {
    private String firstName;
    private String lastName;


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
