package test.java.levelthree;

import main.java.levelthree.FuelInjectionPerfection;
import org.junit.Test;

public class FuelInjectionPerfectionTest {

	private FuelInjectionPerfection f;

	@Test
	public void test() {
		f = new FuelInjectionPerfection();

		System.out.println(f.answer("15"));
		System.out.println(f.answer("1580")); //790
	}
}
