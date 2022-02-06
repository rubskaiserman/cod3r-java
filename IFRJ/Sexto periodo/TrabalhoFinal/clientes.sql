DROP DATABASE IF EXISTS clientes;
CREATE TABLE clientes(cpf_cliente PRIMARY KEY INT UNIQUE, nome VARCHAR(80), email VARCHAR(80) UNIQUE, data_inscricao DATE, plano VARCHAR(20));
CREATE USER registrador IDENTIFIED BY 'loucuras_de_amor';
GRANT ALL PRIVILEGES ON cadastro_clientes.* TO registrador;
USE cadastro_clientes;
