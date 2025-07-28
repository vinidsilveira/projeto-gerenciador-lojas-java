public class Bijuteria extends Loja{
    private double metaVendas;
    
    //Construtor completo
    public Bijuteria(String nome, int qtdFuncionarios, double salarioBase,
                     Endereco endereco, Data dataFundacao, int capacidadeEstoque,
                     double metaVendas) {
        super(nome, qtdFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }
    
    // Getter
    public double getMetaVendas() {
        return metaVendas;
    }

    // Setter
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas Mensal: R$ " + String.format("%.2f", metaVendas);
    }
}