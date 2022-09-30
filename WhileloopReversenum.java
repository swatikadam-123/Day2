import java.util.Scanner;

public class WhileloopReversenum {

	public static void main(String[] args) {
		int num = 0;
		int reversenum = 0;
		System.out.println("enter number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		System.out.println("reverse number is:" + reversenum);
	}

}
