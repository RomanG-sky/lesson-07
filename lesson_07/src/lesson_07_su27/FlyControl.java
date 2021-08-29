package lesson_07_su27;

public class FlyControl implements flyUp, flyDown, flyLeft, flyRight {

	double flyDistance = (double) (Math.random() * 1001);
	double a = (double) (Math.random() * flyDistance);
	double b = (double) (Math.random() * (flyDistance - a));
	double c = (double) (Math.random() * (flyDistance - a - b));
	double d = (double) (Math.random() * (flyDistance - a - b - c));

	@Override
	public void flyUP() {
		System.out.println("Літак рухається вверх на :" + a + "км.");
	}

	@Override
	public void flyLEFT() {
		System.out.println("Літак рухається вліво на :" + b + "км.");
	}

	@Override
	public void flyDOWN() {
		System.out.println("Літак рухається вниз на :" + c + "км.");
	}

	@Override
	public void flyRIGHT() {
		System.out.println("Літак рухається вправо на :" + d + "км.");

	}

}
