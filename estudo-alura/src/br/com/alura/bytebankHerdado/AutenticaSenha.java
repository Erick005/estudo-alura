package br.com.alura.bytebankHerdado;

public class AutenticaSenha {

    private int senha = 2222;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
