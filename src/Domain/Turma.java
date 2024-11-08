package Domain;

import java.util.List;

public class Turma {

private Integer ano;
private Integer semestre;
private Integer diasSemana;
private String horarios;
private List<Avaliacao> avaliacoes;

    public Turma(Integer ano, Integer diasSemana, String horarios, Integer semestre) {
        this.ano = ano;
        this.diasSemana = diasSemana;
        this.horarios = horarios;
        this.semestre = semestre;
    }



private void abrirTurma() {
}

private void alocarProfessor() {
    
}

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(Integer diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

}


