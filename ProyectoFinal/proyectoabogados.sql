-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 28-05-2020 a las 13:12:25
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectoabogados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(1350) NOT NULL,
  `direccion` varchar(1350) NOT NULL,
  `telefono1` varchar(9) NOT NULL,
  `telefono2` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`DNI`, `nombre`, `direccion`, `telefono1`, `telefono2`) VALUES
('12345678A', 'adrian pisabarro garcia', 'asdf', '123456789', ' '),
('12345678B', 'erty rtyui tyui', 'Brasil, Nº9, 2ºK, 01009, Vitoria-Gasteiz', '123456789', ' ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expediente`
--

CREATE TABLE `expediente` (
  `numExpediente` int(255) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `estado` varchar(50) NOT NULL,
  `asunto` varchar(1350) NOT NULL,
  `categoria` varchar(50) NOT NULL,
  `DNI_Cliente` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `expediente`
--

INSERT INTO `expediente` (`numExpediente`, `fechaInicio`, `fechaFin`, `estado`, `asunto`, `categoria`, `DNI_Cliente`) VALUES
(1, '2020-05-05', '2020-08-07', 'EN VISTA', 'Escribe aasDquí la descripción del asunto.', 'PENAL', '12345678A'),
(2, '2020-04-22', '2020-05-23', 'EN VISTA', 'Escribe adaquí la descripción del asunto.', 'CIVIL', '12345678A'),
(3, '2020-05-24', '2020-05-25', 'PREPARALIZADO', 'Ejemplo Asunto', 'FISCAL', '12345678A'),
(4, '2020-04-03', '2020-04-05', 'A DESPACHO', 'Esto es un asunto de ejemplo', 'PENAL', '12345678A'),
(5, '2020-05-04', '2020-07-05', 'A DESPACHO', 'Esto es un ejemplo', 'FISCAL', '12345678B'),
(6, '2020-04-07', '2020-04-08', 'A DESPACHO', 'eareasf sadfasf', 'LABORAL', '12345678B');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD PRIMARY KEY (`numExpediente`),
  ADD KEY `DNI_Cliente` (`DNI_Cliente`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD CONSTRAINT `fk_dnie_dnic` FOREIGN KEY (`DNI_Cliente`) REFERENCES `cliente` (`DNI`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
