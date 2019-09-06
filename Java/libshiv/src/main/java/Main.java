import com.example.libshiv.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ch;
        String choice="";

        do {
            System.out.println("1. Area of Circle.\n2. Arithmetic Operators.\n3.Logical Operators.\n4. Relational Operators.\n5.Assignment Operators.\n 6. Conditional Statements.\n 7. Looping Statements.\n8. Factorial Example.\n9. Simple Interest.\n10. Sum Of N Numbers.\n11. Exit.");
            System.out.println("Enter your choice: ");
            ch=scanner.nextInt();
            switch (ch) {
                case 1:
                    AreaOfCircle areaOfCircle = new AreaOfCircle();
                    double area = areaOfCircle.calculateArea();
                    System.out.println("Area of Circle is: " + area);
                    break;
                case 2:
                    ArithmeticOperatorExample arithmeticOperatorExample = new ArithmeticOperatorExample();
                    arithmeticOperatorExample.doOperations();
                    break;
            case 3:
                LogicalOperatorExample logicalOperatorExample= new LogicalOperatorExample();
                logicalOperatorExample.doOperations();
                break;
            case 4:
                RelationalOperatorExample relationalOperatorExample=new RelationalOperatorExample();
                relationalOperatorExample.doOperations();
                break;
//            case 5:
//                AssignmentOperatorExample assignmentOperatorExample=new AssignmentOperatorExample();
//                assignmentOperatorExample.doOperations();
//            case 6:
//                ConditionalStatementsExample conditionalStatementsExample =new ConditionalStatementsExample();
//                conditionalStatementsExample.doOperations();
//                break;
            case 7:
                LoopStatementsExample.doOperations();
                break;
            case 8:
                FactorialExample factorial=new FactorialExample();
                int fact=factorial.calculateFactorial();
                System.out.println("Factorial is: "+fact);
                break;
            case 9:
                SimpleInterest simpleInterest=new SimpleInterest();
                double SI=simpleInterest.calculateInterest();
                System.out.println("Simple Interest = "+SI);
                break;
            case 10:
                SumOfNNumbers sumOfNNumbers=new SumOfNNumbers();
                double result=sumOfNNumbers.calculateSum();
                System.out.println("Sum = "+result);
//                break;
//            case 11:
//                System.exit(0);
//                break;
                default:
                    System.out.println("Entered Wrong choice.");
            }
            System.out.println("do u want to stop: ");
            choice=scanner.next();
        }
        while (choice!="no"||choice!="No"||choice!="NO");
    }
}
