package Domain;

import java.util.List;

public class Aluno extends Pessoa {

private String matricula;
private String situacao;
private Curso curso;
private List<Avaliacao> avaliacoes;

    public Aluno(Curso curso, String matricula, String situacao) {
        this.curso = curso;
        this.matricula = matricula;
        this.situacao = situacao;
    }

    

public void matricularCurso() {

}

public void trancar() {

}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
