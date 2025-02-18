package atividade03;

public class Cliente {
    private String nome;
    private String idade;
    private pet pet;
    
    
    public Cliente() {
    }

    public Cliente(String nome, String idade, pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public pet getPet() {
        return pet;
    }

    public void setPet(pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + " \nidade: " + idade + "\npet: " + pet;
    } 


    
}
