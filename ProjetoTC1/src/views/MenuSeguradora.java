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

        while (resposta == null ||!resposta.equals("6")) {
            Utills.clearConsole();

            System.out.println("""
                    Menu Seguradoras

                    1- Cadastrar Seguradora

                    2- Exibir Seguradora

                    3- Exibir todas Seguradoras

                    4- Atualizar Seguradora

                    5- Deletar Seguradora

                    6- Voltar""");
                    
            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();

            switch (resposta) {
                case "1" -> controller.cadastrar();
                case "2" -> {
                    controller.buscar();
                    System.out.println("\nPressione Enter para continuar");
                    sc.nextLine();
                }
                case "3" -> {
                    controller.buscarTodos();
                    System.out.println("\nPressione Enter para continuar");
                    sc.nextLine();
                }
                case "4" -> controller.atualizar();
                case "5" -> controller.deletar();
                case "6" -> resposta = "6";
                default -> {
                    System.out.println("\nValor inválido. Insira um valor válido. Pressione Enter para continuar");
                    sc.nextLine();
                }
            }
        }
    }
}
