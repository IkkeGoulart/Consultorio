package Pacote;

public class Paciente {
	private String nome;
	private char sexo;
	private double altura;
	private double peso;
	private int idade;

	public Paciente(String nome, char sexo) {
		this.setNome(nome);
		this.setSexo(sexo);
	}

	public Paciente(String nome, char sexo, double peso, double altura, int idade) {
		this(nome, sexo);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setAltura(altura);
	}

	public String getNome() {
		return this.nome;
	}

	public char getSexo() {
		return this.sexo;
	}

	public double getAltura() {
		return this.altura;
	}

	public int getIdade() {
		return this.idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else {
			this.peso = 0;
		}
	}

	public void setAltura(double altura) {
		if (altura >= 0) {
			this.altura = altura;
		} else {
			this.altura = 0;
		}
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
	}

	public void setSexo(char sexo) {
		// limitando as opções de sexo
		sexo = Character.toUpperCase(sexo);
		if (sexo == 'M' || sexo == 'F') {
			this.sexo = sexo;
		} else {
			this.sexo = '\0';
		}

	}

	public void setNome(String nome) {
		//FORMATAÇÃO DO NOME//
		char[] nomeMaiusculo = nome.toCharArray();
		for (int i = 1; i < nomeMaiusculo.length; i++) {
			if (Character.isAlphabetic(nomeMaiusculo[i])) {
				nomeMaiusculo[i] = Character.toLowerCase(nomeMaiusculo[i]);
			}
			if (Character.isWhitespace(nomeMaiusculo[i - 1])) {
				nomeMaiusculo[i] = Character.toUpperCase(nomeMaiusculo[i]);
			}
			if (nomeMaiusculo[i - 1] == '-') {
				nomeMaiusculo[i] = Character.toUpperCase(nomeMaiusculo[i]);
				
			}
		}
		nomeMaiusculo[0] = Character.toUpperCase(nomeMaiusculo[0]);
		this.nome = new String(nomeMaiusculo);
	}

	public void engorda(double peso) {
		if (peso >= 0)
			this.peso = this.peso + peso;
	}

	public void emagrece(double peso) {
		if (peso >= 0)
			if ((this.peso - peso) >= 0) {
				this.peso = this.peso - peso;
			} else {
				this.peso = 0;
			}
	}

	public void cresce(int alturaCm) {
		if (altura >= 0) {
			this.altura += (alturaCm / 100.0);
		}
	}

	public double getImc() {
		return this.peso / (this.altura * this.altura);
	}

	public double getPercentualGordura() {
		if (this.sexo == 'M') {
			return (1.2 * this.getImc()) + (0.23 * this.idade) - 5.4;
		} else {
			return (1.2 * this.getImc()) + (0.23 * this.idade) - (10.8) - 5.4;
		}
	}

	public String getImcStatus() {
		if (this.getImc() < 18.5) {
			return "Magreza";
		} else if (18.5 <= this.getImc() && this.getImc() < 24.9) {
			return "Regular";
		} else if (24.9 <= this.getImc() && this.getImc() < 30) {
			return "Sobrepeso";
		} else {
			return "Obesidade";
		}
	}

	@Override
	public String toString() {
		return ("Nome: " + this.nome + "\nSexo: " + this.sexo + "\nAltura: " + this.altura + " metros" + "\nPeso: "
				+ this.peso + "kg" + "\nIdade: " + this.idade + " anos" + "\nImc: " + this.getImc()
				+ "\nPercentual de Gordura: " + this.getPercentualGordura());
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (!o.getClass().isInstance(this)) {
			return false;
		} else {
			Paciente that = (Paciente) o;
			return this.nome.equals(that.nome) && this.sexo == that.sexo && this.altura == that.altura && this.peso == that.peso && this.idade == that.idade;
		}
	}

}
