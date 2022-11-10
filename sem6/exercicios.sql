create table tabela_a (
	id serial primary key,
	nome varchar (40)
)

select * from tabela_a
delete from tabela_a where id =8

insert into tabela_a (nome) values ('Fernanda');
insert into tabela_a (nome) values ('Josefa');
insert into tabela_a (nome) values ('Luiz');
insert into tabela_a (nome) values ('Fernando');

create table tabela_b (
	id serial primary key,
	nome varchar (40)
)

select * from tabela_b

insert into tabela_b (nome) values ('Carlos');
insert into tabela_b (nome) values ('Manoel');
insert into tabela_b (nome) values ('Luiz');
insert into tabela_b (nome) values ('Fernando');

