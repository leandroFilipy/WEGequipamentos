package model;

public class MotorEletrico extends Equipamento{

    private double potencia;

    public MotorEletrico(){
        super();
        this.potencia = 0.0;
    }
    public MotorEletrico(String codigo, String nome, int quantidade, double preco, double potencia){

        super(codigo, nome, quantidade, preco);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String toString(){

        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nPreço: " + preco + "\nPotencia: " + potencia;
    }
}
