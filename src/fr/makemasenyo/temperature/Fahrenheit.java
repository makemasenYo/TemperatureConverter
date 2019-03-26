package fr.makemasenyo.temperature;

public class Fahrenheit extends Temperature {
	public static final String unit = "°F";
	
	public Fahrenheit(double number) {
		super(number);
	}

	@Override
	public Temperature convert() {
		return new Celsius( ( (getNumber() - 32) * 5.0 ) / 9.0 );
	}
	
	@Override
	public String toString() {
		return super.toString() + unit;
	}
}