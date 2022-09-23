package controller.veiculos;

import entities.Placa;
import entities.Veiculo;
import repository.veiculo.VeiculoRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerVeiculos {

    private final VeiculoRepository repository;

    public ControllerVeiculos(VeiculoRepository repository) {
        this.repository = repository;
    }

    Scanner sc = new Scanner(System.in);

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
        v2.setPlaca(veiculo.getPlaca());
        repository.edit(v2);
        System.out.println("\n--- Veículo atualizado ---\n");
    }

    private Veiculo formularioInserirEditar(){

        Veiculo veiculo = new Veiculo();
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
}
