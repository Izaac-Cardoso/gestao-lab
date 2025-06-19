
CREATE TABLE ordem_servico (

    os_id BIGINT PRIMARY KEY,
    orcamento_id BIGINT,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
    uri VARCHAR(200) NOT NULL,

    CONSTRAINT fk_os_orcamento
    FOREIGN KEY(orcamento_id) REFERENCES orcamento(orcamento_id)
);