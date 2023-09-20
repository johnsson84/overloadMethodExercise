import java.util.Scanner;

public class Main {

    static double convertMethod(int inches) {
        double cm = inches * 2.54;
        return cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input how many inches: ");
        System.out.println("Inches in cm is: " + convertMethod(input.nextInt()));
    }
}