package br.com.loja.models.classes;

import java.util.Scanner;

public class Funcionario implements Cadastra, ImprimeDados{
    private String nomeFuncionario;
    private String funcao;

    public Funcionario(String nomeFuncionario, String funcao) {
        this.nomeFuncionario = nomeFuncionario;
        this.funcao = funcao;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void cadastra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** *** *** ***");
        System.out.println("Cadastro Funcionario\n");
        System.out.println("Nome funcionario: ");
        nomeFuncionario = sc.nextLine();
        System.out.println("Funcao: ");
        funcao = sc.nextLine();
        System.out.println("*** *** *** ***\n");

        System.out.println("CADASTRO FEITO COM SUCESSO!");
    }

    @Override
    public void imprimeDados() {
        System.out.println("\n=== === === ===");
        System.out.println("Cadastro Funcionario: ");
        System.out.println("Nome do funcionario: " + nomeFuncionario);
        System.out.println("Funcao: " + funcao);
        System.out.println("=== === === ===");
    }
}
