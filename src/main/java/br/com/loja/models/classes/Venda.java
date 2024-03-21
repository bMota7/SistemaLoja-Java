package br.com.loja.models.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private Date data;
    private List<Produtos> itens;
    private double total;

    public Venda() {
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.total = 0;
    }

    public void adiconarItem(Produtos produtos) {
        this.itens.add(produtos);
        this.total += produtos.getPrecoProduto();
    }

    public void imprimirRecibo() {
        System.out.println("\n=== Recibo de Venda ===");
        System.out.println("Data da Venda: " + data);
        System.out.println("Itens:");
        for (Produtos produto : itens) {
            System.out.println("- " + produto.getNomeProduto() + ": R$" + produto.getPrecoProduto());
        }
        System.out.println("Total: R$" + total);
        System.out.println("=======================\n");
    }
}
