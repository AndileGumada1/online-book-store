-- Database: online-Book_db

-- DROP DATABASE "online-Book_db";

CREATE DATABASE "online-Book_db"
    WITH 
    OWNER = root
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_ZA.UTF-8'
    LC_CTYPE = 'en_ZA.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
-- Table: public.book

-- DROP TABLE public.book;

CREATE TABLE public.book
(
    id bigint NOT NULL DEFAULT nextval('book_id_seq'::regclass),
    active boolean NOT NULL,
    date_created timestamp without time zone,
    description character varying(255) COLLATE pg_catalog."default",
    image_url character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    sku character varying(255) COLLATE pg_catalog."default",
    unit_price double precision,
    unit_in_stock integer,
    last_updated timestamp without time zone,
    category_id bigint NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (id),
    CONSTRAINT category_id FOREIGN KEY (category_id)
        REFERENCES public.book_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.book
    OWNER to root;
-- Table: public.book_category

-- DROP TABLE public.book_category;

CREATE TABLE public.book_category
(
    id bigint NOT NULL DEFAULT nextval('book_category_id_seq'::regclass),
    category_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT book_category_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.book_category
    OWNER to root;
