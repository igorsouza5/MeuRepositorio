-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 20/05/2024 às 16:15
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `cadastrarjogadores`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `jogadores`
--

CREATE TABLE `jogadores` (
  `nome` varchar(30) NOT NULL,
  `time` varchar(30) NOT NULL,
  `posicao` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `jogadores`
--

INSERT INTO `jogadores` (`nome`, `time`, `posicao`) VALUES
('Igor', 'Time B', 'Ataque / Pivô'),
('Marcus', 'Time C', 'Defensor / Fixo'),
('Ruan', 'Time A', 'Goleiro'),
('teruel', 'Time B', 'Meio Campo / Ala');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `jogadores`
--
ALTER TABLE `jogadores`
  ADD PRIMARY KEY (`nome`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
