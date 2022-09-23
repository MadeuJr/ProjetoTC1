package views;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Seguradora;
import entities.Veiculo;
import repository.seguradora.SeguradoraRepository;
import repository.veiculo.VeiculoRepository;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);
    String resposta;

    private final SeguradoraRepository repositorySeguradora = new SeguradoraRepository();
    private final VeiculoRepository repositoryVeiculo = new VeiculoRepository();

    public MenuPrincipal() {
    }

    public void selecionaOpt() throws ParseException {

        while (resposta != "3") {
            Utills.clearConsole();

            System.out.println("Menu Principal" +
                    "\n\n1- Menu Seguradoras" +
                    "\n\n2- Menu Veículos" +
                    "\n\n3- Sair");

            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();
            switch (resposta) {

                case "1":
                    MenuSeguradora mnSeguradora = new MenuSeguradora(repositorySeguradora);
                    mnSeguradora.selecionaOpt();
                    break;
                case "2":
                    MenuVeiculo mnVeiculo = new MenuVeiculo(repositoryVeiculo);
                    mnVeiculo.selecionaOpt();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nValor inválido. Insira um valor válido. Pressione Enter para continuar");
                    sc.nextLine();
                    break;
            }
        }

    }

}
