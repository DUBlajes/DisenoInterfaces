-- Volcando estructura de base de datos para dbgametop
DROP DATABASE IF EXISTS dbgametop;
CREATE DATABASE IF NOT EXISTS `dbgametop`;
USE `dbgametop`;

-- Volcando estructura para procedimiento dbgametop.MostrarDatos
DELIMITER //
CREATE PROCEDURE `MostrarDatos`()
BEGIN SELECT * FROM tvideojuegos; END//
DELIMITER ;

-- Volcando estructura para procedimiento dbgametop.NombreJuego
DELIMITER //
CREATE PROCEDURE `NombreJuego`()
BEGIN SELECT * FROM tvideojuegos; END//
DELIMITER ;

-- Volcando estructura para procedimiento dbgametop.ObtenerDatos
DELIMITER //
CREATE PROCEDURE `ObtenerDatos`()
BEGIN SELECT * FROM tvideojuegos;END//
DELIMITER ;

-- Volcando estructura para procedimiento dbgametop.ObtenerJuegos
DELIMITER //
CREATE PROCEDURE `ObtenerJuegos`()
BEGIN SELECT * FROM tvideojuegos;END//
DELIMITER ;


CREATE TABLE IF NOT EXISTS `tvideojuegos` (
  `idjuego` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `anio` int DEFAULT NULL,
  `compania` varchar(50) ,
  `precio` decimal(10,2) DEFAULT NULL,
  `sinopsis` varchar(150) DEFAULT NULL,
  `plataforma` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idjuego`)
) ;

-- Volcando datos para la tabla dbgametop.tvideojuegos: 7 rows
/*!40000 ALTER TABLE `tvideojuegos` DISABLE KEYS */;
INSERT INTO `tvideojuegos` (`idjuego`, `nombre`, `anio`, `compania`, `precio`, `sinopsis`, `plataforma`) VALUES
	(1, 'The Legend of Zelda: Breath of the Wild', 2017, 'Nintendo', 59.99, 'Aventura épica', 'Nintendo Switch'),
	(2, 'Red Dead Redemption 2', 2018, 'Rockstar Games', 49.99, 'Aventura del viejo oeste', 'PlayStation 4'),
	(3, 'Minecraft', 2011, 'Mojang', 29.99, 'Mundo abierto y construcción', 'Multiplataforma'),
	(8, 'World of Wordcraft', 2010, 'Blizzard', 80.00, 'Pedazo de juego', 'todas'),
	(7, 'World of Wordcraft', 2010, 'Blizzard', 80.00, 'Pedazo de juego', 'todas'),
	(9, 'World of Wordcraft', 2010, 'Blizzard', 80.00, 'Pedazo de juego', 'todas'),
	(10, 'World of Wordcraft', 2010, 'Blizzard', 80.00, 'Pedazo de juego', 'todas');
/*!40000 ALTER TABLE `tvideojuegos` ENABLE KEYS */;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
