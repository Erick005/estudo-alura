package br.com.alura.bytebankHerdadoConta;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
