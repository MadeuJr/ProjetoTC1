package entities;

import java.sql.Date;
import java.util.ArrayList;

public class Seguradora {

    private Long CNPJ;
    private String razaoSocial;
    private Date dataInicio;
    private ArrayList<String> emailsContato = new ArrayList<String>();
    private ArrayList<Long> telefonesContato = new ArrayList<Long>();

    public Seguradora() {
    }

    public Seguradora(
            Long cNPJ, String razaoSocial, Date dataInicio, ArrayList<String> emailsContato,
            ArrayList<Long> telefonesContato) {
        CNPJ = cNPJ;
        this.razaoSocial = razaoSocial;
        this.dataInicio = dataInicio;
        this.emailsContato = emailsContato;
        this.telefonesContato = telefonesContato;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    public void addEmailSeguradora(String novoEmailContato) {
        emailsContato.add(novoEmailContato);
    }

    public ArrayList<Long> getTelefonesContato() {
        return telefonesContato;
    }

    public void addTelefoneSeguradora(Long novoTelefoneContato) {
        telefonesContato.add(novoTelefoneContato);
    }
    
    @Override
    public String toString() {
        return "CNPJ: " + CNPJ + System.lineSeparator() 
        + "Razão Social: " + razaoSocial + System.lineSeparator() 
        + "Data de Início: " + dataInicio + System.lineSeparator() 
        + "E-mails: " + emailsContato + System.lineSeparator() 
        + "Telefones de Contato" + telefonesContato;
    }

}
