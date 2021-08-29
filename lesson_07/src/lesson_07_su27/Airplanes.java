package lesson_07_su27;

public abstract class Airplanes {
	double widht;
	double weight;
	double length;

	public double getWidht() {
		return widht;
	}

	public void setWidht(double widht) {
		this.widht = widht;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	abstract void startEngine();

	abstract void flyAirplane();

	abstract void AirplaneGoDown();

}
