package test.java.levelthree;

import main.java.levelthree.FuelInjectionPerfection;
import org.junit.Test;

public class FuelInjectionPerfectionTest {

	private FuelInjectionPerfection f;

	@Test
	public void test() {
		f = new FuelInjectionPerfection();
		//32 = 2^5 (~2)

		//System.out.println(f.answer("8192"));
		System.out.println(f.answer("71"));
		//72 - 36 - 18 - 9 - 8 - 4 - 2 - 1 == 8
		//1024 - 512 - 256 - 128 - 64 - 32 - 16 - 8 - 4 - 2 - 1 //11
		//2048 - 1024 - 512 - 256 - 128 - 64 - 32 - 16 - 8 - 4 - 2 - 1 //12
	}
}
