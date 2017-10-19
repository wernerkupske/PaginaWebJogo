package modelo;

public class LoginDTO {

    public LoginDTO(String user, int cod) {
        this.user = user;
        this.senha = cod;
    }
    
    private String user;
    private int senha;

    public String getUser() {
        return user;
    }

    public void setUser(String user) throws Exception {
        if (!user.isEmpty()) {
            this.user = user;
        } else {
            throw new Exception("nome invalido");
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
