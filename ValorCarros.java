package codgo;

import java.util.Scanner;

public class ValorCarros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		String carro[] = new String[3];
		float valor[] = new float[3];

		do {
			for (int i = 0; i < valor.length; i++) {
				System.out.print("\nInforme o carro: ");
				carro[i] = sc.next();
				System.out.print("\nInforme o valor: ");
				valor[i] = sc.nextFloat();
				cont++;
			}
			float maiorValor = valor[0];
			int maiorIndex = 0;

			if (cont % 3 == 0) {
				System.out.print("\nDeseja parar? 1-SIM // 2-NÃO: ");
				int parada = sc.nextInt();

				if (parada == 1) {
					for (int i = 0; i < valor.length; i++) {
						if (valor[i] > maiorValor) {
							maiorValor = valor[i];
							maiorIndex = i;

						}
					}

					System.out.println("\nO carro de maior valor é : " + carro[maiorIndex]);
					break;

				} else if (parada == 2) {

					continue;
				}

			}

		} while (true);

	}

}
