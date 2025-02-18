package Atividade;


public class maincliente_veiculo {
    public static void main(String[] args) {
       Clienteatividade cliente01 = new Clienteatividade("Pedro", "19", "11719855", "Pituba", "798808");
       System.out.println(cliente01.toString());
       
       Veiculo veiculo01 = new Veiculo("STX6P", "laranja", "2", "20", "80km", "20");
       System.out.println(veiculo01.toString());
    }
}


