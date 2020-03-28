-- pessoa definition

-- Drop table

-- DROP TABLE pessoa;

CREATE TABLE pessoa (
	nome varchar NOT NULL,
	idade int4 NOT NULL,
	genero varchar NULL,
	telefone varchar NULL,
	endereco varchar NULL,
	id int NOT NULL,
	altura varchar NOT NULL,
	peso varchar NOT NULL,
	email varchar NULL,
	CONSTRAINT pessoa_pk PRIMARY KEY (id)
);


-- especializacao definition

-- Drop table

-- DROP TABLE especializacao;

CREATE TABLE especializacao (
	id int4 NOT NULL,
	nome varchar NOT NULL,
	descricao varchar NOT NULL,
	CONSTRAINT especializacao_pk PRIMARY KEY (id)
);


-- curriculo definition

-- Drop table

-- DROP TABLE curriculo;

CREATE TABLE curriculo (
	id int4 NOT NULL,
	educacao int4 NOT NULL,
	experiencia int4 NULL,
	idioma int4 NOT NULL,
	CONSTRAINT curriculo_pk PRIMARY KEY (id)
);


-- historico definition

-- Drop table

-- DROP TABLE historico;

CREATE TABLE historico (
	id int4 NOT NULL,
	CONSTRAINT historico_pk PRIMARY KEY (id)
);


-- profissao definition

-- Drop table

-- DROP TABLE profissao;

CREATE TABLE profissao (
	nome varchar NULL,
	especializacao int4 NULL,
	universidade varchar NULL,
	residencia varchar NULL,
	tmp_experiencia varchar NULL,
	"informacao livre" varchar NULL,
	id int4 NOT NULL,
	CONSTRAINT profissao_pk PRIMARY KEY (id),
	CONSTRAINT profissao_fk FOREIGN KEY (id) REFERENCES especializacao(id)
);


-- profissional definition

-- Drop table

-- DROP TABLE profissional;

CREATE TABLE profissional (
	profissao int4 NULL,
	nome varchar NULL,
	id int4 NOT NULL,
	CONSTRAINT curriculo_fk FOREIGN KEY (id) REFERENCES curriculo(id),
	CONSTRAINT pessoa_fk FOREIGN KEY (id) REFERENCES pessoa(id),
	CONSTRAINT profissao_fk FOREIGN KEY (id) REFERENCES profissao(id)
);


-- paciente definition

-- Drop table

-- DROP TABLE paciente;

CREATE TABLE paciente (
	id int4 NOT NULL,
	CONSTRAINT paciente_pk PRIMARY KEY (id),
	CONSTRAINT historico_fk FOREIGN KEY (id) REFERENCES historico(id),
	CONSTRAINT pessoa_fk FOREIGN KEY (id) REFERENCES pessoa(id)
);