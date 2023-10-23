public class Pessoa {
    private String nome;
    private Pessoa pai;

    public Pessoa(String nome, Pessoa pai) {
        this.pai = pai;
        this.nome = nome;

    }

    public Pessoa(String nome) {
        this.pai = null;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa descobrirPai(Pessoa pessoa) {
        pessoa.getPai();

        return pessoa;
    }
}
