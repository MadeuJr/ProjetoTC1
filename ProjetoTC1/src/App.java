

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Seguradora;
import entities.Veiculo;
import views.MenuPrincipal;

public class App {

    ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
    ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
    Scanner sc = new Scanner(System.in);

    

    public static void main(String[] args) throws ParseException {
        MenuPrincipal mnPrincipal = new MenuPrincipal();    
        mnPrincipal.selecionaOpt();

    }

    public void addListaSeguradora(Seguradora novaSeguradora) {
        boolean objectFound = false;
        if (listaSeguradora.size() == 0) {
            listaSeguradora.add(novaSeguradora);
        } else {
            for (Seguradora seg : listaSeguradora) {
                if (seg.getCNPJ() == novaSeguradora.getCNPJ()) {
                    objectFound = true;
                    System.out.println("CNPJ de seguradora já cadastrada");
                    System.out.println("Pressione Enter para continuar");
                    sc.nextLine();
                    break;
                }
            }

            if (objectFound = false) {
                listaSeguradora.add(novaSeguradora);
                System.out.println("Seguradora cadastrada");
                System.out.println("Pressione Enter para continuar");
                sc.nextLine();
            }

        }
    }

    public void addListaVeiculos(Veiculo novoVeiculo) {
        boolean objectFound = false;
        if (listaVeiculos.size() == 0) {
            listaVeiculos.add(novoVeiculo);
        } else {
            for (Veiculo veic : listaVeiculos) {
                if (veic.getPlacaNumero() == novoVeiculo.getPlacaNumero() &&
                        veic.getPlacaLetras() == novoVeiculo.getPlacaLetras() &&
                        veic.getPlacaCidade() == novoVeiculo.getPlacaCidade() &&
                        veic.getPlacaEstado() == novoVeiculo.getPlacaEstado()) {
                    objectFound = true;
                    System.out.println("Veiculo Semelhante já cadastrado");
                    System.out.println("Pressione Enter para continuar");
                    sc.nextLine();
                    break;

                }
            }
            if (objectFound = false) {
                listaVeiculos.add(novoVeiculo);
                System.out.println("Veiculo Cadastrado");
                System.out.println("Pressione Enter para continuar");
                sc.nextLine();
            }
        }
    }
}
