import java.util.Scanner;

public class soma3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] val = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			val[i] = sc.nextInt();
		}
		int soma = somarTresNumeros(val[0], val[1], val[2]);
		System.out.println("A soma dos três números é: " + soma);
	}
	
	public static int somarTresNumeros(int a, int b, int c) {
		return a + b + c;
	}
}
