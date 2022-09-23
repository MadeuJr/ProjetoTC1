package controller.seguradoras;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Seguradora;
import repository.seguradora.SeguradoraRepository;

public class ControllerSeguradora {

    private final SeguradoraRepository repository;

    public ControllerSeguradora(SeguradoraRepository repository) {
        this.repository = repository;
    }

    Scanner sc = new Scanner(System.in);

    public void cadastrar() throws ParseException {
        Seguradora newSeguradora = new Seguradora();

        System.out.println("Insira o CNPJ da Seguradora:");
        long tempCNPJ = sc.nextLong();
        //todo retornar validação no final do projeto
//        while (Long.toString(tempCNPJ).length() != 14) {
//            System.out.println("Insira um valor com 14 caracteres");
//            tempCNPJ = sc.nextLong();
//        }
        
        System.out.println("Insira a Razão Social");
        sc.nextLine();
        String tempRazaoSocial = sc.nextLine();

        System.out.println("Insira a data de inicio no formato dd/mm/aaaaa: ");
        String tempDataInicio = sc.nextLine();
        
        System.out.println("Insira um telefone de contato:");
        long tempTelefonesContato = sc.nextLong();
        newSeguradora.addTelefoneSeguradora(tempTelefonesContato);

        sc.nextLine();
        System.out.println("Gostaria de inserir outro telefone? y/n: ");
        String respostaTelefone = sc.nextLine();
        while (!respostaTelefone.equals("n")) {
            if ("y".equals(respostaTelefone)) {
                System.out.println("Insira um telefone de contato:");
                tempTelefonesContato = sc.nextLong();
                newSeguradora.addTelefoneSeguradora(tempTelefonesContato);

                sc.nextLine();
                System.out.println("Gostaria de inserir outro telefone? y/n: ");
                respostaTelefone = sc.nextLine();
            }
        }

        System.out.println("Insira um E-mail:");
        String tempEmailContato = sc.nextLine();
        newSeguradora.addEmailSeguradora(tempEmailContato);
        System.out.println("Gostaria de inserir outro E-mail? y/n: ");
        String respostaEmail = sc.nextLine();

        while (!respostaEmail.equals("n")) {
            if ("y".equals(respostaEmail)) {
                System.out.println("Insira um E-mail:");
                tempEmailContato = sc.nextLine();
                newSeguradora.addEmailSeguradora(tempEmailContato);
                System.out.println("Gostaria de inserir outro e-mail? y/n: ");
                respostaEmail = sc.nextLine();
            }
        }

        //Cadastrando

        newSeguradora.setCNPJ(tempCNPJ);
        newSeguradora.setDataInicio(tempDataInicio);
        newSeguradora.setRazaoSocial(tempRazaoSocial);


        repository.insert(newSeguradora);
        System.out.println("\n--- Seguradora incluída ---\n");
    }
    public void atualizar() throws ParseException {

        Seguradora newSeguradora = new Seguradora();

        System.out.println("Insira o CNPJ da Seguradora que deseja alterar:");
        long tempCNPJ = sc.nextLong();
        //todo retornar validação no final do projeto
//        while (Long.toString(tempCNPJ).length() != 14) {
//            System.out.println("Insira um valor com 14 caracteres");
//            tempCNPJ = sc.nextLong();
//        }

        Seguradora one = repository.findOne(tempCNPJ);
        if(one == null){
            System.out.println("Seguradora não cadastrada");
            return;
        }

        System.out.println("Insira a Razão Social");
        sc.nextLine();
        String tempRazaoSocial = sc.nextLine();

        System.out.println("Insira a data de inicio no formato dd/mm/aaaaa: ");
        String tempDataInicio = sc.nextLine();

        System.out.println("Insira um telefone de contato:");
        long tempTelefonesContato = sc.nextLong();
        newSeguradora.addTelefoneSeguradora(tempTelefonesContato);

        sc.nextLine();
        System.out.println("Gostaria de inserir outro telefone? y/n: ");
        String respostaTelefone = sc.nextLine();
        while (!respostaTelefone.equals("n")) {
            if ("y".equals(respostaTelefone)) {
                System.out.println("Insira um telefone de contato:");
                tempTelefonesContato = sc.nextLong();
                newSeguradora.addTelefoneSeguradora(tempTelefonesContato);

                sc.nextLine();
                System.out.println("Gostaria de inserir outro telefone? y/n: ");
                respostaTelefone = sc.nextLine();
            }
        }

        System.out.println("Insira um E-mail:");
        String tempEmailContato = sc.nextLine();
        newSeguradora.addEmailSeguradora(tempEmailContato);
        System.out.println("Gostaria de inserir outro E-mail? y/n: ");
        String respostaEmail = sc.nextLine();

        while (!respostaEmail.equals("n")) {
            if ("y".equals(respostaEmail)) {
                System.out.println("Insira um E-mail:");
                tempEmailContato = sc.nextLine();
                newSeguradora.addEmailSeguradora(tempEmailContato);
                System.out.println("Gostaria de inserir outro e-mail? y/n: ");
                respostaEmail = sc.nextLine();
            }
        }

        //Cadastrando

        newSeguradora.setCNPJ(tempCNPJ);
        newSeguradora.setDataInicio(tempDataInicio);
        newSeguradora.setRazaoSocial(tempRazaoSocial);


        repository.edit(newSeguradora);
        System.out.println("\n--- Seguradora alterada ---\n");
    }

    public void deletar() {

        System.out.println("Insira o CNPJ da Seguradora que deseja alterar:");
        long tempCNPJ = sc.nextLong();
        //todo retornar validação no final do projeto
//        while (Long.toString(tempCNPJ).length() != 14) {
//            System.out.println("Insira um valor com 14 caracteres");
//            tempCNPJ = sc.nextLong();
//        }

        Seguradora one = repository.findOne(tempCNPJ);
        if(one == null){
            System.out.println("Seguradora não cadastrada");
            return;
        }
        repository.remove(tempCNPJ);
        System.out.println("\n--- Seguradora removida ---\n");
    }
    
    public void buscar() {
        System.out.println("Insira o CNPJ da Seguradora que deseja buscar:");
        long tempCNPJ = sc.nextLong();
//        while (Long.toString(tempCNPJ).length() != 14) {
//            System.out.println("Insira um valor com 14 caracteres");
//            tempCNPJ = sc.nextLong();
//        }

        Seguradora one = repository.findOne(tempCNPJ);
        if(one == null){
            System.out.println("Seguradora não cadastrada");
            return;
        }

        System.out.println(one);
    }

    public void buscarTodos() {
        ArrayList<Seguradora> all = repository.findAll();
        if(all.isEmpty()){
            System.out.println("Nenhuma seguradora registrada");
            return;
        }
        for (Seguradora seguradora : all) {
            System.out.println(seguradora+"\n");
        }
    }

}
