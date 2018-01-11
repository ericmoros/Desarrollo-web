-- *********************************************
-- * Standard SQL generation                   
-- *--------------------------------------------
-- * DB-MAIN version: 10.0.3              
-- * Generator date: Aug 17 2017              
-- * Generation date: Fri Oct 20 18:52:07 2017 
-- * LUN file: Z:\Desarrollo-web\Bases de datos\Tema - 2\Práctica - 4\Ej - 1\Ej - 1.lun 
-- * Schema: Tarjetas company/SQL1 
-- ********************************************* 


-- Database Section
-- ________________ 

create database Tarjetas company;


-- DBSpace Section
-- _______________


-- Tables Section
-- _____________ 

create table Classic (
     ID_Tar numeric(10) not null,
     constraint ID_Class_Tarje_ID primary key (ID_Tar));

create table Clientes (
     ID_Cli -- Sequence attribute not implemented -- not null,
     ID_Persona numeric(1),
     Empresas numeric(10),
     constraint ID_Clientes_ID primary key (ID_Cli),
     constraint SID_Clien_Perso_ID unique (ID_Persona));

create table Cuentas (
     ID_Cue -- Sequence attribute not implemented -- not null,
     ID_Tar numeric(10) not null,
     Ordinaria numeric(10),
     Familiar numeric(10),
     Empresarial numeric(10),
     constraint ID_Cuentas_ID primary key (ID_Cue));

create table Electron (
     ID_Tar numeric(10) not null,
     constraint ID_Elect_Tarje_ID primary key (ID_Tar));

create table Empresarial (
     ID_Emp -- Sequence attribute not implemented -- not null,
     ID_Cue numeric(10) not null,
     constraint ID_Empresarial_ID primary key (ID_Emp),
     constraint SID_Empre_Cuent_ID unique (ID_Cue));

create table Empresas (
     ID_Cli numeric(10) not null,
     constraint ID_Empre_Clien_ID primary key (ID_Cli));

create table Familiar (
     ID_Fam -- Sequence attribute not implemented -- not null,
     ID_Cue numeric(10) not null,
     constraint ID_Familiar_ID primary key (ID_Fam),
     constraint SID_Famil_Cuent_ID unique (ID_Cue));

create table Gestiona_E (
     ID_Emp numeric(10) not null,
     ID_Tar numeric(10) not null,
     constraint ID_Gestiona_E_ID primary key (ID_Tar, ID_Emp));

create table Gestiona_F (
     ID_Fam numeric(10) not null,
     ID_Tar numeric(10) not null,
     constraint ID_Gestiona_F_ID primary key (ID_Tar, ID_Fam));

create table Ordinaria (
     ID_Ord -- Sequence attribute not implemented -- not null,
     ID_Cue numeric(10) not null,
     constraint ID_Ordinaria_ID primary key (ID_Ord),
     constraint SID_Ordin_Cuent_ID unique (ID_Cue));

create table Oro (
     ID_Tar numeric(10) not null,
     constraint ID_Oro_Tarje_ID primary key (ID_Tar));

create table Personas (
     ID_Persona numeric(1) not null,
     DNI char(1) not null,
     Nombre char(1) not null,
     Dir_Calle -- Compound attribute -- not null,
     Dir_Numero char(1) not null,
     Dir_Piso char(1) not null,
     constraint ID_Personas_ID primary key (ID_Persona));

create table Tarjetas (
     ID_Tar -- Sequence attribute not implemented -- not null,
     Oro numeric(10),
     Electron numeric(10),
     Classic numeric(10),
     ID_Ord numeric(10) not null,
     constraint ID_Tarjetas_ID primary key (ID_Tar));

create table Tiene_2 (
     ID_Cli numeric(10) not null,
     ID_Cue numeric(10) not null,
     constraint ID_Tiene_2_ID primary key (ID_Cli, ID_Cue));


-- Constraints Section
-- ___________________ 

alter table Classic add constraint ID_Class_Tarje_FK
     foreign key (ID_Tar)
     references Tarjetas;

alter table Clientes add constraint EXTONE_Clientes
     check((ID_Persona is not null and Empresas is null)
           or (ID_Persona is null and Empresas is not null)); 

alter table Clientes add constraint SID_Clien_Perso_FK
     foreign key (ID_Persona)
     references Personas;

alter table Cuentas add constraint ID_Cuentas_CHK
     check(exists(select * from Tiene_2
                  where Tiene_2.ID_Cue = ID_Cue)); 

