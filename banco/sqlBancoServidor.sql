CREATE TABLE Alunos(
idAluno INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
RA INT,
nome Varchar(50),
idade Integer,
endereco Varchar(150),
curso Varchar(40),
anoDeEntradaCurso Integer,
disciplinasMatriculadas Varchar(100),
disciplinasConcluidas Varchar(100)
);

CREATE TABLE Professor(
idProfessor INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
RA INT,
nome Varchar(50),
idade Integer,
endereco Varchar(150),
departamento Varchar(40),
disciplinasMinistra Varchar(100),
linhasPesquisa Varchar(100)
);

CREATE TABLE Disciplinas(
idDisciplina INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
titulo Varchar(50),
preRequisitos Varchar(150),
metodoAvaliacao Varchar(150),
ementa Varchar(400),
disciplinasDependentes Varchar(150)
);

CREATE TABLE Salas(
idSala INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
descricaoLaboratorio Varchar(50),
numeroComputadores Integer,
recursosDidaticos Varchar(150),
departamento Varchar(50),
capacidadeMaxima Integer
);

CREATE TABLE Aulas(
idAula INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
conteudoProgramatico Varchar(510),
disciplinaAssociada Varchar(150),
salaAulaAssociada Varchar(150),
alunosPresentes Varchar(150)
);