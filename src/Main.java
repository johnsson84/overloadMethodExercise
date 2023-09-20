import java.util.Scanner;

public class Main {

    static double convertMethod(int inches) {
        double cm = inches * 2.54;
        return cm;
    }

    static double convertMethod(int meters, int centimeters) {
        int cm = centimeters;
        for (int i = 0; i < meters; i++) {
            cm += 100;
        }
        return ((convertMethod(cm) / 2.54) / 2.54);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("METHOD 1");
        System.out.print("Please input how many inches: ");
        System.out.println("Inches in cm is: " + convertMethod(input.nextInt()));

        System.out.println("\nMETHOD 2");
        System.out.println("Please enter your height. First meters then centimeters");
        System.out.print("Meters: "); int m = input.nextInt();
        System.out.print("Centimeters: "); int cm = input.nextInt();
        System.out.println("Your height converted to inches is: " + convertMethod(m, cm));

    }
}