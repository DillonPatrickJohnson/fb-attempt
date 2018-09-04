package test.java.levelthree;

import main.java.levelthree.LuckyTriples;
import org.junit.Test;

public class LuckyTriplesTest {

	private LuckyTriples luckyTriples;

	@Test
	public void test() {
		luckyTriples = new LuckyTriples();
//		int[] l = new int[6];
//		l[0] = 1;
//		l[1] = 2;
//		l[2] = 3;
//		l[3] = 4;
//		l[4] = 5;
//		l[5] = 6;
		int[] l = new int[3];
		l[0] = 1;
		l[1] = 1;
		l[2] = 1;
		System.out.println(luckyTriples.answer(l));

		//[1, 2, 3, 4, 5, 6]
		//3, 1, 2, 5, 10, 20
	}
}
