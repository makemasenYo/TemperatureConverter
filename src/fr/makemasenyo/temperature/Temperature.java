package fr.makemasenyo.temperature;

public abstract class Temperature {
	private final double number;
	
	public Temperature(double number) {
		this.number = number;
	}

	protected double getNumber() {
		return number;
	}
	
	public abstract Temperature convert();
	
	@Override
	public String toString() {
		return String.format(Double.toString(getNumber()), "%f");
	}
}
