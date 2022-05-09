CREATE TABLE restaurante (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  nome_fantasia varchar(120) NOT NULL,
  cnpj varchar(14) NOT NULL,
  endereco varchar(120) NOT NULL,
  bairro varchar(120),
  cidade varchar(120),
  estado varchar(120),
  cep varchar(120),
  telefone varchar(120),
  celular varchar(120),
  email varchar(120),
  site varchar(120),
  UNIQUE KEY cnpj (cnpj)
);