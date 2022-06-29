package loops.whileLoop;

public class WhileLoop {
    //In while loop variable for condition is not part the loop parameter
    private int increment = 0;
    private int decrement = 5;

    public void increase(){
        while(increment <= 5){
            System.out.println("While loop increase: "+increment);

            //incrementer is written inside the loop body and not in parameter like in for loop
            increment++;
        }
    }

    public void decrease(){
        while(decrement >= 0){
            System.out.println("While loop decrease: "+decrement);
            decrement--;
        }
    }

}
