
CREATE TABLE cliente (

    cliente_id BIGINT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    email VARCHAR(60) NOT NULL UNIQUE,
    cpf INT(20),
    endreco VARCHAR(200),
    cep int(8),
    data_Cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
);