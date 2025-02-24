public class Pessoa {
    private String nome;
    private int idade;
    private Genero Genero;
    public Pessoa() {
    }
    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        Genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Genero getGenero() {
        return Genero;
    }
    public void setGenero(Genero genero) {
        Genero = genero;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nidade: " + idade + "\nGenero: " + Genero;
    }

    

}
