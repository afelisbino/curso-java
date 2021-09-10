package models;

import java.util.Date;

/**
 * PessoaFisica
 */
public class PessoaFisica extends Pessoa{

    private String nome;
    private Date nascimento;
    
    public Date getNascimento() {
        return nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}