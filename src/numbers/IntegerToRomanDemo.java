package numbers;

public class IntegerToRomanDemo {
	 
	public static void main(String[] args) {
		System.out.println(intToRoman(11));
	}

	public static String intToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				roman.append(romanLiterals[i]);
				num -= values[i];
			}

		}
		return roman.toString();
	}
}
