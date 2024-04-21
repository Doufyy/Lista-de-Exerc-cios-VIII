import java.util.Scanner;
import java.util.Locale;
public class imposto {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o valor do item: ");
        double custo = sc.nextDouble();
        double taxaImposto = 0.08;
        
        System.out.println("Custo original: " + custo);
        System.out.println("Taxa de imposto: " + taxaImposto * 100 + "%");
        System.out.printf("Custo com imposto: %.2f", somaImposto(custo, taxaImposto));
    }

    public static double somaImposto(double custo, double taxaImposto) {
        return custo + (custo * taxaImposto);
    }
}