package br.com.loja.models.principal;

import br.com.loja.models.classes.Funcionario;
import br.com.loja.models.classes.Produtos;
import br.com.loja.models.classes.Venda;

import java.util.Scanner;

public class SistemaLoja {
      public static void main(String[] args) {
        boolean novoCadastro = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja iniciar um novo cadastro? (s/n)");
        String resposta = sc.nextLine();
        novoCadastro = resposta.equals("s");

        if (novoCadastro) {
            System.out.println("Deseja cadastrar produto ou funcionario ou realizar uma venda? (p/f/v)");
            String respostaCadastro = sc.nextLine();

            if (respostaCadastro.equals("p")) {
                Produtos produtos = new Produtos("", "", 0);
                produtos.cadastra();
                produtos.imprimeDados();
            } else if (respostaCadastro.equals("f")) {
                Funcionario funcionario = new Funcionario("", "");
                funcionario.cadastra();
                funcionario.imprimeDados();
            } else if(respostaCadastro.equals("v")){
                Venda venda = new Venda();
                boolean adicionarProdutos = true;
                while (adicionarProdutos) {
                    System.out.println("Digite o nome do produto a ser vendido (ou 'f' para encerrar a venda): ");
                    String nomeProduto = sc.nextLine();
                    if (nomeProduto.equals("f")) {
                        adicionarProdutos = false;
                    } else {
                        System.out.println("Digite a descricaodo produto: ");
                        String descricaoProduto = sc.nextLine();
                        System.out.println("Digite o preoco do produto: ");
                        double precoProduto = sc.nextDouble();
                        sc.nextLine();
                        Produtos produtos = new Produtos(nomeProduto, descricaoProduto, precoProduto);
                        venda.adiconarItem(produtos);
                    }
                }

                venda.imprimirRecibo();
            }else {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
