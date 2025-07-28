public class Informatica extends Loja{
    private double seguroEletronicos;
    
    // Construtor completo
    public Informatica(String nome, int qtdFuncionarios, double salarioBase,
                       Endereco endereco, Data dataFundacao, int capacidadeEstoque,
                       double seguroEletronicos) {
        super(nome, qtdFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getter
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    // Setter
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletrônicos: R$ " + String.format("%.2f", seguroEletronicos);
    }
}