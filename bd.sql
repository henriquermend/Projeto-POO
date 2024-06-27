CREATE DATABASE IF NOT EXISTS QCurso;

USE QCurso;

CREATE TABLE IF NOT EXISTS Gerente(
    email VARCHAR(45) PRIMARY KEY,
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Professor(
    email VARCHAR(45) PRIMARY KEY,
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Aluno(
    email VARCHAR(45) PRIMARY KEY,
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Curso(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    descricao VARCHAR(1000),
    tempo VARCHAR(12),
    quantidadeDeAlunos INT
);

CREATE TABLE IF NOT EXISTS Inscricoes(
    aluno_id VARCHAR(45),
    curso_id INT,
    PRIMARY KEY (aluno_id, curso_id),
    FOREIGN KEY (aluno_id) REFERENCES Aluno(email),
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);

CREATE TABLE IF NOT EXISTS Ministrada(
    professor_id VARCHAR(45),
    curso_id INT,
    PRIMARY KEY (professor_id, curso_id),
    FOREIGN KEY (professor_id) REFERENCES Professor(email),
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);

