import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals romNum = new RomanNumerals();
	
	@Test
	public void testConvertToInt_StringNotEmpty() {
		
		assertEquals(0, romNum.convertToInteger(""));
	}
	
	@Test public void testConvertToInt_Convert1toRoman() {
		
		assertEquals(1, romNum.convertToInteger("I"));
	}
	
	@Test public void testConvertToInt_Convert2toRoman() {
		
		assertEquals(2, romNum.convertToInteger("II"));
	}
	
	@Test public void testConvertToInt_Convert3toRoman() {
		
		assertEquals(3, romNum.convertToInteger("III"));
	}
	
	@Test public void testConvertToInt_Convert4toRoman() {
		
		assertEquals(4, romNum.convertToInteger("IV"));
	}
	
	@Test public void testConvertToInt_Convert5toRoman() {
		
		assertEquals(5, romNum.convertToInteger("V"));
	}
	
	@Test public void testConvertToInt_Convert6toRoman() {
		
		assertEquals(6, romNum.convertToInteger("VI"));
	}
	
	@Test public void testConvertToInt_Convert7toRoman() {
		
		assertEquals(7, romNum.convertToInteger("VII"));
	}
	
	@Test public void testConvertToInt_Convert8toRoman() {
		
		assertEquals(8, romNum.convertToInteger("VIII"));
	}
	
	@Test public void testConvertToInt_Convert9toRoman() {
		
		assertEquals(9, romNum.convertToInteger("IX"));
	}
	
	@Test public void testConvertToInt_Convert10toRoman() {
		
		assertEquals(10, romNum.convertToInteger("X"));
	}
	
	@Test public void testConvertToInt_Convert11toRoman() {
		
		assertEquals(11, romNum.convertToInteger("XI"));
	}

	@Test public void testConvertToInt_Convert12toRoman() {
		
		assertEquals(12, romNum.convertToInteger("XII"));
	}

}
