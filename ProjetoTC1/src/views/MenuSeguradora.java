package views;

import java.util.Scanner;

public class MenuSeguradora {

    Scanner sc = new Scanner(System.in);

    public final static void exibeMenu() {
        System.out.println("Menu Principal" +
                "\n\n1- Cadastrar Seguradora" +
                "\n\n2- Exibir Seguradora" +
                "\n\n3- Exibir todas Seguradoras" +
                "\n\n4- Atualizar Seguradora" +
                "\n\n5- Deletar Seguradora" +
                "\n\n6- Voltar");
    }

    public final void selecionaOpt() {
        Utills.clearConsole();
        exibeMenu();
        switch (sc.nextLine()) {

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
                
                break;
                
            default:
                System.out.println("Valor inválido. Insira um valor válido");
                break;
        }
    }
}
