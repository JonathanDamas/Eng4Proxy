package br.edu.univas;

public class Banco implements BancoInt{
    private int quantidadeDeUsuarios;
    private int usuariosConectados;
 
    public Banco() {
        quantidadeDeUsuarios = 50;
        usuariosConectados = 30;
    }
 
    public String getNumeroDeUsuarios() {
        return new String("Total de usuários: " + quantidadeDeUsuarios);
    }
 
    public String getUsuariosConectados() {
        return new String("Usuários conectados: " + usuariosConectados);
    }
}
