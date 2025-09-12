package model;

public class PainelControle extends Equipamento{

    private String tensao;

    public PainelControle(){
        super();
        this.tensao="";
    }

    public PainelControle(String codigo, String nome, int quantidade, double preco, String tensao){

        super(codigo, nome,quantidade, preco);
        this.tensao=tensao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String toString(){

        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nPreço: " + preco + "\nTensao: " + tensao;
    }
}
