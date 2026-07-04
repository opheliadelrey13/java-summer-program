import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice != 5){
            menu();
            choice = readInt(input,"Your choice: ");


            if (choice >= 1 && choice <= 4){
                double firstNum = readDouble(input,"Enter the first number: ");
                double secondNum =readDouble(input,"Enter the second number: ");

                Double output = calculate(choice,firstNum,secondNum);

                if (output != null){
                    System.out.println("result: " + output);
                }
            } else if (choice == 5) {
                System.out.println("Exiting from the program...");
            }else{
                System.out.println("Invalid choice.");
            }

            System.out.println();
        }
        input.close();
    }

    private static int readInt(Scanner input, String message) {
        while (true){
            try{
                System.out.println(message);
                return input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid choice.Please enter a number between 1-5.");
                input.nextLine();
            }
        }
    }

    private static double readDouble(Scanner input, String message) {
        while (true){
            try{
                System.out.println(message);
                return input.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid choice.Please enter a number.");
                input.nextLine();
            }
        }

    }

    public static Double calculate(int choice, double firstNum, double secondNum){
        switch (choice){
            case 1:
                return add(firstNum, secondNum);

            case 2:
                return substract(firstNum, secondNum);

            case 3:
                return multiply(firstNum, secondNum);

            case 4:
                return divide(firstNum,secondNum);

            default:
                return null;
        }
    }

    private static Double divide(double firstNum, double secondNum){
        if (secondNum == 0){
            System.out.println("cannot divide by zero");
            return null;
        }
        return firstNum / secondNum;
    }

    private static double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    private static double substract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double add(double firstNum,double secondNum) {
        return firstNum + secondNum;
    }

    public static void menu() {
        System.out.println("---CALCULATOR---");
        System.out.println("1-Addition");
        System.out.println("2-Substraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Exit");
        System.out.println();
        System.out.print("Your choice: ");
    }


}
