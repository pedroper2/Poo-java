package atividade03;

public class ClientePet {
    public static void main(String[] args) {
        pet pet01 = new pet("max", "5", "dog");
        Cliente clioente01 = new Cliente("Pedro", "19", pet01);

        System.out.println(clioente01.toString());
        
    }

}
