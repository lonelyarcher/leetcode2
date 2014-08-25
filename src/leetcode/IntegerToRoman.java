package leetcode;

public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println(intToRoman(3999));

	}

	public static String intToRoman(int num) {
		assert (num <= 3999);
		assert (num >= 1);
		int[] n = { 1000,900,500,400,100,90,50,40,10,9,5,4,1 };
		String[] r = { "M","CM","D", "CD","C", "XC","L","XL", "X","IX", "V","IV", "I" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < num / n[i]; j++)
					sb.append(r[i]);
			num = num % n[i];
		}
		return sb.toString();
	}

}
