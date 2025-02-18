package encapsulamento;

public class Cliente {
    private String Nome;
    private String email;
    private double senha;


    
    public Cliente() {
    }



    public Cliente(String nome, String email, double senha) {
        Nome = nome;
        this.email = email;
        this.senha = senha;
    }



    public String getNome() {
        return Nome;
    }



    public void setNome(String nome) {
        Nome = nome;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public double getSenha() {
        return senha;
    }



    public void setSenha(double senha) {
        this.senha = senha;
    }



    @Override
    public String toString() {
        return "\nNome=" + Nome + ", \nemail=" + email + ", \nsenha=" + senha;
    }

    
}
