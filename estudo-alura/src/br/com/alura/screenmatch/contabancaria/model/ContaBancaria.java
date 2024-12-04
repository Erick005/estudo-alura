package br.com.alura.screenmatch.contabancaria.model;

public class ContaBancaria {
    private String nome;
    private String tipoConta;
    private double saldoInicial;
    private int opcao;

    public ContaBancaria(String nome, String tipoConta, double saldoInicial, int opcao) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
        this.opcao = opcao;
    }

    public ContaBancaria() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
}
