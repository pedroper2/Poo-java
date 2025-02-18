package Atividade04;

public class Mainfuncionario {
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria01 = new ContaBancaria ("itaú","0111","7425","corrente","59","5000");
        Funcionario funcionario01 = new Funcionario("002", "marcos", "salvador", "88082925", "marcos@gmail", contaBancaria01);

        System.out.println(funcionario01.toString());
    }


}
