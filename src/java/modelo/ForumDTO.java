package modelo;

public class ForumDTO {

    public ForumDTO() {

    }

    public ForumDTO(String nome, String mensag, String data, int id) {
        this.mensag = mensag;
        this.nome = nome;
        this.data = data;
        this.id = id;
    }

    private String mensag, nome, data;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("nome invalido");
        }
    }

    public String getMensag() {
        return mensag;
    }

    public void setMensag(String mensag) throws Exception {
        if (!mensag.isEmpty()) {
            this.mensag = mensag;
        } else {
            throw new Exception("nome invalido");
        }
    }

}
