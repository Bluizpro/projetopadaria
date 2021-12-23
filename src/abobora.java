import java.util.Scanner;

public class abobora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padaria padaria = new Padaria();

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println(" ====== Padaria Pao duro ========");
			System.out.println("0 - Encerrar o programa");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("fim do programa");
				break;
			case 1:
				padaria.Cadastrar(entrada);
				break;
			case 2:
				padaria.consultar();
				break;
			default:
				System.out.println("Numero invalido");
				break;

			}

		}while(opcao != 0);
	

	}

}
