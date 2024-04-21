import java.util.Scanner;
public class posneg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		if (val > 0) {
			System.out.println("P");
		}else {
			System.out.println("N");
		}
		sc.close();
	}

}
