package classBasic;

public class PrivateStudent {
    //private variables
    private String firstName;
    private String lastName;
    private int age;
    private String studentID;
    private String birthdayNumber;

    public PrivateStudent(){

    }

    /*-----------getter methods----------------------------*/
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getStudentID(){
       return this.studentID;
    }

    public String getBirthdayNumber(){
        return this.birthdayNumber;
    }

    /*-------------Setter methods------------------------*/

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setBirthdayNumber(String birthdayNumber){
        this.birthdayNumber = birthdayNumber;
    }
}
