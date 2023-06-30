/*Écrire un programme Java qui permet à l'utilisateur de convertir une température donnée en degrés Celsius vers Fahrenheit ou vice versa.

Le programme doit afficher un menu avec les options suivantes :

Convertir de Celsius vers Fahrenheit
Convertir de Fahrenheit vers Celsius

La formule de conversion de Celsius vers Fahrenheit est la suivante :
°F = (°C * 9/5) + 32

La formule de conversion de Fahrenheit vers Celsius est la suivante :
°C = (°F - 32) * 5/9*/
package exercice7;

public class TP {
	 public static double convertirCelsiusVersFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static double convertirFahrenheitVersCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

}
