package semaine4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		LocalTime oldDate = LocalTime.now();
		String teString = scanner.nextLine();
		LocalTime newDate = LocalTime.now();
		Duration duration = Duration.between(oldDate, newDate);
		System.out.println(duration.getSeconds()+"secondes");
	}
}