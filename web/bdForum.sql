drop database if exists forum ;
create database forum;
use forum;
create table forum(
	nome varchar(15) not null,
        msg varchar(100) not null,
        strData varchar(100) not null
);

create table pontuacao(
    nome varchar(15) not null,
    score int not null
);

create table login (
    login varchar(15) primary key,
    senha varchar(15)
);

insert into login values ("teste", "123");

insert into pontuacao values ("Werner", 100),
("Gabriel", 100),
("Bruno", 100),
("Werner", 105),
("Gabriel", 110),
("Bruno", 200);
