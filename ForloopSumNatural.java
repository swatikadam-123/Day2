import java.util.Scanner;

public class ForloopSumNatural {

	public static void main(String[] args) {
		int i, num = 10, sum = 0;

		System.out.println("enter the number:");
		Scanner s = new Scanner(System.in);
		i = s.nextInt();

		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}

		System.out.println("sum of num:" + sum);

	}

}
