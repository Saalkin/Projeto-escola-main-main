package Domain;

import java.util.List;

public class Curso {

private Integer codigo;

private String dscricao;

private List<Aluno> alunos;

    public Curso(Integer codigo, String dscricao) {
        this.codigo = codigo;
        this.dscricao = dscricao;
    }



public void cadastrar() {
    
}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDscricao() {
        return dscricao;
    }

    public void setDscricao(String dscricao) {
        this.dscricao = dscricao;
    }

}
