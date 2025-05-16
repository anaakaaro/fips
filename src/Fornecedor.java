public class Fornecedor {
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Fornecedor(String razaoSocial, String cnpj, String telefone, String email, Endereco endereco){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this. email = email;
        this.endereco = endereco;
    }

    //getters
    public String getRazaoSocial(){
        return razaoSocial;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    public Endereco getEndereco(){
        return endereco;
    }
    
    //setters
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void exibirFornecedor(){
        System.out.println("Razão social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());
    }
}
