package entities;

import java.sql.Date;
import java.util.ArrayList;

public class Seguradora {

    private Long CNPJ;
    private String razãoSocial;
    private Date dataInicio;
    private ArrayList<String> emailsContato = new ArrayList<String>();
    private ArrayList<Long> telefonesContato = new ArrayList<Long>();

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    public String getRazãoSocial() {
        return razãoSocial;
    }

    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public ArrayList<String> getEmailContato() {
        return emailsContato;
    }

    public void setEmailContato(String novoEmailContato) {
        emailsContato.add(novoEmailContato);
    }

    public ArrayList<Long> getTelefonesContato() {
        return telefonesContato;
    }

    public void setTelefonesContato(Long novoTelefoneContato) {
        telefonesContato.add(novoTelefoneContato);
    }

}
