package loops.do_while_loop;

public class DoWhileLoop {
    private int increment = 0;
    private int decrement = 5;

    public void increase(){
        //do {} is the body of loop. And it is always RUNS ONCE regardless on condition being met or not.
        do {
            //code in body
            System.out.println("do while increase: "+increment);

            //increment/decrement is written inside body like in normal while loop
            increment++;
        }

        //condtion is written in while parameter
        while(increment <= 5);
    }

    public void decrease(){
        do{
            System.out.println("do while decrease: "+decrement );
            decrement--;
        }
        while(decrement >= 0);
    }

}
