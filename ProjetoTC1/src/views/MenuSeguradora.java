package views;

import java.text.ParseException;
import java.util.Scanner;

import controller.seguradoras.ControllerSeguradora;


public class MenuSeguradora {

    Scanner sc = new Scanner(System.in);
    String resposta; 


    ControllerSeguradora controller = new ControllerSeguradora();

    public MenuSeguradora() {
    }

    public void selecionaOpt() throws ParseException {

        while (resposta != "6") {
            Utills.clearConsole();

            System.out.println("Menu Seguradoras" +
                    "\n\n1- Cadastrar Seguradora" +
                    "\n\n2- Exibir Seguradora" +
                    "\n\n3- Exibir todas Seguradoras" +
                    "\n\n4- Atualizar Seguradora" +
                    "\n\n5- Deletar Seguradora" +
                    "\n\n6- Voltar");
                    
            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();

            switch (resposta) {

                case "1":
                    controller.cadastrar();
                    break;
                case "2":

                    break;

                case "3":
                    controller.buscarTodos();

                    System.out.println("\nPressione Enter para continuar");
                    sc.nextLine();
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    resposta = "6";

                    break;
                default:
                    System.out.println("\nValor inválido. Insira um valor válido. Pressione Enter para continuar");
                    sc.nextLine();
                    break;
            }
        }
    }
}
