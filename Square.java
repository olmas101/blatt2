import java.util.Scanner;

public class Square {
	private static Scanner sc;
	public static void main(String[] args)
	{
		int number, square;
		sc = new Scanner(System.in);

		System.out.print(" Ihre Zahl: ");
		number = sc.nextInt();
        square = number*number;

		System.out.println(square);
	}
}
