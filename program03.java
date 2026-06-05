import java.util.Scanner;

public class program03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double x = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char b = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double c = sc.nextDouble();

        double resultado = 0;

        switch (b) {
            case '+':
                resultado = x + c;
                break;
            case '-':
                resultado = x - c;
                break;
            case '*':
                resultado = x * c;
                break;
            case '/':
                if (c == 0) {
                    System.out.println("Erro! Divisão por zero.");
                } else {
                    resultado = x / c;
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println("Resultado = " + resultado);
        sc.close();
    }
}
