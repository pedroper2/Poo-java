package Atividade;



public class Veiculo {
    String placa;
    String cor;
    String numero_passageiros;
    String capacidade_tanque;
    String velocidade_maxima;
    String consumo_medio;


    
    public Veiculo() {
    }



    public Veiculo(String placa, String cor, String numero_passageiros, String capacidade_tanque,
            String velocidade_maxima, String consumo_medio) {
        this.placa = placa;
        this.cor = cor;
        this.numero_passageiros = numero_passageiros;
        this.capacidade_tanque = capacidade_tanque;
        this.velocidade_maxima = velocidade_maxima;
        this.consumo_medio = consumo_medio;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public String getNumero_passageiros() {
        return numero_passageiros;
    }



    public void setNumero_passageiros(String numero_passageiros) {
        this.numero_passageiros = numero_passageiros;
    }



    public String getCapacidade_tanque() {
        return capacidade_tanque;
    }



    public void setCapacidade_tanque(String capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }



    public String getVelocidade_maxima() {
        return velocidade_maxima;
    }



    public void setVelocidade_maxima(String velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }



    public String getConsumo_medio() {
        return consumo_medio;
    }



    public void setConsumo_medio(String consumo_medio) {
        this.consumo_medio = consumo_medio;
    }



    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numero_passageiros=" + numero_passageiros
                + ", capacidade_tanque=" + capacidade_tanque + ", velocidade_maxima=" + velocidade_maxima
                + ", consumo_medio=" + consumo_medio + "]";
    }

    

}
