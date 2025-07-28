public class Alimentacao extends Loja{
    private Data dataAlvara;
    
    // Construtor completo
    public Alimentacao(String nome, int qtdFuncionarios, double salarioBase,
                       Endereco endereco, Data dataFundacao, int capacidadeEstoque,
                       Data dataAlvara) {
        super(nome, qtdFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    // Getter
    public Data getDataAlvara() {
        return dataAlvara;
    }

    // Setter
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\nData do Alvará: " + dataAlvara.toString();
    }
}