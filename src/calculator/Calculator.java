package calculator;

import java.util.Scanner;

public class Calculator {
    public String num1;
   public  String num2;

   public void runCalculator(){
       Calc calculate = new Calc();
       Scanner scan = new Scanner(System.in);

       do {
           System.out.println("Hello. This is program which allows you to calculate 2 numbers"+"\nChoose type of operation by typing one these signs: (+,-,*,/)");
           switch (scan.nextLine()){
               case "+":
                   System.out.println("you chose + "+"\nType first number to add");
                   num1 = scan.nextLine();
                   int addNum1 = Integer.parseInt(num1);
                   System.out.println("Your first number to add is: "+ addNum1+". Choose a second number to add");
                   num2 = scan.nextLine();
                   int addNum2 = Integer.parseInt(num2);
                   System.out.println("Your second number is: "+addNum2 +".  Calculating result.....");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("Result: "+calculate.add(addNum1,addNum2));
                   break;

               case "-":
                   System.out.println("you chose - "+"\nType first number to subtract");
                   num1 = scan.nextLine();
                   int subNum1 = Integer.parseInt(num1);
                   System.out.println("Your first number to subtract is: "+ subNum1+". Choose a second number to subtract");
                   num2 = scan.nextLine();
                   int subNum2 = Integer.parseInt(num2);
                   System.out.println("Your second number is: "+subNum2 +".  Calculating result.....");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("Result: "+calculate.subtract(subNum1,subNum2));
                   break;
               case "*":
                   System.out.println("you chose * "+"\nType first number to multiply");
                   num1 = scan.nextLine();
                   int multiNum1 = Integer.parseInt(num1);
                   System.out.println("Your first number to multiply is: "+ multiNum1+". Choose a second number to multiply");
                   num2 = scan.nextLine();
                   int multiNum2 = Integer.parseInt(num2);
                   System.out.println("Your second number is: "+multiNum2 +".  Calculating result.....");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("Result: "+calculate.multiply(multiNum1,multiNum2));

                   break;case "/":
                   System.out.println("you chose / "+"\nType first number to divide");
                   num1 = scan.nextLine();
                   double divNum1 = Double.parseDouble(num1);
                   System.out.println("Your first number to add is: "+ divNum1+". Choose a second number to divide");
                   num2 = scan.nextLine();
                   double divNum2 = Double.parseDouble(num2);
                   System.out.println("Your second number is: "+divNum2 +".  Calculating result.....");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("Result: "+calculate.divide(divNum1,divNum2));
                   break;
               default:
                   System.out.println("Not valid operation type");
                   break;
           }
           System.out.println("Do you want to continue? (Y),(N)");
       }
       while(scan.nextLine().toUpperCase().equals("Y"));

       //gameover
       System.out.println("Thanks for playing! 😎");
   }
}
