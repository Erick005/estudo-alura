package br.com.alura.bytebankHerdado;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        boolean autenticou = cliente.autentica(2222);

        System.out.println(autenticou);

    }
}
