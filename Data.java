public class Data {
    private int dia;
    private int mes;
    private int ano;

    //construtor com validação
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Atribuindo data padrão: 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //método auxiliar para validar a data
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = { 31, verificaAnoBissexto(ano) ? 29 : 28, 31, 30, 31, 30,
                             31, 31, 30, 31, 30, 31 };

        return dia <= diasPorMes[mes - 1];
    }

    // Método auxiliar para verificar ano bissexto
    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    // Getter e Setter para dia
    public int getDia() {
        return dia;
    }  

    public void setDia(int dia) {
        this.dia = dia;
    }

    // Getter e Setter para mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Getter e Setter para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}