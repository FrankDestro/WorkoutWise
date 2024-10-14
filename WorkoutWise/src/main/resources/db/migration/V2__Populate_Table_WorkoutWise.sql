INSERT INTO usuario (id, nome, nascimento, idade, password)
VALUES (1, 'João da Silva', '1990-01-01', 34, 'senha123'),
       (2, 'Maria Oliveira', '1985-05-05', 39, 'senha456'),
       (3, 'Pedro Santos', '1992-10-10', 31, 'senha789');

INSERT INTO categoria_exercicio (id, nome)
VALUES (1, 'Pernas'),
       (2, 'Bíceps'),
       (3, 'Tríceps'),
       (4, 'Costas'),
       (5, 'Peito'),
       (6, 'Ombros'),
       (7, 'Core');

INSERT INTO exercicio (id, nome, musculo_alvo, execucao, categoria_id)
VALUES (1, 'Flexão de Braço', 'Peito', 'Coloque as mãos no chão, alinhe os pés e faça a flexão do cotovelo.', 5),
       (2, 'Agachamento', 'Pernas', 'Fique em pé com os pés na largura dos ombros e agache como se fosse sentar.', 1),
       (3, 'Prancha', 'Core', 'Deite-se de barriga para baixo e levante o corpo, mantendo-o reto.', 7);

INSERT INTO plano_de_treino (id, nome, objetivo, peso_atual, medida, data_inicio, data_final, usuario_id)
VALUES (1, 'Plano A', 'Ganho de Massa Muscular', 70.0, 'kg', '2024-01-01', '2024-06-01', 1),
       (2, 'Plano B', 'Perda de Peso', 80.0, 'kg', '2024-02-01', '2024-08-01', 2),
       (3, 'Plano C', 'Definição Muscular', 75.0, 'kg', '2024-03-01', '2024-09-01', 3);

INSERT INTO treino (id, nome, descricao, plano_de_treino_id)
VALUES (1, 'Treino A', 'lorem ipsur', 1),
       (2, 'Treino B', 'lorem ipsur', 2),
       (3, 'Treino C', 'lorem ipsur', 3);


INSERT INTO treino_exercicio (treino_id, exercicio_id, series, repeticoes, tempo_descanso)
VALUES (1, 1, 3, 10, '1M'),
       (1, 2, 4, 12, '1M'),
       (2, 3, 2, 15, '1M');

 INSERT INTO historico_de_progresso (id, data_registro, peso, medida, observacoes, plano_de_treino_id)
 VALUES (1, '2024-01-15', 70.0, 'kg', 'Início do plano A', 1),
        (2, '2024-02-15', 72.0, 'kg', 'Progresso no ganho de massa', 1),
        (3, '2024-03-15', 71.5, 'kg', 'Leve queda de peso, mantendo a força', 1),
        (4, '2024-04-15', 69.0, 'kg', 'Continuando o plano A', 1),
        (5, '2024-02-20', 80.0, 'kg', 'Início do plano B', 2),
        (6, '2024-03-20', 78.0, 'kg', 'Reduzindo peso com dieta e exercícios', 2),
        (7, '2024-04-20', 75.0, 'kg', 'Atingindo metas de perda de peso', 2),
        (8, '2024-03-10', 75.0, 'kg', 'Início do plano C', 3),
        (9, '2024-04-10', 74.5, 'kg', 'Progresso na definição muscular', 3),
        (10, '2024-05-10', 73.0, 'kg', 'Continuação do plano C com foco em resistência', 3);