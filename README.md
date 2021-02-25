# APIRestClientes
API Rest de clientes utilizando Spring (Spring Web, Spring Boot DevTools, Spring Data JPA, Lombok, H2 Database). 

## Passos para a utilização da API
* Clonar o repositório.
* Configurar ambiente Spring.
* Executar a aplicação. 

## Utilização
### Inserir Cliente
> `POST (localhost:8080/clientes), no formato JSON, exemplo:`
> `{`
>     `"nome": Maria`
> `}`
### Listar Clientes
> `GET (localhost:8080/clientes)`
### Atualizar Cliente
> `PUT (localhost:8080/clientes), no formato JSON, exemplo:`
> `{`
>     `"id": 1`
>     `"nome": Juliano`
> `}`
### Deletar Cliete
> `DELETE (localhost:8080/clientes), no formato JSON, exemplo:`
> `{`
>     `"id": 1`
> `}`
### Buscar Cliente 
> `GET (localhost:8080/clientes/1)`
