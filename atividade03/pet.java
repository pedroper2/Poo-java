package atividade03;

public class pet {
    private String nome;
    private String idade;
    private String raca;


    
    public pet() {
    }



    public pet(String nome, String idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
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



    public String getRaca() {
        return raca;
    }



    public void setRaca(String raca) {
        this.raca = raca;
    }



    @Override
    public String toString() {
        return "\nNome: " + nome + "\nidade: " + idade + "\nraca: " + raca;
    }

    

}
