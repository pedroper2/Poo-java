package Atividade04;

public class Funcionario {
    private String codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria ContaBancaria;

    
    public Funcionario() {
    }


    public Funcionario(String codigo, String nome, String endereco, String telefone, String email,
            Atividade04.ContaBancaria contaBancaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        ContaBancaria = contaBancaria;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public ContaBancaria getContaBancaria() {
        return ContaBancaria;
    }


    public void setContaBancaria(ContaBancaria contaBancaria) {
        ContaBancaria = contaBancaria;
    }


    @Override
    public String toString() {
        return "\nCodigo: " + codigo + "\nNome: " + nome + "\nendereco: " + endereco + "\ntelefone: " + telefone
                + "\nemail: " + email + "\nContaBancaria: " + ContaBancaria;
    }
    

}
