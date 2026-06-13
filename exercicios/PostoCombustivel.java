import java.util.Scanner;

public class program {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("Digite o tipo de combustível:");
		System.out.println("1 - Álcool | 2 - Gasolina | 3 - Diesel | 4 - Encerrar");

		int tipo = sc.nextInt();

		while (tipo != 4) {
		    switch (tipo) {
		        case 1: alcool++;   break;  
		        case 2: gasolina++; break; // O ++ é um atalho para somar 1 ao valor atual da variável.
		        case 3: diesel++;   break;  
		        default:
		            System.out.println("Opção inválida! Use 1, 2, 3 ou 4.");
		    }
		    tipo = sc.nextInt();
		}

		System.out.println("\nMUITO OBRIGADO");
		System.out.println("Álcool:    " + alcool);
		System.out.println("Gasolina:  " + gasolina);
		System.out.println("Diesel:    " + diesel);
		System.out.println("Total:     " + (alcool + gasolina + diesel));

		sc.close();
	}
}
