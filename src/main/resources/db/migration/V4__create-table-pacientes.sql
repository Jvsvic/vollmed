CREATE TABLE pacientes (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(255),
                           email VARCHAR(255),
                           telefone VARCHAR(20),
                           logradouro VARCHAR(255),
                           numero VARCHAR(10),
                           complemento VARCHAR(255),
                           bairro VARCHAR(255),
                           cidade VARCHAR(255),
                           uf CHAR(2),
                           cep VARCHAR(10)
);
