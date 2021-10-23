import java.util.Scanner;

public class BallistischeKurve {
	private static Scanner sc;
	public static void main(String[] args)
	{
		double time, position, speed, height;
		sc = new Scanner(System.in);

		System.out.print("Die Zeit in Sekunden: ");
        time = sc.nextDouble();
		System.out.print("Die Position in Meter: ");
		position = sc.nextDouble();
		System.out.print("Die Geschwindigkeit in m/sek: ");
		speed = sc.nextDouble();
        height = (position+(speed*time)-((9.81/2)*time*time));

		System.out.println(height);
	}
}
