package provaPriscila;

public class principal {

	public static void main(String []args) {
		System.out.println(" ");
		System.out.println("======= Primeira Pessoa =======");
		System.out.println(" ");
		
		prova p1 = new prova("João",1983,1.76);
		p1.imprimir();
		
		System.out.println(" ");
		System.out.println("======= Segunda Pessoa =======");
		System.out.println(" ");
		
		prova p2 = new prova("Carlos",1998,1.67);
		p2.imprimir();
	}
}
