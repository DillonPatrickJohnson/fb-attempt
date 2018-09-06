package main.java.levelthree;

/*
Fuel Injection Perfection
=========================

Commander Lambda has asked for your help to refine the automatic quantum antimatter fuel injection system for her LAMBCHOP doomsday device. It's a great chance for you to get a closer look at the LAMBCHOP - and maybe sneak in a bit of sabotage while you're at it - so you took the job gladly.

Quantum antimatter fuel comes in small pellets, which is convenient since the many moving parts of the LAMBCHOP each need to be fed fuel one pellet at a time. However, minions dump pellets in bulk into the fuel intake. You need to figure out the most efficient way to sort and shift the pellets down to a single pellet at a time.

The fuel control mechanisms have three operations:

1) Add one fuel pellet
2) Remove one fuel pellet
3) Divide the entire group of fuel pellets by 2 (due to the destructive energy released when a quantum antimatter pellet is cut in half, the safety controls will only allow this to happen if there is an even number of pellets)

Write a function called answer(n) which takes a positive integer as a string and returns the minimum number of operations needed to transform the number of pellets to 1. The fuel intake control panel can only display a number up to 309 digits long, so there won't ever be more pellets than you can express in that many digits.

For example:
answer(4) returns 2: 4 -> 2 -> 1
answer(15) returns 5: 15 -> 16 -> 8 -> 4 -> 2 -> 1
 */

/*
Logic:
worth it to add: number == the power of 2 on the number? 2^4 its worth to do 1 add 2^5 = 2
get the nearest powers of 2, find the “worth” amount of adds/subs
this num will be small, so we can test it vs the end of the str to see if it is worth it

159
closest = 128, 256
worth = 4 (2^7 == 128)
159 +/- 4 != 128
check if odd
159 +/- 1 (there has to be a decision here to see if result is closer to a power of 2)
80/79 (closest = 64/128)
79 is closer so we sub above
repeat (79 -> 78 -> 39 -> 38 -> 19 -> 18 -> 9 -> 8 -> 4 -> 2 -> 1)
done
 */

public class FuelInjectionPerfection {

	public static int answer(String s) {

		return smallestMoves(s);
	}

	public static int smallestMoves(String s) {
		int count = 0;
		while (!isDone(s)) {
			if (!isEven(s)) {
				//minus
				if (s.charAt(s.length()-1) == '9') {
					s = subtract(s);
				} else if (s.charAt(s.length()-1) == '1') {
					s = add(s);
				} else {
					s = add(s);
				}
				count++;
			} else {
				s = divideByTwo(s);
				count++;
			}
		}
		return count;
	}

	public static boolean isDone(String s) {
		if (s.length() > 1) {
			return false;
		}
		if (s.charAt(0) == '1') {
			return true;
		}
		return false;
	}

	public static String subtract(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder newStr = new StringBuilder();
		int offset = 1;
		if (s.charAt(s.length() - offset) != '0') {
			newStr.append(Integer.toString(strToInt(s, s.length() - offset) - 1));
		} else {
			do {
				int i = strToInt(s, s.length() - offset) - 1;
				int n = 10 + i;
				newStr.append(Integer.toString(n));
				offset++;
			} while(s.charAt(s.length() - offset) == '0');
			newStr.insert(0, Integer.toString(strToInt(s, s.length() - offset) - 1));
		}
		for (int i = 0; i < s.length()-offset; i++) {
			stringBuilder.append(s.charAt(i));
		}
		stringBuilder.append(newStr);
		return removePrecedingZeros(stringBuilder.toString());
	}

	public static String add(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		String newStr = "";
		int offset = 1;
		if (s.charAt(s.length() - offset) != '9') {
			newStr = Integer.toString(strToInt(s, s.length() - offset) + 1);
		} else {
			do {
				int i = strToInt(s, s.length() - offset) + 1;
				newStr += Integer.toString(i-1);
				offset++;
			} while(s.charAt(s.length() - offset) == '0');
		}
		for (int i = 0; i < s.length()-offset; i++) {
			stringBuilder.append(s.charAt(i));
		}
		stringBuilder.append(newStr);
		return removePrecedingZeros(stringBuilder.toString());
	}

	public static String divideByTwo(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		int result = 0;
		int carry = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 48;
			result = num/2;
			stringBuilder.append(result+carry);
			carry = (num%2) * 5;
		}
		return removePrecedingZeros(stringBuilder.toString());
	}

	public static String multiplyByTwo(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		int result = 0;
		int carry = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 48;
			result = num*2%10;
			//f
			carry = num*2/10;
		}
		return removePrecedingZeros(stringBuilder.toString());
	}

	public static int strToInt(String str, int index) {
		if (str.length() > index) {
			return str.charAt(index) - 48;
		}
		return -1;
	}

	public static boolean isEven(String s) {
		int len = s.length();
		if ((s.charAt(len-1)-48)%2 == 0) {
			return true;
		}
		return false;
	}

	public static String removePrecedingZeros(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				return s.substring(i);
			}
		}
		return "";
	}

	public static void powerOfTwo(String s) {
		int slen = s.length();

		int powerOf = 1;
		String i = "2";

		while (i.length() < slen) {

		}
	}
}
