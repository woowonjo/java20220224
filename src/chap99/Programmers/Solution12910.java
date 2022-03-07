package chap99.Programmers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution12910 {

	@Test // ctrl + shift + o
	public void test() {
		assertArrayEquals(new int[] { 5, 10 }, solution(new int[] { 5, 9, 7, 10 }, 5));
		assertArrayEquals(new int[] { 1, 2, 3, 36 }, solution(new int[] { 2, 36, 1, 3 }, 1));
		assertArrayEquals(new int[] { -1 }, solution(new int[] { 3, 2, 6 }, 10));
	}

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		return answer;
	}
}
                                       