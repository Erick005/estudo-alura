package br.com.alura.screenmatch.contabancaria.model;

public class Compra  implements Comparable<Compra>{
    private String descricaoProduto;
    private double valor;

    public Compra(String descricaoProduto, double valor) {
        this.descricaoProduto = descricaoProduto;
        this.valor = valor;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: Descrição: " + this.getDescricaoProduto() + "Valor da compra: " + this.getValor();
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
