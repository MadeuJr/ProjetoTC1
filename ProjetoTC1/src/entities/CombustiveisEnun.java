package entities;

public enum CombustiveisEnun {
    ALCOOL("Alcool"),
    ETANOL("Etanol"),
    DIESEL("Diesel");

    private String tipoCombustivel;

    private CombustiveisEnun(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

}
