public class Loja{
    //atributos
    
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    //método construtor com todos atributos
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    
    // construtor com salário indefinido
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    
    //método imprime produtos
    
    public void imprimeProdutos() {
        System.out.println("\n--- Produtos da Loja ---");
        boolean temProduto = false;
        for (Produto p : estoqueProdutos) {
        if (p != null) {
            System.out.println(p);
            temProduto = true;
        }
        }
        if (!temProduto) {
        System.out.println("Nenhum produto cadastrado.");
        }
    }
    
    //insere produtos
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == null) {
            estoqueProdutos[i] = produto;
            return true;
        }
        }
        return false; // estoque cheio
    }
    
    //remove produtos
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true;
        }
        }
        return false; // produto não encontrado
    }
    
    //getters
    
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    //setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    // getter e setter do estoque
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    //método toString
    @Override
    public String toString() {
        return "===== DADOS DA LOJA =====\n" +
               "Nome: " + nome + "\n" +
               "Funcionários: " + quantidadeFuncionarios + "\n" +
               "Salário Base: " + (salarioBaseFuncionario == -1 ? "Não definido" : "R$ " + salarioBaseFuncionario) + "\n" +
               "Endereço:\n" + endereco.toString() + "\n" +
               "Data de Fundação: " + dataFundacao.toString() + "\n" +
               "Capacidade Máxima de Produtos: " + estoqueProdutos.length;
    }
    
    //gastos com salario
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    //tamanho loja
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        }
        
        else if (quantidadeFuncionarios <= 30){
            return 'M';
        }
        
        else {
            return 'G';
        }
    }
}