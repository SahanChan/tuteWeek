import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m1,m2,m3;
		System.out.print("Mark1: ");
		m1=scan.nextInt();
		System.out.print("Mark2: ");
		m2=scan.nextInt();
		System.out.print("Mark3: ");
		m3=scan.nextInt();
		
		Average average = new Average();
		average.setMarks(m1, m2, m3);
		
		System.out.println("Average is : "+average.getAverage());
	}

}
