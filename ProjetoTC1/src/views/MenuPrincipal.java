package views;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner sc = new Scanner(System.in);

    public final static void exibeMenu() {
        System.out.println("Menu Principal" +
                "\n\n1- Menu Seguradoras" +
                "\n\n2- Menu Veículos" +
                "\n\n3- Sair");
    
            
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
                System.exit(0);
                break;
            default:
                break;
        }
    }

}
