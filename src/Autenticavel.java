//interfaces não tem nenhum método ou atributo concreto.
public abstract interface Autenticavel {
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
