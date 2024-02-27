DROP DATABASE IF EXISTS instituto;

CREATE DATABASE instituto CHARACTER SET utf8mb4;

USE instituto;

CREATE TABLE alumno (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido1 VARCHAR(100) NOT NULL,
    apellido2 VARCHAR(100),
    fecha_nacimiento VARCHAR(10),
    es_repetidor VARCHAR(2),
    telefono VARCHAR(9)
)	;

INSERT INTO alumno VALUES(1, 'María', 'Sánchez', 'Pérez', '1990/12/01', 'no', 618253876);

INSERT INTO alumno VALUES(2, 'Juan', 'Sáez', 'Vega', '1998/04/02', 'no', 618253876);

INSERT INTO alumno VALUES(3, 'Pepe', 'Ramírez', 'Gea', '1988/01/03', 'no', 618253876);

INSERT INTO alumno VALUES(4, 'Lucía', 'Sánchez', 'Ortega', '1993/06/13', 'sí', 678516294);

INSERT INTO alumno VALUES(5, 'Paco', 'Martínez', 'López', '1995/11/24', 'no', 692735409);

INSERT INTO alumno VALUES(6, 'Irene', 'Gutiérrez', 'Sánchez', '1991/03/28', 'sí', 618253876);

INSERT INTO alumno VALUES(7, 'Cristina', 'Fernández', 'Ramírez', '1996/09/17', 'no', 628349590);

INSERT INTO alumno VALUES(8, 'Antonio', 'Carretero', 'Ortega', '1994/05/20', 'sí', 612345633);

INSERT INTO alumno VALUES(9, 'Manuel', 'Domínguez', 'Hernández', '1999/07/08', 'no', 618253876);

INSERT INTO alumno VALUES(10, 'Daniel', 'Moreno', 'Ruiz', '1998/02/03', 'no', 618253876);

-- consultas --
SELECT * FROM alumno;

-- Devuelve los datos del alumno cuyo id es igual a 1 -- 
SELECT * FROM alumno WHERE id = 1;

-- Devuelve los datos del alumno cuyo teléfono es igual a 692735409 --
SELECT * FROM alumno WHERE telefono = '692735409';

-- Devuelve un listado de todos los alumnos que son repetidores --
SELECT * FROM alumno WHERE es_repetidor = 'sí';

-- Devuelve un listado de todos los alumnos que no son repetidores --
SELECT * FROM alumno WHERE es_repetidor = 'no';

-- Devuelve el listado de los alumnos que han nacido antes del 1 de enero de 1993 --
SELECT * FROM alumno WHERE fecha_nacimiento <= '1993-01-01';

-- Devuelve el listado de los alumnos que han nacido después del 1 de enero de 1994 --
SELECT * FROM alumno WHERE fecha_nacimiento >= '1994-01-01';

-- Devuelve el listado de los alumnos que han nacido después del 1 de enero de 1994 y no son repetidores --
SELECT * FROM alumno WHERE fecha_nacimiento >= '1994-01-01' AND es_repetidor = 'no';

-- Devuelve el listado de todos los alumnos que nacieron en 1998 --
SELECT * FROM alumno WHERE YEAR(fecha_nacimiento) = 1998;

-- Devuelve el listado de todos los alumnos que no nacieron en 1998 --
SELECT * FROM alumno WHERE YEAR(fecha_nacimiento) != 1998;

-- Devuelve los datos de los alumnos que hayan nacido entre el 1 de enero de 1998 y el 31 de mayo de 1998 --
SELECT * FROM alumno WHERE fecha_nacimiento BETWEEN '1998-01-01' AND '1998-05-31';

-- Devuelve un listado con dos columnas, la primera el nombre de los alumnos y la segunda el nombre con los caracteres invertidos --
SELECT REVERSE (nombre), apellido1 FROM alumno;

-- Devuelve un listado con dos columnas, la primera el nombre y apellidos y la segunda nombre y apellidos invertidos --
SELECT CONCAT (nombre, apellido1, apellido2), REVERSE (CONCAT(nombre, apellido1, apellido2)) AS contrario FROM alumno;

-- Devuelve listado con dos columnas, la primera nombre y apellidos en mayúscula y la segunda nombre y apellidos en minúscula e invertido --
SELECT UPPER (CONCAT(nombre, apellido1, apellido2)), LOWER(REVERSE(CONCAT(nombre, apellido1, apellido2))) AS contrario FROM alumno;

-- Devuelve listado con dos columnas, la primera nombre y apellidos y segunda número total de caracteres de nombre y apellidos --
SELECT CONCAT(nombre, apellido1, apellido2), LENGTH(CONCAT(nombre, apellido1, apellido2)) AS contrario FROM alumno;

-- Devuelve en dos tablas una el nombre y apellidos y otra el correo electrónico con @iescelia.org --
SELECT CONCAT(nombre, apellido1, apellido2) AS nombre, LOWER(CONCAT(nombre, '.', apellido1, '@iescelia.org')) AS correo FROM alumno;

-- Devuelve en tres tablas una el nombre y apellidos, otra el correo electrónico y otra con la contraseña generada en base al segundo apellido invertido y el año de nacimiento --
SELECT CONCAT(nombre, apellido1, apellido2) AS nombre, LOWER(CONCAT(nombre, '.', apellido1, '@iescelia.org')) AS correo, CONCAT(REVERSE(apellido2)), YEAR(fecha_nacimiento) AS contraseña FROM alumno;

-- Devuelve un listado con cuatro columnas, una la fecha de nacimiento y el resto la fecha de nacimiento desglosada --
SELECT fecha_nacimiento AS 'Fecha de Nacimiento', DAY(fecha_nacimiento) AS 'Día', MONTH(fecha_nacimiento) AS 'Mes', YEAR(fecha_nacimiento) AS 'Año' FROM alumno;

-- Devuelve un listado con tres columnas, una la fecha de nacimiento, otra el día de la semana y la última el mes escrito --
-- utilizando dayname y monthname --
SELECT fecha_nacimiento AS 'Fecha de Nacimiento', DAYNAME(fecha_nacimiento) AS 'Día de la Semana', MONTHNAME(fecha_nacimiento) AS 'Mes' FROM alumno;
-- utilizando date_format --
SELECT fecha_nacimiento, DATE_FORMAT(fecha_nacimiento, '%W') AS dia, DATE_FORMAT(fecha_nacimiento, '%M') AS mes FROM alumno;

-- Devuelve listado dos columnas, la primera fecha de nacimiento y la segunda número de días que han pasado desde la fecha de nacimiento hasta la fecha actual --
SELECT fecha_nacimiento, DATEDIFF(NOW(), fecha_nacimiento) AS dias FROM alumno;

-- Devuelve listado dos columnas, primera columna fecha de nacimiento, segunda columna edad de cada alumno --
-- número de días que han pasado des de la fecha de nacimiento hasta la actual --
SELECT fecha_nacimiento, DATEDIFF(NOW(), fecha_nacimiento) AS dias FROM alumno;
-- divide entre 365.25 el resultado obtenido en el paso anterior --
SELECT fecha_nacimiento, DATEDIFF(NOW(), fecha_nacimiento)/365.25 AS dias FROM alumno;
-- trunca las cifras decimales del número obtenido --
SELECT fecha_nacimiento, TRUNCATE(DATEDIFF(NOW(), fecha_nacimiento)/365.25,0) AS dias FROM alumno;