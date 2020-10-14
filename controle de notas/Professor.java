package Entidade;

import java.util.Date;

public class Professor extends Pessoa{
    private Integer dataAdmissao;

    public Professor (String nome, Integer dataAdmissao) {
        setNome(nome);
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return  nome;
    }

    public Integer getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Integer dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
