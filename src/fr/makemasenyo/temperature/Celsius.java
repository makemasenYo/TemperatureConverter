package fr.makemasenyo.temperature;

public class Celsius extends Temperature {
	public static final String unit = "°C";
	
	public Celsius(double number) {
		super(number);
	}

	@Override
	public Temperature convert() {
		return new Fahrenheit( ( 9.0 / 5.0 ) * getNumber() + 32 );
	}
	
	@Override
	public String toString() {
		return super.toString() + unit;
	}
}