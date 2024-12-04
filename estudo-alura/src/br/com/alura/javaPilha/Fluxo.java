package br.com.alura.javaPilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String mensage = ex.getMessage();
            System.out.println("Mensagem " + mensage);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }
}
