package Atividade;

public class Clienteatividade {
    String nome;
    String idade;
    String cpf;
    String endereco;
    String telefone;

    
    public Clienteatividade() {
    }


    public Clienteatividade(String nome, String idade, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
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


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Clienteatividade [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", endereco=" + endereco
                + ", telefone=" + telefone + "]";
    }

    
}
