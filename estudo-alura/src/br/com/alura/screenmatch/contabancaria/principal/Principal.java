package br.com.alura.screenmatch.contabancaria.principal;

import br.com.alura.screenmatch.contabancaria.model.CartaoCredito;
import br.com.alura.screenmatch.contabancaria.model.Compra;
import br.com.alura.screenmatch.contabancaria.model.ContaBancaria;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        ContaBancaria contaBancaria = new ContaBancaria("Jacqueline Oliveira", "Corrente", 2500.00, 0);
//
//        System.out.println(String.format("""
//                ************************
//                \nNome do cliente: %s
//                Tipo da conta: %s
//                Saldo da conta: %.2f reais
//                \n************************
//                """, contaBancaria.getNome(), contaBancaria.getTipoConta(), contaBancaria.getSaldoInicial()));
//
//        String menu = String.format("""
//                \nEscolha a opção desejada %s
//                1- Consultar saldos
//                2- Depositar valor
//                3- Transferir valor
//                4- Sair
//                """, contaBancaria.getNome());
//
//        Scanner dados = new Scanner(System.in);
//
//        while (contaBancaria.getOpcao() != 4) {
//            System.out.println(menu);
//            contaBancaria.setOpcao(dados.nextInt());
//            if (contaBancaria.getOpcao() == 1){
//                System.out.println("Seu Saldo é de: " + contaBancaria.getSaldoInicial());
//            } else if (contaBancaria.getOpcao() == 2) {
//                System.out.println("Digite o valor que deseja depositar: ");
//                contaBancaria.setSaldoInicial(contaBancaria.getSaldoInicial() + dados.nextInt());
//                System.out.println("Novo saldo: " + contaBancaria.getSaldoInicial());
//            } else if (contaBancaria.getOpcao() == 3) {
//                System.out.println("Digite o valor que deseja transferir: ");
//                double recebe = contaBancaria.getSaldoInicial() - dados.nextInt();
//                contaBancaria.setSaldoInicial(recebe);
//                System.out.println(String.format("""
//                        \nValor enviado com sucesso!
//                        Seu saldo bacario é de: %.2f
//                        """, contaBancaria.getSaldoInicial()));
//            } else if(contaBancaria.getOpcao() != 4) {
//                System.out.println("Opção não encontrada! por favor digite a opção desejada.");
//            }
//        }
//        dados.close();

        Scanner respostaCartao = new Scanner(System.in);

        System.out.println("Informe o limite do cartão:");
        double novoLimite = respostaCartao.nextDouble();
        CartaoCredito credito = new CartaoCredito(novoLimite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Informe o nome do produto:");
            String nomeProduto = respostaCartao.next();

            System.out.println("Informe o valor do produto:");
            double valorDoProduto = respostaCartao.nextDouble();

            Compra compra = new Compra(nomeProduto, valorDoProduto);

            credito.lancaCompra(compra);

            System.out.println("Informe 0 para encerrar ou 1 para nova compra!");
            sair = respostaCartao.nextInt();
        }

        Collections.sort(credito.getCompras());

        System.out.println("***** Compras Realizadas *****");
        for (Compra compra : credito.getCompras()) {
            System.out.println(compra.getDescricaoProduto() + " - " + compra.getValor());
        }
        System.out.println("**********");

        System.out.println("Saldo do cartão: " + credito.getSaldo());
        respostaCartao.close();
    }
}
