
CREATE TABLE orcamento (

orcamento_id BIGINT PRIMARY KEY,
cliente_id BIGINT,
data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
uri VARCHAR(200) NOT NULL,

CONSTRAINT fk_orcamento_cliente
FOREIGN KEY(cliente_id) REFERENCES cliente(cliente_id)
);