import java.util.Scanner;
public class WeatherForecastSystem {
    public static double convertTemperature(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return (temp * 9 / 5) + 32;  // Celsius to Fahrenheit
        } else if (unit.equalsIgnoreCase("F")) {
            return (temp - 32) * 5 / 9;  // Fahrenheit to Celsius
        } else {
            System.out.println("Invalid unit. Use 'C' for Celsius or 'F' for Fahrenheit.");
            return temp;
        }
    }
    public static void getWeatherAdvice(double temperature, String weatherCondition) {
        System.out.println("Weather Condition: " + weatherCondition);
        
        if (temperature < 10) {
            System.out.println("It's cold. Wear a jacket or coat.");
        } else if (temperature >= 10 && temperature <= 20) {
            System.out.println("Cool weather. Wear a sweater or hoodie.");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("Warm weather. Light clothing is fine.");
        } else {
            System.out.println("It's hot! Stay hydrated and wear light clothes.");
        }

        if (weatherCondition.equalsIgnoreCase("rainy")) {
            System.out.println("Don't forget an umbrella or raincoat!");
        } else if (weatherCondition.equalsIgnoreCase("sunny")) {
            System.out.println("Wear sunglasses and use sunscreen.");
        } else if (weatherCondition.equalsIgnoreCase("snowy")) {
            System.out.println("Wear boots and a warm hat.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next();
        double convertedTemp = convertTemperature(temp, unit);
        String convertedUnit = unit.equalsIgnoreCase("C") ? "F" : "C";
        System.out.println("Converted Temperature: " + convertedTemp + "°" + convertedUnit);
        System.out.print("Enter weather condition (e.g., sunny, rainy, snowy): ");
        scanner.nextLine();
        String condition = scanner.nextLine();

        if (unit.equalsIgnoreCase("F")) {
            temp = (temp - 32) * 5 / 9;
        }
        getWeatherAdvice(temp, condition);

        scanner.close();
    }
}