package Domain;

import java.util.List;

public class Disciplina {

private Integer codigo;
private String descricao;
private Integer cargaHoraria;
private String ementa;
private String bibliografia;
private List<Disciplina> preRequisitos;

public Disciplina(Integer codigo, String descricao, Integer cargaHoraria, String ementa, String bibliografia,
        List<Disciplina> preRequisitos) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
    this.ementa = ementa;
    this.bibliografia = bibliografia;
    this.preRequisitos = preRequisitos;
}



public void cadastrar() {

}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

}
