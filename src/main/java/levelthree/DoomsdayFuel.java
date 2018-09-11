package main.java.levelthree;

public class DoomsdayFuel {
	public static int[] answer(int[][] m) {
		int numTerm = (numTerminal(m));
		System.out.println(numTerm);

		int denom = numOptions(m);
		for (int[] a : m) {
			int i = 0;
			for (int b : a) {
				if (b == a[i]) {
					denom -= i;
				}
				i++;
			}
		}
		System.out.println(denom);

		return new int[]{0};
	}

	public static int numOptions(int[][] m) {
		int num = 1, cur;
		for (int[] a : m) {
			cur = 0;
			for (int i : a) {
				cur += i;
			}
			if (cur > 0) {
				num *= cur;
			}
		}

		return num;
	}

	public static int numTerminal(int[][] m) {
		int count = 0;
		for (int[] i : m) {
			if (isTerm(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isTerm(int[] a) {
		for (int i : a) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
}
