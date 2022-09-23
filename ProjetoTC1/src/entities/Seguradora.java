package entities;

import repository.ModelWithPK;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Seguradora extends ModelWithPK<Long> {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

    private Long CNPJ;
    private String razaoSocial;
    private Date dataInicio;
    private ArrayList<String> emailsContato = new ArrayList<>();
    private ArrayList<Long> telefonesContato = new ArrayList<>();
 
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

    public void setDataInicio(String dataInicio) throws ParseException {
        
        this.dataInicio = simpleDateFormat.parse(dataInicio);
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
        + "Data de Início: " +  simpleDateFormat.format(dataInicio) + System.lineSeparator() 
        + "E-mails: " + emailsContato + System.lineSeparator() 
        + "Telefones de Contato: " + telefonesContato;
    }

    @Override
    public Long getPK() {
        return getCNPJ();
    }
}
