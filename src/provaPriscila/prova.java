package provaPriscila;

public class prova {
	private String nome;
	private int dataNasc;
	private double altura;
	
	prova(){
	}
	
	prova(String nome, int dataNasc, double altura){
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public int calcularIdade() {
		return 2022 - dataNasc;
	}
	
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNasc);
		System.out.println("Altura: " + this.altura);
		System.out.println("Idade: " + this.calcularIdade());
	}
	
	
}
