public class Produto{
    //atributos
    
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //construtor
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    //método esta vencido
    
    public boolean estaVencido(Data dataAtual){
            if (this.dataValidade.getAno() < dataAtual.getAno()) {
                return true;
            }
            else if (this.dataValidade.getAno() == dataAtual.getAno()) {
                if (this.dataValidade.getMes() < dataAtual.getMes()) {
                    return true;
                }
            else if (this.dataValidade.getMes() == dataAtual.getMes()) {
                if (this.dataValidade.getDia() < dataAtual.getDia()) {
                    return true;
            }
        }
    }
    return false;
    
    }
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDatavalidade(){
        return dataValidade;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDatavalidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    //método toString
    @Override
    public String toString(){
        return "===== PRODUTO =====\n" +
           "Nome: " + nome + "\n" +
           "Preço: R$ " + String.format("%.2f", preco) + "\n" +
           "Data de Validade: " + dataValidade.toString();    
    }
}