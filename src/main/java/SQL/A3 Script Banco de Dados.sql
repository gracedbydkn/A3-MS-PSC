drop database scholarpath;
create database scholarpath;

use scholarpath;
create table tb_cadastro
(	codigo int auto_increment primary key, 
    nomecompleto varchar(60) not null,
    nomeexibicao varchar(30) not null,
    aniversario varchar(8) not null,
    senha varchar(20) not null,
    escolaridade int(1) not null,
    email varchar(30) not null
);

create table tb_grupo
(	nomegrupo varchar(30) not null,
    tema varchar(25) not null,
    codigo varchar(10) not null
);