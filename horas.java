import java.util.Scanner;

public class horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Horas (0-23) e minutos (0-59): ");
            int horas = scanner.nextInt();
            int minutos = scanner.nextInt();
            if (horas == -1) {
                break;
            }
            convertePara12Horas(horas, minutos);
        }
        scanner.close();
    }

    public static void convertePara12Horas(int horas, int minutos) {
        int horas12 = horas % 12;
        String periodo = horas < 12 ? "A.M." : "P.M.";
        if (horas == 0) {
            horas12 = 12;
        }
        System.out.printf("%d:%02d %s%n", horas12, minutos, periodo);
    }
}