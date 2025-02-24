public class Cliente {
    private String nome;
    private String idade;
    private Endereco Endereco;
    public Cliente() {
    }
  

    public Cliente(String nome, String idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        Endereco = endereco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdade() {
        return idade;
    }


    public void setIdade(String idade) {
        this.idade = idade;
    }


    public Endereco getEndereco() {
        return Endereco;
    }


    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }


    @Override
    public String toString() {
        return "\nNome: " + nome + "\nidade: " + idade + "\nEndereco: " + Endereco;
    }

    

}
