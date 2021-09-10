package models;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
    
    private String razaoSocial;
    private String nomeFantasia;
    private Date fundacao;

    public Date getFundacao() {
        return fundacao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
