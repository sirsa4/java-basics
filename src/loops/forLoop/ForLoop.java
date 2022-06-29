package loops.forLoop;

public class ForLoop {

    public void increase(){
        for(int i = 0; i <= 5; i++){
            System.out.println("index increase: "+ i);
        }
    }
    public void decrease(){
        for(int i = 5; i >= 0; i--){
            System.out.println("index decrease: "+i);
        }
    }
}
