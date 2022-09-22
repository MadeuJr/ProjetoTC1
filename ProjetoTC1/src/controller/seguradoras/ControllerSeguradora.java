package controller.seguradoras;

import java.text.ParseException;
import java.util.Scanner;

import entities.Seguradora;

public class ControllerSeguradora {

    private Long tempCNPJ;
    private String tempRazaoSocial;
    private String tempDataInicio;
    private String tempEmailContato;
    private Long tempTelefonesContato;
    private String resposta;

    Scanner sc = new Scanner(System.in);


    
    public void Cadastrar() throws ParseException {
        Seguradora newSeguradora = new Seguradora();

        System.out.println("Insira o CNPJ da Seguradora:");
        tempCNPJ = sc.nextLong();
        while (Long.toString(tempCNPJ).length() != 14) {
            System.out.println("Insira um valor com 14 caracteres");
            tempCNPJ = sc.nextLong();
        }
        
        System.out.println("Insira a Razão Social");
        tempRazaoSocial = sc.nextLine();

        System.out.println("Insira a data de inicio no formato dd/mm/aaaaa: ");
        tempDataInicio = sc.nextLine();
        
        System.out.println("Insira um telefone de contato:");
        tempTelefonesContato = sc.nextLong();
        newSeguradora.addTelefoneSeguradora(tempTelefonesContato);
        System.out.println("Gostaria de inserir outro telefone? y/n: ");
        
        while (resposta != "n") {
            resposta = sc.nextLine();
            switch (resposta) {
                case "y":
                    System.out.println("Insira um telefone de contato:");
                    tempTelefonesContato = sc.nextLong();
                    newSeguradora.addTelefoneSeguradora(tempTelefonesContato);
                    System.out.println("Gostaria de inserir outro telefone? y/n: ");
                    break;
            }
        }

        System.out.println("Insira um E-mail:");
        tempEmailContato = sc.nextLine();
        newSeguradora.addEmailSeguradora(tempEmailContato);
        System.out.println("Gostaria de inserir outro E-mail? y/n: ");

        resposta = null;

        while (resposta != "n") {
            resposta = sc.nextLine();
            switch (resposta) {
                case "y":
                    System.out.println("Insira um telefone de contato:");
                    tempTelefonesContato = sc.nextLong();
                    newSeguradora.addTelefoneSeguradora(tempTelefonesContato);
                    System.out.println("Gostaria de inserir outro telefone? y/n: ");
                    break;
            }
        }

        //Cadastrando

        newSeguradora.setCNPJ(tempCNPJ);
        newSeguradora.setDataInicio(tempDataInicio);
        newSeguradora.setRazaoSocial(tempRazaoSocial);


    }

}
