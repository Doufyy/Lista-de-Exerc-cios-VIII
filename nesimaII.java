import java.util.Scanner;
public class nesimaII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		int i, j;
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
			sc.close();
		}

	}

}
