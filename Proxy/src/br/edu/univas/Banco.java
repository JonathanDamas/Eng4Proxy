package br.edu.univas;

public class Banco implements BancoInt{
    private int quantidadeDeUsuarios;
    private int usuariosConectados;
 
    public Banco() {
        quantidadeDeUsuarios = 50;
        usuariosConectados = 30;
    }
 
    public String getNumeroDeUsuarios() {
        return new String("Total de usu�rios: " + quantidadeDeUsuarios);
    }
 
    public String getUsuariosConectados() {
        return new String("Usu�rios conectados: " + usuariosConectados);
    }
}
