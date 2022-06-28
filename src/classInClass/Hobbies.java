package classInClass;

public class Hobbies {
    String name;
    double rating;

    public Hobbies(){

    }
    public Hobbies(String name,double rating){
        this.name = name;
        this.rating = rating;
    }

    public void printOutHobbies(){
        System.out.println("Hobbies: "+this.name + "\n" +"Ratings: "+this.rating);
    }

    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setRating(double rating){
        this.rating = rating;
    }

    //getter methods
    public String getName(){
        return this.name;
    }
    public double getRating(){
        return this.rating;
    }
}
