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

    //getters
    public String getNome(){
        return nome;
    }

    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }

    public String getCargo(){
        return cargo;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        System.out.println("Cargo: " + cargo);
    }
}
