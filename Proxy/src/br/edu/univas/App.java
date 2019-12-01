package br.edu.univas;

public class App {
	public static void main(String[] args) {
		
		BancoInt banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
