package br.com.alura.bytebankHerdadoConta;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double sacar = valor + 0.2;
        super.saca(sacar);
    }
}
