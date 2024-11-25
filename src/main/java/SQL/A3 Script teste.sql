drop database scholarpath;
create database scholarpath;

use scholarpath;
create table tb_cadastro
(   codigo int auto_increment primary key, 
    nomecompleto varchar(60) not null,
    nomeexibicao varchar(30) not null,
    aniversario varchar(8) not null,
    senha varchar(20) not null,
    escolaridade int(1) not null,
    email varchar(30) not null
);

create table tb_grupo
(   codgrupo int auto_increment primary key,
    nomegrupo varchar(30) not null  UNIQUE,
    tema varchar(25) not null,
    senhagrupo varchar(10) not null
);

select * from tb_grupo;


insert into tb_grupo (nomegrupo, tema, senhagrupo)
values ('grupo2', 'Biologia', '123466665');

update tb_grupo
set nomegrupo = 'grupo2real', tema = 'abacate', senhagrupo = '1222'
where codgrupo = 2

delete from tb_grupo where nomegrupo = 'grupo1';