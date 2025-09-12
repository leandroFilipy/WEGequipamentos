package model;

public class Equipamento {

    protected String codigo;
    protected String nome;
    protected int quantidade;
    protected double preco;
    static int quantidadeTotal;


    public Equipamento() {
        this.codigo = "";
        this.nome = "";
        this.quantidade = 0;
        this.preco = 0.0;
    }

    public Equipamento(String codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        quantidadeTotal+= quantidadeTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){

        return "Codigo: " + codigo + "\nNome: "+ nome + "\nQuantidade: " + quantidade + "\nPreco: " + preco;
    }
}
