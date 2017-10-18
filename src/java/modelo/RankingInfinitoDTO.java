package modelo;

public class RankingInfinitoDTO {

    private String nome;

    public String getNome() {
        return nome;
    }

    public RankingInfinitoDTO(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("nome invalido");
        }
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    private int pontuacao;
}
