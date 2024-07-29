import java.util.Scanner;

public class Main {
    private static double X;
    private static double P;
    public static void main(String[] args) {
        //Suppose that the relationshipo between a firm´s profit P and the number x of items sold can
        //be described by the equaction
        //5 * X [ ITEM SOLDS ] -4 * P [ FIRM´S PROFIT ] = 1200
        //(a) How many units must be produced and sold for the firm to make a profit of $150?
        //(b) Solve this equation for P in terms of x.
        //(c) Find the profit when 240 units are sold.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write input value of P = ");
        P = scanner.nextDouble();
        double d = valueA(P);
        System.out.println("a. Value valculated is " + d);
        System.out.println("-".repeat(20));

        System.out.print("Write input value of X = ");
        X = scanner.nextDouble();
        double u = valueB(X);
        System.out.println("c. Value calculated is " + u);

    }
    private static double valueA(double P)
    {
        X = 240 + (4 * P) / 5;
        System.out.println("x = " + X);
        return X;
    }

    private static double valueB(double X)
    {
        P = (5 * X) / 4 - 300;
        System.out.println("P = " + P);
        return P;
    }
}
