public class Endereco{
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    //constructor
    public Endereco(String rua, String numero, String bairro, String cidade, String cep){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    //getters servem para acessar os atributos privados da classe de forma segura
    public String getRua(){
        return rua;
    }

    public String getNumero(){
        return numero;
    }

    public String getBairro(){
        return bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public String getCep(){
        return cep;
    }

    public String getEnderecoCompleto(){
        return rua + ", " + numero + ", " + bairro + " - " + cidade + " - " + cep;
    }

    
}

