import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please inter your height: ");
        double height = scanner.nextDouble();

        System.out.println("please inter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("this is your bmi: ");
        double BMI = weight / (height * height);

        System.out.println("your BMI is: " + BMI);

        if (BMI > 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal weight");

        } else if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obese");

        }

    }
}
