-- public.curriculo definition

-- Drop table

-- DROP TABLE public.curriculo;

CREATE TABLE public.curriculo (
	id int8 NOT NULL,
	educacao_id int8 NOT NULL,
	experiencia_id int8 NULL,
	idioma int8 NOT NULL,
	CONSTRAINT curriculo_pk PRIMARY KEY (id)
);


-- public.especializacao definition

-- Drop table

-- DROP TABLE public.especializacao;

CREATE TABLE public.especializacao (
	id int8 NOT NULL,
	nome varchar NOT NULL,
	descricao varchar NOT NULL,
	CONSTRAINT especializacao_pk PRIMARY KEY (id)
);


-- public.pessoa definition

-- Drop table

-- DROP TABLE public.pessoa;

CREATE TABLE public.pessoa (
	nome varchar NOT NULL,
	idade int2 NOT NULL,
	genero varchar NULL,
	telefone varchar NULL,
	endereco varchar NULL,
	id int8 NOT NULL,
	altura varchar NOT NULL,
	peso varchar NOT NULL,
	email varchar NULL,
	CONSTRAINT pessoa_pk PRIMARY KEY (id)
);


-- public.profissao definition

-- Drop table

-- DROP TABLE public.profissao;

CREATE TABLE public.profissao (
	nome varchar NULL,
	especializacao_id int8 NULL,
	universidade varchar NULL,
	residencia varchar NULL,
	tmp_experiencia varchar NULL,
	"informacao livre" varchar NULL,
	id int8 NOT NULL,
	descricao varchar(255) NULL,
	tipo varchar(255) NULL,
	CONSTRAINT profissao_pk PRIMARY KEY (id),
	CONSTRAINT especializacao_fk FOREIGN KEY (id) REFERENCES especializacao(id)
);


-- public.profissional definition

-- Drop table

-- DROP TABLE public.profissional;

CREATE TABLE public.profissional (
	profissao_id int8 NOT NULL,
	nome varchar NULL,
	id int8 NOT NULL,
	curriculo__id int8 NULL,
	pessoa_id int8 NOT NULL,
	CONSTRAINT profissional_pk PRIMARY KEY (id),
	CONSTRAINT curriculo_fk FOREIGN KEY (id) REFERENCES curriculo(id),
	CONSTRAINT fkgg2u8ohjw7qhwygn91hypsdo3 FOREIGN KEY (pessoa_id) REFERENCES pessoa(id),
	CONSTRAINT pessoa_fk FOREIGN KEY (id) REFERENCES pessoa(id),
	CONSTRAINT profissao_fk FOREIGN KEY (id) REFERENCES profissao(id)
);


-- public.historicoo definition

-- Drop table

-- DROP TABLE public.historicoo;

CREATE TABLE public.historicoo (
	id int8 NOT NULL,
	paciente_id int8 NULL,
	CONSTRAINT historicoo_pk PRIMARY KEY (id)
);


-- public.paciente definition

-- Drop table

-- DROP TABLE public.paciente;

CREATE TABLE public.paciente (
	id int4 NOT NULL,
	historicoo_id int4 NOT NULL,
	pessoa_id int4 NOT NULL,
	CONSTRAINT paciente_pk PRIMARY KEY (id)
);


-- public.historicoo foreign keys

ALTER TABLE public.historicoo ADD CONSTRAINT paciente_fk FOREIGN KEY (paciente_id) REFERENCES paciente(id);


-- public.paciente foreign keys

ALTER TABLE public.paciente ADD CONSTRAINT historicoo_fk FOREIGN KEY (id) REFERENCES historicoo(id);
ALTER TABLE public.paciente ADD CONSTRAINT pessoa_fk FOREIGN KEY (id) REFERENCES pessoa(id);