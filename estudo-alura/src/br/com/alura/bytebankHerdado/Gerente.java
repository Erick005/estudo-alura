package br.com.alura.bytebankHerdado;

public class Gerente extends Funcionario implements Autentica {

    private AutenticaSenha autenticador;

    public Gerente() {
        this.autenticador = new AutenticaSenha();
    }

    public double getBonificacao() {
        System.out.println("sua bonificacao é ");
        return super.getSalario();
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
