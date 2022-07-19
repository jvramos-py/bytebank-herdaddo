public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g2 = new Gerente();
        g2.setNome("Ricardo");
        g2.getNome();

        System.out.println(g2.getNome());
    }
}
