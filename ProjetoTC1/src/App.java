

import java.util.ArrayList;

import entities.Seguradora;
import entities.Veiculo;

public class App {

    ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
    ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    public static void main(String[] args) {

    }

    public void addListaSeguradora(Seguradora novaSeguradora) {
        boolean objectFound = false;
        if (listaSeguradora.size() == 0) {
            listaSeguradora.add(novaSeguradora);
        } else {
            for (Seguradora seg : listaSeguradora) {
                if (seg.getCNPJ() == novaSeguradora.getCNPJ()) {
                    objectFound = true;
                }
            }

            if (objectFound = false) {
                listaSeguradora.add(novaSeguradora);
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
                    break;
                }
            }
            if (objectFound = false) {
                listaVeiculos.add(novoVeiculo);
            }
        }
    }
}
