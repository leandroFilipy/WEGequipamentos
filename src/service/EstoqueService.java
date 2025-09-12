package service;

import model.Equipamento;
import model.PainelControle;
import view.InterfaceUsuario;
import model.MotorEletrico;

import java.util.ArrayList;


public class EstoqueService {

    ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

    public void gerenciarEstoque(InterfaceUsuario interfaceUsuario, int decisao1) {

        switch (decisao1) {
            case 1:

                int oqueCadastrar2 = interfaceUsuario.oqueCadastrar();
                if (oqueCadastrar2 == 1) {

                    String cadastrarCodigo2 = interfaceUsuario.cadastrarCodigo();
                    String cadastrarNome2 = interfaceUsuario.cadastrarNome();
                    int cadastrarQuantidade2 = interfaceUsuario.cadastrarQuantidade();
                    double cadastrarPreco2 = interfaceUsuario.cadastrarPreco();

                    Equipamento novoEquipamento = new Equipamento(cadastrarCodigo2, cadastrarNome2, cadastrarQuantidade2, cadastrarPreco2);
                    equipamentos.add(novoEquipamento);
                    interfaceUsuario.cadastradoComSucesso();

                } else if (oqueCadastrar2 == 2) {

                    String cadastrarCodigo2 = interfaceUsuario.cadastrarCodigo();
                    String cadastrarNome2 = interfaceUsuario.cadastrarNome();
                    int cadastrarQuantidade2 = interfaceUsuario.cadastrarQuantidade();
                    double cadastrarPreco2 = interfaceUsuario.cadastrarPreco();
                    double cadastrarPotencia2 = interfaceUsuario.cadastrarPotencia();

                    Equipamento novoMotorEletrico = new MotorEletrico(cadastrarCodigo2, cadastrarNome2, cadastrarQuantidade2, cadastrarPreco2, cadastrarPotencia2);
                    equipamentos.add(novoMotorEletrico);
                    interfaceUsuario.cadastradoComSucesso();

                } else if (oqueCadastrar2 == 3) {

                    String cadastrarCodigo2 = interfaceUsuario.cadastrarCodigo();
                    String cadastrarNome2 = interfaceUsuario.cadastrarNome();
                    int cadastrarQuantidade2 = interfaceUsuario.cadastrarQuantidade();
                    double cadastrarPreco2 = interfaceUsuario.cadastrarPreco();
                    String cadastrarTensao2 = interfaceUsuario.cadastrarTensao();

                    Equipamento novoPainelControle = new PainelControle(cadastrarCodigo2, cadastrarNome2, cadastrarQuantidade2, cadastrarPreco2, cadastrarTensao2);
                    equipamentos.add(novoPainelControle);
                    interfaceUsuario.cadastradoComSucesso();
                }


                break;


            case 2:

                int oqueListar2 = interfaceUsuario.oqueListar();
                if (oqueListar2 == 1) {

                    for (Equipamento show : equipamentos) {
                        if (show instanceof Equipamento equipamento) {
                            System.out.println(equipamento);
                        }
                    }
                    if (equipamentos.isEmpty()) {
                        interfaceUsuario.estoqueVazio();
                    }

                } else if (oqueListar2 == 2) {

                    for (Equipamento show : equipamentos) {
                        if (show instanceof MotorEletrico motorEletrico) {
                            System.out.println(motorEletrico);
                        }
                    }
                    if (equipamentos.isEmpty()) {
                        interfaceUsuario.estoqueVazio();
                    }

                } else if (oqueListar2 == 3) {

                    for (Equipamento show : equipamentos) {
                        if (show instanceof PainelControle painelControle) {
                            System.out.println(painelControle);
                        }
                    }
                    if (equipamentos.isEmpty()) {
                        interfaceUsuario.estoqueVazio();
                    }

                }

                break;

            case 3:

                String codigo2 = interfaceUsuario.pesquisaPorCodigo();

                for (int i = 0; i < equipamentos.size(); i++) {

                    if (equipamentos.get(i).getCodigo().equals(codigo2)) {
                        System.out.println(equipamentos.get(i));
                    }
                }

                break;
            case 4:

                String codigoRemocao = interfaceUsuario.removerPorCodigo();

                for (int i = 0; i < equipamentos.size(); i++) {

                    if (equipamentos.get(i).getCodigo().equals(codigoRemocao)) {
                        equipamentos.remove(equipamentos.get(i));
                    }
                }

                break;

            case 5:

                int oqueMovimentar2 = interfaceUsuario.oqueMovimentar();
                int quantoAdicionar2 = interfaceUsuario.adicionarQuantidade();

                if (oqueMovimentar2 == 1) {


                    String movimentarAdiciona2 = interfaceUsuario.movimentarAdiciona();
                    for (int i = 0; i < equipamentos.size(); i++) {

                        if (equipamentos.get(i).getCodigo().equals(movimentarAdiciona2)) {
                            equipamentos.get(i).setQuantidade(quantoAdicionar2);
                        }
                    }

                } else if (oqueMovimentar2 == 2) {

                    int quantoRemover2 = interfaceUsuario.removerQuantidade();
                    String codigoDiminuir = interfaceUsuario.movimentarDiminuir();
                    for (int i = 0; i < equipamentos.size(); i++) {

                        if (equipamentos.get(i).getCodigo().equals(codigoDiminuir)) {
                            equipamentos.get(i).setQuantidade(quantoRemover2);
                        }
                    }

                }

                break;

            case 6:

                int qualQuantidadeVer2 = interfaceUsuario.qualQuantidadeVer();

                if (qualQuantidadeVer2 == 1) {

                    System.out.println();
                }
                break;

            case 7:

                int opcaoRelatorio = interfaceUsuario.menuRelatorios();

                switch (opcaoRelatorio) {
                    case 1: // quantidade total
                        int total = 0;
                        for (Equipamento e : equipamentos) {
                            total += e.getQuantidade();
                        }
                        System.out.println("Quantidade total em estoque: " + total);


                        break;

                    case 8:
                        String parteNome = interfaceUsuario.nomeBuscaAvancada();
                        System.out.println("Resultados da busca por nome \"" + parteNome + ": ");

                        boolean achouNome = false;
                        for (Equipamento e : equipamentos) {
                            if (e.getNome().toLowerCase().contains(parteNome.toLowerCase())) {
                                System.out.println(e);
                                achouNome = true;
                            }
                        }
                        if (!achouNome) {
                            System.out.println("Nenhum equipamento encontrado com esse nome.");
                        }
                        break;


                    case 9:

                        double precoMin = interfaceUsuario.BuscaPrecoAvancada();
                        System.out.println("Equipamentos com preço acima de " + precoMin + ":");

                        boolean achouPreco = false;
                        for (Equipamento e : equipamentos) {
                            if (e.getPreco() > precoMin) {
                                System.out.println(e);
                                achouPreco = true;
                            }
                        }
                        if (!achouPreco) {
                            System.out.println("Nenhum equipamento encontrado acima desse preço.");
                        }

                        break;

                    case 10:

                        interfaceUsuario.saindoDoSistema();
                        break;
                }
        }


    }
}


