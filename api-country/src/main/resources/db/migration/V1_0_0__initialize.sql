DROP TABLE IF EXISTS pais, estado , cidade;
DROP SEQUENCE IF EXISTS seqpais,seqestado,seqcidade;

CREATE SEQUENCE seqpais
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
        CACHE 1
        NO CYCLE;

CREATE SEQUENCE seqestado
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
        CACHE 1
        NO CYCLE;

CREATE SEQUENCE seqcidade
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
        CACHE 1
        NO CYCLE;

CREATE TABLE pais
(
    id   int8 NOT NULL,
    nome varchar(255) NULL,
    CONSTRAINT pais_pkey PRIMARY KEY (id)
);

CREATE TABLE estado
(
    id     int8 NOT NULL,
    nome   varchar(255) NULL,
    paisid int8 NULL,
    CONSTRAINT estado_pkey PRIMARY KEY (id),
    CONSTRAINT fk_paisid_estado FOREIGN KEY (paisid) REFERENCES pais (id)
);

CREATE TABLE cidade
(
    id       int8 NOT NULL,
    nome     varchar(255) NULL,
    estadoid int8 NULL,
    CONSTRAINT cidade_pkey PRIMARY KEY (id),
    CONSTRAINT fk_estadoid_cidade FOREIGN KEY (estadoid) REFERENCES estado (id)
);

