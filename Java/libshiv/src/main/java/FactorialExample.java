import com.example.libshiv.Factorial;

import java.util.Scanner;
class FactorialExample {
    //Factorial Java Program by using Constructor.

    int fact = 1;
    public int calculateFactorial() {

        System.out.println("Enter no: ");
        //For taking input use Scanner
        Scanner scanner = new Scanner(System.in);
        //Take integer input using nextInt();
        int no = scanner.nextInt();
        //Check whether no is not zero if zero call Default Constructor.
        fact=fact* factoral(no);
        return fact;
    }

    private int factoral(int no) {
        if (no==0){
            return 1;
        }
        return no* factoral(no-1);
    }
}

