/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class RankingDTO {
    private String nome;
    private int puntuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(!nome.isEmpty()){
        this.nome = nome;
        } else{
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
