package entities;

import repository.ModelWithPK;

import java.util.ArrayList;

public class Veiculo extends ModelWithPK<Placa> {
    private Placa placa;
    private String tipoVeiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private Integer anoVeiculo;
    private Integer portasVeiculo;
    private Integer numLugaresVeiculos;
    private ArrayList<String> combustiveisVeiculo = new ArrayList<>();
    private String corVeiculo;
    private ArrayList<String> acessoriosVeiculo = new ArrayList<>();

    public Veiculo() {
    }

    public Veiculo(Placa placa, String tipoVeiculo, String marcaVeiculo, String modeloVeiculo, Integer anoVeiculo, Integer portasVeiculo,
                   Integer numLugaresVeiculos, ArrayList<String> combustiveisVeiculo, String corVeiculo,
                   ArrayList<String> acessoriosVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.portasVeiculo = portasVeiculo;
        this.numLugaresVeiculos = numLugaresVeiculos;
        this.combustiveisVeiculo = combustiveisVeiculo;
        this.corVeiculo = corVeiculo;
        this.acessoriosVeiculo = acessoriosVeiculo;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public Integer getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Integer anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public Integer getPortasVeiculo() {
        return portasVeiculo;
    }

    public void setPortasVeiculo(Integer portasVeiculo) {
        this.portasVeiculo = portasVeiculo;
    }

    public Integer getNumLugaresVeiculos() {
        return numLugaresVeiculos;
    }

    public void setNumLugaresVeiculos(Integer numLugaresVeiculos) {
        this.numLugaresVeiculos = numLugaresVeiculos;
    }

    public void addCombustiveisVeiculo(String combustiveisVeiculo) {
        this.combustiveisVeiculo.add(combustiveisVeiculo);
    }

    public ArrayList<String> getCombustiveisVeiculo() {
        return combustiveisVeiculo;
    }

    public void setCombustiveisVeiculo(ArrayList<String> combustiveisVeiculo) {
        this.combustiveisVeiculo = combustiveisVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public void addAcessorioVeiculo(String acessorio) {
        this.acessoriosVeiculo.add(acessorio);
    }

    public ArrayList<String> getAcessoriosVeiculo() {
        return acessoriosVeiculo;
    }

    public void setAcessoriosVeiculo(ArrayList<String> acessoriosVeiculo) {
        this.acessoriosVeiculo = acessoriosVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa=" + placa +
                ", tipoVeiculo='" + tipoVeiculo + '\'' +
                ", marcaVeiculo='" + marcaVeiculo + '\'' +
                ", modeloVeiculo='" + modeloVeiculo + '\'' +
                ", anoVeiculo=" + anoVeiculo +
                ", portasVeiculo=" + portasVeiculo +
                ", numLugaresVeiculos=" + numLugaresVeiculos +
                ", combustiveisVeiculo=" + combustiveisVeiculo +
                ", corVeiculo='" + corVeiculo + '\'' +
                ", acessoriosVeiculo=" + acessoriosVeiculo +
                '}';
    }

    @Override
    public Placa getPK() {
        return getPlaca();
    }
}
