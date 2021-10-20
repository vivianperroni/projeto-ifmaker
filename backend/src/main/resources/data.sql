
INSERT INTO tb_material(titulo,descricao) 
VALUES ('Impressora 3D','Impressora para imprimir materiais de forma tridimensional');
INSERT INTO tb_material(titulo,descricao) 
VALUES ('Lazer','Fazer corte em materiais mais resistentes');

INSERT INTO tb_projeto(titulo,descricao,integrante,coordenador,material) 
VALUES ('TCC','robotica e robos','Rudson, Emanoeli, Lucas','Nicholas','impressora 3d');
INSERT INTO tb_projeto(titulo,descricao,integrante,coordenador,material) 
VALUES ('TCC','escultura','Vivian','Marcos','impressora 3d');

INSERT INTO tb_agendamento(horario,data,material,dia_agenda,id_projeto) 
VALUES ('09:35:00','2021-08-24','Lazer',1,1);
INSERT INTO tb_agendamento(horario,data,material,dia_agenda,id_projeto) 
VALUES ('07:00:00','2021-09-02','Impressora 3D',1,1);

INSERT INTO tb_emprestimo(horario,data,id_material) 
VALUES ('15:55:00','2021-08-10',1);
INSERT INTO tb_emprestimo(horario,data,id_material) 
VALUES ('13:20:00','2020-03-12',1);






