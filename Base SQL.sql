use db_springboot_test;
DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    apellido VARCHAR(100),
    email VARCHAR(100),
    created_at datetime,
    PRIMARY KEY (id)
);


INSERT INTO cliente VALUES (0, "GERMAN", "GUERRERO", "german.guerrero@bdguidance.com", "2018-03-06")
