CREATE TABLE IF NOT EXISTS USUARIO {
    ID_USUARIO INT PRIMARY KEY,
    NOME VARCHAR(255),
    SENHA_ALTERNATIVA VARCHAR(20),
    }

CREATE TABLE IF NOT EXISTS PRESENTE (
      ID_PRESENTE INT PRIMARY KEY,
      NOME VARCHAR(255),
      DESCRICAO_PRESENTE TEXT,
      ID_USUARIO INT,
      COMPRADO BOOLEAN DEFAULT FALSE,
      FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID_USUARIO)
    );