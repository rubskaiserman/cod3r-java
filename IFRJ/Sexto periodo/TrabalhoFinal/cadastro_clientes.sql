DROP DATABASE IF EXISTS cadastro_clientes;
CREATE DATABASE cadastro_clientes;
USE cadastro_clientes;
CREATE TABLE clientes(cpf_cliente INT UNIQUE PRIMARY KEY, nome VARCHAR(80), email VARCHAR(80) UNIQUE, data_inscricao DATE, plano VARCHAR(20));
CREATE USER registrador IDENTIFIED BY 'loucuras_de_amor';
GRANT ALL PRIVILEGES ON cadastro_clientes.* TO registrador;

