package entities;

import java.util.Objects;

public class Placa {
    private String letras;
    private int numeros;
    private String cidade;
    private String estado;

    public Placa(String letras, int numeros, String cidade, String estado) {
        this.letras = letras;
        this.numeros = numeros;
        this.cidade = cidade;
        this.estado = estado;
    }


    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Placa)) return false;
        Placa placa = (Placa) o;
        return getNumeros() == placa.getNumeros() &&
                getLetras().equals(placa.getLetras()) &&
                getCidade().equals(placa.getCidade()) &&
                getEstado().equals(placa.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLetras(), getNumeros(), getCidade(), getEstado());
    }

    public String getAsKey(){
        return toString();
    }

    @Override
    public String toString() {
        return "Placa: " + letras + numeros + " "+ cidade + " " + estado;
    }
}
