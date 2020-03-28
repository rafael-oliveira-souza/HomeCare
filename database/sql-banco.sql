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
	id int8 NOT NULL,
	altura float8 NULL,
	cpf varchar(14) NOT NULL,
	email varchar(255) NOT NULL,
	endereco varchar(255) NULL,
	genero bpchar(1) NULL,
	idade int4 NULL,
	nome varchar(255) NOT NULL,
	peso float8 NULL,
	telefone varchar(255) NULL,
	tipo_usuario bpchar(1) NOT NULL,
	CONSTRAINT pessoa_pkey null,
	CONSTRAINT uk_mc87q8fpvldpdyfo9o5633o5l null,
	CONSTRAINT uk_nlwiu48rutiltbnjle59krljo null
);


-- public.paciente definition

-- Drop table

-- DROP TABLE public.paciente;

CREATE TABLE public.paciente (
	id int8 NOT NULL,
	pessoa_id int8 NOT NULL,
	CONSTRAINT paciente_pk null,
	CONSTRAINT pessoa_fk null
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


-- public.historico definition

-- Drop table

-- DROP TABLE public.historico;

CREATE TABLE public.historico (
	id int8 NOT NULL,
	paciente_id int8 NULL,
	CONSTRAINT historico_pk PRIMARY KEY (id),
	CONSTRAINT paciente_fk FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);