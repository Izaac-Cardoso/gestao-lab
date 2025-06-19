
CREATE TABLE comprovante_pagamento (

    pgt_id BIGINT PRIMARY KEY,
    os_id BIGINT,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
    uri VARCHAR(200) NOT NULL,

    CONSTRAINT fk_comprovante_pgt_os
    FOREIGN KEY(os_id) REFERENCES ordem_servico(os_id)
);