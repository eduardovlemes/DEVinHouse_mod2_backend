create table empregado (
	id SERIAL, 
	nome varchar(30), 
	salario int,
	supervisor varchar(30), 
	primary key (id)
);

insert into empregado (nome, salario, supervisor) values ('diogo', 2000, 'carlos'), 
('gabriel', 5000, 'joao'), ('sérgio', 15000, 'patrick'), ('ana', 7500, 'carlos'), 
('abigail', 3000, 'joao'), ('joana', 24000, 'patrick'), ('felipe', 2300, 'carlos'), 
('edson', 1500, 'joao'), ('roberta', 6000, 'patrick');

select * from empregado;

select min (salario), max(salario), avg (salario), supervisor 
from empregado 
group by supervisor 
having avg(salario) > 3500