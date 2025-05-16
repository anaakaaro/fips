public class Funcionario {
    public String nome;
    public String login;
    private String senha;
    private String cargo;

    //construtor
    public Funcionario(String nome, String login, String senha, String cargo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        System.out.println("Cargo: " + cargo);
    }
}
