package chap06.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;
	
	// 생성자는 여러개 작성가능
	// 생성자의 파라미터의 수, 타입이 달라야함
	Computer(String cpu, String ram, String ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	
//	Computer(String ram, String ssd) {
//		this.ram = ram;
//		this.ssd = ssd;
//	}
	
	Computer(String cpu) {
		this.cpu = cpu;
	}
	
}








