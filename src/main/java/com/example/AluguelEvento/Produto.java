package com.example.AluguelEvento;

public class Produto {
    private String id;
    private String nome;
    private String descricao;
    private int quantidade;
    private int quantidadeDisponivel;
    private double valor;

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", valor=" + valor +
                '}';
    }

    public Produto(String id, String nome, String descricao, int quantidade, int quantidadeDisponivel, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
