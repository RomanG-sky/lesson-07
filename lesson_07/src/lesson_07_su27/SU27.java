package lesson_07_su27;

public class SU27 extends Airplanes implements NitroPower, NuclearBomb, Stels {

	String color;
	double maxSeed;
	double timeToStart = (double)Math.random() * 71 + 18;;
	int nucleaBomb = (int) (Math.random() * 10 + 1);
	


	public SU27(String color, double maxSeed) {
		super();
		this.color = color;
		this.maxSeed = maxSeed;
	}

	private FlyControl flycontrol = new FlyControl();

	public void flyRIGHT() {
		flycontrol.flyRIGHT();
	}

	public void flyLEFT() {
		flycontrol.flyLEFT();
	}

	public void flyDOWN() {
		flycontrol.flyDOWN();
	}

	public void flyUP() {
		flycontrol.flyUP();
	}

	@Override
	public String toString() {
		return "SU27 [color=" + color + ", maxSeed=" + maxSeed + ", timeToStart=" + timeToStart + "]";
	}

	@Override
	void startEngine() {
		System.out.println("До взльоту літака залишилось :" + timeToStart + "с.");

	}

	@Override
	void AirplaneGoDown() {
		System.out.println("Літак проводить посадку");

	}

	@Override
	void flyAirplane() {
		System.out.println("Палива буде достатньо для польоту на відстань :" + flycontrol.flyDistance + "км.");

	}

	@Override
	public void STELS() {
		System.out.println("Літак залишатиметься невидимим протягом : " + (Math.random()*100) + " с.");

	}

	@Override
	public void NuclearBOMB() {
		System.out.println("На ціль буде скинуто : " + nucleaBomb + " ядерних богоєголовок");

	}

	@Override
	public void nitroPOWER() {
		System.out.println("Швидкість SU27 збільшено до : " + (maxSeed + Math.random()*100) + " км.");

	}


}
