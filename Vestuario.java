public class Vestuario extends Loja{
    private boolean produtosImportados;
    
    // Construtor completo
    public Vestuario(String nome, int qtdFuncionarios, double salarioBase,
                     Endereco endereco, Data dataFundacao, int capacidadeEstoque,
                     boolean produtosImportados) {
        super(nome, qtdFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }
    
    // Getter
    public boolean isProdutosImportados() {
        return produtosImportados;
      }

    // Setter
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}