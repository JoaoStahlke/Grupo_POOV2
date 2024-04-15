public class Usuario implements Autenticavel {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar() {
        return this.senha.equals("secret");
    }
}