package br.com.alura.bytebankHerdado;

public class TesteSistemaInterno {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSenha(2222);

        Administrador ad = new Administrador();
        ad.setNome("Jose");
        ad.setSenha(2223);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        cliente.autentica(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(ad);
        si.autentica(cliente);
    }
}
