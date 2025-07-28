public class Cosmetico extends Loja{
    private double taxaComercializacao;
    
    //construtor completo
    public Cosmetico(String nome, int qtdFunc, double salario, Endereco endereco, Data fundacao, int capacidadeEstoque, double taxa) {
    super(nome, qtdFunc, salario, endereco, fundacao, capacidadeEstoque);
    this.taxaComercializacao = taxa;
    }
    
    // Getter
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    // Setter
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}