package AprendendoMais_sobre_java;

public class Usuario {
    private String nomeCompleto = "Fabiano Alves Santos";
    private String telefone = "(35) 998985204";
    protected  String senha = "fas090100";
    int idade = 39;
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
