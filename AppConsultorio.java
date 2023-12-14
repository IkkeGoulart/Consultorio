package Pacote;

import java.util.Scanner;

public class AppConsultorio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//create var and array
		Paciente pacientes[] = new Paciente[100];
		int indiceCadastro = 0;
		int indice = 0;
		double trocaPeso = 0;
		int op = 0;

		//two options to menu
		while (true) {
			if (pacientes[0] == null) {
				System.out.println("==============MENU==============");
				System.out.println("Sair---------------------------0");
				System.out.println("Cadastrar Paciente-------------1");
			} else {
				System.out.println("==============MENU==============");
				System.out.println("Sair---------------------------0");
				System.out.println("Cadastrar Paciente-------------1");
				System.out.println("Emagrecer----------------------2");
				System.out.println("Engordar-----------------------3");
				System.out.println("Valor Imc----------------------4");
				System.out.println("Valor Percentual de Gorudura---5");
				System.out.println("Infos Paciente-----------------6");
				System.out.println("Paciente Iguais----------------7");

			}
			op = teclado.nextInt();
			System.out.println();

			//create the options for menu
			if (op == 0) {
				break;
			}
			if (op == 1) {
				teclado.nextLine();
				System.out.println("Digite o NOME do paciente");
				String nome = teclado.nextLine();
				System.out.println("Digite o SEXO do paciente (M p/ Masculino e F p/ Feminino");
				char sexo = teclado.next().charAt(0);
				System.out.println("Digite a ALTURA do paciente");
				double altura = teclado.nextDouble();
				System.out.println("Digite o PESO do paciente");
				double peso = teclado.nextDouble();
				System.out.println("Digite a IDADE do paciente");
				int idade = teclado.nextInt();
				System.out.println();

				pacientes[indiceCadastro] = new Paciente(nome, sexo, peso, altura, idade);
				indiceCadastro += 1;
			}

			if (op == 2) {
				System.out.println("Digite o indice do paciente");
				indice = teclado.nextInt();
				System.out.println("Digite quanto de peso foi perdido");
				trocaPeso = teclado.nextDouble();
				pacientes[indice].emagrece(trocaPeso);
			}
			if (op == 3) {
				System.out.println("Digite o indice do paciente");
				indice = teclado.nextInt();
				System.out.println("Digite quanto de peso foi ganho");
				trocaPeso = teclado.nextDouble();
				pacientes[indice].engorda(trocaPeso);
			}
			if (op == 4) {
				System.out.println("Digite o indice do paciente");
				indice = teclado.nextInt();
				System.out.println("Imc: " + pacientes[indice].getImc());
			}
			if (op == 5) {
				System.out.println("Digite o indice do paciente");
				indice = teclado.nextInt();
				System.out.println("Percentual de Gordura:" + pacientes[indice].getPercentualGordura());
			}
			if (op == 6) {
				System.out.println("Digite o indice do paciene para as informações");
				indice = teclado.nextInt();
				System.out.println(pacientes[indice].toString());
				System.out.println();
			}
			if (op == 7) {
				boolean pacientesIguais = false;
				System.out.println("Existem pacientes iguais?");
				for (int i = 0; i < indiceCadastro; i++) {
					for (int j = i + 1; j <= (indiceCadastro - 1); j++) {
						if (pacientes[i].equals(pacientes[j])) {
							pacientesIguais = true;
							break;
						}
					}
				}
				if (pacientesIguais == true) {
					System.out.println("sim");
				} else {
					System.out.println("não");
				}
			}
		}
	}
}
