package ee.valiit.romannumeral;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RomannumeralApplicationTests {

	@Test
	public void testConvert1() {
		Assert.assertThat(RomanNumerals.convert(1), Is.is("I"));
	}

	@Test
	public void testConvert2() {
		Assert.assertThat(RomanNumerals.convert(2), Is.is("II"));
	}

	@Test
	public void testConvert3() {
		Assert.assertThat(RomanNumerals.convert(3), Is.is("III"));
	}

	@Test
	public void testConvert10() {
		Assert.assertThat(RomanNumerals.convert(10), Is.is("X"));
	}

	@Test
	public void testConvert20() {
		Assert.assertThat(RomanNumerals.convert(20), Is.is("XX"));
	}

	@Test
	public void testConvert11() {
		Assert.assertThat(RomanNumerals.convert(11), Is.is("XI"));
	}

	@Test
	public void testConvert23() {
		Assert.assertThat(RomanNumerals.convert(23), Is.is("XXIII"));
	}

	@Test
	public void testConvert5() {
		Assert.assertThat(RomanNumerals.convert(5), Is.is("V"));
	}

	@Test
	public void testConvert8() {
		Assert.assertThat(RomanNumerals.convert(8), Is.is("VIII"));
	}

	@Test
	public void testConvert1505() {
		Assert.assertThat(RomanNumerals.convert(1505), Is.is("MDV"));
	}

	@Test
	public void testConvert1775() {
		Assert.assertThat(RomanNumerals.convert(1775), Is.is("MDCCLXXV"));
	}

	@Test
	public void testConvert4() {
		Assert.assertThat(RomanNumerals.convert(4), Is.is("IV"));
	}

	@Test
	public void testConvert9() {
		Assert.assertThat(RomanNumerals.convert(9), Is.is("IX"));
	}

	@Test
	public void testConvert1954() {
		Assert.assertThat(RomanNumerals.convert(1954), Is.is("MCMLIV"));
	}

}
