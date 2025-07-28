# Gerenciador de Lojas de um Shopping Center

Projeto desenvolvido como parte do Desafio I da disciplina de Programação Orientada a Objetos, no curso de Análise e Desenvolvimento de Sistemas (ADS) – 1º semestre de 2025.

Neste desafio, foi proposto o desenvolvimento de um sistema completo em Java, com foco em Programação Orientada a Objetos (POO), simulação de regras de negócio reais, herança, polimorfismo, associação entre classes e uso de arrays.

## Objetivo do Projeto

Simular um sistema de gerenciamento de lojas dentro de um shopping center. O sistema permite:

- Cadastrar diferentes tipos de lojas
- Adicionar e gerenciar produtos
- Verificar validade de produtos
- Gerenciar estoque de produtos
- Criar um shopping com várias lojas
- Gerar relatórios e buscas com base em regras específicas

## Estrutura do Projeto

O projeto foi dividido em quatro etapas principais:

### Etapa 1 - Criação das Classes Base

- Classes: Loja, Produto, Endereco, Data
- Métodos: Construtores, getters e setters
- Regras de negócio:
  - gastosComSalario()
  - tamanhoDaLoja()
  - verificaAnoBissexto()

### Etapa 2 - Associação entre Classes e Menu Principal

- Relacionamento entre Loja, Endereco e Data
- Produto com data de validade
- Método estaVencido()
- Classe Principal com menu interativo no terminal

### Etapa 3 - Herança e Polimorfismo

Subclasses da classe Loja:

- Cosmetico (com taxaComercializacao)
- Vestuario (com produtosImportados)
- Bijuteria (com metaVendas)
- Alimentacao (com dataAlvara)
- Informatica (com seguroEletronicos)

### Etapa 4 - Arrays e Organização

- Loja com array estoqueProdutos (Produto[])
- Métodos:
  - insereProduto()
  - removeProduto()
  - imprimeProdutos()

Criação da classe Shopping com os métodos:

- insereLoja()
- removeLoja()
- quantidadeLojasPorTipo()
- lojaSeguroMaisCaro()

## Execução do Programa

1. Compile todos os arquivos .java.
2. Execute a classe Principal.
3. O menu interativo oferece as opções:
   - (1) Criar uma loja
   - (2) Criar um produto
   - (3) Sair
4. Após o cadastro, o sistema exibe:
   - Se o produto está vencido com base na data 20/10/2023
   - As informações completas da loja cadastrada


## Resultado

Projeto desenvolvido com sucesso, todas as etapas foram implementadas conforme o enunciado. Os conceitos de orientação a objetos, herança, polimorfismo e manipulação de arrays foram aplicados de forma prática em um cenário realista de gerenciamento de lojas em um shopping center.

## Responsável pelo Projeto

Desenvolvido por: [Vinícius D. Silveira]  
Curso: Análise e Desenvolvimento de Sistemas – 1º semestre  
Instituição: [Universidade do Vale do Rio dos Sinos (Unisinos)]

## Licença

Projeto desenvolvido para fins acadêmicos. Uso livre para estudo e aperfeiçoamento, com os devidos créditos ao autor.
