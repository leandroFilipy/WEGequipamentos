import model.*;
import service.*;
import view.InterfaceUsuario;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        EstoqueService estoqueService = new EstoqueService();
    InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
    Equipamento equipamento = new Equipamento();
    MotorEletrico motorEletrico = new MotorEletrico();
    PainelControle painelControle = new PainelControle();



        try{

            while (true) {

                int decisao1 = interfaceUsuario.menu();

                estoqueService.gerenciarEstoque(interfaceUsuario, decisao1);

            }

        }catch(InputMismatchException err){
            interfaceUsuario.erroNoSistema();
            main(args);
        }







    }

}