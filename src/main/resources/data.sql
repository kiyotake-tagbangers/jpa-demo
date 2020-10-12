-- if use JDBC
--CREATE TABLE person
--(
--    id INTEGER NOT NULL,
--    name VARCHAR(255) NOT NULL,
--    location VARCHAR(255),
--    birth_date TIMESTAMP,
--    PRIMARY KEY(id)
--);
-- If you use JPA. schema is directly initialized and updated schema which is triggered by SpringBoot Autoconfiguration

INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10001, 'Tanaka', 'Tokyo', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10002, 'Yamada', 'Osaka', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10003, 'Sato', 'Yokohama', sysdate());
