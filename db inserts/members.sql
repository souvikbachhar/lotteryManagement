--
-- PostgreSQL database dump
--

-- Dumped from database version 11.3
-- Dumped by pg_dump version 11.3

-- Started on 2021-01-09 15:02:40

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

SET default_with_oids = false;

--
-- TOC entry 203 (class 1259 OID 67475)
-- Name: member_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.member_details (
    member_id integer NOT NULL,
    lobby_id integer,
    member_name character varying(100)
);


ALTER TABLE public.member_details OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 67473)
-- Name: member_details_member_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.member_details_member_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.member_details_member_id_seq OWNER TO postgres;

--
-- TOC entry 2829 (class 0 OID 0)
-- Dependencies: 202
-- Name: member_details_member_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.member_details_member_id_seq OWNED BY public.member_details.member_id;


--
-- TOC entry 2700 (class 2604 OID 67478)
-- Name: member_details member_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.member_details ALTER COLUMN member_id SET DEFAULT nextval('public.member_details_member_id_seq'::regclass);


--
-- TOC entry 2823 (class 0 OID 67475)
-- Dependencies: 203
-- Data for Name: member_details; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (8, 4, 'test user');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (9, 4, 'user2');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (10, 4, 't3');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (11, 4, 't4');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (12, 4, 't5');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (13, 4, 't6');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (14, 4, 't7');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (15, 4, 't8');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (16, 4, 't9');
INSERT INTO public.member_details (member_id, lobby_id, member_name) VALUES (17, 4, 't10');


--
-- TOC entry 2830 (class 0 OID 0)
-- Dependencies: 202
-- Name: member_details_member_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.member_details_member_id_seq', 17, true);


-- Completed on 2021-01-09 15:02:41

--
-- PostgreSQL database dump complete
--

