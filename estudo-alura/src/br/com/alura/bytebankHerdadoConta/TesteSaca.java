package br.com.alura.bytebankHerdadoConta;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(2222, 3333);

        try {
            conta.deposita(3000);
            conta.saca(2000);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
        System.out.println(conta.getSaldo());

    }
}
