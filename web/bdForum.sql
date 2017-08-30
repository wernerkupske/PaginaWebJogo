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

select * from pontuacao;

insert into pontuacao values ("Werner", 100),
("Gabriel", 100),
("Bruno", 100);
