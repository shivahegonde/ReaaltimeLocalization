import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SimpleInterest {
    double p,n,r;
    Scanner scanner=new Scanner(System.in);
    private static double calculateSimpleInterest(double p, double r, double n) {
        double si;
        if(p==0||n==0||r==0){
            System.out.println("entered inputs should not be zero.");
            return 0;
        }
        else{
            si=(p*n*r)/100;
        }
        return si;

    }

    public double calculateInterest() {
        System.out.println("Enter Principle: ");
        p=scanner.nextDouble();
        System.out.println("Enter Rate: ");
        r=scanner.nextDouble();
        System.out.println("Enter No of Year: ");
        n=scanner.nextDouble();
        //Call calculateSimpleInterest and pass inputs to it.
        double si=calculateSimpleInterest(p,r,n);
        if(si==0){
            //Zero value input entered
            System.out.println("Ohhh You entered zero value in inputs.");
        }
        return si;
    }
}
