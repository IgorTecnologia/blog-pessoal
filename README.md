# blog-pessoal - Plataforma de Blog Pessoal
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)

blog-pessoal é uma aplicação backend monolítica desenvolvida para gerenciar um blog pessoal, oferecendo funcionalidades robustas para a administração de usuários, temas e postagens, com segurança reforçada através de tokens JWT.

# Funcionalidades Principais

A aplicação utiliza quatro APIs REST para comunicação dos serviços:

User: Gerencia os usuários da plataforma, permitindo operações de criação, leitura, atualização e exclusão (CRUD) de perfis de usuário.

Tema: Gerencia os temas das postagens, oferecendo a capacidade de criar, visualizar, atualizar e excluir temas que categorizam os conteúdos do blog.

Postagem: Focada no gerenciamento das postagens do blog, permitindo criar, ler, atualizar e excluir conteúdos publicados pelos usuários.

# Segurança

A aplicação implementa segurança utilizando tokens JWT (JSON Web Tokens) para autenticação e autorização, garantindo que apenas usuários autenticados possam acessar e manipular os dados sensíveis da plataforma.

# O que a aplicação proporciona?

blog-pessoal foi projetada para oferecer uma solução completa e segura para a gestão de blogs pessoais. A arquitetura monolítica assegura a integração coesa das funcionalidades de usuário, tema e postagem, enquanto o uso de JWT para segurança proporciona uma camada adicional de proteção aos dados e operações realizadas na plataforma.

## Tabela de conteúdos

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)
- [Banco de dados](#banco-de-dados)
- [Tecnologias usadas](#tecnologias-usadas)
- [Contribuição](#contribuição)
- [Observação](#observação)

## Instalação

1. Clone the repository:

```bash
git clone https://github.com/IgorTecnologia/blog-pessoal.git
```

2. Instale as dependências com o Maven.

## Uso

1. Inicie a aplicação com o Maven.
2. A API estará acessível em http://localhost:8080

## Coleção Postman

Baixe esses arquivos e importe-os para o seu Postman para utilizar os métodos HTTP prontos junto com as variáveis ​​de ambiente já configuradas, para realizar as solicitações/respostas

[Baixar Coleções](https://github.com/IgorTecnologia/api-movie/blob/docs-postman/api-movie-collection.json)

[Baixar variáveis de ambiente](https://github.com/IgorTecnologia/api-movie/blob/docs-postman/Local-host-environment.json)

## API Endpoints
A API fornece os seguintes endpoints:

**POST USUARIOS**
```markdown
GET /usuarios/cadastrar - Register a new user into the App.
```
```json
{
    "nome" : "igor",
    "usuario" : "igor@gmail.com.br",
    "senha" : "12345678",
    "foto" : "www.img.com"
}
```
**POST LOGIN USUARIOS**
```markdown
GET /usuarios/logar - Performs authentication and authorization in the application.
```
```json
{
    "nome" : "igor",
    "usuario" : "igor@gmail.com.br"
}
```
**PUT USUARIOS**
```markdown
PUT /usuarios/atualizar - Update a user in the application by id.
```
```json
{
    "id" : 1,
    "nome": "Wilson",
    "usuario": "wilson@gmail.com.br",
    "senha": "12345678",
    "foto": "www.img.com.br"
}
```
**GET USUARIOS**
```markdown
GET /usuarios/all - Retrieve all users.
```
```json
{
        "id": 1,
        "nome": "igor",
        "usuario": "igor@gmail.com.br",
        "senha": "$2a$10$yL8xjW0oaRgLgIafGe9Q.OznZoWE1D7L7ClTN4C9waUi6jAPiyk02",
        "foto": "www.img.com",
        "postagem": []
    }
```
**GET USUARIOS/ID**
```markdown
GET /usuarios/id - Retrieve a single user by id.
```

```json
{
    "id": 1,
    "nome": "igor",
    "usuario": "igor@gmail.com.br",
    "senha": "$2a$10$yL8xjW0oaRgLgIafGe9Q.OznZoWE1D7L7ClTN4C9waUi6jAPiyk02",
    "foto": "www.img.com",
    "postagem": []
}
```
## Banco de dados
The project utilizes [MySql](https://dev.mysql.com/doc/) as the database.

## Tecnologias Usadas

- Java version 17
- Spring Boot
- Maven
- MySql database
- Spring Tool Suite 4
- Postman

## Observação
This APIRest provides other endpoints besides movies, such as:

/temas

/postagens


Located in the Application resources layer.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://medium.com/linkapi-solutions/conventional-commits-pattern-3778d1a1e657), e envie suas alterações em uma branch separado.

![imagem1](https://i.imgur.com/IcLtFqS.png)
