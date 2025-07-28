import java.util.Scanner;
import java.util.Locale;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        Loja lojaCriada = null;
        int opcao;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("===== CRIAÇÃO DE LOJA =====");
                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    System.out.print("Quantidade de funcionários: ");
                    int qtdFunc = scanner.nextInt();

                    System.out.print("Salário base: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Nome da rua: ");
                    String rua = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();

                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    System.out.print("País: ");
                    String pais = scanner.nextLine();

                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();

                    System.out.print("Número: ");
                    String numero = scanner.nextLine();

                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();

                    System.out.print("Data de fundação - Dia: ");
                    int dia = scanner.nextInt();

                    System.out.print("Mês: ");
                    int mes = scanner.nextInt();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Capacidade máxima de produtos: ");
                    int capacidadeProdutos = scanner.nextInt();
                    scanner.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                    Data dataFundacao = new Data(dia, mes, ano);

                    lojaCriada = new Loja(nomeLoja, qtdFunc, salario, endereco, dataFundacao, capacidadeProdutos);
                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    if (lojaCriada == null) {
                        System.out.println("Nenhuma loja foi criada ainda. Crie uma loja primeiro.");
                        break;
                    }

                    System.out.println("===== CRIAÇÃO DE PRODUTO =====");
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Data de validade - Dia:");
                    int diaVal = scanner.nextInt();

                    System.out.println("Mês:");
                    int mesVal = scanner.nextInt();

                    System.out.println("Ano:");
                    int anoVal = scanner.nextInt();
                    scanner.nextLine();

                    Data dataValidade = new Data(diaVal, mesVal, anoVal);
                    Produto novoProduto = new Produto(nomeProduto, precoProduto, dataValidade);

                    boolean inserido = lojaCriada.insereProduto(novoProduto);
                    if (!inserido) {
                        System.out.println("Estoque cheio! Produto não inserido.");
                    }

                    Data dataReferencia = new Data(20, 10, 2023);
                    if (novoProduto.estaVencido(dataReferencia)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }

                    System.out.println("\n===== INFORMAÇÕES DA LOJA =====");
                    System.out.println(lojaCriada);
                    lojaCriada.imprimeProdutos();
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}
