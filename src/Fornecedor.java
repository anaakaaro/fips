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

    public String getRazaoSocial(){
        return razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public void exibirFornecedor(){
        System.out.println("Razão social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());
    }
}
