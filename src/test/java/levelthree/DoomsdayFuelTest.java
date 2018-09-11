package test.java.levelthree;

import main.java.levelthree.DoomsdayFuel;
import org.junit.Test;

/*
Inputs:
    (int) m = [[0, 2, 1, 0, 0], [0, 0, 0, 3, 4], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
Output:
    (int list) [7, 6, 8, 21]
 */
public class DoomsdayFuelTest {
	DoomsdayFuel doomsdayFuel = new DoomsdayFuel();

	@Test
	public void test() {
		int[] s0 = new int[]{0, 1, 0, 0, 1};
		int[] s1 = new int[]{4, 0, 2, 3, 0};
		int[] s2 = new int[]{0, 0, 0, 0, 0};
		int[] s3 = new int[]{0, 0, 0, 0, 0};
		int[] s4 = new int[]{0, 0, 0, 0, 0};
		int[][] s = new int[5][5];
		s[0] = s0;
		s[1] = s1;
		s[2] = s2;
		s[3] = s3;
		s[4] = s4;
		int[] ans = doomsdayFuel.answer(s);
		System.out.println("ans:");
		for (int i : ans) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
