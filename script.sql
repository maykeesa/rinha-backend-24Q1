CREATE TABLE public.clientes (
    id SERIAL PRIMARY KEY,
    limite INT NOT NULL,
    saldo INT NOT NULL DEFAULT 0
);

CREATE TABLE public.transacoes (
    id SERIAL PRIMARY KEY,
    cliente_id INT NOT NULL,
    valor INT NOT NULL,
    tipo VARCHAR NOT NULL,
    descricao VARCHAR NOT NULL,
    realizada_em DATE NOT NULL
);

INSERT INTO public.clientes (id, limite)
VALUES (1, 100000),
       (2, 80000),
       (3, 1000000),
       (4, 10000000),
       (5, 500000);