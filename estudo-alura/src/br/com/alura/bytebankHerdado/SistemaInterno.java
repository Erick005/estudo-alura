package br.com.alura.bytebankHerdado;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autentica senha) {
        boolean autentica = senha.autentica(this.senha);
        if (autentica) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}
