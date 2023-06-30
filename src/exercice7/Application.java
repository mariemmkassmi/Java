package exercice7;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez la température en Celsius : ");
	        double celsius = scanner.nextDouble();

	        double fahrenheit = TP.convertirCelsiusVersFahrenheit(celsius);

	        System.out.println("Résultat en Fahrenheit : " + fahrenheit + "°F");

	        System.out.print("Entrez la température en Fahrenheit : ");
	        double tempFahrenheit = scanner.nextDouble();

	        double tempCelsius = TP.convertirFahrenheitVersCelsius(tempFahrenheit);

	        System.out.println("Résultat en Celsius : " + tempCelsius + "°C");
	    }
}
