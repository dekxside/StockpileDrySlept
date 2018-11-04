create database sicone;
use sicone;

-- drop database sicone;


CREATE TABLE ADMIN (
  ID VARCHAR(10) NOT NULL,
  SENHA VARCHAR(20),
  PRIMARY KEY (ID)
);

CREATE TABLE FUNCIONARIO (
  ID INT NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(40),
  CPF INT NOT NULL,
  SENHA VARCHAR(20),
  PRIMARY KEY (ID)
);

CREATE TABLE CLIENTE (
  CPF INT NOT NULL,
  NOME VARCHAR(40),
  PRIMARY KEY (CPF)
);

CREATE TABLE FORNECEDOR (
  CNPJ VARCHAR(40),
  NOME VARCHAR(40),
  PRIMARY KEY (CNPJ)
);

CREATE TABLE PRODUTO (
  CODPROD INT,
  NOMEPROD VARCHAR(20),
  QTDPROD INT,
  DESCRPROD VARCHAR(40),
  PRIMARY KEY (CODPROD)
);

CREATE TABLE PEDIDO (
  NUMPEDIDO INT,
  DATAPEDIDO DATE,
  PRIMARY KEY (NUMPEDIDO)
);

CREATE TABLE ITEMPEDIDO (
  CODPROD INT,
  NOMEPROD VARCHAR(20),
  QTDPROD INT,
  PRIMARY KEY (CODPROD)
);

show table PRODUTO;
