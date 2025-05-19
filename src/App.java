public class App {
    public static void main(String[] args) throws Exception {
        //cadastrando endereço do fornecedor
        Endereco endFornecedor1 = new Endereco(
            "Rua das flores", 
            "168 A", 
            "Bairro Jardim", 
            "Contagem", 
            "30303006");
        
        //cadastrando o fornecedor
        Fornecedor fornecedor1 = new Fornecedor(
            "OBRAS E REVSTIMENTOS",
            "02545548568", 
            "3199998885", 
            "emailteste@gmail.com", 
            endFornecedor1);
        
        //exibir fornecedor
        fornecedor1.exibirFornecedor();
        System.out.println(fornecedor1.getRazaoSocial());

        //cadastrando o produto
        Produto rodasCarro = new Produto(
            "325", 
            500.00, 
            100, 
            "Rodas para carro.", 
            fornecedor1, 
            "Prateleira 5.");

        //exibir produto
        rodasCarro.exibirProduto();

    
    }
}
