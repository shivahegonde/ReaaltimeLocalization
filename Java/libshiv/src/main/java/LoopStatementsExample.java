import java.util.Scanner;

class LoopStatementsExample {
    LoopStatementsExample() {
        System.out.println("For Loop Example ");
        for (int i = 1; i <= 10; i++) {
            if (i==5){
                continue;
            }
            System.out.print("  "+i);
        }
    }

    public static void doOperations() {
        Scanner scanner=new Scanner(System.in);
        int ch;
        String choice="";

        do {
            System.out.println("1. For Loop\n2. While Loop.\n3. Do While Loop\n4. Exit");
            System.out.println("enter ur choice: ");
            ch=scanner.nextInt();
            switch (ch) {
                case 1:
                    LoopStatementsExample loopStatementsExample=new LoopStatementsExample();
                    break;
                case 2:
                    System.out.println("While Loop Example ");
                    int i=1;
                    while (i<=10) {

                        System.out.print("  "+i);
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Do While Loop Example ");
                    int j=1;
                    do{
                        System.out.print("  "+j);
                        j++;
                    }while (j<=10);
                    break;
                case 4: return;
                default:
                    System.out.println("wrong choice");
            }
            System.out.println("do u want to stop: ");
            choice=scanner.next();
        }while (choice!="no"||choice!="No"||choice!="NO");

    }
}
