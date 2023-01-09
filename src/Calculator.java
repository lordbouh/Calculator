import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char calculatorOperation = 'c';
        double operand1;
        double operand2;
        char operation;
        double result = 0;
        do {
            if (calculatorOperation == 'c') {
                System.out.println("Enter operand 1: ");
                operand1 = sc.nextInt();
                System.out.println("Enter operation: ");
                operation = sc.next().charAt(0);
            } else {
                operand1 = result;
                operation = calculatorOperation;
            }
            System.out.println("Enter operand 2: ");
            operand2 = sc.nextInt();
            result = calculate (operand1, operation, operand2);
            System.out.println(result);
            System.out.println("Enter operation: ");
            calculatorOperation = sc.next().charAt(0);

        }
        while (calculatorOperation != 's');
    }

    public static double calculate(double operand1, char operation, double operand2) {
        return switch (operation){
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Incorrect operation");
                yield 0;
            }
        };
    }

}
