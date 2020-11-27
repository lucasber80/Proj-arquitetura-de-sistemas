CREATE TABLE IF NOT EXISTS cliente(
    id int AUTO_INCREMENT primary key,
    nome varchar(30) not null,
    endereco varchar(100) not null,
    cpf varchar(11) not null,
    telefone varchar(15),
    nascimento date not null
);