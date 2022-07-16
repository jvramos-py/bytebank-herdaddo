public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario rogerio = new Funcionario();
        rogerio.setNome("Rogério");
        rogerio.setCpf("118.831.489-01");
        rogerio.setSalario(3200);
        System.out.println(rogerio.getNome());
        System.out.println(rogerio.getBonificacao());
    }
}
