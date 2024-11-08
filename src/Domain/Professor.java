package Domain;

public class Professor extends Pessoa{

private String titulacaoMaxima;

    public Professor(String titulacaoMaxima, String endereco, String nome, String telefone) {
        super(endereco, nome, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
    }



public void cadastrar(){

}

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
}