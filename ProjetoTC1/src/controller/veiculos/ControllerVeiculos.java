package controller.veiculos;

import entities.Placa;
import entities.Seguradora;
import entities.Veiculo;
import repository.seguradora.SeguradoraRepository;
import repository.veiculo.VeiculoRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerVeiculos {

    private final VeiculoRepository repository;
    private final SeguradoraRepository seguradoraRepository;

    Scanner sc = new Scanner(System.in);


    public ControllerVeiculos(VeiculoRepository repository, SeguradoraRepository seguradoraRepository) {
        this.repository = repository;
        this.seguradoraRepository = seguradoraRepository;
    }

    public void inserir(){
        System.out.println("Informe as letras da placa: ");
        String letrasPlaca = sc.nextLine();

        System.out.println("Informe os numeros da placa: ");
        int numerosPlaca = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe a cidade da placa: ");
        String cidadePlaca = sc.nextLine();

        System.out.println("Informe o estado da placa: ");
        String estadoPlaca = sc.nextLine();

        Placa p = new Placa(letrasPlaca, numerosPlaca, cidadePlaca, estadoPlaca);
        Veiculo veiculo = formularioInserirEditar();
        if(veiculo == null) return;
        veiculo.setPlaca(p);

        repository.insert(veiculo);
        System.out.println("\n--- Veículo inserido ---\n");
    }

    public void atualizar(){
        System.out.println("Para buscar um veiculo:");
        Veiculo veiculo = buscarPorPlaca();
        if(veiculo == null){
            System.out.println("Veículo não encontrado");
            return;
        }
        Veiculo v2 = formularioInserirEditar();
        if(v2 == null) return;
        v2.setPlaca(veiculo.getPlaca());
        repository.edit(v2);
        System.out.println("\n--- Veículo atualizado ---\n");
    }

    private Veiculo formularioInserirEditar(){
        Veiculo veiculo = new Veiculo();
        Seguradora seguradora = buscarSeguradora();
        if(seguradora == null){
            System.out.println("Seguradora não cadastrada");
            return null;
        }
        veiculo.setSeguradora(seguradora);


        System.out.println("Informe o tipo do veiculo: ");
        String tipo = sc.nextLine();
        veiculo.setTipoVeiculo(tipo);

        System.out.println("Informe a marca do veiculo: ");
        String marca = sc.nextLine();
        veiculo.setMarcaVeiculo(marca);

        System.out.println("Informe o modelo do veiculo: ");
        String modelo = sc.nextLine();
        veiculo.setModeloVeiculo(modelo);

        System.out.println("Informe o ano do veiculo: ");
        int ano = sc.nextInt();
        sc.nextLine();
        veiculo.setAnoVeiculo(ano);


        System.out.println("Informe a quantidade de portas do veiculo: ");
        int portas = sc.nextInt();
        sc.nextLine();
        veiculo.setPortasVeiculo(portas);

        System.out.println("Informe a quantidade de lugares do veiculo: ");
        int lugares = sc.nextInt();
        sc.nextLine();
        veiculo.setNumLugaresVeiculos(lugares);

        System.out.println("Informe a cor do veiculo: ");
        String cor = sc.nextLine();
        veiculo.setCorVeiculo(cor);

        System.out.println("Informe o combustivel do veiculo: ");
        String combustivel = sc.nextLine();
        veiculo.addCombustiveisVeiculo(combustivel);

        System.out.println("Deseja informar outro combustivel? y/n ");
        String informarCombustivel = sc.nextLine();

        if(informarCombustivel.equals("y")){
            while(informarCombustivel.equals("y")){
                System.out.println("Informe o combustivel do veiculo: ");
                 combustivel = sc.nextLine();
                veiculo.addCombustiveisVeiculo(combustivel);
                System.out.println("Deseja informar outro combustivel? y/n ");
                informarCombustivel = sc.nextLine();
            }
        }


        System.out.println("Informe o acessorio do veiculo: ");
        String acessorio = sc.nextLine();
        veiculo.addAcessorioVeiculo(acessorio);

        System.out.println("Deseja informar outro acessorio? y/n ");
        String informarAcessorio = sc.nextLine();

        if(informarAcessorio.equals("y")){
            while(informarAcessorio.equals("y")){
                System.out.println("Informe o acessorio do veiculo: ");
                acessorio = sc.nextLine();
                veiculo.addAcessorioVeiculo(acessorio);
                System.out.println("Deseja informar outro acessorio? y/n ");
                informarAcessorio = sc.nextLine();
            }
        }
        return veiculo;
    }


    public void deletar(){
        Veiculo veiculo = buscarPorPlaca();
        if(veiculo == null){
            System.out.println("Veículo não encontrado");
            return;
        }
        repository.remove(veiculo.getPlaca());
        System.out.println("\n--- Veículo removido ---\n");
    }

    public void buscar(){
        System.out.println("Para buscar um veiculo");
        Veiculo veiculo = buscarPorPlaca();
        if(veiculo == null){
            System.out.println("Veículo não encontrado");
            return;
        }
        System.out.println(veiculo);
    }
    private Veiculo buscarPorPlaca(){
        System.out.println("Informe as letras da placa: ");
        String letrasPlaca = sc.nextLine();

        System.out.println("Informe os numeros da placa: ");
        int numerosPlaca = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe a cidade da placa: ");
        String cidadePlaca = sc.nextLine();

        System.out.println("Informe o estado da placa: ");
        String estadoPlaca = sc.nextLine();

        return repository.findOne(new Placa(letrasPlaca, numerosPlaca, cidadePlaca, estadoPlaca));
    }

    public void buscarTodos(){
        ArrayList<Veiculo> all = repository.findAll();
        if(all.isEmpty()){
            System.out.println("Nenhuma seguradora registrada");
            return;
        }
        for (Veiculo veiculo : all) {
            System.out.println(veiculo+"\n");
        }
    }

    private Seguradora buscarSeguradora(){

        System.out.println("Insira o CNPJ da seguradora:");
        long tempCNPJ = sc.nextLong();
        sc.nextLine();
        while (Long.toString(tempCNPJ).length() != 14) {
            System.out.println("Insira um valor com 14 caracteres");
            tempCNPJ = sc.nextLong();
        }

        return seguradoraRepository.findOne(tempCNPJ);
    }
}
