
CREATE TABLE boletim (

    boletim_id BIGINT PRIMARY KEY,
    os_id BIGINT,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
    uri VARCHAR(200) NOT NULL,

    CONSTRAINT fk_boletim_os
    FOREIGN KEY(os_id) REFERENCES ordem_servico(os_id)
);