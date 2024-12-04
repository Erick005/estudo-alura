package br.com.alura.bytebankHerdado;

public class Cliente implements Autentica{

    private AutenticaSenha autenticador;

    public Cliente() {
        this.autenticador = new AutenticaSenha();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
