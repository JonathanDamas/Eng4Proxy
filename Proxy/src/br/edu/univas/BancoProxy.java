package br.edu.univas;

public class BancoProxy implements BancoInt {

	protected String usuario, senha;
	Banco Clientes = new Banco();

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		return Clientes.getNumeroDeUsuarios();
	}

	@Override
	public String getUsuariosConectados() {
		return Clientes.getUsuariosConectados();
	}

}
