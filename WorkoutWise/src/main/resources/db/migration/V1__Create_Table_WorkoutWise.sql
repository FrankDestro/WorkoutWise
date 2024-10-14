CREATE TABLE IF NOT EXISTS usuario (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nascimento DATE NOT NULL,
    idade INT NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS categoria_exercicio (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS exercicio (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    musculo_alvo VARCHAR(100) NOT NULL,
    execucao TEXT NOT NULL,
    categoria_id BIGINT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES categoria_exercicio(id)
);

CREATE TABLE IF NOT EXISTS plano_de_treino (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    objetivo VARCHAR(255) NOT NULL,
    peso_atual DECIMAL(5,2) NOT NULL,
    medida VARCHAR(10) NOT NULL,
    data_inicio DATE NOT NULL,
    data_final DATE NOT NULL,
    usuario_id BIGINT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE IF NOT EXISTS treino (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    plano_de_treino_id BIGINT NOT NULL,
    FOREIGN KEY (plano_de_treino_id) REFERENCES plano_de_treino(id)
);

CREATE TABLE IF NOT EXISTS treino_exercicio (
    treino_id BIGINT NOT NULL,
    exercicio_id BIGINT NOT NULL,
    series INT NOT NULL,
    repeticoes INT NOT NULL,
    tempo_descanso VARCHAR(10) NOT NULL,
    PRIMARY KEY (treino_id, exercicio_id),
    FOREIGN KEY (treino_id) REFERENCES treino(id),
    FOREIGN KEY (exercicio_id) REFERENCES exercicio(id)
);

 CREATE TABLE IF NOT EXISTS historico_de_progresso (
     id BIGINT PRIMARY KEY,
     data_registro DATE NOT NULL,
     peso DECIMAL(5,2) NOT NULL,
     medida VARCHAR(10) NOT NULL,
     observacoes TEXT,
     plano_de_treino_id BIGINT NOT NULL,
     FOREIGN KEY (plano_de_treino_id) REFERENCES plano_de_treino(id)
 );
