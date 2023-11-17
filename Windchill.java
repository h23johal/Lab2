import java.util.Scanner;

public class Windchill {


    public static double calculateWindChill(double temperature, double windSpeed) {
        // Omvandla vindhastighet från m/s till km/h om så behövs
        double speedInKmh = windSpeed * 3.6;
        // Beräkna WCT enligt formeln
        return 13.12 + 0.6215 * temperature - 11.37 * Math.pow(speedInKmh, 0.16) + 0.3965 * temperature * Math.pow(speedInKmh, 0.16);
    }

    public static void main(String[] args) {
        // Objekt: Skapa ett Scanner-objekt för att läsa inmatning från användaren
        Scanner input = new Scanner(System.in);

        // Uppmana användaren att mata in temperatur
        System.out.println("Fyll i utetemperaturen i Celsius:");
        // Metod: Använd metoden nextDouble för att läsa in ett decimaltal
        double temperature = input.nextDouble();

        // Uppmana användaren att mata in vindhastighet i m/s
        System.out.println("Fyll i vindhastigheten i m/s:");
        // Metod: Använd metoden nextDouble för att läsa in ett decimaltal
        double windSpeed = input.nextDouble();

        // Beräkna WCT med de insamlade värdena
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output: Använd System.out.printf för att visa resultatet formaterat till två decimaler
        System.out.printf("Wind chill temperaturen är: %.2f grader Celsius%n", windChill);

        // Stäng input-objektet
        input.close();
    }
}