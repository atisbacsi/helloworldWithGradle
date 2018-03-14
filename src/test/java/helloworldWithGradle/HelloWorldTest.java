package helloworldWithGradle;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test1() {
		Assert.assertTrue("Sikeres teszt", true);
	}
	
	@Test
	public void mainTest() {
		HelloWorld.main("a", "b");
	}

	@Test
	public void mainConstructorTest() {
		HelloWorld hw = new HelloWorld();
		hw.main("X");
	}

	@Ignore
	@Test
	public void test2() {
		Assert.assertTrue("Hibas teszt", false);
	}

}
