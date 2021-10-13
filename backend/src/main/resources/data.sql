INSERT INTO tb_projetos(titulo,descricao,integrante,coordenador,material) VALUES ('TCC','robotica e robos','Rudson, Emanoeli, Lucas','Nicholas','impressora 3d');
INSERT INTO tb_projetos(titulo,descricao,integrante,coordenador,material) VALUES ('TCC','escultura','Vivian','Marcos','impressora 3d');

INSERT INTO tb_materiais(titulo,descricao) VALUES ('Impressora 3D','Impressora para imprimir materiais de forma tridimensional');
INSERT INTO tb_materiais(titulo,descricao) VALUES ('Lazer','Fazer corte em materiais mais resistentes');

INSERT INTO tb_agendamentos(horario,dia_agenda,data,material) VALUES ('09:35:00',1,'2021-08-24','Lazer');
INSERT INTO tb_agendamentos(horario,dia_agenda,data,material) VALUES ('07:00:00',2,'2021-09-02','Impressora 3D');

INSERT INTO tb_emprestimos(horario,data,material) VALUES ('15:55:00','2021-08-10','Impressora');
INSERT INTO tb_emprestimos(horario,data,material) VALUES ('13:20:00','2020-03-12','Lazer');