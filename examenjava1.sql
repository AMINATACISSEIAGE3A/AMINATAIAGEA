-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 10 juin 2024 à 18:24
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `examenjava1`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `niveau` varchar(50) DEFAULT NULL,
  `filiere` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricule` varchar(50) DEFAULT NULL,
  `nomComplet` varchar(50) DEFAULT NULL,
  `tuteur` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `matricule`, `nomComplet`, `tuteur`) VALUES
(1, 'Aminata', 'aminataCisse', 'lika');

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `annee` int(11) DEFAULT NULL,
  `matricule` varchar(50) DEFAULT NULL,
  `classe_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classe_id` (`classe_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

DROP TABLE IF EXISTS `professeur`;
CREATE TABLE IF NOT EXISTS `professeur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nci` varchar(20) DEFAULT NULL,
  `nomComplet` varchar(100) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nci` (`nci`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `professeurdeclasse`
--

DROP TABLE IF EXISTS `professeurdeclasse`;
CREATE TABLE IF NOT EXISTS `professeurdeclasse` (
  `id_professeur` int(11) NOT NULL,
  `id_classe` int(11) NOT NULL,
  PRIMARY KEY (`id_professeur`,`id_classe`),
  KEY `id_classe` (`id_classe`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
