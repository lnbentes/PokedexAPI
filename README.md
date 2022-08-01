# API de pokédex

CRUD completo para a criação de um banco de dados de uma pokédex

## Rodar a Aplicação localmente:
1. Rode o arquivo ApiPokedexApplication da aplicação
2. Acesse http://localhost:8080/ no seu navegador ou seu programa de requisições.

## Documentação no swagger
Com a aplicação rodando, acesse o [link](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config)

## Tabelas:
* Pokemon:
  * nome - String;
  * numero - int;
  * foto - String;
  * classificacao - String;
  * peso - String;
  * altura - String;
  * taxaCaptura - String;
  * taxaGenero - String;
  * tipo - Tipo;
  * habilidade - Habilidade;


* Habilidade:
  * nomeHabilidade - String;
  * pokemon - List - Pokemon;


* Tipagem:
  * nomeTipo - String;
  * fotoTipo - String;
  * pokemon - List - Pokemon;

## End-points:
* Pokemon:
  * GET:
    * All - /pokemon
    * id - /pokemon/{id}
    * nome - /pokemon/nome/{nome}
  * POST - /pokemon
  * PUT - /pokemon
  * DELETE - /pokemon/{id}


* Habilidade:
  * GET:
    * All - /habilidade
    * id - /habilidade/{id}
    * nome - /habilidade/nome/{nome}
  * POST - /habilidade
  * PUT - /habilidade
  * DELETE - /habilidade/{id}


* Tipo:
  * GET:
    * All - /tipo
    * id - /tipo/{id}
    * nome - /tipo/nome/{nome}
  * POST - /tipo
  * PUT - /tipo
  * DELETE - /tipo/{id}


## Tecnologias usadas:
* Java 11
* Spring boot
* Maven
* Postman
* MySQL
* Swagger