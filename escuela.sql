-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-09-2018 a las 02:27:14
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `dni` int(8) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `lugar_nac` varchar(50) NOT NULL,
  `fecha_nac` date NOT NULL,
  `sexo` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`dni`, `apellido`, `nombre`, `direccion`, `localidad`, `lugar_nac`, `fecha_nac`, `sexo`) VALUES
(1, 'Fulano', 'Pepito', '', '', '', '0000-00-00', ''),
(2, 'Pepito', 'Fulano', 'calle falsa 123', 'laferrere', 'capital federal', '1999-12-29', 'm'),
(3, 'Suarez', 'Adrian', 'calle falsa 123', 'laferrere', 'capital federal', '2000-12-29', 'm'),
(4, 'Apellido', 'Josefina', 'calle falsa 123', 'lafe', 'isidro casanova', '1998-12-29', 'f'),
(5, 'Andrada', 'Jose', 'calle falsa 123', 'gregorio de laferrere', 'isidro casanova', '1999-12-29', 'm'),
(6, 'Andrade', 'Jose', 'calle falsa 123', 'isidro casanova', 'capital federal', '1998-12-29', 'm'),
(7, 'Condori', 'Flor', 'calle falsa 123', 'laferrere', 'capital federal', '1999-12-29', 'f'),
(8, 'Gomez', 'Gabriel', 'calle falsa 123', 'gonzalez catan', 'capital federal', '1994-12-29', 'm'),
(9, 'Villarreal', 'Daniel', 'calle falsa 123', 'catan', 'capital federal', '1994-12-29', 'm'),
(10, 'Fernandez', 'Fulano', 'calle falsa 123', 'gonsalez catan', 'capital federal', '1993-12-29', 'm'),
(11, 'Fernandez', 'Fernando', 'calle falsa 123', 'laferrere', 'capital federal', '1999-12-29', 'm'),
(12, 'Perez', 'Misael', 'calle falsa 123', 'laferrere', 'isidro casanova', '1999-12-29', 'm'),
(13, 'Fernandez', 'Gloria', 'calle falsa 123', 'laferrere', 'capital federal', '1993-12-29', 'f'),
(2541, 'Gonzalez', 'Pablo', 'calle falsa 123', 'laferrere', 'capital federal', '1993-12-29', 'm'),
(5241, 'Gonzalez', 'Nicolas', 'calle falsa 123', 'laferrere', 'capital federal', '1991-12-29', 'm'),
(44121, 'Perez', 'Francisco', 'calle falsa 123', 'laferrere', 'capital federal', '1993-12-29', 'm'),
(225512, 'Perez', 'Estefano', 'calle falsa 123', 'laferrere', 'capital federal', '1999-12-29', 'm'),
(6547441, 'Perez', 'Lorena', 'calle falsa 123', 'laferrere', 'isidro casanova', '1991-12-29', 'f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_curso` int(11) NOT NULL,
  `anio` tinyint(4) NOT NULL,
  `division` tinyint(4) NOT NULL,
  `modalidad` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id_curso`, `anio`, `division`, `modalidad`) VALUES
(1, 1, 1, 'CSoc'),
(2, 1, 2, 'CSoc'),
(3, 1, 3, 'CSoc'),
(4, 2, 1, 'CSoc'),
(5, 2, 2, 'CNat'),
(6, 3, 1, 'CSoc'),
(7, 3, 2, 'CNat'),
(8, 4, 1, 'CSoc'),
(9, 4, 2, 'CNat'),
(10, 5, 1, 'CSoc'),
(11, 5, 2, 'CNat'),
(12, 6, 1, 'CSoc'),
(13, 6, 2, 'CNat');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ensenia`
--

CREATE TABLE `ensenia` (
  `id_ensenio` int(11) NOT NULL,
  `profesor` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `inicio` date NOT NULL,
  `cese` date NOT NULL,
  `materia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ensenia`
--

INSERT INTO `ensenia` (`id_ensenio`, `profesor`, `curso`, `inicio`, `cese`, `materia`) VALUES
(1, 5332113, 8, '1994-05-12', '2010-06-14', 'Lengua'),
(2, 22312, 8, '2000-05-12', '2012-06-14', 'Matematica'),
(3, 65444, 6, '2001-05-12', '2016-06-14', 'Lengua'),
(4, 65444, 5, '2000-05-12', '2017-06-14', 'Filosofia'),
(5, 65444, 2, '1994-05-12', '2009-06-14', 'Sociales'),
(6, 533211, 3, '2001-05-12', '2008-06-14', 'Lengua'),
(7, 32113121, 3, '2000-05-12', '2010-06-14', 'Sociales'),
(8, 32113121, 2, '2000-05-12', '2010-06-14', 'Matematica'),
(9, 533211, 1, '1994-05-12', '2017-06-14', 'Sociales'),
(10, 65444, 12, '2000-05-12', '2018-06-14', 'Matematica'),
(11, 533211, 10, '2000-05-12', '2010-06-14', 'Sociales'),
(12, 22312, 7, '2001-05-12', '2009-06-14', 'Filosofia'),
(13, 32113121, 13, '1994-05-12', '2008-06-14', 'Matematica'),
(14, 22312, 10, '2000-05-12', '2002-06-14', 'Sociales'),
(15, 32113121, 1, '2001-05-12', '2003-06-14', 'Filosofia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio`
--

CREATE TABLE `estudio` (
  `id_estudio` int(11) NOT NULL,
  `alumno` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `ciclo_lectivo` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudio`
--

INSERT INTO `estudio` (`id_estudio`, `alumno`, `curso`, `ciclo_lectivo`) VALUES
(1, 6547441, 7, 2005),
(12, 1, 4, 2004),
(13, 1, 1, 2003),
(14, 1, 7, 2005),
(15, 1, 8, 2006),
(16, 1, 11, 2007),
(17, 1, 13, 2008),
(18, 44121, 2, 2004),
(19, 44121, 4, 2003),
(20, 44121, 7, 2005),
(21, 44121, 9, 2006),
(22, 44121, 10, 2007),
(23, 6547441, 2, 2002),
(24, 6547441, 4, 2003),
(25, 6547441, 7, 2004),
(26, 6547441, 9, 2005),
(27, 6547441, 10, 2006),
(28, 3, 3, 2002),
(29, 3, 4, 2003),
(30, 3, 7, 2004),
(31, 3, 11, 2005),
(32, 3, 13, 2006),
(33, 5, 9, 2004),
(34, 5, 10, 2005);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `dni` int(8) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `lugar_nac` varchar(50) NOT NULL,
  `fecha_nac` date NOT NULL,
  `sexo` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`dni`, `apellido`, `nombre`, `direccion`, `localidad`, `lugar_nac`, `fecha_nac`, `sexo`) VALUES
(22312, 'Andrada', 'Jose', 'calle falsa 123', 'gregorio de laferrere', 'isidro casanova', '1945-12-29', 'm'),
(65444, 'Suarez', 'Adrian', 'calle falsa 123', 'laferrere', 'capital federal', '1925-12-29', 'm'),
(65636, 'Andrade', 'Ester', 'calle falsa 123', 'isidro casanova', 'capital federal', '1935-12-29', 'f'),
(546563, 'Apellido', 'Josefina', 'calle falsa 123', 'lafe', 'isidro casanova', '1942-12-29', 'f'),
(555665, 'Fernandez', 'Fulano', 'calle falsa 123', 'gonsalez catan', 'capital federal', '1915-12-29', 'm'),
(635565, 'Condori', 'Flor', 'calle falsa 123', 'laferrere', 'capital federal', '1970-12-29', 'f'),
(5332113, 'Gomez', 'Gabriela', 'calle falsa 123', 'gonzalez catan', 'capital federal', '1960-12-29', 'f'),
(32113121, 'Villarreal', 'Daniela', 'calle falsa 123', 'catan', 'capital federal', '1954-12-29', 'f');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `ensenia`
--
ALTER TABLE `ensenia`
  ADD PRIMARY KEY (`id_ensenio`),
  ADD KEY `profesor` (`profesor`),
  ADD KEY `curso` (`curso`);

--
-- Indices de la tabla `estudio`
--
ALTER TABLE `estudio`
  ADD PRIMARY KEY (`id_estudio`),
  ADD KEY `alumno` (`alumno`),
  ADD KEY `curso` (`curso`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `id_curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `ensenia`
--
ALTER TABLE `ensenia`
  MODIFY `id_ensenio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT de la tabla `estudio`
--
ALTER TABLE `estudio`
  MODIFY `id_estudio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ensenia`
--
ALTER TABLE `ensenia`
  ADD CONSTRAINT `ensenia_ibfk_1` FOREIGN KEY (`curso`) REFERENCES `curso` (`id_curso`);

--
-- Filtros para la tabla `estudio`
--
ALTER TABLE `estudio`
  ADD CONSTRAINT `estudio_ibfk_1` FOREIGN KEY (`alumno`) REFERENCES `alumnos` (`dni`),
  ADD CONSTRAINT `estudio_ibfk_2` FOREIGN KEY (`curso`) REFERENCES `curso` (`id_curso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
