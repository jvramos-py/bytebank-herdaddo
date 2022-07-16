public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Eduardo");
        g1.setCpf("qualquer um");
        g1.setSalario(5000);
        g1.setSenha(2222);

        System.out.println(g1.getNome());


        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
