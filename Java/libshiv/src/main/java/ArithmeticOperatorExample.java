import java.util.Scanner;

class ArithmeticOperatorExample {
    public void doOperations() {
        String choice = "";
        do {
            System.out.println("Enter no1 and no2: ");
            int no1 = scanner.nextInt();
            int no2 = scanner.nextInt();
            System.out.println("select the operation you want to perform \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Diviion\n5.Mod\n6. Exit");

            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    double addition = add(no1, no2);
                    System.out.println("Addition is : " + addition);
                    break;
                case 2:
                    double subtraction = subtract(no1, no2);
                    System.out.println("Subtraction is : " + subtraction);
                    break;
                case 3:
                    double multiplication = multiply(no1, no2);
                    System.out.println("Multiplication is : " + multiplication);
                    break;
                case 4:
                    double division = divide(no1, no2);
                    System.out.println("Division is : " + division);
                    break;
                case 5:
                    double modulus = modulus(no1, no2);
                    System.out.println("Modulus is : " + modulus);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice..!");
            }
            System.out.println("Do u want stop. ");
            choice = scanner.next();
        } while (choice != "no" || choice != "No" || choice != "NO");
    }

    Scanner scanner = new Scanner(System.in);

    double result;
    int operation;

    double add(int no1, int no2) {
        result = no1 + no2;
        return result;
    }

    double subtract(int no1, int no2) {
        result = no1 - no2;
        return result;
    }

    double multiply(int no1, int no2) {
        result = no1 * no2;
        return result;
    }

    double divide(int no1, int no2) {
        result = no1 / no2;
        return result;
    }

    double modulus(int no1, int no2) {
        result = no1 % no2;
        return result;
    }


}