--
-- PostgreSQL database dump
--

-- Dumped from database version 11.3
-- Dumped by pg_dump version 11.3

-- Started on 2021-01-09 15:01:36

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
-- TOC entry 201 (class 1259 OID 67469)
-- Name: lobby_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.lobby_details (
    lobby_id integer NOT NULL,
    entry_prize integer,
    member_required integer,
    created_time timestamp without time zone,
    lobby_name character varying(100),
    member_registered integer,
    winner_prize integer,
    house_charges integer,
    winner_id character varying(10)
);


ALTER TABLE public.lobby_details OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 67467)
-- Name: lobby_details_lobby_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.lobby_details_lobby_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.lobby_details_lobby_id_seq OWNER TO postgres;

--
-- TOC entry 2829 (class 0 OID 0)
-- Dependencies: 200
-- Name: lobby_details_lobby_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.lobby_details_lobby_id_seq OWNED BY public.lobby_details.lobby_id;


--
-- TOC entry 2700 (class 2604 OID 67472)
-- Name: lobby_details lobby_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lobby_details ALTER COLUMN lobby_id SET DEFAULT nextval('public.lobby_details_lobby_id_seq'::regclass);


--
-- TOC entry 2823 (class 0 OID 67469)
-- Dependencies: 201
-- Data for Name: lobby_details; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.lobby_details (lobby_id, entry_prize, member_required, created_time, lobby_name, member_registered, winner_prize, house_charges, winner_id) VALUES (5, 110, 12, '2021-01-09 12:41:03.577', 'JanFest', 0, 1254, 66, NULL);
INSERT INTO public.lobby_details (lobby_id, entry_prize, member_required, created_time, lobby_name, member_registered, winner_prize, house_charges, winner_id) VALUES (6, 150, 16, '2021-01-09 14:03:03.213', 'HackerEarth fest', 0, 2280, 120, NULL);
INSERT INTO public.lobby_details (lobby_id, entry_prize, member_required, created_time, lobby_name, member_registered, winner_prize, house_charges, winner_id) VALUES (4, 100, 10, '2021-01-09 12:31:23.104', 'Test', 10, 950, 50, '12');


--
-- TOC entry 2830 (class 0 OID 0)
-- Dependencies: 200
-- Name: lobby_details_lobby_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.lobby_details_lobby_id_seq', 6, true);


-- Completed on 2021-01-09 15:01:36

--
-- PostgreSQL database dump complete
--

