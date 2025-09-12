package view;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner read = new Scanner(System.in);

    public int menu(){

        System.out.println("==================================================");
        System.out.println("||          Bem Vindo a WEG Versão 1.0          ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("||                Menu de Opções                ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("|| 1- Cadastrar Equipamentos                    ||");
        System.out.println("|| 2- Listar Equipamentos                       ||");
        System.out.println("|| 3- Pesquisar Equipamentos por Código         ||");
        System.out.println("|| 4- Remover Equipamentos por Código           ||");
        System.out.println("|| 5- Movimentar Estoque                        ||");
        System.out.println("|| 6- Verificar a quantidade de Equipamentos    ||");
        System.out.println("|| 7 - Relatórios de Estoque                    ||");
        System.out.println("|| 8 - Busca Avançada por Nome                  ||");
        System.out.println("|| 9 - Busca Avançada por Preço                 ||");
        System.out.println("|| 10- Sair                                      ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o que deseja: ");
        int decisao = read.nextInt();

        return decisao;
    }

    public String cadastrarCodigo(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||              Cadastrar Código                ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o código: ");
        String cadastrarCodigo = read.next();

        return cadastrarCodigo;
    }
    public String cadastrarNome(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||               Cadastrar Nome                 ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o nome: ");
        String cadastrarNome = read.next();

        return cadastrarNome;
    }
    public int cadastrarQuantidade(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Cadastrar Quantidade              ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui a quantidade: ");
        int cadastrarQuantidade = read.nextInt();

        return cadastrarQuantidade;
    }
    public double cadastrarPreco(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Cadastrar Preço                   ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o preço: ");
        double cadastrarPreco = read.nextDouble();

        return cadastrarPreco;
    }
    public int oqueCadastrar(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            O que deseja Cadastrar            ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("|| 1- Cadastrar Equipamentos                    ||");
        System.out.println("|| 2- Cadastrar Motores Elétricos               ||");
        System.out.println("|| 3- Cadastrar Painel de Controle               ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o que deseja: ");
        int oqueCadastrar = read.nextInt();

        return oqueCadastrar;
    }
    public double cadastrarPotencia(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Cadastrar Potência                ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui a potência: ");
        double cadastrarPotencia = read.nextDouble();

        return cadastrarPotencia;
    }
    public String cadastrarTensao(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Cadastrar Tensão                  ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui a tensão: ");
        String cadastrarPotencia = read.next();

        return cadastrarPotencia;
    }
    public int oqueListar(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            O que deseja Listar               ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("|| 1- Listar todos os Equipamentos              ||");
        System.out.println("|| 2- Listar Motores Elétricos                  ||");
        System.out.println("|| 3- Listar Painel de Controle                 ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o que deseja: ");
        int oqueListar = read.nextInt();

        return oqueListar;
    }
    public void cadastradoComSucesso(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||           Cadastrado com sucesso             ||");
        System.out.println("||----------------------------------------------||");
    }
    public void estoqueVazio(){

        System.err.println("||----------------------------------------------||");
        System.err.println("||                Estoque Vazio                 ||");
        System.err.println("||----------------------------------------------||");
    }
    public String pesquisaPorCodigo(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Pesquisa por Código               ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o código para pesquisa: ");

        String pesquisaPorCodigo = read.next();

        return pesquisaPorCodigo;
    }
    public String removerPorCodigo(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Remover por Código                ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o código para remoção: ");

        String removerPorCodigo = read.next();

        return removerPorCodigo;
    }
    public int oqueMovimentar(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||           O que deseja Movimentar            ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("|| 1- Adicionar unidades                        ||");
        System.out.println("|| 2- Remover unidades                          ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o que deseja: ");
        int oqueMovimentar = read.nextInt();

        return oqueMovimentar;
    }
    public String movimentarAdiciona(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Adicionar Quantidade              ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o código para a movimentação: ");

        String movimentarAdiciona = read.next();

        return movimentarAdiciona;
    }
    public String movimentarDiminuir(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||             Remover Quantidade               ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui o código para a movimentação: ");

        String movimentarDiminuir = read.next();

        return movimentarDiminuir;
    }
    public int adicionarQuantidade(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Adicionar Quantidade              ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui qual o novo número de Quantidades: ");

        int adicionarQuantidade = read.nextInt();

        return adicionarQuantidade;
    }
    public int removerQuantidade(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||            Remover Quantidade                ||");
        System.out.println("||----------------------------------------------||");
        System.out.print("||Insira aqui qual o novo número de Quantidades: ");

        int removerQuantidade = read.nextInt();

        return removerQuantidade;
    }
    public void erroNoSistema(){

        System.err.println("||----------------------------------------------||");
        System.err.println("||   Houve um erro na execução do nosso Sistema  ||");
        System.err.println("||----------------------------------------------||");

    }
    public void saindoDoSistema(){

        System.err.println("||----------------------------------------------||");
        System.err.println("||              Saindo do Sistema               ||");
        System.err.println("||----------------------------------------------||");

    }
    public int qualQuantidadeVer(){

        System.out.println("||----------------------------------------------||");
        System.out.println("||   Do que voce quer verificar a quantidade?   ||");
        System.out.println("||----------------------------------------------||");
        System.out.println("|| 1- Ver quantidade de Todos os equipamentos   ||");
        System.out.println("|| 2- Ver quantidade de Motores Elétricos       ||");
        System.out.println("|| 3- Ver quantidade de Painel de Controle      ||");
        System.out.print("||Insira aqui oque você deseja ver: ");

        int qualQuantidadeVer = read.nextInt();

        return qualQuantidadeVer;
    }
    public int menuRelatorios() {
        System.out.println("||----------------------------------------------||");
        System.out.println("||             Relatórios de Estoque            || ");
        System.out.println("|| 1 - Quantidade total em estoque              ||");
        System.out.println("|| 2 - Equipamento com maior preço              ||");
        System.out.println("|| 3 - Equipamento com maior quantidade         ||");
        System.out.println("|| 4 - Equipamentos com estoque baixo           ||");
        System.out.print("Escolha uma opção: ");
        return read.nextInt();
    }
    public String nomeBuscaAvancada() {
        System.out.println("||----------------------------------------------||");
        System.out.println("||             Relatórios de Estoque            || ");
        System.out.println("|| 1 - Quantidade total em estoque              ||");
        System.out.println("|| 2 - Equipamento com maior preço              ||");
        System.out.println("|| 3 - Equipamento com maior quantidade         ||");
        System.out.println("|| 4 - Equipamentos com estoque baixo           ||");
        System.out.print("Escolha uma opção: ");
        String nomeBuscaAvancada = read.next();

        return nomeBuscaAvancada;
    }
    public double BuscaPrecoAvancada() {
        System.out.println("||----------------------------------------------||");
        System.out.println("||             Relatórios de Estoque            || ");
        System.out.println("|| 1 - Quantidade total em estoque              ||");
        System.out.println("|| 2 - Equipamento com maior preço              ||");
        System.out.println("|| 3 - Equipamento com maior quantidade         ||");
        System.out.println("|| 4 - Equipamentos com estoque baixo           ||");
        System.out.print("Escolha uma opção: ");
        double BuscaPrecoAvancada = read.nextDouble();

        return BuscaPrecoAvancada;
    }

}
