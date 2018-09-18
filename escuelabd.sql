-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-09-2018 a las 21:43:22
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `escuelabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `nombre` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `dni` int(8) NOT NULL,
  `direccion` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `localidad` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `lugar_nac` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `sexo` varchar(1) COLLATE utf8mb4_spanish_ci NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`nombre`, `apellido`, `dni`, `direccion`, `localidad`, `lugar_nac`, `fecha_nac`, `sexo`) VALUES
('Sabrina', 'Gonzales', 6863819, 'Duende', 'Tres de Febrero', 'Lobos', '1974-12-06', 'F'),
('Federico', 'Condori', 15497524, 'Capitan Federal', 'Pizza', 'Queso', '1980-05-23', 'M'),
('Fernando', 'Diaz', 17263308, 'Virrey del Pino', 'Tres de Febrero', 'Lobos', '1983-10-29', 'M'),
('Patty', 'Larza', 19624296, 'Catan', 'CABA', 'San Justo', '2018-07-19', 'M'),
('Fernando', 'Perez', 32100305, 'Lafe', 'CABA', 'Lobos', '2004-06-11', 'M'),
('Daniel', 'Larza', 37282025, 'Queso', 'Empanada', 'Queso', '2014-04-14', 'M'),
('Daniel', 'Condori', 41046601, 'Capitan Federal', 'CABA', 'Lobos', '1973-02-10', 'M'),
('Priscila', 'Olmedo', 43377739, 'Lobos', 'Empanada', 'Capitan Federal', '2009-12-28', 'M'),
('Patty', 'Diaz', 47033505, 'Duende', 'Empanada', 'Catan', '1983-02-28', 'M'),
('Nicolas', 'Larza', 55352604, 'Duende', 'Pizza', 'Morron', '1975-12-11', 'M'),
('Nicolas', 'Olmedo', 78170872, 'Lobos', 'La Matanza', 'Lafe', '2017-10-10', 'M'),
('Diana', 'Larza', 78753799, 'Duende', 'La Matanza', 'Capitan Federal', '1983-10-29', 'M'),
('Gabriel', 'Olmedo', 91858439, 'Virrey del Pino', 'Pizza', 'Capitan Federal', '1976-00-17', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `id_curso` int(11) NOT NULL AUTO_INCREMENT,
  `anio` year(4) NOT NULL,
  `division` tinyint(4) NOT NULL,
  `modalidad` tinyint(4) NOT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ensenio`
--

CREATE TABLE IF NOT EXISTS `ensenio` (
  `id_ensenio` int(11) NOT NULL AUTO_INCREMENT,
  `profesor` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `inicio` date NOT NULL,
  `cede` date NOT NULL,
  `materia` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  PRIMARY KEY (`id_ensenio`),
  KEY `profesor` (`profesor`),
  KEY `curso` (`curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio`
--

CREATE TABLE IF NOT EXISTS `estudio` (
  `id_estudio` int(11) NOT NULL AUTO_INCREMENT,
  `alumno` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `ciclo_electivo` year(4) NOT NULL,
  PRIMARY KEY (`id_estudio`),
  KEY `alumno` (`alumno`),
  KEY `curso` (`curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE IF NOT EXISTS `profesor` (
  `nombre` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `dni` int(8) NOT NULL,
  `direccion` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `localidad` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `lugar_nac` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `sexo` varchar(1) COLLATE utf8mb4_spanish_ci NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`nombre`, `apellido`, `dni`, `direccion`, `localidad`, `lugar_nac`, `fecha_nac`, `sexo`) VALUES
('Priscila', 'Larza', 18256170, 'Queso', 'Pizza', 'Catan', '2014-04-20', 'M'),
('Diana', 'Condori', 18464716, 'Catan', 'Pizza', 'Lobos', '2000-05-30', 'M'),
('Nicolas', 'Condori', 32087141, 'San Justo', 'Quilmes', 'San Justo', '2007-05-22', 'M'),
('Sabrina', 'Condori', 33933140, 'Duende', 'Quilmes', 'Morron', '2015-03-16', 'M'),
('Priscila', 'Gomez', 35739447, 'Duende', 'Quilmes', 'Morron', '2005-00-18', 'M'),
('Patty', 'Villarreal', 38753903, 'Catan', 'Quilmes', 'Catan', '2000-09-11', 'M'),
('Diana', 'Diaz', 52899576, 'Lobos', 'CABA', 'Morron', '2010-04-08', 'M');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
