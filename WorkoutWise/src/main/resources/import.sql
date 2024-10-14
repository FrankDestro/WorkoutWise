-- Inserindo usuários
INSERT INTO tb_usuario (nome, email) VALUES ('Alice', 'alice@example.com');
INSERT INTO tb_usuario (nome, email) VALUES ('Bob', 'bob@example.com');

-- Inserindo grupos musculares
INSERT INTO tb_grupo_muscular (nome) VALUES ('Perna');
INSERT INTO tb_grupo_muscular (nome) VALUES ('Bíceps');
INSERT INTO tb_grupo_muscular (nome) VALUES ('Tríceps');
INSERT INTO tb_grupo_muscular (nome) VALUES ('Ombro');

-- Inserindo categorias de exercício
INSERT INTO tb_categoria_exercicio (nome) VALUES ('Hipertrofia');
INSERT INTO tb_categoria_exercicio (nome) VALUES ('Cardio');
INSERT INTO tb_categoria_exercicio (nome) VALUES ('Fortalecimento');

-- Inserindo exercícios
INSERT INTO tb_exercicio (nome, descricao, categoria_id, grupo_muscular_id) VALUES ('Agachamento', 'Exercício para pernas', 1, 1);
INSERT INTO tb_exercicio (nome, descricao, categoria_id, grupo_muscular_id) VALUES ('Supino', 'Exercício para peito', 1, 2);
INSERT INTO tb_exercicio (nome, descricao, categoria_id, grupo_muscular_id) VALUES ('Corrida', 'Exercício cardiovascular', 2, NULL);
INSERT INTO tb_exercicio (nome, descricao, categoria_id, grupo_muscular_id) VALUES ('Tríceps testa', 'Exercício para tríceps', 1, 3);
INSERT INTO tb_exercicio (nome, descricao, categoria_id, grupo_muscular_id) VALUES ('Desenvolvimento', 'Exercício para ombros', 1, 4);


-- Inserindo planos de treino
INSERT INTO tb_plano_treino (nome, usuario_id) VALUES ('Plano de Treino da Alice', 1); -- Plano de treino para Alice
INSERT INTO tb_plano_treino (nome, usuario_id) VALUES ('Plano de Treino do Bob', 2); -- Plano de treino para Bob

-- Inserindo treinos
INSERT INTO tb_treino (nome, plano_treino_id ) VALUES ('Treino de Força', 1);
INSERT INTO tb_treino (nome, plano_treino_id) VALUES ('Treino Cardio', 1);

-- Associando exercícios aos treinos
INSERT INTO treino_exercicio (treino_id, exercicio_id, repeticoes, series, peso) VALUES (1, 1, 10, 3, 50.0); -- Agachamento
INSERT INTO treino_exercicio (treino_id, exercicio_id, repeticoes, series, peso) VALUES (1, 2, 8, 4, 40.0); -- Supino
INSERT INTO treino_exercicio (treino_id, exercicio_id, repeticoes, series, peso) VALUES (1, 4, 12, 3, 20.0); -- Tríceps testa
INSERT INTO treino_exercicio (treino_id, exercicio_id, repeticoes, series, peso) VALUES (2, 3, 30, 1, 0.0); -- Corrida
INSERT INTO treino_exercicio (treino_id, exercicio_id, repeticoes, series, peso) VALUES (2, 5, 10, 3, 30.0); -- Desenvolvimento
