package chap08.lecture.p03extends;

public class App01 {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MySubInterface1 sub1 = o1;
		MySuperInterface1 super1 = o1;
		
		sub1.subMethod1();
		o1.subMethod1();
//		super1.subMethod1();// xxx
		
		sub1.superMethod1();
		o1.superMethod1();
		super1.superMethod1();
	}
}
