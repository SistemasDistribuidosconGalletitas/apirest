CREATE TABLE public."Medicamento"
(
    id integer NOT NULL,
    CONSTRAINT "Medicamento_pkey" PRIMARY KEY (id)
);


CREATE TABLE public."Medico"
(
    id integer NOT NULL,
    nombre_medico character varying(100) COLLATE pg_catalog."default",
    correo_electronico character varying(100) COLLATE pg_catalog."default",
    edad integer,
    CONSTRAINT "Medico_pkey" PRIMARY KEY (id)
);


CREATE TABLE public."Paciente"
(
    id integer NOT NULL,
    nombre_paciente character varying(100) COLLATE pg_catalog."default",
    correo_electronico character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT "Paciente_pkey" PRIMARY KEY (id)
);

CREATE TABLE public."Receta"
(
    id_receta integer NOT NULL,
    medico_nombre character varying COLLATE pg_catalog."default",
    fecha_consulta date,
    "receta_fechaInicio" date,
    "receta_fechaFin" date,
    CONSTRAINT "Receta_pkey" PRIMARY KEY (id_receta)
);