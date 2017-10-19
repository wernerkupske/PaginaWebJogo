drop database if exists forum ;
create database forum;
use forum;

create table forum(
	nome varchar(15) not null,
        msg varchar(100) not null,
        strData varchar(100) not null,
        id int not null auto_increment
);

create table pontuacao(
    nome varchar(15) not null,
    score int not null
);

create table login (
    login varchar(60) primary key,
    senha varchar(60)
);

create table pontuacaoInfinito(
    nomeInf varchar(15) not null,
    scoreInf int not null
);

insert into login values ("698DC19D489C4E4DB73E28A713EAB07B", "202CB962AC59075B964B07152D234B70");


insert into pontuacao values ("Werner", 100),
("Gabriel", 100),
("Bruno", 100),
("Werner", 105),
("Gabriel", 110),
("Bruno", 200);

insert into pontuacaoInfinito values ("Werner", 10),
("Gabriel", 20),
("Bruno", 30);

select * from forum;


