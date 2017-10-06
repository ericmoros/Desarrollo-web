-- *********************************************
-- * Standard SQL generation                   
-- *--------------------------------------------
-- * DB-MAIN version: 10.0.3              
-- * Generator date: Aug 17 2017              
-- * Generation date: Fri Oct  6 18:24:14 2017 
-- * LUN file: Z:\Desarrollo-web\Bases de datos\Tema - 2\Práctica - 4\Ej - 1.lun 
-- * Schema: 2/SQL 
-- ********************************************* 


-- Database Section
-- ________________ 

create database 2;


-- DBSpace Section
-- _______________


-- Tables Section
-- _____________ 

create table Web (
);

create table Fisica (
);

create table Personas (
     ID_Persona numeric(1) not null,
     DNI char(1) not null,
     Nombre char(1) not null,
     Dir_Calle -- Compound attribute -- not null,
     Dir_Numero char(1) not null,
     Dir_Piso char(1) not null,
     constraint ID_Personas_ID primary key (ID_Persona));

create table Pedidos (
     ID_Pedido char(1) not null,
     Fecha char(1) not null,
     ID_Persona numeric(1) not null,
     constraint ID_Pedidos_ID primary key (ID_Pedido));


-- Constraints Section
-- ___________________ 

alter table Pedidos add constraint REF_Pedid_Perso_FK
     foreign key (ID_Persona)
     references Personas;


-- Index Section
-- _____________ 

create unique index ID_Personas_IND
     on Personas (ID_Persona);

create unique index ID_Pedidos_IND
     on Pedidos (ID_Pedido);

create index REF_Pedid_Perso_IND
     on Pedidos (ID_Persona);

