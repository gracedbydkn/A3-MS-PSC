drop database scholarpath;
create database scholarpath;

use scholarpath;
create table tb_usuario
(	codusuario int auto_increment primary key, 
    nomecompleto varchar(60) not null,
    nomeexibicao varchar(30) not null,
    aniversario varchar(10) not null,
    senha varchar(20) not null,
    email varchar(30) not null,
    adm boolean not null default false
);

create table tb_grupo
(	codgrupo int auto_increment primary key,
	nomegrupo varchar(30) not null,
    tema varchar(25) not null,
    senhagrupo varchar(10) not null
);