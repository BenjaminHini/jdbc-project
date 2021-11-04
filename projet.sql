-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 04 nov. 2021 à 18:46
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `films`
--

DROP TABLE IF EXISTS `films`;
CREATE TABLE IF NOT EXISTS `films` (
  `name` varchar(100) NOT NULL,
  `genre` text DEFAULT NULL,
  `image` text DEFAULT NULL,
  `releaseDate` date DEFAULT NULL,
  `runningTime` int(11) DEFAULT NULL,
  `nbViewers` int(11) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `films`
--

INSERT INTO `films` (`name`, `genre`, `image`, `releaseDate`, `runningTime`, `nbViewers`) VALUES
('SHREK 3', 'pour enfant', 'image/Shrek3(red).jpg', '2007-05-18', 93, 19),
('pirates des caraibes : jusqu\'au bout du monde', 'action/aventure', 'image/piratesdescaraibes(red).jpg', '2007-05-24', 168, 28),
('OSS 117 : Rio ne repond plus', 'comedie', 'image/OSS2(red).jpg', '2009-04-15', 100, 69),
('OSS 117 : Le Caire Nid D\'espion', 'comedie', 'image/0SS(red).jpg', '2006-04-19', 109, 26),
('le seigneur des anneaux : la communaute de l\'anneau ', 'fantastique', 'image/LSD(red).jpg', '2001-12-19', 178, 26),
('whiplash', 'drame/musical', 'image/whiplash(red).jpg', '2014-12-24', 107, 79),
('Pokemon Detective Pikachu', 'action/aventure', 'image/detectivePikachu(red).jpg', '2019-05-08', 105, 13),

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

DROP TABLE IF EXISTS `membre`;
CREATE TABLE IF NOT EXISTS `membre` (
  `mail` varchar(50) NOT NULL,
  `mdp` text DEFAULT NULL,
  `reduction` double DEFAULT NULL,
  PRIMARY KEY (`mail`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `membre`
--

INSERT INTO `membre` (`mail`, `mdp`, `reduction`) VALUES
('jldr24@orange.fr', 'onestla', 0),
('aug.lumiere@yahoo.fr', 'cheese', 0.2),
('hatsune.miku@nihon.jpn', 'loli', 0.3),
('celine.tran@hotmail.fr', 'katsuni', 0);

-- --------------------------------------------------------

--
-- Structure de la table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
CREATE TABLE IF NOT EXISTS `ticket` (
  `nomFilm` varchar(100) DEFAULT NULL,
  `mailClient` varchar(50) DEFAULT NULL,
  `dateVu` date DEFAULT NULL,
  `prix` double NOT NULL,
  `nombre` int(11) NOT NULL,
  KEY `nomFilm` (`nomFilm`),
  KEY `mailClient` (`mailClient`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ticket`
--

INSERT INTO `ticket` (`nomFilm`, `mailClient`, `dateVu`, `prix`, `nombre`) VALUES
('SHREK 3', 'francis.dupond@gmail.com', '2020-11-30', 7.6, 1),
('whiplash', 'francis.dupond@gmail.com', '2020-11-30', 7.6, 1),
('pirates des caraibes : jusqu\'au bout du monde', 'hugues8@hotmail.fr', '2020-11-29', 9, 3),
('whiplash', 'hugues8@hotmail.fr', '2020-12-03', 1.7999999999999998, 1),
('SHREK 3', 'francis.dupond@gmail.com', '2020-12-03', 9, 4282),
('pirates des caraibes : jusqu\'au bout du monde', 'tomtom@gmail.com', '2020-12-03', 163.8, 26),
('whiplash', 'hugues8@hotmail.fr', '2020-12-03', 18, 2),
('pirates des caraibes : jusqu\'au bout du monde', 'hugues8@hotmail.fr', '2020-12-04', 252, 28),
('whiplash', 'hugues8@hotmail.fr', '2020-12-04', 135, 3),
('whiplash', 'tomtom@gmail.com', '2020-12-04', 6.300000000000001, 1),
('SHREK 3', 'lena.hiquer@gmail.com', '2020-12-04', 18, 2),
('Pokemon Detective Pikachu', 'francis.dupondlavergne@gmail.com', '2020-12-04', 16.200000000000003, 3),
('OSS 117 : Le Caire Nid D\'espion', 'hugues8@hotmail.fr', '2020-12-04', 4.5, 1),
('Pokemon Detective Pikachu', 'hugues8@hotmail.fr', '2020-12-04', 10.799999999999999, 3),
('OSS 117 : Le Caire Nid D\'espion', 'hugues8@hotmail.fr', '2020-12-08', 18, 2),
('Pokemon Detective Pikachu', 'tomtom@gmail.com', '2020-12-04', 5.4, 1),
('OSS 117 : Le Caire Nid D\'espion', 'hugues8@hotmail.fr', '2020-12-08', 5.4, 1),
('Pokemon Detective Pikachu', 'francis.dupons@hotmail.fr', '2020-12-08', 27, 3),
('Pokemon Detective Pikachu', 'tomtom@hotmail.fr', '2020-12-08', 5.4, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
