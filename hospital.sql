-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.17-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para hospital
DROP DATABASE IF EXISTS `hospital`;
CREATE DATABASE IF NOT EXISTS `hospital` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hospital`;

-- Volcando estructura para tabla hospital.cita
DROP TABLE IF EXISTS `cita`;
CREATE TABLE IF NOT EXISTS `cita` (
  `id_Cita` int(10) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `id_Paciente` int(10) DEFAULT NULL,
  `id_Medico` int(10),
  `id_Consultorio` int(10),
  `id_Receta` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_Cita`),
  KEY `id_Paciente` (`id_Paciente`),
  KEY `id_Medico` (`id_Medico`),
  KEY `id_Consultorio` (`id_Consultorio`),
  KEY `id_Receta` (`id_Receta`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.consultorio
DROP TABLE IF EXISTS `consultorio`;
CREATE TABLE IF NOT EXISTS `consultorio` (
  `id_Consultorio` int(11) NOT NULL AUTO_INCREMENT,
  `id_Departamento` int(11) DEFAULT NULL,
  `piso` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Consultorio`),
  KEY `id_Departamento` (`id_Departamento`),
  CONSTRAINT `FK_consultorio_departamentos` FOREIGN KEY (`id_Departamento`) REFERENCES `departamentos` (`id_Departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.departamentos
DROP TABLE IF EXISTS `departamentos`;
CREATE TABLE IF NOT EXISTS `departamentos` (
  `id_Departamento` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_Departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.especialidad
DROP TABLE IF EXISTS `especialidad`;
CREATE TABLE IF NOT EXISTS `especialidad` (
  `id_Especialidad` int(11) NOT NULL AUTO_INCREMENT,
  `id_Departamento` int(11),
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_Especialidad`),
  KEY `id_Departamento` (`id_Departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.medico
DROP TABLE IF EXISTS `medico`;
CREATE TABLE IF NOT EXISTS `medico` (
  `cedula` int(10) NOT NULL,
  `id_Especialidad` int(10) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `Ap_Paterno` varchar(50) DEFAULT NULL,
  `Ap_Materno` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cedula`),
  KEY `id_Especialidad` (`id_Especialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.paciente
DROP TABLE IF EXISTS `paciente`;
CREATE TABLE IF NOT EXISTS `paciente` (
  `id_Paciente` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `ap_Paterno` varchar(50) DEFAULT NULL,
  `ap_Materno` varchar(50) DEFAULT NULL,
  `tipo_Sangre` varchar(50) DEFAULT NULL,
  `alergias` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `fecha_Nacimiento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_Paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla hospital.receta
DROP TABLE IF EXISTS `receta`;
CREATE TABLE IF NOT EXISTS `receta` (
  `id_Receta` int(10) NOT NULL AUTO_INCREMENT,
  `id_Paciente` int(10) DEFAULT NULL,
  `cedula` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `peso` int(10) DEFAULT NULL,
  `presion` int(10) DEFAULT NULL,
  `talla` int(10) DEFAULT NULL,
  `temperatura` int(10) DEFAULT NULL,
  `diagnostico` varchar(50) DEFAULT NULL,
  `observacion` varchar(100) DEFAULT NULL,
  `prescripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_Receta`),
  KEY `id_Cita` (`id_Paciente`),
  KEY `cedula` (`cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
