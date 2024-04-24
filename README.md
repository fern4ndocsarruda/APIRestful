# SisEstoque
Sistema de Cadastro de Produtos no Estoque de uma Loja de Instrumentos
# Loja de Instrumentos - Backend

Bem-vindo ao repositório do projeto backend para uma loja de instrumentos desenvolvido como parte do curso de Backend do SENAI. Este projeto visa criar uma aplicação robusta e eficiente para gerenciar os dados de uma loja de instrumentos musicais.

## Equipe

O projeto foi desenvolvido pelos seguintes alunos do SENAI:
- Alberto Rezende
- Amanda Porto
- Fernando Arruda
- Thiago Netto

## Funcionalidades

- Gerenciamento de produtos: adição, remoção, atualização e listagem de produtos disponíveis na loja.
- Gerenciamento de clientes: cadastro, atualização e listagem de clientes da loja.
- Gerenciamento de pedidos: criação, atualização, listagem e cancelamento de pedidos realizados pelos clientes.
- Gestão de funcionários: cadastro, atualização e listagem dos funcionários da loja.
- Controle de vendas: registro e acompanhamento das vendas realizadas pela loja, incluindo informações sobre os produtos vendidos e clientes envolvidos.
- Controle de estoque: monitoramento dos níveis de estoque dos produtos.



## Tecnologias Utilizadas

- Spring Boot: Framework utilizado para o desenvolvimento da aplicação backend.
- MySQL: Banco de dados relacional utilizado para armazenar os dados da aplicação.
- Swagger: Ferramenta utilizada para documentar a API RESTful da aplicação.

## Estrutura do Projeto

- **Modelo Lógico do Banco**: Um esquema do banco de dados utilizado no aplicativo, mostrando a estrutura lógica das tabelas e suas relações.

- **Diagrama de Classe**: Representação visual das classes e suas relações no sistema, fornecendo uma visão geral da estrutura do código.

![Diagrama de Classe](https://i.ibb.co/y8j2RTS/diagrama1.png)
![Diagrama de Classe](https://i.ibb.co/QKRmvLq/digrama2.png)

- **Documentação Swagger**: Documentação interativa do aplicativo gerada com Swagger, permitindo visualizar e testar os endpoints da API.

- **Projeto Spring Boot**: O código-fonte do aplicativo backend, desenvolvido utilizando o framework Spring Boot.



## Como Executar

1. Clone este repositório em sua máquina local.
2. Configure o banco de dados MySQL de acordo com as configurações definidas no arquivo `application.properties`.
3. Execute a aplicação Spring Boot.

```bash
cd projeto-spring-boot
./mvnw spring-boot:run