package org.comp.Class;

import org.comp.utils.Utils;

public class Produto {
    //criando um contador para os produtos iniciando com 1
    private static int cont = 1;
    //variáveis
    private int id = cont;
    private String nome;
    private Double preco;
    private int quantidade;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
//construtor para utilizacao das variaveis


    public Produto(int id, String nome, Double preco) {

        this.id += cont;
        this.nome = nome;
        this.preco = preco;
        Produto.cont += 1;

    }

    public Produto(String nome, Double preco, int id) {
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
