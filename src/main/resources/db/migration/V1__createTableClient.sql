create table client(
                       id bigint primary key,
                       name varchar(50),
                       last_name varchar(40),
                       phone_number varchar,
                       birth_date varchar(10),
                       email varchar(50),
                       cpf varchar,
                       password varchar,
                       image_perfil varchar,
                       pix varchar(50)
);

CREATE SEQUENCE client_id_seq OWNED BY client.id;

ALTER TABLE client ALTER COLUMN id SET DEFAULT nextval('client_id_seq');