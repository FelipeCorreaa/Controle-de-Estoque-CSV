# Controle de Estoque

## Descrição
Este é um projeto de controle de estoque que permite a leitura e escrita de produtos em um arquivo. Ele inclui funcionalidades como adicionar produtos, atualizar seus nomes e exibir a lista de produtos.

## Funcionalidades

- Adicionar um novo produto ao estoque
- Atualizar o nome de um produto existente
- Exibir a lista de produtos

## Estrutura do Projeto

O projeto está organizado em diferentes pacotes:

- `controllers`: Contém a lógica de controle da aplicação
- `entities`: Define a entidade `Product` que representa um produto
- `file_IO`: Manipula a leitura e escrita de produtos em um arquivo
- `managers`: Controlador de estoque (herda da classe `FileHandler`)
- `views`: Exibe os produtos na tela

## Dependências

Este projeto utiliza o Spring Boot para inicialização da aplicação e o JUnit 5 para testes unitários.

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Certifique-se de ter o Java e o Maven instalados em seu sistema.
3. Abra o projeto em seu ambiente de desenvolvimento.
4. Execute a classe `ControleDeEstoqueApplication` para iniciar a aplicação.

## Testes Unitários

Os testes unitários são feitos usando JUnit 5. Eles estão localizados na pasta `src/test/java`. Para executar os testes, basta rodar os arquivos de teste com a extensão `Test` ou `Tests` em seu IDE de escolha.

