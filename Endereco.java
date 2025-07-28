public class Endereco{
    //atributos
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;
    
    //construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    // Getter e Setter para nomeDaRua
    public String getNomeDaRua() {
        return nomeDaRua;
    }

        public void setNomeDaRua(String nomeDaRua) {
    this.nomeDaRua = nomeDaRua;
    }
    
    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // Getter e Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Getter e Setter para pais
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    // Getter e Setter para cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    // Getter e Setter para numero
    public String getNumero(){
        return cep;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    // Getter e Setter para complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    //método toString
    @Override
    public String toString() {
        return "===== ENDEREÇO =====\n" +
           "Rua: " + nomeDaRua + ", Nº: " + numero + "\n" +
           "Complemento: " + complemento + "\n" +
           "Cidade: " + cidade + " - " + estado + "\n" +
           "País: " + pais + "\n" +
           "CEP: " + cep;
    }
}