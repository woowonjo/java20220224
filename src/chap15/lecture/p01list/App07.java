package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App07 {
	public static void main(String[] args) {
		// ArrayList를 만들고
		// 0부터 99까지의 Integer를 element로 추가
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		
		// ArrayList를 만들고
		// 99부터 0까지의 Integer를 element로 추가
		List<Integer> list2 = new ArrayList<>();
		for (int i = 99; i >= 0; i--) {
			list2.add(i);
		}
		System.out.println(list2);
		
	}
}







