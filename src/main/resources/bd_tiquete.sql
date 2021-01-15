--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.3

-- Started on 2021-01-15 17:11:06

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16439)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id_cliente integer NOT NULL,
    num_id character varying(45),
    nombre character varying(200),
    apellido1 character varying(45),
    apellido2 character varying(45),
    telefono1 character varying(20),
    telefono2 character varying(20),
    direccion character varying(200),
    fec_nacimiento date
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16437)
-- Name: cliente_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_cliente_seq OWNER TO postgres;

--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 202
-- Name: cliente_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_id_cliente_seq OWNED BY public.clientes.id_cliente;


--
-- TOC entry 207 (class 1259 OID 16458)
-- Name: tiquetes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tiquetes (
    id_tiquete integer NOT NULL,
    mca_equipaje_bodeja character(1),
    fec_salida date,
    fec_llegada date,
    ciudad_origen character varying(50),
    ciudad_destino character varying(50),
    nom_pasajero character varying(100),
    edad_pasajero integer,
    precio double precision
);


ALTER TABLE public.tiquetes OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16456)
-- Name: tiquete_id_tiquete_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tiquete_id_tiquete_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tiquete_id_tiquete_seq OWNER TO postgres;

--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 206
-- Name: tiquete_id_tiquete_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tiquete_id_tiquete_seq OWNED BY public.tiquetes.id_tiquete;


--
-- TOC entry 205 (class 1259 OID 16450)
-- Name: vuelos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vuelos (
    id_vuelvo integer NOT NULL,
    cod_avion character varying(20),
    num_pasajeros integer,
    ciudad_origen character varying(45),
    ciudad_destino character varying(45),
    fec_salida date,
    fec_llegada date,
    precio double precision
);


ALTER TABLE public.vuelos OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16448)
-- Name: vuelo_id_vuelvo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vuelo_id_vuelvo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vuelo_id_vuelvo_seq OWNER TO postgres;

--
-- TOC entry 2848 (class 0 OID 0)
-- Dependencies: 204
-- Name: vuelo_id_vuelvo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vuelo_id_vuelvo_seq OWNED BY public.vuelos.id_vuelvo;


--
-- TOC entry 2700 (class 2604 OID 16442)
-- Name: clientes id_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_id_cliente_seq'::regclass);


--
-- TOC entry 2702 (class 2604 OID 16461)
-- Name: tiquetes id_tiquete; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tiquetes ALTER COLUMN id_tiquete SET DEFAULT nextval('public.tiquete_id_tiquete_seq'::regclass);


--
-- TOC entry 2701 (class 2604 OID 16453)
-- Name: vuelos id_vuelvo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelos ALTER COLUMN id_vuelvo SET DEFAULT nextval('public.vuelo_id_vuelvo_seq'::regclass);


--
-- TOC entry 2836 (class 0 OID 16439)
-- Dependencies: 203
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.clientes (id_cliente, num_id, nombre, apellido1, apellido2, telefono1, telefono2, direccion, fec_nacimiento) FROM stdin;
1	7511	7511	7511	7511	7511	7511	7511	\N
2	7511	7511	7511	7511	7511	7511	7511	\N
\.


--
-- TOC entry 2840 (class 0 OID 16458)
-- Dependencies: 207
-- Data for Name: tiquetes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tiquetes (id_tiquete, mca_equipaje_bodeja, fec_salida, fec_llegada, ciudad_origen, ciudad_destino, nom_pasajero, edad_pasajero, precio) FROM stdin;
2	S	2021-01-10	2022-12-10	MANIZALES	SAO PAULO	CARLOS	36	500000
3	S	2021-02-11	2022-11-12	MEDELLIN	RIO JANEIRO	HUGO	35	25000
4	S	2021-05-10	2022-08-03	BOGOTÁ	MEXICO DC	MARIA	22	45000
5	S	2021-01-19	2022-12-10	MADRID	BARCELONA	VALENTINA	34	4100
6	S	2021-05-10	2022-12-10	LONDRES	PARIS	CRISTINA	45	64552
7	\N	2021-02-11	2022-11-12	MEDELLIN	RIO JANEIRO	HUGO	35	25000
8	\N	2021-02-11	2022-11-12	LIMA	BUENOS AIRES	HUGO	35	25000
9	\N	2021-02-11	2022-11-12	LIMA	BUENOS AIRES	HUGO	35	25000
10	\N	2021-02-11	2022-11-10	LIMA	BUENOS AIRES	HUGO	35	25000
11	\N	2021-02-11	2022-11-10	LIMA	BUENOS AIRES	HUGO	35	25000
12	\N	2021-02-11	2022-11-10	LIMA	BUENOS AIRES	HUGO	35	25000
13	\N	2021-02-11	2022-11-10	LIMA	BUENOS AIRES	HUGO	35	25000
\.


--
-- TOC entry 2838 (class 0 OID 16450)
-- Dependencies: 205
-- Data for Name: vuelos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.vuelos (id_vuelvo, cod_avion, num_pasajeros, ciudad_origen, ciudad_destino, fec_salida, fec_llegada, precio) FROM stdin;
1	A455	80	MANIZALES	BOGOTÁ	\N	\N	100
2	A455	80	MANIZALES	BOGOTÁ	\N	\N	100
\.


--
-- TOC entry 2849 (class 0 OID 0)
-- Dependencies: 202
-- Name: cliente_id_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_id_cliente_seq', 2, true);


--
-- TOC entry 2850 (class 0 OID 0)
-- Dependencies: 206
-- Name: tiquete_id_tiquete_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tiquete_id_tiquete_seq', 13, true);


--
-- TOC entry 2851 (class 0 OID 0)
-- Dependencies: 204
-- Name: vuelo_id_vuelvo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vuelo_id_vuelvo_seq', 2, true);


--
-- TOC entry 2704 (class 2606 OID 16447)
-- Name: clientes cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);


--
-- TOC entry 2708 (class 2606 OID 16463)
-- Name: tiquetes tiquete_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tiquetes
    ADD CONSTRAINT tiquete_pkey PRIMARY KEY (id_tiquete);


--
-- TOC entry 2706 (class 2606 OID 16455)
-- Name: vuelos vuelo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelos
    ADD CONSTRAINT vuelo_pkey PRIMARY KEY (id_vuelvo);


-- Completed on 2021-01-15 17:11:06

--
-- PostgreSQL database dump complete
--

