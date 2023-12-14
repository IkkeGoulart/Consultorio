package Pacote;

public class TestePaciente {
	public static void main(String[] args) {
		// nome, sexo, peso, altura, idade
		Paciente TestePaciente1 = new Paciente("alberto camus", 'm', 60, 1.90, 50);
		Paciente TestePaciente2 = new Paciente("jean-Paul Sartre", 'M', 70, 1.80, 80);
		Paciente TestePaciente3 = new Paciente("Jean-paul SarTrE", 'm', 70, 1.80, 80);

		// getNome
		if (TestePaciente1.getNome().equals("Alberto Camus")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getNome().equals("alberto camus")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getAltura e cresce
		if (TestePaciente1.getAltura() == 1.90) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getAltura() == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		TestePaciente1.cresce(10);
		if (TestePaciente1.getAltura() == 1.90) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getAltura() == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getIdade
		if (TestePaciente1.getIdade() == 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getIdade() == 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getSexo
		if (TestePaciente1.getSexo() == 'M') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getSexo() == 'm') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// engorda, getPeso e emagrece
		TestePaciente1.engorda(10);
		if (TestePaciente1.getPeso() == 70) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getPeso() == 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		TestePaciente1.emagrece(10);
		if (TestePaciente1.getPeso() == 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getPeso() == 70) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getImc **altura = 2 metros e peso = 60kg**
		if (TestePaciente1.getImc() == 15) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getImc() == 16.62) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getPercenturalGordura
		if (TestePaciente1.getPercentualGordura() == 24.1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getPercentualGordura() == 30) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// getImcStatus
		if (TestePaciente1.getImcStatus().equals("Magreza")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (TestePaciente1.getImcStatus().equals("Obesidade")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(TestePaciente1.toString());
		// equals
		//toString

	}

}
