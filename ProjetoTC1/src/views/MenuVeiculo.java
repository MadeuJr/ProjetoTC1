package views;

import java.util.Scanner;

import controller.veiculos.ControllerVeiculos;
import repository.veiculo.VeiculoRepository;

public class MenuVeiculo {

    Scanner sc = new Scanner(System.in);
    String resposta;
    private final ControllerVeiculos controller;
  
    public MenuVeiculo(VeiculoRepository repositoryVeiculo) {
        controller = new ControllerVeiculos(repositoryVeiculo);
    }

    public void selecionaOpt() {

        while (resposta == null || !resposta.equals("6")) {
            Utills.clearConsole();

            System.out.println("""
                    Menu Veiculos

                    1- Cadastrar Veiculo

                    2- Exibir Veiculo

                    3- Exibir todos Veiculos

                    4- Atualizar Veiculo

                    5- Deletar Veículo

                    6- Voltar""");

            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();

            switch (resposta) {
                case "1" -> controller.inserir();
                case "2" -> controller.buscar();
                case "3" -> controller.buscarTodos();
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