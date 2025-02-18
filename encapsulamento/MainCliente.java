package encapsulamento;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("jose");
        cliente1.setEmail("jose@gmai");
        cliente1.setSenha(123);

        System.out.println("Nome: " + cliente1 .getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("senha: " + cliente1.getSenha());

      
        Cliente cliente2 = new Cliente("pedro", "pedro@gmail", 123);
        System.out.println(cliente2.toString());
    }

}
