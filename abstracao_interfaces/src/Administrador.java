public class Administrador implements Autenticavel {
    private String nome;
    private String senha;

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar() {
        return this.senha.equals("adminsecret");
    }
}