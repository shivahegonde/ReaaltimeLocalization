import java.util.Scanner;

public class SumOfNNumbers {

    static int n;
    public static double calculateSum() {
        //Accept input using Scanner.
        Scanner scanner=new Scanner(System.in);
        //Accept no that you want to calculate sum of no.
        System.out.println("Enter N: ");
        n=scanner.nextInt();
        //Call calculateSum by passing n.
        double sum=calculateSum(n);
        return sum;


        //Return sum of no using following formula and return result.

    }

    private static double calculateSum(int n) {
        return n*(n+1)/2;
    }


}
