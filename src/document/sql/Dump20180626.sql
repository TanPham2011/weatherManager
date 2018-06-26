-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: weather
-- ------------------------------------------------------
-- Server version	5.6.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
DROP TABLE IF EXISTS `weather_day`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cities` (
  `id` varchar(10) NOT NULL,
  `city_name` varchar(255) NOT NULL,
  `country_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

CREATE TABLE `weather_day` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `city_id` varchar(10) NOT NULL,
  `weather_date` date NOT NULL,
  `weather_status` varchar(255) NOT NULL,
  `weather_icon` varchar(45) NOT NULL,
  `weather_temperature` decimal(10,2) NOT NULL,
  `weather_pressure` varchar(255) NOT NULL,
  `weather_wind_speed` decimal(10,2) NOT NULL,
  `weather_clouds` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=174 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES ('1566083','Ho Chi Minh','VN'),('1581130','Ha Noi','VN'),('1848169','Yoshino-cho','JP'),('1848266','Yonakuni','JP'),('1850147','Tokyo','JP'),('1852534','Shiida','JP'),('1856798','Miyajima','JP'),('1862944','Heda','JP'),('1880252','Singapore','SG'),('2112454','Kakudate','JP'),('2129761','Kamikawa','JP'),('2410048','New York','SL'),('2641673','New York','GB'),('2643743','London','GB'),('2644486','New York','GB'),('4119617','London','US'),('4298960','London','US'),('4389309','New York','US'),('5128581','New York','US'),('6058560','London','CA'),('6417596','Koya','JP'),('6691616','Kihoku-cho','JP'),('6697514','Asahi','JP'),('6822212','Aisai','JP'),('6941783','Niseko Town','JP'),('7303387','Rishiri Town','JP'),('8198710','Yoshitomi','JP');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;


LOCK TABLES `weather_day` WRITE;
/*!40000 ALTER TABLE `weather_day` DISABLE KEYS */;
INSERT INTO `weather_day` VALUES (148,'2643743','2018-06-26','Clear','01d',15.99,'1026',3.10,'0'),(149,'4119617','2018-06-26','Clouds','04n',26.00,'1015',0.93,'75'),(150,'4298960','2018-06-26','Clouds','04n',20.99,'1020',1.50,'75'),(151,'6058560','2018-06-26','Clear','02n',11.00,'1023',2.10,'5'),(157,'1880252','2018-06-26','Rain','09d',27.23,'1010',0.50,'75'),(158,'1850147','2018-06-26','Clouds','04d',28.02,'1013',6.70,'75'),(169,'2410048','2018-06-26','Rain','10d',23.10,'1017.82',1.81,'92'),(170,'2641673','2018-06-26','Fog','50d',11.29,'1028',0.50,'90'),(171,'2644486','2018-06-26','Mist','50d',11.57,'1028',2.60,'75'),(172,'4389309','2018-06-26','Clouds','02n',24.00,'1012',3.10,'20'),(173,'5128581','2018-06-26','Clear','01n',16.60,'1022',3.08,'1');
/*!40000 ALTER TABLE `weather_day` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-26 13:46:13
