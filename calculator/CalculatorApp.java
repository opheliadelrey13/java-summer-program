import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice != 5){
            menu();
            choice = input.nextInt();


            if (choice >= 1 && choice <= 4){
                System.out.print("Enter the first number: ");
                double firstNum = input.nextDouble();

                System.out.print("Enter the second number: ");
                double secondNum = input.nextDouble();

                double output = calculate(choice,firstNum,secondNum);
                System.out.println("result: " + output);
            } else if (choice == 5) {
                System.out.println("Exiting from the program...");
            }else{
                System.out.println("Invalid choice.");
            }

            System.out.println();
        }
    }

    public static double calculate(int choice, double firstNum, double secondNum){
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
                return 0;
        }
    }

    private static double divide(double firstNum, double secondNum){
        if (secondNum == 0){
            System.out.println("cannot divide by zero");
            return 0;
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