alter table Cuentas add constraint EXTONE_Cuentas
     check((Empresarial is not null and Familiar is null and Ordinaria is null)
           or (Empresarial is null and Familiar is not null and Ordinaria is null)
           or (Empresarial is null and Familiar is null and Ordinaria is not null)); 

alter table Cuentas add constraint REF_Cuent_Tarje_FK
     foreign key (ID_Tar)
     references Tarjetas;

alter table Electron add constraint ID_Elect_Tarje_FK
     foreign key (ID_Tar)
     references Tarjetas;

alter table Empresarial add constraint SID_Empre_Cuent_FK
     foreign key (ID_Cue)
     references Cuentas;

alter table Empresas add constraint ID_Empre_Clien_FK
     foreign key (ID_Cli)
     references Clientes;

alter table Familiar add constraint SID_Famil_Cuent_FK
     foreign key (ID_Cue)
     references Cuentas;

alter table Gestiona_E add constraint REF_Gesti_Tarje_1
     foreign key (ID_Tar)
     references Tarjetas;

alter table Gestiona_E add constraint REF_Gesti_Empre_FK
     foreign key (ID_Emp)
     references Empresarial;

alter table Gestiona_F add constraint REF_Gesti_Tarje
     foreign key (ID_Tar)
     references Tarjetas;

alter table Gestiona_F add constraint REF_Gesti_Famil_FK
     foreign key (ID_Fam)
     references Familiar;

alter table Ordinaria add constraint SID_Ordin_Cuent_FK
     foreign key (ID_Cue)
     references Cuentas;

alter table Oro add constraint ID_Oro_Tarje_FK
     foreign key (ID_Tar)
     references Tarjetas;

alter table Personas add constraint ID_Personas_CHK
     check(exists(select * from Clientes
                  where Clientes.ID_Persona = ID_Persona)); 

alter table Tarjetas add constraint EXTONE_Tarjetas
     check((Electron is not null and Oro is null and Classic is null)
           or (Electron is null and Oro is not null and Classic is null)
           or (Electron is null and Oro is null and Classic is not null)); 

alter table Tarjetas add constraint REF_Tarje_Ordin_FK
     foreign key (ID_Ord)
     references Ordinaria;

alter table Tiene_2 add constraint EQU_Tiene_Cuent_FK
     foreign key (ID_Cue)
     references Cuentas;

alter table Tiene_2 add constraint REF_Tiene_Clien
     foreign key (ID_Cli)
     references Clientes;


-- Index Section
-- _____________ 

create unique index ID_Class_Tarje_IND
     on Classic (ID_Tar);

create unique index ID_Clientes_IND
     on Clientes (ID_Cli);

create unique index SID_Clien_Perso_IND
     on Clientes (ID_Persona);

create unique index ID_Cuentas_IND
     on Cuentas (ID_Cue);

create index REF_Cuent_Tarje_IND
     on Cuentas (ID_Tar);

create unique index ID_Elect_Tarje_IND
     on Electron (ID_Tar);

create unique index ID_Empresarial_IND
     on Empresarial (ID_Emp);

create unique index SID_Empre_Cuent_IND
     on Empresarial (ID_Cue);

create unique index ID_Empre_Clien_IND
     on Empresas (ID_Cli);

create unique index ID_Familiar_IND
     on Familiar (ID_Fam);

create unique index SID_Famil_Cuent_IND
     on Familiar (ID_Cue);

create unique index ID_Gestiona_E_IND
     on Gestiona_E (ID_Tar, ID_Emp);

create index REF_Gesti_Empre_IND
     on Gestiona_E (ID_Emp);

create unique index ID_Gestiona_F_IND
     on Gestiona_F (ID_Tar, ID_Fam);

create index REF_Gesti_Famil_IND
     on Gestiona_F (ID_Fam);

create unique index ID_Ordinaria_IND
     on Ordinaria (ID_Ord);

create unique index SID_Ordin_Cuent_IND
     on Ordinaria (ID_Cue);

create unique index ID_Oro_Tarje_IND
     on Oro (ID_Tar);

create unique index ID_Personas_IND
     on Personas (ID_Persona);

create unique index ID_Tarjetas_IND
     on Tarjetas (ID_Tar);

create index REF_Tarje_Ordin_IND
     on Tarjetas (ID_Ord);

create unique index ID_Tiene_2_IND
     on Tiene_2 (ID_Cli, ID_Cue);

create index EQU_Tiene_Cuent_IND
     on Tiene_2 (ID_Cue);

