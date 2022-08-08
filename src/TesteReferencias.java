public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g2 = new Gerente();
        g2.setNome("Ricardo");
        g2.getNome();
        g2.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo e = new EditorVideo();
        e.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(f);
        controle.registra(e);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
