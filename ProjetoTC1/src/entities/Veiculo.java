package entities;

import java.time.Year;
import java.util.ArrayList;

public class Veiculo {

    private String placaLetras;
    private Integer placaNumero;
    private String placaCidade;
    private CidadesEnun placaEstado;
    private String tipoVeiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private Year anoVeiculo;
    private Integer portasVeiculo;
    private Integer numLugaresVeiculos;
    private ArrayList<CombustiveisEnun> combustiveisVeiculo = new ArrayList<CombustiveisEnun>();
    private String corVeiculo;
    private ArrayList<String> acessoriosVeiculo = new ArrayList<String>();

    public Veiculo() {
    }

    public Veiculo(String placaLetras, Integer placaNumero, String placaCidade, CidadesEnun placaEstado,
            String tipoVeiculo, String marcaVeiculo, String modeloVeiculo, Year anoVeiculo, Integer portasVeiculo,
            Integer numLugaresVeiculos, ArrayList<CombustiveisEnun> combustiveisVeiculo, String corVeiculo,
            ArrayList<String> acessoriosVeiculo) {
        this.placaLetras = placaLetras;
        this.placaNumero = placaNumero;
        this.placaCidade = placaCidade;
        this.placaEstado = placaEstado;
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

    public String getPlacaLetras() {
        return placaLetras;
    }

    public void setPlacaLetras(String placaLetras) {
        this.placaLetras = placaLetras;
    }

    public Integer getPlacaNumero() {
        return placaNumero;
    }

    public void setPlacaNumero(Integer placaNumero) {
        this.placaNumero = placaNumero;
    }

    public String getPlacaCidade() {
        return placaCidade;
    }

    public void setPlacaCidade(String placaCidade) {
        this.placaCidade = placaCidade;
    }

    public CidadesEnun getPlacaEstado() {
        return placaEstado;
    }

    public void setPlacaEstado(CidadesEnun placaEstado) {
        this.placaEstado = placaEstado;
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

    public Year getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Year anoVeiculo) {
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

    public ArrayList<CombustiveisEnun> getCombustiveisVeiculo() {
        return combustiveisVeiculo;
    }

    public void setCombustiveisVeiculo(ArrayList<CombustiveisEnun> combustiveisVeiculo) {
        this.combustiveisVeiculo = combustiveisVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public ArrayList<String> getAcessoriosVeiculo() {
        return acessoriosVeiculo;
    }

    public void setAcessoriosVeiculo(ArrayList<String> acessoriosVeiculo) {
        this.acessoriosVeiculo = acessoriosVeiculo;
    }

    @Override
    public String toString() {
        return "Marca do Veiculo: " + marcaVeiculo + System.lineSeparator() 
            + "Modelo do Veiculo: " + modeloVeiculo + System.lineSeparator() 
            + "Ano do Veiculo: " + anoVeiculo + System.lineSeparator() 
            + "Combustiveis do Veiculo: " + combustiveisVeiculo + System.lineSeparator() 
            + "Cor do Veiculo=" + corVeiculo + System.lineSeparator() 
            + "Quantidade de portas: " + portasVeiculo + System.lineSeparator() 
            + "Tipo: " + tipoVeiculo + System.lineSeparator()  
            + "Numero de Lugares:" + numLugaresVeiculos + System.lineSeparator() 
            + "Placa do Veiculo: " + placaLetras + placaNumero + " " + placaCidade+ " " +  placaEstado ;
    }

}
