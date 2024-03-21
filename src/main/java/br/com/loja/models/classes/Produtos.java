package br.com.loja.models.classes;

import java.util.Scanner;

public class Produtos implements Cadastra, ImprimeDados{
    private String nomeProduto;
    private String descricao;
    private double precoProduto;

    public Produtos(String nomeProduto, String descricao, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public void cadastra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** *** *** ***");
        System.out.println("Cadastro Produtos\n");
        System.out.println("Nome produto: ");
        nomeProduto = sc.nextLine();
        System.out.println("Descricao do produto: ");
        descricao = sc.nextLine();
        System.out.println("Preco do produto: ");

        boolean precoValido = false;
        do {
            System.out.println("Preco do prouto: ");
            if (sc.hasNextDouble()) {
                precoProduto = sc.nextDouble();
                precoValido = true;
            } else {
                System.out.println("Preco invalido! Insira um numero valido.");
                sc.next();
            }
        } while (!precoValido);

        System.out.println("*** *** *** ***\n");
        System.out.println("CADASTRO FEITO COM SUCESSO!");
    }

    @Override
    public void imprimeDados() {
        System.out.println("\n=== === === ===");
        System.out.println("Produto cadastrado\n");
        System.out.println("Nome produto: " + nomeProduto);
        System.out.println("Descricao produto: " + descricao);
        System.out.println("Preco produto: " + precoProduto);
        System.out.println("=== === === ===");
    }
}
