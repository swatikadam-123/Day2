
public class ForloopReversnum {

	public static void main(String[] args) {
		int num = 123, reversed = 0;
		for (num=123; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("reversed number:" + reversed);
	}

}
