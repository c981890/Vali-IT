package ee.valiit.stringcalculator;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringcalculatorApplicationTests {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testAddEmptyString() {
		Assert.assertEquals("Oodati number 0", StringcalculatorApplication.add(""), 0);
	}

	@Test
	public void testAddStringWithOne1() {
		Assert.assertEquals(StringcalculatorApplication.add("1"), 1);
	}

	@Test
	public void testAddStringWithOne9() {
		Assert.assertEquals(StringcalculatorApplication.add("9"), 9);
	}

	@Test
	public void testAddStringWithTwo12() {
		Assert.assertEquals(StringcalculatorApplication.add("1,2"), 3);
	}
	@Test
	public void testAddStringWithUnlimited1279() {
		Assert.assertEquals(StringcalculatorApplication.add("1,2,7,9"), 19);
	}
	@Test
	public void testAddStringWithUnlimited1279AndTwoRegex() {
		Assert.assertEquals(StringcalculatorApplication.add("1\n2,7,9"), 19);
	}
	@Test
	public void testAddStringWithUnlimited12AndUnknownRegex() {
		Assert.assertEquals(StringcalculatorApplication.add("//;\n1;2"), 3);
	}
	@Test
	public void testAddStringWithUnlimited12AndUnknownRegexAndNegative() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("negatives not allowed -2");
		StringcalculatorApplication.add("1,-2,7,9");
	}

}
