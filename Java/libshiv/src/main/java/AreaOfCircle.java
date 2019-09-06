import java.util.Scanner;

class AreaOfCircle {
    double r;
    double pi=3.14;
    Scanner scanner=new Scanner(System.in);

    public double calculateArea() {
        System.out.println("Enter Radious: ");
        r=scanner.nextInt();
        if(r==0){
            System.out.println("You Enter 0 as radious so Result is 0.");
            return 0;
        }
        double area= pi*r*r;
        return area;
    }
}
