--Brasil
insert into pais values (nextval('seqpais'),'Brasil');
--RS
insert into estado values (nextval('seqestado'),'Rio Grande do Sul',currval('seqpais'));
insert into cidade values (nextval('seqcidade'),'Porto Alegre',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Caxias',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Pelotas',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Gramado',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Novo Hamburgo',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Bagé',currval('seqestado'));
--SC
insert into estado values (nextval('seqestado'),'Santa Catarina',currval('seqpais'));
insert into cidade values (nextval('seqcidade'),'Florianópolis',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Chapecó',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Criciúma',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Joinville',currval('seqestado'));

--Estados Unidos
insert into pais values (nextval('seqpais'),'Estados Unidos');
--California
insert into estado values (nextval('seqestado'),'California',currval('seqpais'));
insert into cidade values (nextval('seqcidade'),'Los Angeles',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'San Diego',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'San Franscisco',currval('seqestado'));
--Nova Yorke
insert into estado values (nextval('seqestado'),'Nova Yorke',currval('seqpais'));
insert into cidade values (nextval('seqcidade'),'Manhattan',currval('seqestado'));
--Flórida
insert into estado values (nextval('seqestado'),'Flórida',currval('seqpais'));
insert into cidade values (nextval('seqcidade'),'Orlando',currval('seqestado'));
insert into cidade values (nextval('seqcidade'),'Miami',currval('seqestado'));