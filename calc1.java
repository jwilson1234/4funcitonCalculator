import java.util.Scanner;

public class calc1 {
    // global variable for scanner to make it more convenient for my program 
 private static Scanner in = new Scanner(System.in);

 // get option method 
    public static int getOption() {
  
        System.out.println("Make a selection:\n 1: Add 2 numbers\n 2: Subtract 2 numbers\n 3: Multiply 2 numbers\n 4: Divide 2 numbers\n Enter your choice:");
        int choice;
        // try block 
        try {
            choice = in.nextInt();
            // makign sure input is valid 
            if (choice < 1 || choice > 4){
                System.out.println("Please enter a valid number choice");
                System.exit(1);
        }
        // Exception for our program to make sure everything runs smoothly
    } catch (Exception e) {
        System.out.println("Invalid input, please enter a number between 1 and 4.");
        in.next();
        return getOption();
    }
    
       return choice;
    }
    // get operand method using prompt
    static double[] getOperand(String prompt) {
       
        System.out.println(prompt);
        // using array which I learned in python to help make code more efficent and effective
        double[] operands = new double[2];

  System.out.println("Enter the First number choice:");
  operands[0] = in.nextDouble();
  System.out.println("Enter the second number choice:");
  operands[1] = in.nextDouble();
return operands;
    }

    // arithmetic method + 
public static void add(double opnd1, double opnd2) {
    System.out.println("Result: " + (opnd1 + opnd2));
}
// arithmetic method -
public static void Subtract(double opnd1, double opnd2) {
    System.out.println("Result: " + (opnd1 - opnd2));
}
// arithmetic method *
public static void Multiply(double opnd1, double opnd2) {
    System.out.println("Result: " + (opnd1 * opnd2));
}
// arithmetic method /
public static void Divide(double opnd1, double opnd2) {
    if (opnd2 == 0){
        // making sure to do conditonal so it will flag division by 0 
        System.out.println("Error: Division by zero is undefined");
    } else {
        System.out.println("Result: " + (opnd1 / opnd2));
    }
}


// main method 
public static void main(String[] args) {
        int choice = getOption();
        System.out.println("You selected..." + choice);
        double[] numbers = getOperand("Which numbers will you select for calculation");
        System.out.println("The two numbers you chose for caluclation were: " +  numbers[0] + " and " +  numbers[1]);
      // using a switch to make the program more efficent and effective
        switch (choice) {
            case 1: 
            add(numbers[0], numbers[1]);
            break;
            case 2:
            Subtract(numbers[0], numbers[1]);
            break;
            case 3:
            Multiply(numbers[0], numbers[1]);
            break;
            case 4:
            Divide(numbers[0], numbers[1]);
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
    }
}
