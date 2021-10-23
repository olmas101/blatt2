import java.util.Scanner;

public class Random {
	private static Scanner sc;
	public static void main(String[] args)
	{
		int grenze1, grenze2, augenzahl;
		sc = new Scanner(System.in);

		System.out.print("Geben Sie die erste Grenze ein: ");
		grenze1 = sc.nextInt();
        System.out.print("Geben Sie die zweite Grenze ein: ");
		grenze2 = sc.nextInt();
        augenzahl=(int)(Math.random()*(grenze2-grenze1+1)+grenze1);
       	System.out.println(augenzahl);
	}
}




