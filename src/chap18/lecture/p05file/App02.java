package chap18.lecture.p05file;

import java.io.File;

public class App02 {
	public static void main(String[] args) {
		String path = "output/참조타입01_copy.png";
		File file1 = new File(path);
		
		System.out.println(file1.exists());
		file1.delete(); // 지우기
		
		System.out.println(file1.exists());
		
		path = "output/other";
		File file2 = new File(path);
		
		file2.mkdir(); // 폴더하나 만들기
		
		path = "output/other1/other2/other3";
		File file3 = new File(path);
		file3.mkdirs(); // 여러폴더 만들기
	}
}
