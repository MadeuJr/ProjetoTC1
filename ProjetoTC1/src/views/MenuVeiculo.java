package views;

import java.util.Scanner;

public class MenuVeiculo {

    Scanner sc = new Scanner(System.in);
    String resposta;
  
    public MenuVeiculo() {
    }

    public void selecionaOpt() {

        while (resposta != "6") {
            Utills.clearConsole();

            System.out.println("Menu Veiculos" +
                    "\n\n1- Cadastrar Veiculo" +
                    "\n\n2- Exibir Veiculo" +
                    "\n\n3- Exibir todos Veiculos" +
                    "\n\n4- Atualizar Veiculo" +
                    "\n\n5- Deletar Veículo" +
                    "\n\n6- Voltar");

            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();

            switch (resposta) {

                case "1":

                    break;
                case "2":

                    break;

                case "3":

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