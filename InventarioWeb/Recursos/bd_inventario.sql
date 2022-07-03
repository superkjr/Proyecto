-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-07-2022 a las 21:45:15
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_inventario`
--
CREATE DATABASE IF NOT EXISTS `bd_inventario` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_inventario`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `id_categoria` int(5) NOT NULL,
  `nom_categoria` varchar(50) NOT NULL,
  `estado_categoria` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tb_categoria`
--

INSERT INTO `tb_categoria` (`id_categoria`, `nom_categoria`, `estado_categoria`) VALUES
(1, 'Armando El pro ', 1),
(2, 'Producto O', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_producto`
--

CREATE TABLE `tb_producto` (
  `id_producto` int(9) NOT NULL,
  `nom_producto` varchar(50) NOT NULL,
  `stock` decimal(3,2) DEFAULT NULL,
  `precio` decimal(3,2) DEFAULT NULL,
  `unidad_de_medida` varchar(20) DEFAULT NULL,
  `estado_producto` tinyint(1) DEFAULT NULL,
  `categoria` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tb_producto`
--

INSERT INTO `tb_producto` (`id_producto`, `nom_producto`, `stock`, `precio`, `unidad_de_medida`, `estado_producto`, `categoria`) VALUES
(1, 'Armando', '1.00', '1.00', 'Libra', 1, NULL),
(2, 'Armndo', '2.34', '2.32', 'Liba', 9, NULL),
(3, 'Pollo', '2.88', '5.87', 'Peso', 1, NULL),
(4, 'POLLO', '5.43', '6.70', 'Libra', 1, NULL),
(5, 'Arroz', '1.30', '9.80', 'Libra', 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `clave` varchar(10) NOT NULL,
  `estado` int(11) NOT NULL,
  `pregunta` varchar(60) NOT NULL,
  `respuesta` varchar(60) NOT NULL,
  `tipo` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_usuario`
--

INSERT INTO `tb_usuario` (`id`, `nombre`, `apellido`, `usuario`, `correo`, `clave`, `estado`, `pregunta`, `respuesta`, `tipo`, `fecha`) VALUES
(1, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:51:19'),
(2, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:51:19'),
(3, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:52:39'),
(4, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:52:39'),
(5, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:53:06'),
(6, 'Armado', 'Minero', 'minero_armando', 'minerocarlos28@gmail.com', '1234', 1, 'Cuantos Anios?', '15', 1, '2022-07-02 23:53:06');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `categoria` (`categoria`);

--
-- Indices de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `id_categoria` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  MODIFY `id_producto` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD CONSTRAINT `tb_producto_ibfk_1` FOREIGN KEY (`categoria`) REFERENCES `tb_categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
