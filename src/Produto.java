public class Produto {
    private String codigo;
    private double valor;
    private int quantidade;
    private String descricao;
    private Fornecedor fornecedor;
    private String localizacao;
    
    //construtor
    //comentario novo
    public Produto(String codigo, double valor, int quantidade, String descricao, Fornecedor fornecedor, String localizacao){
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.localizacao = localizacao;
    }

    //getters

    public String getCodigo(){
        return codigo;
    }

    public double getValor(){
        return valor;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public String descricao(){
        return descricao;
    }

    public Fornecedor getFornecedor(){
        return fornecedor;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    //setters

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setForncedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public void exibirProduto(){
        System.out.println("Código: " + codigo);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Descrição: " + descricao);
        System.out.println("Fornecedor: " + fornecedor.getRazaoSocial());
        System.out.println("Localização: " + localizacao);
    }

    public void exibirLocalizacao(){
        System.out.println("Localização do produto: " + getLocalizacao());
    }

}


