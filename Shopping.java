public class Shopping{
    //atributos
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    //construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    //toString
    @Override
    public String toString() {
        return "===== SHOPPING =====\n" +
               "Nome: " + nome + "\n" +
               "Endereço:\n" + endereco + "\n" +
               "Capacidade Máxima de Lojas: " + lojas.length;
    }
    
    // MÉTODO 1: inserir loja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // MÉTODO 2: remover loja por nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // MÉTODO 3: contar lojas por tipo
    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipo.toLowerCase()) {
                    case "cosmetico":
                        if (loja instanceof Cosmetico) count++;
                        break;
                    case "vestuario":
                        if (loja instanceof Vestuario) count++;
                        break;
                    case "bijuteria":
                        if (loja instanceof Bijuteria) count++;
                        break;
                    case "alimentacao":
                        if (loja instanceof Alimentacao) count++;
                        break;
                    case "informatica":
                        if (loja instanceof Informatica) count++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return count;
    }

    // MÉTODO 4: loja de informática com seguro mais caro
    public Loja lojaSeguroMaisCaro() {
        double maiorSeguro = -1;
        Loja lojaMaisCara = null;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica info = (Informatica) loja;
                if (info.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = info.getSeguroEletronicos();
                    lojaMaisCara = info;
                }
            }
        }

        return lojaMaisCara;
    }
}