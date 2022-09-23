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

        while (resposta == null || !resposta.equals("3")) {
            Utills.clearConsole();

            System.out.println("""
                    Menu Principal

                    1- Menu Seguradoras

                    2- Menu Veículos

                    3- Sair""");

            System.out.print("\nSelecione uma opção: ");
            resposta = sc.nextLine();
            switch (resposta) {
                case "1" -> {
                    MenuSeguradora mnSeguradora = new MenuSeguradora(repositorySeguradora);
                    mnSeguradora.selecionaOpt();
                }
                case "2" -> {
                    MenuVeiculo mnVeiculo = new MenuVeiculo(repositoryVeiculo, repositorySeguradora);
                    mnVeiculo.selecionaOpt();
                }
                case "3" -> System.exit(0);
                default -> {
                    System.out.println("\nValor inválido. Insira um valor válido. Pressione Enter para continuar");
                    sc.nextLine();
                }
            }
        }

    }

}
