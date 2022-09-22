

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;

import entities.Seguradora;
import entities.Veiculo;
import views.MenuPrincipal;
import views.Utills;

public class App {

    ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
    ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    public static void main(String[] args) throws ParseException {
        MenuPrincipal.exibeMenu();
        Seguradora s1 = new Seguradora();

    
        s1.setCNPJ(1);
        s1.setDataInicio("10/10/2010");
        s1.setRazaoSocial("Bananinha");
        s1.addEmailSeguradora("hermenegil127@uorak.com");
        s1.addTelefoneSeguradora(123456L);
        Utills.clearConsole();
        System.out.println(s1);

        
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
