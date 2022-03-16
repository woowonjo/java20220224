package chap07.book.s070702;

public class Car {

	Tire frontLeftTire = new Tire();
	Tire frontRightTire = new Tire();
	Tire backLeftTire = new Tire();
	Tire backRightTire = new Tire();

	Car myCar = new Car();
	myCar.frontRightTire = new HankookTire();
	myCar.backLeftTire = new KumhoTire();
	myCar.run();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
