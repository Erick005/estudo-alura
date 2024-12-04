package br.com.alura.screenmatch.contabancaria.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoCredito extends ContaBancaria{
    private double saldo;
    private double limite;
    private List<Compra> compras;

    public CartaoCredito(String nome, String tipoConta, double saldoInicial, int opcao) {
        super(nome, tipoConta, saldoInicial, opcao);
    }

    public CartaoCredito(double limite) {
        this.saldo = limite;
        this.limite = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void imprimeOrdenadoPorValor() {
        this.compras.sort(Comparator.comparing(Compra::getValor));
        System.out.println("Imprimindo compra do menor para maior valor: ");
    }
}
