
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int counter = 0;
		char[] romanNumCharArray = romanNum.toCharArray();
		
			if(romanNumCharArray.length == 1) {
				counter = singleLengthConverter(romanNumCharArray[0]);
			}	
			
			if(romanNumCharArray.length == 2) {
				counter = twoLengthConverter(romanNumCharArray[0],romanNumCharArray[1]);
			}
			
			if(romanNumCharArray.length == 3 ) {
				counter = threeLengthConverter(romanNumCharArray[0],romanNumCharArray[1], romanNumCharArray[2]);
			}
			
			if(romanNumCharArray.length == 4 ) {
				counter = fourLengthConverter(romanNumCharArray[0],romanNumCharArray[1], romanNumCharArray[2],romanNumCharArray[3]);
			}
			
			
		
		
		
		return counter;

		
	}
	



	private int simpleConvert(char convertThisChar) {
		switch (convertThisChar){
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}		
	}
	
	private int singleLengthConverter(char convertThisChar) {
		return this.simpleConvert(convertThisChar);
	}
	
	private int twoLengthConverter(char firstChar, char secondChar) {
		
		if(this.simpleConvert(firstChar) >= this.simpleConvert(secondChar)) {
			return this.simpleConvert(firstChar) + this.simpleConvert(secondChar);
		} else {
			return this.simpleConvert(secondChar) - this.simpleConvert(firstChar);
		}
		
		/*
		if(firstChar == 'I') {
			if(secondChar == 'I')
			{
				return simpleConvert(firstChar) + simpleConvert(secondChar) ;
			}
			if(secondChar == 'V')
			{
				return simpleConvert(secondChar) - simpleConvert(firstChar);
			}	
			if(secondChar == 'X')
			{
				return simpleConvert(secondChar) - simpleConvert(firstChar);
			}
		}

		if(firstChar == 'V' && secondChar == 'I') {
			return  simpleConvert(firstChar) + simpleConvert(secondChar);
		}
		
		if(firstChar == 'X' && secondChar == 'I') {
			return simpleConvert(firstChar) + simpleConvert(secondChar);
		}
		return 0;
		
		*/
	}
	
	private int threeLengthConverter(char firstChar, char secondChar, char thirdChar) {
		return simpleConvert(firstChar) + simpleConvert(secondChar) + simpleConvert(thirdChar);
		
		
		/* worked until 11 
		 * if(firstChar == 'I' && secondChar == 'I' && thirdChar == 'I') {
			return simpleConvert(firstChar) + simpleConvert(secondChar) + simpleConvert(thirdChar);
		}
		if(firstChar == 'V' && secondChar == 'I' && thirdChar == 'I') {
			return simpleConvert(firstChar) + simpleConvert(secondChar) + simpleConvert(thirdChar);
		}
		if(firstChar == 'X' && secondChar == 'I' && thirdChar == 'I') {
			return simpleConvert(firstChar) + simpleConvert(secondChar) + simpleConvert(thirdChar);
		}*/

	}
	
	private int fourLengthConverter(char firstChar, char secondChar, char thirdChar, char fourChar) {
		if(firstChar == 'V' && secondChar == 'I' && thirdChar == 'I' &&  fourChar == 'I') {
			return simpleConvert(firstChar) + simpleConvert(secondChar) + simpleConvert(thirdChar) + simpleConvert(fourChar);
		}
		return 0;
	}
}
