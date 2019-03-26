package fr.makemasenyo.temperature.converter;

import java.util.Scanner;

import fr.makemasenyo.temperature.Celsius;
import fr.makemasenyo.temperature.Fahrenheit;
import fr.makemasenyo.temperature.Temperature;

public class Converter {
	public static void main(String[] args) {
		System.out.println("Temperature converter:");
		System.out.println("================\n");

		do {
			int converterMode = askConverterMode();
			Temperature temperature = askTemperature(converterMode);
			displayConversion(temperature);
		} while(askNewConversion());
	}

	private static int askConverterMode() {
		int mode = 0;
		
		while( mode != 1 && mode != 2 ) {
			System.out.println("Choose one converter mode:");
			System.out.println("1 - Celsius/Fahrenheit converter");
			System.out.println("2 - Fahrenheit/Celsius converter");
			mode = new Scanner(System.in).nextInt();
		}
		
		return mode;
	}

	private static Temperature askTemperature(int converterMode) {
		Temperature temperature = null;
		
		System.out.println("Temperature to convert:");
		double number = new Scanner(System.in).nextDouble();
		
		switch(converterMode) {
			case 1:
				temperature = new Celsius(number);
				break;
			case 2:
				temperature =  new Fahrenheit(number);
				break;
			default:
				System.out.println("This mode is not supported....");
				System.exit(-1);
		}
		
		return temperature;
	}

	private static void displayConversion(Temperature temperature) {
		System.out.println(temperature + " corresponds to: " + temperature.convert());
	}

	private static boolean askNewConversion() {	
		System.out.println("Do you wish to convert another temperature ? ( Yes / No )");
		String answer = new Scanner(System.in).nextLine();
		
		switch(answer) {
		case "Yes":
		case "yes":
		case "Y":
		case "y":
			return true;
		default:
			System.out.println("Bye bye !");
			return false;
		}
	}
}
