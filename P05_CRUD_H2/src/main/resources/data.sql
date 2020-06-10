
DROP table IF EXISTS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	fecha date
);

insert into cliente (nombre, apellido,direccion,dni,fecha)values('Jose','Marin','calle imaginaria 1',123456789, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Juan','Lopez','calle imaginaria 2',122222222, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Pedro','Guillem','calle imaginaria 3',123333333, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Jordi','Martin','calle imaginaria 4',123444444, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Jonatan','Vicente','calle imaginaria 5',123455555, NOW());