
import java.text.ParseException;
import java.util.Scanner;

import entities.Seguradora;
import repository.ArraySaver;
import views.MenuPrincipal;



public class App {

    Scanner sc = new Scanner(System.in);
    String resposta;
    ArraySaver arraySaver = new ArraySaver();

    public static void main(String[] args) throws ParseException{
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Seguradora s1 = new Seguradora();

        s1.setCNPJ(1);
        s1.setDataInicio("10/10/2010");
        s1.setRazaoSocial("Bananinha");
        s1.addEmailSeguradora("hermenegil127@uorak.com");
        s1.addTelefoneSeguradora(123456L);

        ArraySaver.arraySeguradora.add(s1);

        menuPrincipal.selecionaOpt();
    }
}
