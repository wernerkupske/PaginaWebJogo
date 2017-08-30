package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatica
 */
public class ForumDTO {

    public ForumDTO(){
	
    }
    
    public ForumDTO(String nome, String mensag, String data) {
	this.mensag = mensag;
	this.nome = nome;
	this.data = data;
    }

    private String mensag, nome, data;

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(!nome.isEmpty()){
        this.nome = nome;
        }else{
            throw new Exception("nome invalido");
        }
    }

    public String getMensag() {
        return mensag;
    }

    public void setMensag(String mensag) throws Exception {
        if(!mensag.isEmpty()){
        this.mensag = mensag;
        }else{
            throw new Exception("nome invalido");
        }
    }

}
