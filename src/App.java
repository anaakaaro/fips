public class App {
    public static void main(String[] args) throws Exception {
        Endereco endFornecedor1 = new Endereco(
            "Rua das flores", 
            "168A", 
            "Bairro Jardim", 
            "Contagem", 
            "30303006");
        
        Fornecedor fornecedor1 = new Fornecedor(
            "OBRAS E REVSTIMENTOS",
            "02545548568", 
            "3199998885", 
            "emailteste@gmail.com", 
            endFornecedor1);
        
        fornecedor1.exibirFornecedor();
        System.out.println(fornecedor1.getRazaoSocial());

        Produto salgadinho = new Produto(
            "325", 
            3.25, 
            100, 
            "Salgadinho de milho.", 
            fornecedor1, 
            "Prateleira 5.");

        salgadinho.exibirProduto();

        salgadinho.exibirLocalizacao();
    }
}
