-- *********************************************
-- * Standard SQL generation                   
-- *--------------------------------------------
-- * DB-MAIN version: 10.0.3              
-- * Generator date: Aug 17 2017              
-- * Generation date: Mon Nov  6 19:59:37 2017 
-- * LUN file: C:\Users\usuario\Documents\Desarrollo-web\Bases de datos\Tema - 2\Práctica - 3\Ej - 1\Teatro.lun 
-- * Schema: Entidad Relación/SQL 
-- ********************************************* 


-- Database Section
-- ________________ 

create database Entidad Relación;


-- DBSpace Section
-- _______________


-- Tables Section
-- _____________ 

create table Teatro (
     Nombre varchar(30) not null,
     Aforo numeric(99999) not null,
     Telefono varchar(18) not null,
     Email varchar(30) not null,
     Direccion varchar(30) not null,
     CP varchar(10) not null,
     Ciudad varchar(20) not null,
     constraint ID_Teatro_ID primary key (Nombre));

create table Obra (
     ID_Obra char(1) not null,
     Titulo char(1) not null,
     constraint ID_Obra_ID primary key (ID_Obra));

create table Actor (
     ID_Actor varchar(10) not null,
     Nombre varchar(30) not null,
     Apellido varchar(40) not null,
     Alias varchar(30) not null,
     Foto -- Sequence attribute not implemented -- not null,
     constraint ID_Actor_ID primary key (ID_Actor));

create table Autor (
     Nombre varchar(20) not null,
     Apellidos varchar(30) not null,
     constraint ID_Autor_ID primary key (Nombre));

create table Libro (
     Nombre varchar(20) not null,
     constraint ID_Libro_ID primary key (Nombre));

create table Basada (
     Nombre varchar(20) not null,
     ID_Obra char(1) not null,
     constraint ID_Basada_ID primary key (Nombre, ID_Obra));

create table Escribe (
     Nombre varchar(20) not null,
     ID_Obra char(1) not null,
     Fecha date not null,
     constraint ID_Escribe_ID primary key (ID_Obra, Nombre));

create table Participa (
     ID_Actor varchar(10) not null,
     ID_Obra char(1) not null,
     constraint ID_Participa_ID primary key (ID_Actor, ID_Obra));

create table Representa (
     ID_Represetacion char(1) not null,
     Fecha char(1) not null,
     Personaje char(1) not null,
     Nombre varchar(30) not null,
     ID_Obra char(1) not null,
     ID_Actor varchar(10) not null,
     constraint ID_Representa_ID primary key (ID_Represetacion));


-- Constraints Section
-- ___________________ 

alter table Teatro add constraint ID_Teatro_CHK
     check(exists(select * from Representa
                  where Representa.Nombre = Nombre)); 

alter table Obra add constraint ID_Obra_CHK
     check(exists(select * from Basada
                  where Basada.ID_Obra = ID_Obra)); 

alter table Obra add constraint ID_Obra_CHK
     check(exists(select * from Escribe
                  where Escribe.ID_Obra = ID_Obra)); 

alter table Obra add constraint ID_Obra_CHK
     check(exists(select * from Participa
                  where Participa.ID_Obra = ID_Obra)); 

alter table Obra add constraint ID_Obra_CHK
     check(exists(select * from Representa
                  where Representa.ID_Obra = ID_Obra)); 

alter table Actor add constraint ID_Actor_CHK
     check(exists(select * from Participa
                  where Participa.ID_Actor = ID_Actor)); 

alter table Actor add constraint ID_Actor_CHK
     check(exists(select * from Representa
                  where Representa.ID_Actor = ID_Actor)); 

alter table Basada add constraint EQU_Basad_Obra_FK
     foreign key (ID_Obra)
     references Obra;

alter table Basada add constraint REF_Basad_Libro
     foreign key (Nombre)
     references Libro;

alter table Escribe add constraint EQU_Escri_Obra
     foreign key (ID_Obra)
     references Obra;

alter table Escribe add constraint REF_Escri_Autor_FK
     foreign key (Nombre)
     references Autor;

alter table Participa add constraint EQU_Parti_Obra_FK
     foreign key (ID_Obra)
     references Obra;

alter table Participa add constraint EQU_Parti_Actor
     foreign key (ID_Actor)
     references Actor;

alter table Representa add constraint EQU_Repre_Teatr_FK
     foreign key (Nombre)
     references Teatro;

alter table Representa add constraint EQU_Repre_Obra_FK
     foreign key (ID_Obra)
     references Obra;

alter table Representa add constraint EQU_Repre_Actor_FK
     foreign key (ID_Actor)
     references Actor;


-- Index Section
-- _____________ 

create unique index ID_Teatro_IND
     on Teatro (Nombre);

create unique index ID_Obra_IND
     on Obra (ID_Obra);

create unique index ID_Actor_IND
     on Actor (ID_Actor);

create unique index ID_Autor_IND
     on Autor (Nombre);

create unique index ID_Libro_IND
     on Libro (Nombre);

create unique index ID_Basada_IND
     on Basada (Nombre, ID_Obra);

create index EQU_Basad_Obra_IND
     on Basada (ID_Obra);

create unique index ID_Escribe_IND
     on Escribe (ID_Obra, Nombre);

create index REF_Escri_Autor_IND
     on Escribe (Nombre);

create unique index ID_Participa_IND
     on Participa (ID_Actor, ID_Obra);

create index EQU_Parti_Obra_IND
     on Participa (ID_Obra);

create unique index ID_Representa_IND
     on Representa (ID_Represetacion);

create index EQU_Repre_Teatr_IND
     on Representa (Nombre);

create index EQU_Repre_Obra_IND
     on Representa (ID_Obra);

create index EQU_Repre_Actor_IND
     on Representa (ID_Actor);

