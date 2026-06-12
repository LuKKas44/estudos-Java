import java.util.Scanner;

public class program {
	public void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			 System.out.println("Senha inválida");
			 System.out.print("Digite a senha novamente: ");
			 senha = sc.nextInt();
		}
			System.out.print("Senha válida");
			sc.close();
	}
}
