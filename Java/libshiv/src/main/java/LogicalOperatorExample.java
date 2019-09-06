import java.util.Random;
import java.util.Scanner;

class LogicalOperatorExample {
    LogicalOperatorExample(){
        int a = 10, b = 20, ch;

        String choice="";
        do {
            System.out.println("1.AND Operation.\n2. OR operation.\n3.Not Operation.\n 4. Exit");
            System.out.println("Enter ur choice: ");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    if (a == 10 && b == 20) {
                        System.out.println("AND operation Successful.");
                    }
                    break;
                case 2:
                    if (a == 10 || b == 20) {
                        System.out.println("OR Operation Successful");
                    }
                    break;
                case 3:
                    if (a != b) {
                        System.out.println("NOT operation Successful.");
                    }
                    break;
            }
            System.out.println("Do u want stop. ");
            choice = scanner.next();
        } while (choice != "no" || choice != "No" || choice != "NO");
    }
    public void doOperations() {
        LogicalOperatorExample logicalOperatorExample=new LogicalOperatorExample();
        return;
    }
}
