package Atividade04;

public class ContaBancaria {
    private String Banco;
    private String agencia;
    private String numero_da_conta;
    private String tipo;
    private String Saldo;
    private String limite;

    
    public ContaBancaria() {
    }


    public ContaBancaria(String banco, String agencia, String numero_da_conta, String tipo, String saldo,
            String limite) {
        Banco = banco;
        this.agencia = agencia;
        this.numero_da_conta = numero_da_conta;
        this.tipo = tipo;
        Saldo = saldo;
        this.limite = limite;
    }


    public String getBanco() {
        return Banco;
    }


    public void setBanco(String banco) {
        Banco = banco;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNumero_da_conta() {
        return numero_da_conta;
    }


    public void setNumero_da_conta(String numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getSaldo() {
        return Saldo;
    }


    public void setSaldo(String saldo) {
        Saldo = saldo;
    }


    public String getLimite() {
        return limite;
    }


    public void setLimite(String limite) {
        this.limite = limite;
    }


    @Override
    public String toString() {
        return "\nBanco:" + Banco + "\nagencia: " + agencia + "\nnumero da conta: " + numero_da_conta
                + "\ntipo: " + tipo + "\nSaldo: " + Saldo + "\nlimite: " + limite;
    }

    

}
