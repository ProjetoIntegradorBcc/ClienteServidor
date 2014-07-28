CREATE TABLE Alunos(
RA int(10),
nome varchar(50),
idade int(5),
endereco varchar(150),
curso varchar(40),
anoDeEntradaCurso int(5),
disciplinasMatriculadas varchar(100),
disciplinasConcluidas varchar(100),
PRIMARY KEY (RA)
);

CREATE TABLE Professor(
RA int(10),
nome varchar(50),
idade int(5),
endereco varchar(150),
departamento varchar(40),
disciplinasMinistra varchar(100),
linhasPesquisa varchar(100),
PRIMARY KEY (RA)
);

CREATE TABLE Disciplinas(
idDisciplina int(10),
titulo varchar(50),
preRequisitos varchar(150),
metodoAvaliacao varchar(150),
ementa varchar(400),
disciplinasDependentes varchar(150),
PRIMARY KEY (idDisciplina)
);

CREATE TABLE Salas(
idSala int(10),
descricaoLaboratorio varchar(50),
numeroComputadores int(50),
recursosDidaticos varchar(150),
departamento varchar(50),
capacidadeMaxima int(10),
PRIMARY KEY (idSala)
);

CREATE TABLE Aulas(
idAula int(10),
conteudoProgramatico varchar(510),
disciplinaAssociada varchar(150),
salaAulaAssociada varchar(150),
alunosPresentes varchar(150),
PRIMARY KEY (idAula)
);

