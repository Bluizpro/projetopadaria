import java.util.Scanner;

public class Padaria {
	private String[] paes = new String[3];
	private String[] bebidas = new String[3];

	public Padaria() {
	}

	public void Cadastrar(Scanner sc) {
		for (int i = 0; i < paes.length; i++) {
			System.out.println("Digite o tipo de pão:");
			this.paes[i] = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite a bebida");
			this.bebidas[i] = sc.nextLine();
		}
	}

	public void consultar() {
		for (int i = 0; i < this.bebidas.length; i++) {
			if (this.bebidas[i] == null) {
				System.out.println("nao existe regidtro");
				break;
			} else {

				System.out.println();
				System.out.println("pao: " + this.paes[i]);
				System.out.println("bebida: " + this.bebidas[i]);
				System.out.println();
			}

		}

	}

	public String[] getPaes() {
		return paes;
	}

	public void setPaes(String[] paes) {
		this.paes = paes;
	}

	public String[] getBebidas() {
		return bebidas;
	}

	public void setBebidas(String[] bebidas) {
		this.bebidas = bebidas;
	}

}
