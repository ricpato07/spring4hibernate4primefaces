/*
SQLyog Community v8.71 
MySQL - 5.6.20 : Database - prueba
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`prueba` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `prueba`;

/*Table structure for table `alumnos` */

DROP TABLE IF EXISTS `alumnos`;

CREATE TABLE `alumnos` (
  `matricula` int(22) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `app` varchar(100) DEFAULT NULL,
  `apm` varchar(100) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `FK_alumnos` (`usuario`),
  CONSTRAINT `FK_alumnos` FOREIGN KEY (`usuario`) REFERENCES `login` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `articulos` */

DROP TABLE IF EXISTS `articulos`;

CREATE TABLE `articulos` (
  `id_articulo` int(5) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `costo` double DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_articulo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Table structure for table `cat_bancos` */

DROP TABLE IF EXISTS `cat_bancos`;

CREATE TABLE `cat_bancos` (
  `idBanco` int(11) NOT NULL AUTO_INCREMENT,
  `sBanco` varchar(250) NOT NULL,
  PRIMARY KEY (`idBanco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(50) NOT NULL,
  `APELLIDOS` varchar(150) NOT NULL,
  `EDAD` int(3) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
