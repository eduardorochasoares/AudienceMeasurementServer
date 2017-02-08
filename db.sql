CREATE DATABASE  IF NOT EXISTS `audiencemeasurement` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `audiencemeasurement`;
-- MySQL dump 10.13  Distrib 5.5.53, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: audiencemeasurement
-- ------------------------------------------------------
-- Server version	5.5.53-0+deb8u1

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
-- Table structure for table `amfcapabilityprofile`
--

DROP TABLE IF EXISTS `amfcapabilityprofile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amfcapabilityprofile` (
  `id_amf` int(11) NOT NULL AUTO_INCREMENT,
  `ConfigurationPackageRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`id_amf`),
  KEY `amf_config_fk_idx` (`ConfigurationPackageRequest_id`),
  CONSTRAINT `amf_config_fk` FOREIGN KEY (`ConfigurationPackageRequest_id`) REFERENCES `configurationpackagerequest` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amfcapabilityprofile`
--

LOCK TABLES `amfcapabilityprofile` WRITE;
/*!40000 ALTER TABLE `amfcapabilityprofile` DISABLE KEYS */;
INSERT INTO `amfcapabilityprofile` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15),(16,16),(17,17),(18,18),(19,19),(20,20),(21,21),(22,22),(23,23),(24,24),(25,25),(26,26),(27,27),(28,28),(29,29),(30,30),(31,31),(32,32),(33,33),(34,34),(35,35),(36,36),(37,37),(38,38),(39,39),(40,40),(41,41),(42,42),(43,43),(44,44),(45,45),(46,46),(47,47),(48,48),(49,49),(50,50),(51,51),(52,52),(53,53),(54,54),(55,55),(56,56),(57,57),(58,58);
/*!40000 ALTER TABLE `amfcapabilityprofile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amfconfigpckg`
--

DROP TABLE IF EXISTS `amfconfigpckg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amfconfigpckg` (
  `idamfconfigpckg` int(11) NOT NULL AUTO_INCREMENT,
  `effectiveDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `future` tinyint(1) DEFAULT NULL,
  `configpckgrequestresponse_id` int(11) NOT NULL,
  PRIMARY KEY (`idamfconfigpckg`),
  KEY `fk_amfconfigpckg_configpckg_idx` (`configpckgrequestresponse_id`),
  CONSTRAINT `fk_amfconfigpckg_configpckg` FOREIGN KEY (`configpckgrequestresponse_id`) REFERENCES `configpckgrequestresponse` (`idconfigpckgrequestresponse`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amfconfigpckg`
--

LOCK TABLES `amfconfigpckg` WRITE;
/*!40000 ALTER TABLE `amfconfigpckg` DISABLE KEYS */;
INSERT INTO `amfconfigpckg` VALUES (1,'2016-08-03 15:00:00',0,1),(2,'2016-08-03 15:00:00',0,2),(3,'2016-08-03 15:00:00',0,3),(4,'2016-08-03 15:00:00',0,4),(5,'2016-08-03 15:00:00',0,5),(6,'2016-08-03 15:00:00',0,6),(7,'2016-08-03 15:00:00',0,7),(8,'2016-08-03 15:00:00',0,8),(9,'2016-08-03 15:00:00',0,9),(10,'2016-08-03 15:00:00',0,10),(11,'2016-08-03 15:00:00',0,11),(12,'2016-08-03 15:00:00',0,12),(13,'2016-08-03 15:00:00',0,13),(14,'2016-08-03 15:00:00',0,14),(15,'2016-08-03 15:00:00',0,15),(16,'2016-08-03 15:00:00',0,16),(17,'2016-08-03 15:00:00',0,17),(18,'2016-08-03 15:00:00',0,18),(19,'2016-08-03 15:00:00',0,19),(20,'2016-08-03 15:00:00',0,20),(21,'2016-08-03 15:00:00',0,21),(22,'2016-08-03 15:00:00',0,22),(23,'2016-08-03 15:00:00',0,23),(24,'2016-08-03 15:00:00',0,24),(25,'2016-08-03 15:00:00',0,25),(26,'2016-08-03 15:00:00',0,26),(27,'2016-08-03 15:00:00',0,27),(28,'2016-08-03 15:00:00',0,28),(29,'2016-08-03 15:00:00',0,29),(30,'2016-08-03 15:00:00',0,30),(31,'2016-08-03 15:00:00',0,31),(32,'2016-08-03 15:00:00',0,32),(33,'2016-08-03 15:00:00',0,33),(34,'2016-08-03 15:00:00',0,34),(35,'2016-08-03 15:00:00',0,35),(36,'2016-08-03 15:00:00',0,36),(37,'2016-08-03 15:00:00',0,37),(38,'2016-08-03 15:00:00',0,38),(39,'2016-08-03 15:00:00',0,39),(40,'2016-08-03 15:00:00',0,40),(41,'2016-08-03 15:00:00',0,41),(42,'2016-08-03 15:00:00',0,42),(43,'2016-08-03 15:00:00',0,43),(44,'2016-08-03 15:00:00',0,44),(45,'2016-08-03 15:00:00',0,45),(46,'2016-08-03 15:00:00',0,46),(47,'2016-08-03 15:00:00',0,47),(48,'2016-08-03 15:00:00',0,48),(49,'2016-08-03 15:00:00',0,49),(50,'2016-08-03 15:00:00',0,50),(51,'2016-08-03 15:00:00',0,51),(52,'2016-08-03 15:00:00',0,52),(53,'2016-08-03 15:00:00',0,53),(54,'2016-08-03 15:00:00',0,54),(55,'2016-08-03 15:00:00',0,55),(56,'2016-08-03 15:00:00',0,56);
/*!40000 ALTER TABLE `amfconfigpckg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amreportpackage`
--

DROP TABLE IF EXISTS `amreportpackage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amreportpackage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subscriberID` varchar(45) NOT NULL,
  `terminalDeviceID` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=649 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amreportpackage`
--

LOCK TABLES `amreportpackage` WRITE;
/*!40000 ALTER TABLE `amreportpackage` DISABLE KEYS */;
INSERT INTO `amreportpackage` VALUES (1,'12345','I3E56'),(2,'12345','I3E56'),(3,'12345','I3E56'),(4,'12345','I3E56'),(5,'12345','I3E56'),(6,'12345','I3E56'),(7,'12345','I3E56'),(8,'12345','I3E56'),(9,'12345','I3E56'),(10,'12345','I3E56'),(11,'12345','I3E56'),(12,'12345','I3E56'),(13,'12345','I3E56'),(14,'12345','I3E56'),(15,'12345','I3E56'),(16,'12345','I3E56'),(17,'12345','I3E56'),(18,'12345','I3E56'),(19,'12345','I3E56'),(20,'12345','I3E56'),(21,'12345','I3E56'),(22,'12345','I3E56'),(23,'12345','I3E56'),(24,'12345','I3E56'),(25,'12345','I3E56'),(26,'12345','I3E56'),(27,'12345','I3E56'),(28,'12345','I3E56'),(29,'12345','I3E56'),(30,'12345','I3E56'),(31,'12345','I3E56'),(32,'12345','I3E56'),(33,'12345','I3E56'),(34,'12345','I3E56'),(35,'12345','I3E56'),(36,'12345','I3E56'),(37,'12345','I3E56'),(38,'12345','I3E56'),(39,'12345','I3E56'),(40,'12345','I3E56'),(41,'12345','I3E56'),(42,'12345','I3E56'),(43,'12345','I3E56'),(44,'12345','I3E56'),(45,'12345','I3E56'),(46,'12345','I3E56'),(47,'12345','I3E56'),(48,'12345','I3E56'),(49,'12345','I3E56'),(50,'12345','I3E56'),(51,'12345','I3E56'),(52,'12345','I3E56'),(53,'12345','I3E56'),(54,'12345','I3E56'),(55,'12345','I3E56'),(56,'12345','I3E56'),(57,'12345','I3E56'),(58,'12345','I3E56'),(59,'12345','I3E56'),(60,'12345','I3E56'),(61,'12345','I3E56'),(62,'12345','I3E56'),(63,'12345','I3E56'),(64,'12345','I3E56'),(65,'12345','I3E56'),(66,'12345','I3E56'),(67,'12345','I3E56'),(68,'12345','I3E56'),(69,'12345','I3E56'),(70,'12345','I3E56'),(71,'12345','I3E56'),(72,'12345','I3E56'),(73,'12345','I3E56'),(74,'12345','I3E56'),(75,'12345','I3E56'),(76,'12345','I3E56'),(77,'12345','I3E56'),(78,'12345','I3E56'),(79,'12345','I3E56'),(80,'12345','I3E56'),(81,'12345','I3E56'),(82,'12345','I3E56'),(83,'12345','I3E56'),(84,'12345','I3E56'),(85,'12345','I3E56'),(86,'12345','I3E56'),(87,'12345','I3E56'),(88,'12345','I3E56'),(89,'12345','I3E56'),(90,'12345','I3E56'),(91,'12345','I3E56'),(92,'12345','I3E56'),(93,'12345','I3E56'),(94,'12345','I3E56'),(95,'12345','I3E56'),(96,'12345','I3E56'),(97,'12345','I3E56'),(98,'12345','I3E56'),(99,'12345','I3E56'),(100,'12345','I3E56'),(101,'12345','I3E56'),(102,'12345','I3E56'),(103,'12345','I3E56'),(104,'12345','I3E56'),(105,'12345','I3E56'),(106,'12345','I3E56'),(107,'12345','I3E56'),(108,'12345','I3E56'),(109,'12345','I3E56'),(110,'12345','I3E56'),(111,'12345','I3E56'),(112,'12345','I3E56'),(113,'12345','I3E56'),(114,'12345','I3E56'),(115,'12345','I3E56'),(116,'12345','I3E56'),(117,'12345','I3E56'),(118,'12345','I3E56'),(119,'12345','I3E56'),(120,'12345','I3E56'),(121,'12345','I3E56'),(122,'12345','I3E56'),(123,'12345','I3E56'),(124,'12345','I3E56'),(125,'12345','I3E56'),(126,'12345','I3E56'),(127,'12345','I3E56'),(128,'12345','I3E56'),(129,'12345','I3E56'),(130,'12345','I3E56'),(131,'12345','I3E56'),(132,'12345','I3E56'),(133,'12345','I3E56'),(134,'12345','I3E56'),(135,'12345','I3E56'),(136,'12345','I3E56'),(137,'12345','I3E56'),(138,'12345','I3E56'),(139,'12345','I3E56'),(140,'12345','I3E56'),(141,'12345','I3E56'),(142,'12345','I3E56'),(143,'12345','I3E56'),(144,'12345','I3E56'),(145,'12345','I3E56'),(146,'12345','I3E56'),(147,'12345','I3E56'),(148,'12345','I3E56'),(149,'12345','I3E56'),(150,'12345','I3E56'),(151,'12345','I3E56'),(152,'12345','I3E56'),(153,'12345','I3E56'),(154,'12345','I3E56'),(155,'12345','I3E56'),(156,'12345','I3E56'),(157,'12345','I3E56'),(158,'12345','I3E56'),(159,'12345','I3E56'),(160,'12345','I3E56'),(161,'12345','I3E56'),(162,'12345','I3E56'),(163,'12345','I3E56'),(164,'12345','I3E56'),(165,'12345','I3E56'),(166,'12345','I3E56'),(167,'12345','I3E56'),(168,'12345','I3E56'),(169,'12345','I3E56'),(170,'12345','I3E56'),(171,'12345','I3E56'),(172,'12345','I3E56'),(173,'12345','I3E56'),(174,'12345','I3E56'),(175,'12345','I3E56'),(176,'12345','I3E56'),(177,'12345','I3E56'),(178,'12345','I3E56'),(179,'12345','I3E56'),(180,'12345','I3E56'),(181,'12345','I3E56'),(182,'12345','I3E56'),(183,'12345','I3E56'),(184,'12345','I3E56'),(185,'12345','I3E56'),(186,'12345','I3E56'),(187,'12345','I3E56'),(188,'12345','I3E56'),(189,'12345','I3E56'),(190,'12345','I3E56'),(191,'12345','I3E56'),(192,'12345','I3E56'),(193,'12345','I3E56'),(194,'12345','I3E56'),(195,'12345','I3E56'),(196,'12345','I3E56'),(197,'12345','I3E56'),(198,'12345','I3E56'),(199,'12345','I3E56'),(200,'12345','I3E56'),(201,'12345','I3E56'),(202,'12345','I3E56'),(203,'12345','I3E56'),(204,'12345','I3E56'),(205,'12345','I3E56'),(206,'12345','I3E56'),(207,'12345','I3E56'),(208,'12345','I3E56'),(209,'12345','I3E56'),(210,'12345','I3E56'),(211,'12345','I3E56'),(212,'12345','I3E56'),(213,'12345','I3E56'),(214,'12345','I3E56'),(215,'12345','I3E56'),(216,'12345','I3E56'),(217,'12345','I3E56'),(218,'12345','I3E56'),(219,'12345','I3E56'),(220,'12345','I3E56'),(221,'12345','I3E56'),(222,'12345','I3E56'),(223,'12345','I3E56'),(224,'12345','I3E56'),(225,'12345','I3E56'),(226,'12345','I3E56'),(227,'12345','I3E56'),(228,'12345','I3E56'),(229,'12345','I3E56'),(230,'12345','I3E56'),(231,'12345','I3E56'),(232,'12345','I3E56'),(233,'12345','I3E56'),(234,'12345','I3E56'),(235,'12345','I3E56'),(236,'12345','I3E56'),(237,'12345','I3E56'),(238,'12345','I3E56'),(239,'12345','I3E56'),(240,'12345','I3E56'),(241,'12345','I3E56'),(242,'12345','I3E56'),(243,'12345','I3E56'),(244,'12345','I3E56'),(245,'12345','I3E56'),(246,'12345','I3E56'),(247,'12345','I3E56'),(248,'12345','I3E56'),(249,'12345','I3E56'),(250,'12345','I3E56'),(251,'12345','I3E56'),(252,'12345','I3E56'),(253,'12345','I3E56'),(254,'12345','I3E56'),(255,'12345','I3E56'),(256,'12345','I3E56'),(257,'12345','I3E56'),(258,'12345','I3E56'),(259,'12345','I3E56'),(260,'12345','I3E56'),(261,'12345','I3E56'),(262,'12345','I3E56'),(263,'12345','I3E56'),(264,'12345','I3E56'),(265,'12345','I3E56'),(266,'12345','I3E56'),(267,'12345','I3E56'),(268,'12345','I3E56'),(269,'12345','I3E56'),(270,'12345','I3E56'),(271,'12345','I3E56'),(272,'12345','I3E56'),(273,'12345','I3E56'),(274,'12345','I3E56'),(275,'12345','I3E56'),(276,'12345','I3E56'),(277,'12345','I3E56'),(278,'12345','I3E56'),(279,'12345','I3E56'),(280,'12345','I3E56'),(281,'12345','I3E56'),(282,'12345','I3E56'),(283,'12345','I3E56'),(284,'12345','I3E56'),(285,'12345','I3E56'),(286,'12345','I3E56'),(287,'12345','I3E56'),(288,'12345','I3E56'),(289,'12345','I3E56'),(290,'12345','I3E56'),(291,'12345','I3E56'),(292,'12345','I3E56'),(293,'12345','I3E56'),(294,'12345','I3E56'),(295,'12345','I3E56'),(296,'12345','I3E56'),(297,'12345','I3E56'),(298,'12345','I3E56'),(299,'12345','I3E56'),(300,'12345','I3E56'),(301,'12345','I3E56'),(302,'12345','I3E56'),(303,'12345','I3E56'),(304,'12345','I3E56'),(305,'12345','I3E56'),(306,'12345','I3E56'),(307,'12345','I3E56'),(308,'12345','I3E56'),(309,'12345','I3E56'),(310,'12345','I3E56'),(311,'12345','I3E56'),(312,'12345','I3E56'),(313,'12345','I3E56'),(314,'12345','I3E56'),(315,'12345','I3E56'),(316,'12345','I3E56'),(317,'12345','I3E56'),(318,'12345','I3E56'),(319,'12345','I3E56'),(320,'12345','I3E56'),(321,'12345','I3E56'),(322,'12345','I3E56'),(323,'12345','I3E56'),(324,'12345','I3E56'),(325,'12345','I3E56'),(326,'12345','I3E56'),(327,'12345','I3E56'),(328,'12345','I3E56'),(329,'12345','I3E56'),(330,'12345','I3E56'),(331,'12345','I3E56'),(332,'12345','I3E56'),(333,'12345','I3E56'),(334,'12345','I3E56'),(335,'12345','I3E56'),(336,'12345','I3E56'),(337,'12345','I3E56'),(338,'12345','I3E56'),(339,'12345','I3E56'),(340,'12345','I3E56'),(341,'12345','I3E56'),(342,'12345','I3E56'),(343,'12345','I3E56'),(344,'12345','I3E56'),(345,'12345','I3E56'),(346,'12345','I3E56'),(347,'12345','I3E56'),(348,'12345','I3E56'),(349,'12345','I3E56'),(350,'12345','I3E56'),(351,'12345','I3E56'),(352,'12345','I3E56'),(353,'12345','I3E56'),(354,'12345','I3E56'),(355,'12345','I3E56'),(356,'12345','I3E56'),(357,'12345','I3E56'),(358,'12345','I3E56'),(359,'12345','I3E56'),(360,'12345','I3E56'),(361,'12345','I3E56'),(362,'12345','I3E56'),(363,'12345','I3E56'),(364,'12345','I3E56'),(365,'12345','I3E56'),(366,'12345','I3E56'),(367,'12345','I3E56'),(368,'12345','I3E56'),(369,'12345','I3E56'),(370,'12345','I3E56'),(371,'12345','I3E56'),(372,'12345','I3E56'),(373,'12345','I3E56'),(374,'12345','I3E56'),(375,'12345','I3E56'),(376,'12345','I3E56'),(377,'12345','I3E56'),(378,'12345','I3E56'),(379,'12345','I3E56'),(380,'12345','I3E56'),(381,'12345','I3E56'),(382,'12345','I3E56'),(383,'12345','I3E56'),(384,'12345','I3E56'),(385,'12345','I3E56'),(386,'12345','I3E56'),(387,'12345','I3E56'),(388,'12345','I3E56'),(389,'12345','I3E56'),(390,'12345','I3E56'),(391,'12345','I3E56'),(392,'12345','I3E56'),(393,'12345','I3E56'),(394,'12345','I3E56'),(395,'12345','I3E56'),(396,'12345','I3E56'),(397,'12345','I3E56'),(398,'12345','I3E56'),(399,'12345','I3E56'),(400,'12345','I3E56'),(401,'12345','I3E56'),(402,'12345','I3E56'),(403,'12345','I3E56'),(404,'12345','I3E56'),(405,'12345','I3E56'),(406,'12345','I3E56'),(407,'12345','I3E56'),(408,'12345','I3E56'),(409,'12345','I3E56'),(410,'12345','I3E56'),(411,'12345','I3E56'),(412,'12345','I3E56'),(413,'12345','I3E56'),(414,'12345','I3E56'),(415,'12345','I3E56'),(416,'12345','I3E56'),(417,'12345','I3E56'),(418,'12345','I3E56'),(419,'12345','I3E56'),(420,'12345','I3E56'),(421,'12345','I3E56'),(422,'12345','I3E56'),(423,'12345','I3E56'),(424,'12345','I3E56'),(425,'12345','I3E56'),(426,'12345','I3E56'),(427,'12345','I3E56'),(428,'12345','I3E56'),(429,'12345','I3E56'),(430,'12345','I3E56'),(431,'12345','I3E56'),(432,'12345','I3E56'),(433,'12345','I3E56'),(434,'12345','I3E56'),(435,'12345','I3E56'),(436,'12345','I3E56'),(437,'12345','I3E56'),(438,'12345','I3E56'),(439,'12345','I3E56'),(440,'12345','I3E56'),(441,'12345','I3E56'),(442,'12345','I3E56'),(443,'12345','I3E56'),(444,'12345','I3E56'),(445,'12345','I3E56'),(446,'12345','I3E56'),(447,'12345','I3E56'),(448,'12345','I3E56'),(449,'12345','I3E56'),(450,'12345','I3E56'),(451,'12345','I3E56'),(452,'12345','I3E56'),(453,'12345','I3E56'),(454,'12345','I3E56'),(455,'12345','I3E56'),(456,'12345','I3E56'),(457,'12345','I3E56'),(458,'12345','I3E56'),(459,'12345','I3E56'),(460,'12345','I3E56'),(461,'12345','I3E56'),(462,'12345','I3E56'),(463,'12345','I3E56'),(464,'12345','I3E56'),(465,'12345','I3E56'),(466,'12345','I3E56'),(467,'12345','I3E56'),(468,'12345','I3E56'),(469,'12345','I3E56'),(470,'12345','I3E56'),(471,'12345','I3E56'),(472,'12345','I3E56'),(473,'12345','I3E56'),(474,'12345','I3E56'),(475,'12345','I3E56'),(476,'12345','I3E56'),(477,'12345','I3E56'),(478,'12345','I3E56'),(479,'12345','I3E56'),(480,'12345','I3E56'),(481,'12345','I3E56'),(482,'12345','I3E56'),(483,'12345','I3E56'),(484,'12345','I3E56'),(485,'12345','I3E56'),(486,'12345','I3E56'),(487,'12345','I3E56'),(488,'12345','I3E56'),(489,'12345','I3E56'),(490,'12345','I3E56'),(491,'12345','I3E56'),(492,'12345','I3E56'),(493,'12345','I3E56'),(494,'12345','I3E56'),(495,'12345','I3E56'),(496,'12345','I3E56'),(497,'12345','I3E56'),(498,'12345','I3E56'),(499,'12345','I3E56'),(500,'12345','I3E56'),(501,'12345','I3E56'),(502,'12345','I3E56'),(503,'12345','I3E56'),(504,'12345','I3E56'),(505,'12345','I3E56'),(506,'12345','I3E56'),(507,'12345','I3E56'),(508,'12345','I3E56'),(509,'12345','I3E56'),(510,'12345','I3E56'),(511,'12345','I3E56'),(512,'12345','I3E56'),(513,'12345','I3E56'),(514,'12345','I3E56'),(515,'12345','I3E56'),(516,'12345','I3E56'),(517,'12345','I3E56'),(518,'12345','I3E56'),(519,'12345','I3E56'),(520,'12345','I3E56'),(521,'12345','I3E56'),(522,'12345','I3E56'),(523,'12345','I3E56'),(524,'12345','I3E56'),(525,'12345','I3E56'),(526,'12345','I3E56'),(527,'12345','I3E56'),(528,'12345','I3E56'),(529,'12345','I3E56'),(530,'12345','I3E56'),(531,'12345','I3E56'),(532,'12345','I3E56'),(533,'12345','I3E56'),(534,'12345','I3E56'),(535,'12345','I3E56'),(536,'12345','I3E56'),(537,'12345','I3E56'),(538,'12345','I3E56'),(539,'12345','I3E56'),(540,'12345','I3E56'),(541,'12345','I3E56'),(542,'12345','I3E56'),(543,'12345','I3E56'),(544,'12345','I3E56'),(545,'12345','I3E56'),(546,'12345','I3E56'),(547,'12345','I3E56'),(548,'12345','I3E56'),(549,'12345','I3E56'),(550,'12345','I3E56'),(551,'12345','I3E56'),(552,'12345','I3E56'),(553,'12345','I3E56'),(554,'12345','I3E56'),(555,'12345','I3E56'),(556,'12345','I3E56'),(557,'12345','I3E56'),(558,'12345','I3E56'),(559,'12345','I3E56'),(560,'12345','I3E56'),(561,'12345','I3E56'),(562,'12345','I3E56'),(563,'12345','I3E56'),(564,'12345','I3E56'),(565,'12345','I3E56'),(566,'12345','I3E56'),(567,'12345','I3E56'),(568,'12345','I3E56'),(569,'12345','I3E56'),(570,'12345','I3E56'),(571,'12345','I3E56'),(572,'12345','I3E56'),(573,'12345','I3E56'),(574,'12345','I3E56'),(575,'12345','I3E56'),(576,'12345','I3E56'),(577,'12345','I3E56'),(578,'12345','I3E56'),(579,'12345','I3E56'),(580,'12345','I3E56'),(581,'12345','I3E56'),(582,'12345','I3E56'),(583,'12345','I3E56'),(584,'12345','I3E56'),(585,'12345','I3E56'),(586,'12345','I3E56'),(587,'12345','I3E56'),(588,'12345','I3E56'),(589,'12345','I3E56'),(590,'12345','I3E56'),(591,'12345','I3E56'),(592,'12345','I3E56'),(593,'12345','I3E56'),(594,'12345','I3E56'),(595,'12345','I3E56'),(596,'12345','I3E56'),(597,'12345','I3E56'),(598,'12345','I3E56'),(599,'12345','I3E56'),(600,'12345','I3E56'),(601,'12345','I3E56'),(602,'12345','I3E56'),(603,'12345','I3E56'),(604,'12345','I3E56'),(605,'12345','I3E56'),(606,'12345','I3E56'),(607,'12345','I3E56'),(608,'12345','I3E56'),(609,'12345','I3E56'),(610,'12345','I3E56'),(611,'12345','I3E56'),(612,'12345','I3E56'),(613,'12345','I3E56'),(614,'12345','I3E56'),(615,'12345','I3E56'),(616,'12345','I3E56'),(617,'12345','I3E56'),(618,'12345','I3E56'),(619,'12345','I3E56'),(620,'12345','I3E56'),(621,'12345','I3E56'),(622,'12345','I3E56'),(623,'12345','I3E56'),(624,'12345','I3E56'),(625,'12345','I3E56'),(626,'12345','I3E56'),(627,'12345','I3E56'),(628,'12345','I3E56'),(629,'12345','I3E56'),(630,'12345','I3E56'),(631,'12345','I3E56'),(632,'12345','I3E56'),(633,'12345','I3E56'),(634,'12345','I3E56'),(635,'12345','I3E56'),(636,'12345','I3E56'),(637,'12345','I3E56'),(638,'12345','I3E56'),(639,'12345','I3E56'),(640,'12345','I3E56'),(641,'12345','I3E56'),(642,'12345','I3E56'),(643,'12345','I3E56'),(644,'12345','I3E56'),(645,'12345','I3E56'),(646,'12345','I3E56'),(647,'12345','I3E56'),(648,'12345','I3E56');
/*!40000 ALTER TABLE `amreportpackage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audiovolume`
--

DROP TABLE IF EXISTS `audiovolume`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audiovolume` (
  `idaudiovolume` int(11) NOT NULL AUTO_INCREMENT,
  `volumeDirection` varchar(45) NOT NULL,
  `serviceInstanceID` int(11) NOT NULL,
  `measurementReport_id` int(11) NOT NULL,
  PRIMARY KEY (`idaudiovolume`),
  KEY `fk_audiovolume_mr_idx` (`measurementReport_id`),
  CONSTRAINT `fk_audiovolume_mr` FOREIGN KEY (`measurementReport_id`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audiovolume`
--

LOCK TABLES `audiovolume` WRITE;
/*!40000 ALTER TABLE `audiovolume` DISABLE KEYS */;
/*!40000 ALTER TABLE `audiovolume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channellist`
--

DROP TABLE IF EXISTS `channellist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `channellist` (
  `idchannellist` int(11) NOT NULL AUTO_INCREMENT,
  `serviceIdentifier` varchar(45) NOT NULL,
  `id_tvLinear` int(11) NOT NULL,
  PRIMARY KEY (`idchannellist`),
  KEY `fk_channellist_tvqualiifier_idx` (`id_tvLinear`),
  CONSTRAINT `fk_channellist_tvqualiifier` FOREIGN KEY (`id_tvLinear`) REFERENCES `lineartvqualififer` (`idlineartvqualififer`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channellist`
--

LOCK TABLES `channellist` WRITE;
/*!40000 ALTER TABLE `channellist` DISABLE KEYS */;
INSERT INTO `channellist` VALUES (1,'ALL',1),(2,'ALL',2),(3,'ALL',3),(4,'ALL',4),(5,'ALL',5),(6,'ALL',6),(7,'ALL',7),(8,'ALL',8),(9,'ALL',9),(10,'ALL',10),(11,'ALL',11),(12,'ALL',12),(13,'ALL',13),(14,'ALL',14),(15,'ALL',15),(16,'ALL',16),(17,'ALL',17),(18,'ALL',18),(19,'ALL',19),(20,'ALL',20),(21,'ALL',21),(22,'ALL',22),(23,'ALL',23),(24,'ALL',24),(25,'ALL',25),(26,'ALL',26),(27,'ALL',27),(28,'ALL',28),(29,'ALL',29),(30,'ALL',30),(31,'ALL',31),(32,'ALL',32),(33,'ALL',33),(34,'ALL',34),(35,'ALL',35),(36,'ALL',36),(37,'ALL',37),(38,'ALL',38),(39,'ALL',39),(40,'ALL',40),(41,'ALL',41),(42,'ALL',42),(43,'ALL',43),(44,'ALL',44),(45,'ALL',45),(46,'ALL',46),(47,'ALL',47),(48,'ALL',48),(49,'ALL',49),(50,'ALL',50),(51,'ALL',51),(52,'ALL',52),(53,'ALL',53),(54,'ALL',54),(55,'ALL',55),(56,'ALL',56);
/*!40000 ALTER TABLE `channellist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channelplaying`
--

DROP TABLE IF EXISTS `channelplaying`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `channelplaying` (
  `idchannelplaying` int(11) NOT NULL AUTO_INCREMENT,
  `serviceIdentifier` varchar(45) NOT NULL,
  `serviceInstanceID` int(11) NOT NULL,
  `measurementReport_id` int(11) NOT NULL,
  PRIMARY KEY (`idchannelplaying`),
  KEY `fk_channelplaying_mr_idx` (`measurementReport_id`),
  CONSTRAINT `fk_channelplaying_mr` FOREIGN KEY (`measurementReport_id`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channelplaying`
--

LOCK TABLES `channelplaying` WRITE;
/*!40000 ALTER TABLE `channelplaying` DISABLE KEYS */;
/*!40000 ALTER TABLE `channelplaying` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channelstart`
--

DROP TABLE IF EXISTS `channelstart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `channelstart` (
  `idchannelstart` int(11) NOT NULL AUTO_INCREMENT,
  `controlDevice` varchar(45) DEFAULT NULL,
  `startNavMethod` varchar(45) DEFAULT NULL,
  `previousServiceInstanceID` int(11) DEFAULT NULL,
  `serviceIdentifier` varchar(45) NOT NULL,
  `viewMode` varchar(45) DEFAULT NULL,
  `obscuration` varchar(45) DEFAULT NULL,
  `serviceInstanceID` int(11) NOT NULL,
  `measurementReport_id` int(11) NOT NULL,
  PRIMARY KEY (`idchannelstart`),
  KEY `fk_channelstart_mr_idx` (`measurementReport_id`),
  CONSTRAINT `fk_channelstart_mr` FOREIGN KEY (`measurementReport_id`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channelstart`
--

LOCK TABLES `channelstart` WRITE;
/*!40000 ALTER TABLE `channelstart` DISABLE KEYS */;
/*!40000 ALTER TABLE `channelstart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channelstop`
--

DROP TABLE IF EXISTS `channelstop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `channelstop` (
  `idchannelstop` int(11) NOT NULL AUTO_INCREMENT,
  `controlDevice` varchar(45) DEFAULT NULL,
  `serviceInstanceID` int(11) NOT NULL,
  `stopNavMethod` varchar(45) DEFAULT NULL,
  `measurementReport_id` int(11) NOT NULL,
  PRIMARY KEY (`idchannelstop`),
  KEY `fk_channelstop_mr_idx` (`measurementReport_id`),
  CONSTRAINT `fk_channelstop_mr` FOREIGN KEY (`measurementReport_id`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channelstop`
--

LOCK TABLES `channelstop` WRITE;
/*!40000 ALTER TABLE `channelstop` DISABLE KEYS */;
/*!40000 ALTER TABLE `channelstop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compression`
--

DROP TABLE IF EXISTS `compression`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compression` (
  `id_compression` int(11) NOT NULL AUTO_INCREMENT,
  `compression` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`id_compression`),
  KEY `fk_compression_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_compression_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compression`
--

LOCK TABLES `compression` WRITE;
/*!40000 ALTER TABLE `compression` DISABLE KEYS */;
INSERT INTO `compression` VALUES (1,'None',1),(2,'None',2),(3,'None',3),(4,'None',4),(5,'None',5),(6,'None',6),(7,'None',7),(8,'None',8),(9,'None',9),(10,'None',10),(11,'None',11),(12,'None',12),(13,'None',13),(14,'None',14),(15,'None',15),(16,'None',16),(17,'None',17),(18,'None',18),(19,'None',19),(20,'None',20),(21,'None',21),(22,'None',22),(23,'None',23),(24,'None',24),(25,'None',25),(26,'None',26),(27,'None',27),(28,'None',28),(29,'None',29),(30,'None',30),(31,'None',31),(32,'None',32),(33,'None',33),(34,'None',34),(35,'None',35),(36,'None',36),(37,'None',37),(38,'None',38),(39,'None',39),(40,'None',40),(41,'None',41),(42,'None',42),(43,'None',43),(44,'None',44),(45,'None',45),(46,'None',46),(47,'None',47),(48,'None',48),(49,'None',49),(50,'None',50),(51,'None',51),(52,'None',52),(53,'None',53),(54,'None',54),(55,'None',55),(56,'None',56),(57,'None',57),(58,'None',58);
/*!40000 ALTER TABLE `compression` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configpckgrequestresponse`
--

DROP TABLE IF EXISTS `configpckgrequestresponse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configpckgrequestresponse` (
  `idconfigpckgrequestresponse` int(11) NOT NULL AUTO_INCREMENT,
  `configPckgCheckDelay` int(11) DEFAULT NULL,
  `id_configrequest` int(11) NOT NULL,
  PRIMARY KEY (`idconfigpckgrequestresponse`),
  KEY `fk_configpckgrequestresponse_configreq_idx` (`id_configrequest`),
  CONSTRAINT `fk_configpckgrequestresponse_configreq` FOREIGN KEY (`id_configrequest`) REFERENCES `configurationpackagerequest` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configpckgrequestresponse`
--

LOCK TABLES `configpckgrequestresponse` WRITE;
/*!40000 ALTER TABLE `configpckgrequestresponse` DISABLE KEYS */;
INSERT INTO `configpckgrequestresponse` VALUES (1,600,3),(2,600,4),(3,600,5),(4,600,6),(5,600,7),(6,600,8),(7,600,9),(8,600,10),(9,600,11),(10,600,12),(11,600,13),(12,600,14),(13,600,15),(14,600,16),(15,600,17),(16,600,18),(17,600,19),(18,600,20),(19,600,21),(20,600,22),(21,600,23),(22,600,24),(23,600,25),(24,600,26),(25,600,27),(26,600,28),(27,600,29),(28,600,30),(29,600,31),(30,600,32),(31,600,33),(32,600,34),(33,600,35),(34,600,36),(35,600,37),(36,600,38),(37,600,39),(38,600,40),(39,600,41),(40,600,42),(41,600,43),(42,600,44),(43,600,45),(44,600,46),(45,600,47),(46,600,48),(47,600,49),(48,600,50),(49,600,51),(50,600,52),(51,600,53),(52,600,54),(53,600,55),(54,600,56),(55,600,57),(56,600,58);
/*!40000 ALTER TABLE `configpckgrequestresponse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configurationmode`
--

DROP TABLE IF EXISTS `configurationmode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configurationmode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `configurationMode` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_configurationmode_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_configurationmode_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configurationmode`
--

LOCK TABLES `configurationmode` WRITE;
/*!40000 ALTER TABLE `configurationmode` DISABLE KEYS */;
INSERT INTO `configurationmode` VALUES (1,'Pull',1),(2,'Pull',2),(3,'Pull',3),(4,'Pull',4),(5,'Pull',5),(6,'Pull',6),(7,'Pull',7),(8,'Pull',8),(9,'Pull',9),(10,'Pull',10),(11,'Pull',11),(12,'Pull',12),(13,'Pull',13),(14,'Pull',14),(15,'Pull',15),(16,'Pull',16),(17,'Pull',17),(18,'Pull',18),(19,'Pull',19),(20,'Pull',20),(21,'Pull',21),(22,'Pull',22),(23,'Pull',23),(24,'Pull',24),(25,'Pull',25),(26,'Pull',26),(27,'Pull',27),(28,'Pull',28),(29,'Pull',29),(30,'Pull',30),(31,'Pull',31),(32,'Pull',32),(33,'Pull',33),(34,'Pull',34),(35,'Pull',35),(36,'Pull',36),(37,'Pull',37),(38,'Pull',38),(39,'Pull',39),(40,'Pull',40),(41,'Pull',41),(42,'Pull',42),(43,'Pull',43),(44,'Pull',44),(45,'Pull',45),(46,'Pull',46),(47,'Pull',47),(48,'Pull',48),(49,'Pull',49),(50,'Pull',50),(51,'Pull',51),(52,'Pull',52),(53,'Pull',53),(54,'Pull',54),(55,'Pull',55),(56,'Pull',56),(57,'Pull',57),(58,'Pull',58);
/*!40000 ALTER TABLE `configurationmode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configurationpackagerequest`
--

DROP TABLE IF EXISTS `configurationpackagerequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configurationpackagerequest` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `terminalDeviceID` varchar(45) NOT NULL,
  `terminalDeviceType` varchar(45) NOT NULL,
  `serviceProviderIdentifier` varchar(45) NOT NULL,
  `subscriberID` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configurationpackagerequest`
--

LOCK TABLES `configurationpackagerequest` WRITE;
/*!40000 ALTER TABLE `configurationpackagerequest` DISABLE KEYS */;
INSERT INTO `configurationpackagerequest` VALUES (1,'1','2','100',1),(2,'1','2','100',1),(3,'1','2','100',1),(4,'1','2','100',1),(5,'1','2','100',1),(6,'1','2','100',1),(7,'1','2','100',1),(8,'1','2','100',1),(9,'1','2','100',1),(10,'1','2','100',1),(11,'1','2','100',1),(12,'1','2','100',1),(13,'1','2','100',1),(14,'1','2','100',1),(15,'1','2','100',1),(16,'1','2','100',1),(17,'1','2','100',1),(18,'1','2','100',1),(19,'1','2','100',1),(20,'1','2','100',1),(21,'1','2','100',1),(22,'1','2','100',1),(23,'1','2','100',1),(24,'1','2','100',1),(25,'1','2','100',1),(26,'1','2','100',1),(27,'1','2','100',1),(28,'1','2','100',1),(29,'1','2','100',1),(30,'1','2','100',1),(31,'1','2','100',1),(32,'1','2','100',1),(33,'1','2','100',1),(34,'1','2','100',1),(35,'1','2','100',1),(36,'1','2','100',1),(37,'1','2','100',1),(38,'1','2','100',1),(39,'1','2','100',1),(40,'1','2','100',1),(41,'1','2','100',1),(42,'1','2','100',1),(43,'1','2','100',1),(44,'1','2','100',1),(45,'1','2','100',1),(46,'1','2','100',1),(47,'1','2','100',1),(48,'1','2','100',1),(49,'1','2','100',1),(50,'1','2','100',1),(51,'1','2','100',1),(52,'1','2','100',1),(53,'1','2','100',1),(54,'1','2','100',1),(55,'1','2','100',1),(56,'1','2','100',1),(57,'1','2','100',1),(58,'1','2','100',1);
/*!40000 ALTER TABLE `configurationpackagerequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cryptographicprotocol`
--

DROP TABLE IF EXISTS `cryptographicprotocol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cryptographicprotocol` (
  `idcryptographicprotocol` int(11) NOT NULL AUTO_INCREMENT,
  `CryptographicProtocol` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`idcryptographicprotocol`),
  KEY `fk_cryptographicprotocol_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_cryptographicprotocol_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cryptographicprotocol`
--

LOCK TABLES `cryptographicprotocol` WRITE;
/*!40000 ALTER TABLE `cryptographicprotocol` DISABLE KEYS */;
INSERT INTO `cryptographicprotocol` VALUES (1,'TLS',1),(2,'TLS',2),(3,'TLS',3),(4,'TLS',4),(5,'TLS',5),(6,'TLS',6),(7,'TLS',7),(8,'TLS',8),(9,'TLS',9),(10,'TLS',10),(11,'TLS',11),(12,'TLS',12),(13,'TLS',13),(14,'TLS',14),(15,'TLS',15),(16,'TLS',16),(17,'TLS',17),(18,'TLS',18),(19,'TLS',19),(20,'TLS',20),(21,'TLS',21),(22,'TLS',22),(23,'TLS',23),(24,'TLS',24),(25,'TLS',25),(26,'TLS',26),(27,'TLS',27),(28,'TLS',28),(29,'TLS',29),(30,'TLS',30),(31,'TLS',31),(32,'TLS',32),(33,'TLS',33),(34,'TLS',34),(35,'TLS',35),(36,'TLS',36),(37,'TLS',37),(38,'TLS',38),(39,'TLS',39),(40,'TLS',40),(41,'TLS',41),(42,'TLS',42),(43,'TLS',43),(44,'TLS',44),(45,'TLS',45),(46,'TLS',46),(47,'TLS',47),(48,'TLS',48),(49,'TLS',49),(50,'TLS',50),(51,'TLS',51),(52,'TLS',52),(53,'TLS',53),(54,'TLS',54),(55,'TLS',55),(56,'TLS',56),(57,'TLS',57),(58,'TLS',58);
/*!40000 ALTER TABLE `cryptographicprotocol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliveryAddress`
--

DROP TABLE IF EXISTS `deliveryAddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliveryAddress` (
  `iddeliveryAddress` int(11) NOT NULL AUTO_INCREMENT,
  `deliveryAddress` varchar(45) NOT NULL,
  `measurementRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`iddeliveryAddress`),
  KEY `fk_deliveryAddress_mreq_idx` (`measurementRequest_id`),
  CONSTRAINT `fk_deliveryAddress_mreq` FOREIGN KEY (`measurementRequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveryAddress`
--

LOCK TABLES `deliveryAddress` WRITE;
/*!40000 ALTER TABLE `deliveryAddress` DISABLE KEYS */;
INSERT INTO `deliveryAddress` VALUES (1,'[::1]:8009',1),(2,'[::1]:8009',2),(3,'[::1]:8009',3),(4,'[::1]:8009',4),(5,'[::1]:8009',5),(6,'[::1]:8009',6),(7,'[::1]:8009',7),(8,'[::1]:8009',8),(9,'[::1]:8009',9),(10,'[::1]:8009',10),(11,'[::1]:8009',11),(12,'[::1]:8009',12),(13,'[::1]:8009',13),(14,'[::1]:8009',14),(15,'[::1]:8009',15),(16,'[::1]:8009',16),(17,'[::1]:8009',17),(18,'[::1]:8009',18),(19,'[::1]:8009',19),(20,'[::1]:8009',20),(21,'[::1]:8009',21),(22,'[::1]:8009',22),(23,'[::1]:8009',23),(24,'[::1]:8009',24),(25,'[::1]:8009',25),(26,'[::1]:8009',26),(27,'[::1]:8009',27),(28,'[::1]:8009',28),(29,'[::1]:8009',29),(30,'[::1]:8009',30),(31,'[::1]:8009',31),(32,'[::1]:8009',32),(33,'[::1]:8009',33),(34,'[::1]:8009',34),(35,'[::1]:8009',35),(36,'[::1]:8009',36),(37,'[::1]:8009',37),(38,'[::1]:8009',38),(39,'[::1]:8009',39),(40,'[::1]:8009',40),(41,'[::1]:8009',41),(42,'[::1]:8009',42),(43,'[::1]:8009',43),(44,'[::1]:8009',44),(45,'[::1]:8009',45),(46,'[::1]:8009',46),(47,'[::1]:8009',47),(48,'[::1]:8009',48),(49,'[::1]:8009',49),(50,'[::1]:8009',50),(51,'[::1]:8009',51),(52,'[::1]:8009',52),(53,'[::1]:8009',53),(54,'[::1]:8009',54),(55,'[::1]:8009',55),(56,'[::1]:8009',56);
/*!40000 ALTER TABLE `deliveryAddress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliverymode`
--

DROP TABLE IF EXISTS `deliverymode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliverymode` (
  `iddeliverymode` int(11) NOT NULL AUTO_INCREMENT,
  `deliveryMode` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`iddeliverymode`),
  KEY `fk_deliverymode_fk_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_deliverymode_fk` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliverymode`
--

LOCK TABLES `deliverymode` WRITE;
/*!40000 ALTER TABLE `deliverymode` DISABLE KEYS */;
INSERT INTO `deliverymode` VALUES (1,'ImmediatePush',1),(2,'ImmediatePush',2),(3,'ImmediatePush',3),(4,'ImmediatePush',4),(5,'ImmediatePush',5),(6,'ImmediatePush',6),(7,'ImmediatePush',7),(8,'ImmediatePush',8),(9,'ImmediatePush',9),(10,'ImmediatePush',10),(11,'ImmediatePush',11),(12,'ImmediatePush',12),(13,'ImmediatePush',13),(14,'ImmediatePush',14),(15,'ImmediatePush',15),(16,'ImmediatePush',16),(17,'ImmediatePush',17),(18,'ImmediatePush',18),(19,'ImmediatePush',19),(20,'ImmediatePush',20),(21,'ImmediatePush',21),(22,'ImmediatePush',22),(23,'ImmediatePush',23),(24,'ImmediatePush',24),(25,'ImmediatePush',25),(26,'ImmediatePush',26),(27,'ImmediatePush',27),(28,'ImmediatePush',28),(29,'ImmediatePush',29),(30,'ImmediatePush',30),(31,'ImmediatePush',31),(32,'ImmediatePush',32),(33,'ImmediatePush',33),(34,'ImmediatePush',34),(35,'ImmediatePush',35),(36,'ImmediatePush',36),(37,'ImmediatePush',37),(38,'ImmediatePush',38),(39,'ImmediatePush',39),(40,'ImmediatePush',40),(41,'ImmediatePush',41),(42,'ImmediatePush',42),(43,'ImmediatePush',43),(44,'ImmediatePush',44),(45,'ImmediatePush',45),(46,'ImmediatePush',46),(47,'ImmediatePush',47),(48,'ImmediatePush',48),(49,'ImmediatePush',49),(50,'ImmediatePush',50),(51,'ImmediatePush',51),(52,'ImmediatePush',52),(53,'ImmediatePush',53),(54,'ImmediatePush',54),(55,'ImmediatePush',55),(56,'ImmediatePush',56),(57,'ImmediatePush',57),(58,'ImmediatePush',58);
/*!40000 ALTER TABLE `deliverymode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dias`
--

DROP TABLE IF EXISTS `dias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dias` (
  `iddias` int(11) NOT NULL AUTO_INCREMENT,
  `dayoftheweek` int(11) NOT NULL,
  `measurementRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`iddias`),
  KEY `fk_dias_mreq_idx` (`measurementRequest_id`),
  CONSTRAINT `fk_dias_mreq` FOREIGN KEY (`measurementRequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dias`
--

LOCK TABLES `dias` WRITE;
/*!40000 ALTER TABLE `dias` DISABLE KEYS */;
INSERT INTO `dias` VALUES (1,0,1),(2,0,2),(3,0,3),(4,0,4),(5,0,5),(6,0,6),(7,0,7),(8,0,8),(9,0,9),(10,0,10),(11,0,11),(12,0,12),(13,0,13),(14,0,14),(15,0,15),(16,0,16),(17,0,17),(18,0,18),(19,0,19),(20,0,20),(21,0,21),(22,0,22),(23,0,23),(24,0,24),(25,0,25),(26,0,26),(27,0,27),(28,0,28),(29,0,29),(30,0,30),(31,0,31),(32,0,32),(33,0,33),(34,0,34),(35,0,35),(36,0,36),(37,0,37),(38,0,38),(39,0,39),(40,0,40),(41,0,41),(42,0,42),(43,0,43),(44,0,44),(45,0,45),(46,0,46),(47,0,47),(48,0,48),(49,0,49),(50,0,50),(51,0,51),(52,0,52),(53,0,53),(54,0,54),(55,0,55),(56,0,56);
/*!40000 ALTER TABLE `dias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endtime`
--

DROP TABLE IF EXISTS `endtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endtime` (
  `idendtime` int(11) NOT NULL AUTO_INCREMENT,
  `endTime` time NOT NULL,
  `measurementrequest_id` int(11) NOT NULL,
  PRIMARY KEY (`idendtime`),
  KEY `fk_endtime_mreq_idx` (`measurementrequest_id`),
  CONSTRAINT `fk_endtime_mreq` FOREIGN KEY (`measurementrequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endtime`
--

LOCK TABLES `endtime` WRITE;
/*!40000 ALTER TABLE `endtime` DISABLE KEYS */;
INSERT INTO `endtime` VALUES (1,'23:59:59',1),(2,'23:59:59',2),(3,'23:59:59',3),(4,'23:59:59',4),(5,'23:59:59',5),(6,'23:59:59',6),(7,'23:59:59',7),(8,'23:59:59',8),(9,'23:59:59',9),(10,'23:59:59',10),(11,'23:59:59',11),(12,'23:59:59',12),(13,'23:59:59',13),(14,'23:59:59',14),(15,'23:59:59',15),(16,'23:59:59',16),(17,'23:59:59',17),(18,'23:59:59',18),(19,'23:59:59',19),(20,'23:59:59',20),(21,'23:59:59',21),(22,'23:59:59',22),(23,'23:59:59',23),(24,'23:59:59',24),(25,'23:59:59',25),(26,'23:59:59',26),(27,'23:59:59',27),(28,'23:59:59',28),(29,'23:59:59',29),(30,'23:59:59',30),(31,'23:59:59',31),(32,'23:59:59',32),(33,'23:59:59',33),(34,'23:59:59',34),(35,'23:59:59',35),(36,'23:59:59',36),(37,'23:59:59',37),(38,'23:59:59',38),(39,'23:59:59',39),(40,'23:59:59',40),(41,'23:59:59',41),(42,'23:59:59',42),(43,'23:59:59',43),(44,'23:59:59',44),(45,'23:59:59',45),(46,'23:59:59',46),(47,'23:59:59',47),(48,'23:59:59',48),(49,'23:59:59',49),(50,'23:59:59',50),(51,'23:59:59',51),(52,'23:59:59',52),(53,'23:59:59',53),(54,'23:59:59',54),(55,'23:59:59',55),(56,'23:59:59',56);
/*!40000 ALTER TABLE `endtime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventtrigger`
--

DROP TABLE IF EXISTS `eventtrigger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventtrigger` (
  `ideventtrigger` int(11) NOT NULL AUTO_INCREMENT,
  `event` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`ideventtrigger`),
  KEY `fk_eventtrigger_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_eventtrigger_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventtrigger`
--

LOCK TABLES `eventtrigger` WRITE;
/*!40000 ALTER TABLE `eventtrigger` DISABLE KEYS */;
INSERT INTO `eventtrigger` VALUES (1,'VideoResize',1),(2,'AudioVolume',1),(3,'ChannelStart',1),(4,'ChannelStop',1),(5,'VideoResize',2),(6,'AudioVolume',2),(7,'ChannelStart',2),(8,'ChannelStop',2),(9,'VideoResize',3),(10,'AudioVolume',3),(11,'ChannelStart',3),(12,'ChannelStop',3),(13,'VideoResize',4),(14,'AudioVolume',4),(15,'ChannelStart',4),(16,'ChannelStop',4),(17,'VideoResize',5),(18,'AudioVolume',5),(19,'ChannelStart',5),(20,'ChannelStop',5),(21,'VideoResize',6),(22,'AudioVolume',6),(23,'ChannelStart',6),(24,'ChannelStop',6),(25,'VideoResize',7),(26,'AudioVolume',7),(27,'ChannelStart',7),(28,'ChannelStop',7),(29,'VideoResize',8),(30,'AudioVolume',8),(31,'ChannelStart',8),(32,'ChannelStop',8),(33,'VideoResize',9),(34,'AudioVolume',9),(35,'ChannelStart',9),(36,'ChannelStop',9),(37,'VideoResize',10),(38,'AudioVolume',10),(39,'ChannelStart',10),(40,'ChannelStop',10),(41,'VideoResize',11),(42,'AudioVolume',11),(43,'ChannelStart',11),(44,'ChannelStop',11),(45,'VideoResize',12),(46,'AudioVolume',12),(47,'ChannelStart',12),(48,'ChannelStop',12),(49,'VideoResize',13),(50,'AudioVolume',13),(51,'ChannelStart',13),(52,'ChannelStop',13),(53,'VideoResize',14),(54,'AudioVolume',14),(55,'ChannelStart',14),(56,'ChannelStop',14),(57,'VideoResize',15),(58,'AudioVolume',15),(59,'ChannelStart',15),(60,'ChannelStop',15),(61,'VideoResize',16),(62,'AudioVolume',16),(63,'ChannelStart',16),(64,'ChannelStop',16),(65,'VideoResize',17),(66,'AudioVolume',17),(67,'ChannelStart',17),(68,'ChannelStop',17),(69,'VideoResize',18),(70,'AudioVolume',18),(71,'ChannelStart',18),(72,'ChannelStop',18),(73,'VideoResize',19),(74,'AudioVolume',19),(75,'ChannelStart',19),(76,'ChannelStop',19),(77,'VideoResize',20),(78,'AudioVolume',20),(79,'ChannelStart',20),(80,'ChannelStop',20),(81,'VideoResize',21),(82,'AudioVolume',21),(83,'ChannelStart',21),(84,'ChannelStop',21),(85,'VideoResize',22),(86,'AudioVolume',22),(87,'ChannelStart',22),(88,'ChannelStop',22),(89,'VideoResize',23),(90,'AudioVolume',23),(91,'ChannelStart',23),(92,'ChannelStop',23),(93,'VideoResize',24),(94,'AudioVolume',24),(95,'ChannelStart',24),(96,'ChannelStop',24),(97,'VoDEvents',24),(98,'VideoResize',25),(99,'AudioVolume',25),(100,'ChannelStart',25),(101,'ChannelStop',25),(102,'VoDEvents',25),(103,'VideoResize',26),(104,'AudioVolume',26),(105,'ChannelStart',26),(106,'ChannelStop',26),(107,'VoDEvents',26),(108,'VideoResize',27),(109,'AudioVolume',27),(110,'ChannelStart',27),(111,'ChannelStop',27),(112,'VoDEvents',27),(113,'VideoResize',28),(114,'AudioVolume',28),(115,'ChannelStart',28),(116,'ChannelStop',28),(117,'VoDEvents',28),(118,'VideoResize',29),(119,'AudioVolume',29),(120,'ChannelStart',29),(121,'ChannelStop',29),(122,'VideoResize',30),(123,'AudioVolume',30),(124,'ChannelStart',30),(125,'ChannelStop',30),(126,'VoDEvents',30),(127,'VideoResize',31),(128,'AudioVolume',31),(129,'ChannelStart',31),(130,'ChannelStop',31),(131,'VoDEvents',31),(132,'VideoResize',32),(133,'AudioVolume',32),(134,'ChannelStart',32),(135,'ChannelStop',32),(136,'VoDEvents',32),(137,'VideoResize',33),(138,'AudioVolume',33),(139,'ChannelStart',33),(140,'ChannelStop',33),(141,'VoDEvents',33),(142,'VideoResize',34),(143,'AudioVolume',34),(144,'ChannelStart',34),(145,'ChannelStop',34),(146,'VoDEvents',34),(147,'VideoResize',35),(148,'AudioVolume',35),(149,'ChannelStart',35),(150,'ChannelStop',35),(151,'VoDEvents',35),(152,'VideoResize',36),(153,'AudioVolume',36),(154,'ChannelStart',36),(155,'ChannelStop',36),(156,'VoDEvents',36),(157,'VideoResize',37),(158,'AudioVolume',37),(159,'ChannelStart',37),(160,'ChannelStop',37),(161,'VoDEvents',37),(162,'VideoResize',38),(163,'AudioVolume',38),(164,'ChannelStart',38),(165,'ChannelStop',38),(166,'VoDEvents',38),(167,'VideoResize',39),(168,'AudioVolume',39),(169,'ChannelStart',39),(170,'ChannelStop',39),(171,'VoDEvents',39),(172,'VideoResize',40),(173,'AudioVolume',40),(174,'ChannelStart',40),(175,'ChannelStop',40),(176,'VoDEvents',40),(177,'VideoResize',41),(178,'AudioVolume',41),(179,'ChannelStart',41),(180,'ChannelStop',41),(181,'VoDEvents',41),(182,'VideoResize',42),(183,'AudioVolume',42),(184,'ChannelStart',42),(185,'ChannelStop',42),(186,'VoDEvents',42),(187,'VideoResize',43),(188,'AudioVolume',43),(189,'ChannelStart',43),(190,'ChannelStop',43),(191,'VoDEvents',43),(192,'VideoResize',44),(193,'AudioVolume',44),(194,'ChannelStart',44),(195,'ChannelStop',44),(196,'VoDEvents',44),(197,'VideoResize',45),(198,'AudioVolume',45),(199,'ChannelStart',45),(200,'ChannelStop',45),(201,'VoDEvents',45),(202,'VideoResize',46),(203,'AudioVolume',46),(204,'ChannelStart',46),(205,'ChannelStop',46),(206,'VoDEvents',46),(207,'VideoResize',47),(208,'AudioVolume',47),(209,'ChannelStart',47),(210,'ChannelStop',47),(211,'VoDEvents',47),(212,'VideoResize',48),(213,'AudioVolume',48),(214,'ChannelStart',48),(215,'ChannelStop',48),(216,'VoDEvents',48),(217,'VideoResize',49),(218,'AudioVolume',49),(219,'ChannelStart',49),(220,'ChannelStop',49),(221,'VoDEvents',49),(222,'VideoResize',50),(223,'AudioVolume',50),(224,'ChannelStart',50),(225,'ChannelStop',50),(226,'VoDEvents',50),(227,'VideoResize',51),(228,'AudioVolume',51),(229,'ChannelStart',51),(230,'ChannelStop',51),(231,'VoDEvents',51),(232,'VideoResize',52),(233,'AudioVolume',52),(234,'ChannelStart',52),(235,'ChannelStop',52),(236,'VoDEvents',52),(237,'VideoResize',53),(238,'AudioVolume',53),(239,'ChannelStart',53),(240,'ChannelStop',53),(241,'VoDEvents',53),(242,'VideoResize',54),(243,'AudioVolume',54),(244,'ChannelStart',54),(245,'ChannelStop',54),(246,'VoDEvents',54),(247,'VideoResize',55),(248,'AudioVolume',55),(249,'ChannelStart',55),(250,'ChannelStop',55),(251,'VoDEvents',55),(252,'VideoResize',56),(253,'AudioVolume',56),(254,'ChannelStart',56),(255,'ChannelStop',56),(256,'VoDEvents',56),(257,'VideoResize',57),(258,'AudioVolume',57),(259,'ChannelStart',57),(260,'ChannelStop',57),(261,'VoDEvents',57),(262,'VideoResize',58),(263,'AudioVolume',58),(264,'ChannelStart',58),(265,'ChannelStop',58),(266,'VoDEvents',58);
/*!40000 ALTER TABLE `eventtrigger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `immediatepush`
--

DROP TABLE IF EXISTS `immediatepush`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `immediatepush` (
  `idimmediatepush` int(11) NOT NULL AUTO_INCREMENT,
  `measReportnumbnypush` int(11) NOT NULL,
  `maxTimeBetweenDelivery` int(11) NOT NULL,
  `measurementRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`idimmediatepush`),
  KEY `fk_immediatepush_mreq_idx` (`measurementRequest_id`),
  CONSTRAINT `fk_immediatepush_mreq` FOREIGN KEY (`measurementRequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `immediatepush`
--

LOCK TABLES `immediatepush` WRITE;
/*!40000 ALTER TABLE `immediatepush` DISABLE KEYS */;
INSERT INTO `immediatepush` VALUES (1,1,1000,1),(2,1,1000,2),(3,1,1000,3),(4,1,1000,4),(5,1,1000,5),(6,1,1000,6),(7,1,1000,7),(8,1,1000,8),(9,1,1000,9),(10,1,1000,10),(11,1,1000,11),(12,1,1000,12),(13,1,1000,13),(14,1,1000,14),(15,1,1000,15),(16,1,1000,16),(17,1,1000,17),(18,1,1000,18),(19,1,1000,19),(20,1,1000,20),(21,1,1000,21),(22,1,1000,22),(23,1,1000,23),(24,1,1000,24),(25,1,1000,25),(26,1,1000,26),(27,1,1000,27),(28,1,1000,28),(29,1,1000,29),(30,1,1000,30),(31,1,1000,31),(32,1,1000,32),(33,1,1000,33),(34,1,1000,34),(35,1,1000,35),(36,1,1000,36),(37,1,1000,37),(38,1,1000,38),(39,1,1000,39),(40,1,1000,40),(41,1,1000,41),(42,1,1000,42),(43,1,1000,43),(44,1,1000,44),(45,1,1000,45),(46,1,1000,46),(47,1,1000,47),(48,1,1000,48),(49,1,1000,49),(50,1,1000,50),(51,1,1000,51),(52,1,1000,52),(53,1,1000,53),(54,1,1000,54),(55,1,1000,55),(56,1,1000,56);
/*!40000 ALTER TABLE `immediatepush` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lineartvqualififer`
--

DROP TABLE IF EXISTS `lineartvqualififer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lineartvqualififer` (
  `idlineartvqualififer` int(11) NOT NULL AUTO_INCREMENT,
  `navmethod` int(11) NOT NULL,
  `controlDevice` int(11) NOT NULL,
  `viewMode` int(11) NOT NULL,
  `obscuration` int(11) NOT NULL,
  `id_measurementRequest` int(11) NOT NULL,
  PRIMARY KEY (`idlineartvqualififer`),
  KEY `fk_lineartvqualififer_mreq_idx` (`id_measurementRequest`),
  CONSTRAINT `fk_lineartvqualififer_mreq` FOREIGN KEY (`id_measurementRequest`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lineartvqualififer`
--

LOCK TABLES `lineartvqualififer` WRITE;
/*!40000 ALTER TABLE `lineartvqualififer` DISABLE KEYS */;
INSERT INTO `lineartvqualififer` VALUES (1,1,0,1,0,1),(2,1,0,1,0,2),(3,1,0,1,0,3),(4,1,0,1,0,4),(5,1,0,1,0,5),(6,1,0,1,0,6),(7,1,0,1,0,7),(8,1,0,1,0,8),(9,1,0,1,0,9),(10,1,0,1,0,10),(11,1,0,1,0,11),(12,1,0,1,0,12),(13,1,0,1,0,13),(14,1,0,1,0,14),(15,1,0,1,0,15),(16,1,0,1,0,16),(17,1,0,1,0,17),(18,1,0,1,0,18),(19,1,0,1,0,19),(20,1,0,1,0,20),(21,1,0,1,0,21),(22,1,0,1,0,22),(23,1,0,1,0,23),(24,1,0,1,0,24),(25,1,0,1,0,25),(26,1,0,1,0,26),(27,1,0,1,0,27),(28,1,0,1,0,28),(29,1,0,1,0,29),(30,1,0,1,0,30),(31,1,0,1,0,31),(32,1,0,1,0,32),(33,1,0,1,0,33),(34,1,0,1,0,34),(35,1,0,1,0,35),(36,1,0,1,0,36),(37,1,0,1,0,37),(38,1,0,1,0,38),(39,1,0,1,0,39),(40,1,0,1,0,40),(41,1,0,1,0,41),(42,1,0,1,0,42),(43,1,0,1,0,43),(44,1,0,1,0,44),(45,1,0,1,0,45),(46,1,0,1,0,46),(47,1,0,1,0,47),(48,1,0,1,0,48),(49,1,0,1,0,49),(50,1,0,1,0,50),(51,1,0,1,0,51),(52,1,0,1,0,52),(53,1,0,1,0,53),(54,1,0,1,0,54),(55,1,0,1,0,55),(56,1,0,1,0,56);
/*!40000 ALTER TABLE `lineartvqualififer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurementreport`
--

DROP TABLE IF EXISTS `measurementreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurementreport` (
  `idmeasurementreport` int(11) NOT NULL AUTO_INCREMENT,
  `measurementRequestID` int(11) NOT NULL,
  `measurementReportTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `amReportPackage_id` int(11) NOT NULL,
  PRIMARY KEY (`idmeasurementreport`),
  KEY `fk_measurementreport_amr_idx` (`amReportPackage_id`),
  CONSTRAINT `fk_measurementreport_amr` FOREIGN KEY (`amReportPackage_id`) REFERENCES `amreportpackage` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=648 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurementreport`
--

LOCK TABLES `measurementreport` WRITE;
/*!40000 ALTER TABLE `measurementreport` DISABLE KEYS */;
INSERT INTO `measurementreport` VALUES (1,1,'2017-01-24 18:24:06',1),(2,1,'2017-01-24 18:24:11',2),(3,1,'2017-01-24 18:24:16',3),(4,1,'2017-01-24 18:24:21',4),(5,1,'2017-01-24 18:24:26',5),(6,1,'2017-01-24 18:24:31',6),(7,1,'2017-01-24 18:24:36',7),(8,1,'2017-01-24 18:24:41',8),(9,1,'2017-01-24 18:24:46',9),(10,1,'2017-01-24 18:24:51',10),(11,1,'2017-01-24 18:24:56',11),(12,1,'2017-01-24 18:34:50',12),(13,1,'2017-01-24 18:37:27',13),(14,1,'2017-01-24 18:37:32',14),(15,1,'2017-01-24 18:37:37',15),(16,1,'2017-01-24 18:37:42',16),(17,1,'2017-01-24 18:37:47',17),(18,1,'2017-01-24 18:37:52',18),(19,1,'2017-01-24 18:37:57',19),(20,1,'2017-01-24 18:38:02',20),(21,1,'2017-01-24 18:38:07',21),(22,1,'2017-01-24 18:38:12',22),(23,1,'2017-01-24 18:38:17',23),(24,1,'2017-01-24 18:38:22',24),(25,1,'2017-01-24 18:38:27',25),(26,1,'2017-01-24 18:38:32',26),(27,1,'2017-01-24 18:38:37',27),(28,1,'2017-01-24 18:38:42',28),(29,1,'2017-01-24 18:38:47',29),(30,1,'2017-01-24 18:38:52',30),(31,1,'2017-01-24 18:38:57',31),(32,1,'2017-01-24 18:43:10',32),(33,6,'2017-01-24 18:48:23',34),(34,6,'2017-01-24 18:48:28',35),(35,6,'2017-02-06 23:29:41',36),(36,6,'2017-02-06 23:29:46',37),(37,6,'2017-02-06 23:29:51',38),(38,6,'2017-02-06 23:29:56',39),(39,6,'2017-02-06 23:30:01',40),(40,6,'2017-02-06 23:30:06',41),(41,6,'2017-02-06 23:30:11',42),(42,6,'2017-02-06 23:30:16',43),(43,6,'2017-02-06 23:30:21',44),(44,6,'2017-02-06 23:30:26',45),(45,6,'2017-02-06 23:30:31',46),(46,6,'2017-02-06 23:30:36',47),(47,6,'2017-02-06 23:30:41',48),(48,6,'2017-02-06 23:33:49',49),(49,6,'2017-02-06 23:33:49',50),(50,6,'2017-02-06 23:33:54',51),(51,6,'2017-02-06 23:33:59',52),(52,6,'2017-02-06 23:34:04',53),(53,6,'2017-02-06 23:34:09',54),(54,6,'2017-02-07 16:24:13',55),(55,20,'2017-02-07 16:46:11',56),(56,20,'2017-02-07 16:46:16',57),(57,22,'2017-02-07 16:51:06',58),(58,22,'2017-02-07 16:51:11',59),(59,22,'2017-02-07 16:51:16',60),(60,22,'2017-02-07 16:51:21',61),(61,22,'2017-02-07 16:51:26',62),(62,22,'2017-02-07 16:51:31',63),(63,22,'2017-02-07 16:51:36',64),(64,22,'2017-02-07 16:51:41',65),(65,22,'2017-02-07 16:51:46',66),(66,22,'2017-02-07 16:51:51',67),(67,22,'2017-02-07 16:51:56',68),(68,22,'2017-02-07 16:52:01',69),(69,22,'2017-02-07 16:52:06',70),(70,22,'2017-02-07 16:52:11',71),(71,22,'2017-02-07 16:52:16',72),(72,23,'2017-02-07 16:56:44',73),(73,23,'2017-02-07 16:56:49',74),(74,23,'2017-02-07 16:56:54',75),(75,23,'2017-02-07 16:56:59',76),(76,23,'2017-02-07 16:57:04',77),(77,23,'2017-02-07 16:57:06',78),(78,23,'2017-02-07 16:57:09',79),(79,23,'2017-02-07 16:57:14',80),(80,23,'2017-02-07 16:57:19',81),(81,23,'2017-02-07 16:57:24',82),(82,23,'2017-02-07 16:57:29',83),(83,23,'2017-02-07 16:57:34',84),(84,23,'2017-02-07 16:57:39',85),(85,23,'2017-02-07 16:57:44',86),(86,23,'2017-02-07 16:57:49',87),(87,23,'2017-02-07 16:57:54',88),(88,23,'2017-02-07 16:57:59',89),(89,23,'2017-02-07 16:58:04',90),(90,23,'2017-02-07 16:58:09',91),(91,23,'2017-02-07 16:58:14',92),(92,23,'2017-02-07 16:58:19',93),(93,23,'2017-02-07 16:58:24',94),(94,23,'2017-02-07 16:58:29',95),(95,23,'2017-02-07 16:58:34',96),(96,23,'2017-02-07 16:58:39',97),(97,23,'2017-02-07 16:58:44',98),(98,23,'2017-02-07 16:58:49',99),(99,23,'2017-02-07 16:58:54',100),(100,23,'2017-02-07 16:58:59',101),(101,23,'2017-02-07 16:59:04',102),(102,23,'2017-02-07 16:59:09',103),(103,23,'2017-02-07 16:59:14',104),(104,23,'2017-02-07 16:59:19',105),(105,23,'2017-02-07 16:59:24',106),(106,23,'2017-02-07 16:59:29',107),(107,23,'2017-02-07 16:59:34',108),(108,23,'2017-02-07 16:59:39',109),(109,23,'2017-02-07 16:59:44',110),(110,23,'2017-02-07 16:59:49',111),(111,23,'2017-02-07 16:59:54',112),(112,23,'2017-02-07 16:59:59',113),(113,23,'2017-02-07 17:00:04',114),(114,23,'2017-02-07 17:00:09',115),(115,23,'2017-02-07 17:00:14',116),(116,23,'2017-02-07 17:00:19',117),(117,23,'2017-02-07 17:00:24',118),(118,25,'2017-02-07 17:03:50',119),(119,25,'2017-02-07 17:03:55',120),(120,26,'2017-02-07 17:05:05',121),(121,26,'2017-02-07 17:05:07',122),(122,26,'2017-02-07 17:05:12',123),(123,26,'2017-02-07 17:05:17',124),(124,26,'2017-02-07 17:05:22',125),(125,26,'2017-02-07 17:05:27',126),(126,28,'2017-02-07 17:08:04',127),(127,28,'2017-02-07 17:08:06',128),(128,28,'2017-02-07 17:08:11',129),(129,28,'2017-02-07 17:08:16',130),(130,28,'2017-02-07 17:08:21',131),(131,28,'2017-02-07 17:08:26',132),(132,28,'2017-02-07 17:08:31',133),(133,28,'2017-02-07 17:08:36',134),(134,28,'2017-02-07 17:08:41',135),(135,28,'2017-02-07 17:08:46',136),(136,29,'2017-02-07 17:21:47',137),(137,29,'2017-02-07 17:21:52',138),(138,30,'2017-02-07 17:23:04',139),(139,30,'2017-02-07 17:23:09',140),(140,30,'2017-02-07 17:23:14',141),(141,30,'2017-02-07 17:23:19',142),(142,30,'2017-02-07 17:23:24',143),(143,30,'2017-02-07 17:23:29',144),(144,30,'2017-02-07 17:23:34',145),(145,30,'2017-02-07 17:23:39',146),(146,30,'2017-02-07 17:23:44',147),(147,30,'2017-02-07 17:23:49',148),(148,30,'2017-02-07 17:23:54',149),(149,30,'2017-02-07 17:23:59',150),(150,32,'2017-02-07 17:27:17',151),(151,32,'2017-02-07 17:27:22',152),(152,32,'2017-02-07 17:27:27',153),(153,32,'2017-02-07 17:27:32',154),(154,32,'2017-02-07 17:27:37',155),(155,32,'2017-02-07 17:27:42',156),(156,32,'2017-02-07 17:27:47',157),(157,32,'2017-02-07 17:27:52',158),(158,32,'2017-02-07 17:27:57',159),(159,32,'2017-02-07 17:28:02',160),(160,32,'2017-02-07 17:28:07',161),(161,32,'2017-02-07 17:28:12',162),(162,32,'2017-02-07 17:28:17',163),(163,32,'2017-02-07 17:28:22',164),(164,32,'2017-02-07 17:28:27',165),(165,32,'2017-02-07 17:28:32',166),(166,33,'2017-02-07 17:33:31',167),(167,33,'2017-02-07 17:33:36',168),(168,33,'2017-02-07 17:33:41',169),(169,33,'2017-02-07 17:33:46',170),(170,33,'2017-02-07 17:33:51',171),(171,33,'2017-02-07 17:33:56',172),(172,33,'2017-02-07 17:34:01',173),(173,33,'2017-02-07 17:34:06',174),(174,33,'2017-02-07 17:34:11',175),(175,33,'2017-02-07 17:34:16',176),(176,33,'2017-02-07 17:34:21',177),(177,33,'2017-02-07 17:34:26',178),(178,33,'2017-02-07 17:34:31',179),(179,33,'2017-02-07 17:34:36',180),(180,33,'2017-02-07 17:34:41',181),(181,33,'2017-02-07 17:34:46',182),(182,33,'2017-02-07 17:34:51',183),(183,33,'2017-02-07 17:34:56',184),(184,33,'2017-02-07 17:35:01',185),(185,33,'2017-02-07 17:35:06',186),(186,33,'2017-02-07 17:35:11',187),(187,33,'2017-02-07 17:35:16',188),(188,33,'2017-02-07 17:35:21',189),(189,33,'2017-02-07 17:35:26',190),(190,33,'2017-02-07 17:35:31',191),(191,33,'2017-02-07 17:35:36',192),(192,33,'2017-02-07 17:35:41',193),(193,33,'2017-02-07 17:35:46',194),(194,33,'2017-02-07 17:35:51',195),(195,34,'2017-02-07 17:37:28',196),(196,34,'2017-02-07 17:37:33',197),(197,34,'2017-02-07 17:37:38',198),(198,34,'2017-02-07 17:37:43',199),(199,34,'2017-02-07 17:37:48',200),(200,34,'2017-02-07 17:37:53',201),(201,34,'2017-02-07 17:37:58',202),(202,34,'2017-02-07 17:38:03',203),(203,34,'2017-02-07 17:38:08',204),(204,34,'2017-02-07 17:38:13',205),(205,34,'2017-02-07 17:38:18',206),(206,34,'2017-02-07 17:38:23',207),(207,34,'2017-02-07 17:38:28',208),(208,34,'2017-02-07 17:38:33',209),(209,34,'2017-02-07 17:38:38',210),(210,34,'2017-02-07 17:38:43',211),(211,34,'2017-02-07 17:38:48',212),(212,34,'2017-02-07 17:38:53',213),(213,34,'2017-02-07 17:38:58',214),(214,35,'2017-02-07 17:42:02',215),(215,35,'2017-02-07 17:42:07',216),(216,35,'2017-02-07 17:42:12',217),(217,36,'2017-02-07 17:43:12',218),(218,37,'2017-02-07 17:44:15',219),(219,37,'2017-02-07 17:44:17',220),(220,37,'2017-02-07 17:44:22',221),(221,37,'2017-02-07 17:44:27',222),(222,37,'2017-02-07 17:44:32',223),(223,37,'2017-02-07 17:44:37',224),(224,37,'2017-02-07 17:44:42',225),(225,37,'2017-02-07 17:44:47',226),(226,38,'2017-02-07 17:45:37',227),(227,38,'2017-02-07 17:45:41',228),(228,38,'2017-02-07 17:45:46',229),(229,38,'2017-02-07 17:45:51',230),(230,38,'2017-02-07 17:45:56',231),(231,38,'2017-02-07 17:46:01',232),(232,38,'2017-02-07 17:46:06',233),(233,38,'2017-02-07 17:46:11',234),(234,38,'2017-02-07 17:46:16',235),(235,38,'2017-02-07 17:46:21',236),(236,38,'2017-02-07 17:46:26',237),(237,38,'2017-02-07 17:46:31',238),(238,38,'2017-02-07 17:46:36',239),(239,38,'2017-02-07 17:46:41',240),(240,38,'2017-02-07 17:46:46',241),(241,38,'2017-02-07 17:46:51',242),(242,38,'2017-02-07 17:46:56',243),(243,38,'2017-02-07 17:47:01',244),(244,38,'2017-02-07 17:47:06',245),(245,38,'2017-02-07 17:47:11',246),(246,38,'2017-02-07 17:47:16',247),(247,38,'2017-02-07 17:47:21',248),(248,38,'2017-02-07 17:47:26',249),(249,38,'2017-02-07 17:47:31',250),(250,38,'2017-02-07 17:47:36',251),(251,38,'2017-02-07 17:47:41',252),(252,38,'2017-02-07 17:47:46',253),(253,38,'2017-02-07 17:47:51',254),(254,38,'2017-02-07 17:47:56',255),(255,38,'2017-02-07 17:48:01',256),(256,38,'2017-02-07 17:48:06',257),(257,38,'2017-02-07 17:48:11',258),(258,38,'2017-02-07 17:48:16',259),(259,38,'2017-02-07 17:48:21',260),(260,38,'2017-02-07 17:48:26',261),(261,38,'2017-02-07 17:48:31',262),(262,38,'2017-02-07 17:48:36',263),(263,38,'2017-02-07 17:48:41',264),(264,38,'2017-02-07 17:48:46',265),(265,38,'2017-02-07 17:48:51',266),(266,38,'2017-02-07 17:48:56',267),(267,38,'2017-02-07 17:49:01',268),(268,38,'2017-02-07 17:49:06',269),(269,38,'2017-02-07 17:49:11',270),(270,38,'2017-02-07 17:49:16',271),(271,38,'2017-02-07 17:49:21',272),(272,38,'2017-02-07 17:49:26',273),(273,38,'2017-02-07 17:49:31',274),(274,38,'2017-02-07 17:49:36',275),(275,38,'2017-02-07 17:49:41',276),(276,38,'2017-02-07 17:49:46',277),(277,38,'2017-02-07 17:49:51',278),(278,38,'2017-02-07 17:49:56',279),(279,38,'2017-02-07 17:50:01',280),(280,38,'2017-02-07 17:50:06',281),(281,38,'2017-02-07 17:50:11',282),(282,38,'2017-02-07 17:50:16',283),(283,38,'2017-02-07 17:50:21',284),(284,38,'2017-02-07 17:50:26',285),(285,38,'2017-02-07 17:50:31',286),(286,38,'2017-02-07 17:50:36',287),(287,38,'2017-02-07 17:50:41',288),(288,39,'2017-02-07 17:51:12',289),(289,39,'2017-02-07 17:51:15',290),(290,39,'2017-02-07 17:51:20',291),(291,39,'2017-02-07 17:51:25',292),(292,39,'2017-02-07 17:51:30',293),(293,39,'2017-02-07 17:51:35',294),(294,39,'2017-02-07 17:51:40',295),(295,39,'2017-02-07 17:51:45',296),(296,39,'2017-02-07 17:51:50',297),(297,39,'2017-02-07 17:51:55',298),(298,40,'2017-02-07 17:52:26',299),(299,40,'2017-02-07 17:52:26',300),(300,40,'2017-02-07 17:52:31',301),(301,40,'2017-02-07 17:52:36',302),(302,40,'2017-02-07 17:52:41',303),(303,40,'2017-02-07 17:52:46',304),(304,42,'2017-02-07 17:54:16',305),(305,43,'2017-02-07 17:54:57',306),(306,43,'2017-02-07 17:55:02',307),(307,43,'2017-02-07 17:55:05',308),(308,43,'2017-02-07 17:55:07',309),(309,43,'2017-02-07 17:55:12',310),(310,43,'2017-02-07 17:55:17',311),(311,43,'2017-02-07 17:55:22',312),(312,43,'2017-02-07 17:55:27',313),(313,43,'2017-02-07 17:55:32',314),(314,43,'2017-02-07 17:55:37',315),(315,43,'2017-02-07 17:55:42',316),(316,43,'2017-02-07 17:55:47',317),(317,43,'2017-02-07 17:55:52',318),(318,43,'2017-02-07 17:55:57',319),(319,43,'2017-02-07 17:56:02',320),(320,43,'2017-02-07 17:56:07',321),(321,43,'2017-02-07 17:56:12',322),(322,43,'2017-02-07 17:56:17',323),(323,43,'2017-02-07 17:56:22',324),(324,43,'2017-02-07 17:56:27',325),(325,43,'2017-02-07 17:56:32',326),(326,43,'2017-02-07 17:56:37',327),(327,43,'2017-02-07 17:56:42',328),(328,43,'2017-02-07 17:56:47',329),(329,43,'2017-02-07 17:56:52',330),(330,43,'2017-02-07 17:56:57',331),(331,43,'2017-02-07 17:57:02',332),(332,43,'2017-02-07 17:57:07',333),(333,43,'2017-02-07 17:57:12',334),(334,43,'2017-02-07 17:57:17',335),(335,43,'2017-02-07 17:57:22',336),(336,43,'2017-02-07 17:57:27',337),(337,43,'2017-02-07 17:57:32',338),(338,44,'2017-02-07 17:59:35',339),(339,44,'2017-02-07 17:59:37',340),(340,44,'2017-02-07 17:59:40',341),(341,44,'2017-02-07 17:59:45',342),(342,45,'2017-02-07 18:00:06',343),(343,45,'2017-02-07 18:00:08',344),(344,45,'2017-02-07 18:00:13',345),(345,45,'2017-02-07 18:00:18',346),(346,45,'2017-02-07 18:00:23',347),(347,45,'2017-02-07 18:00:28',348),(348,45,'2017-02-07 18:00:33',349),(349,45,'2017-02-07 18:00:38',350),(350,45,'2017-02-07 18:00:43',351),(351,45,'2017-02-07 18:00:48',352),(352,45,'2017-02-07 18:00:53',353),(353,45,'2017-02-07 18:00:58',354),(354,45,'2017-02-07 18:01:03',355),(355,45,'2017-02-07 18:01:08',356),(356,45,'2017-02-07 18:01:13',357),(357,45,'2017-02-07 18:01:18',358),(358,45,'2017-02-07 18:01:23',359),(359,45,'2017-02-07 18:01:28',360),(360,45,'2017-02-07 18:01:33',361),(361,45,'2017-02-07 18:01:38',362),(362,45,'2017-02-07 18:01:43',363),(363,45,'2017-02-07 18:01:48',364),(364,45,'2017-02-07 18:01:53',365),(365,45,'2017-02-07 18:01:58',366),(366,45,'2017-02-07 18:02:03',367),(367,45,'2017-02-07 18:02:08',368),(368,45,'2017-02-07 18:02:13',369),(369,45,'2017-02-07 18:02:18',370),(370,45,'2017-02-07 18:02:23',371),(371,45,'2017-02-07 18:02:28',372),(372,45,'2017-02-07 18:02:33',373),(373,45,'2017-02-07 18:02:38',374),(374,45,'2017-02-07 18:02:43',375),(375,45,'2017-02-07 18:02:48',376),(376,45,'2017-02-07 18:02:53',377),(377,45,'2017-02-07 18:02:58',378),(378,45,'2017-02-07 18:03:03',379),(379,45,'2017-02-07 18:03:08',380),(380,45,'2017-02-07 18:03:13',381),(381,45,'2017-02-07 18:03:18',382),(382,45,'2017-02-07 18:03:23',383),(383,45,'2017-02-07 18:03:28',384),(384,45,'2017-02-07 18:03:33',385),(385,45,'2017-02-07 18:03:38',386),(386,45,'2017-02-07 18:03:43',387),(387,45,'2017-02-07 18:03:48',388),(388,45,'2017-02-07 18:03:53',389),(389,45,'2017-02-07 18:03:58',390),(390,45,'2017-02-07 18:04:03',391),(391,45,'2017-02-07 18:04:08',392),(392,45,'2017-02-07 18:04:13',393),(393,45,'2017-02-07 18:04:18',394),(394,45,'2017-02-07 18:04:23',395),(395,45,'2017-02-07 18:04:28',396),(396,45,'2017-02-07 18:04:33',397),(397,45,'2017-02-07 18:04:38',398),(398,45,'2017-02-07 18:04:43',399),(399,45,'2017-02-07 18:04:48',400),(400,45,'2017-02-07 18:04:53',401),(401,45,'2017-02-07 18:04:58',402),(402,45,'2017-02-07 18:05:03',403),(403,45,'2017-02-07 18:05:08',404),(404,45,'2017-02-07 18:05:13',405),(405,46,'2017-02-07 18:05:30',406),(406,46,'2017-02-07 18:05:33',407),(407,46,'2017-02-07 18:05:38',408),(408,46,'2017-02-07 18:05:43',409),(409,46,'2017-02-07 18:05:48',410),(410,46,'2017-02-07 18:05:53',411),(411,46,'2017-02-07 18:05:58',412),(412,46,'2017-02-07 18:06:03',413),(413,46,'2017-02-07 18:06:08',414),(414,46,'2017-02-07 18:06:13',415),(415,46,'2017-02-07 18:06:18',416),(416,46,'2017-02-07 18:06:23',417),(417,46,'2017-02-07 18:06:28',418),(418,46,'2017-02-07 18:06:33',419),(419,46,'2017-02-07 18:06:38',420),(420,46,'2017-02-07 18:06:43',421),(421,47,'2017-02-07 18:07:10',422),(422,47,'2017-02-07 18:07:12',423),(423,47,'2017-02-07 18:07:17',424),(424,47,'2017-02-07 18:07:22',425),(425,47,'2017-02-07 18:07:27',426),(426,47,'2017-02-07 18:07:32',427),(427,47,'2017-02-07 18:07:37',428),(428,47,'2017-02-07 18:07:42',429),(429,47,'2017-02-07 18:07:47',430),(430,47,'2017-02-07 18:07:52',431),(431,47,'2017-02-07 18:07:57',432),(432,47,'2017-02-07 18:08:02',433),(433,47,'2017-02-07 18:08:07',434),(434,48,'2017-02-07 18:10:46',435),(435,48,'2017-02-07 18:10:48',436),(436,48,'2017-02-07 18:10:53',437),(437,48,'2017-02-07 18:10:58',438),(438,48,'2017-02-07 18:11:03',439),(439,48,'2017-02-07 18:11:08',440),(440,48,'2017-02-07 18:11:13',441),(441,48,'2017-02-07 18:11:18',442),(442,48,'2017-02-07 18:11:23',443),(443,48,'2017-02-07 18:11:28',444),(444,48,'2017-02-07 18:11:33',445),(445,48,'2017-02-07 18:11:38',446),(446,48,'2017-02-07 18:11:43',447),(447,48,'2017-02-07 18:11:48',448),(448,48,'2017-02-07 18:11:53',449),(449,48,'2017-02-07 18:11:58',450),(450,48,'2017-02-07 18:12:03',451),(451,48,'2017-02-07 18:12:08',452),(452,48,'2017-02-07 18:12:13',453),(453,48,'2017-02-07 18:12:18',454),(454,48,'2017-02-07 18:12:23',455),(455,49,'2017-02-07 18:20:44',456),(456,49,'2017-02-07 18:20:47',457),(457,49,'2017-02-07 18:20:52',458),(458,49,'2017-02-07 18:20:57',459),(459,49,'2017-02-07 18:21:02',460),(460,49,'2017-02-07 18:21:07',461),(461,49,'2017-02-07 18:21:12',462),(462,49,'2017-02-07 18:21:17',463),(463,49,'2017-02-07 18:21:22',464),(464,49,'2017-02-07 18:21:27',465),(465,49,'2017-02-07 18:21:32',466),(466,49,'2017-02-07 18:21:37',467),(467,49,'2017-02-07 18:21:42',468),(468,49,'2017-02-07 18:21:47',469),(469,49,'2017-02-07 18:21:52',470),(470,49,'2017-02-07 18:21:57',471),(471,50,'2017-02-07 18:42:10',472),(472,50,'2017-02-07 18:42:11',473),(473,50,'2017-02-07 18:42:16',474),(474,50,'2017-02-07 18:42:21',475),(475,50,'2017-02-07 18:42:26',476),(476,50,'2017-02-07 18:42:31',477),(477,50,'2017-02-07 18:42:36',478),(478,50,'2017-02-07 18:42:41',479),(479,50,'2017-02-07 18:42:46',480),(480,50,'2017-02-07 18:42:51',481),(481,50,'2017-02-07 18:42:56',482),(482,50,'2017-02-07 18:43:01',483),(483,50,'2017-02-07 18:43:06',484),(484,50,'2017-02-07 18:43:11',485),(485,50,'2017-02-07 18:43:16',486),(486,51,'2017-02-07 18:44:48',487),(487,51,'2017-02-07 18:44:49',488),(488,51,'2017-02-07 18:44:54',489),(489,51,'2017-02-07 18:44:59',490),(490,52,'2017-02-07 18:46:41',491),(491,52,'2017-02-07 18:46:42',492),(492,53,'2017-02-07 18:47:00',493),(493,53,'2017-02-07 18:47:03',494),(494,53,'2017-02-07 18:47:08',495),(495,53,'2017-02-07 18:47:13',496),(496,53,'2017-02-07 18:47:18',497),(497,53,'2017-02-07 18:47:23',498),(498,53,'2017-02-07 18:47:28',499),(499,53,'2017-02-07 18:47:33',500),(500,53,'2017-02-07 18:47:38',501),(501,53,'2017-02-07 18:47:43',502),(502,53,'2017-02-07 18:47:48',503),(503,53,'2017-02-07 18:47:53',504),(504,53,'2017-02-07 18:47:58',505),(505,53,'2017-02-07 18:48:03',506),(506,53,'2017-02-07 18:48:08',507),(507,53,'2017-02-07 18:48:13',508),(508,53,'2017-02-07 18:48:18',509),(509,53,'2017-02-07 18:48:23',510),(510,53,'2017-02-07 18:48:28',511),(511,53,'2017-02-07 18:48:33',512),(512,53,'2017-02-07 18:48:38',513),(513,53,'2017-02-07 18:48:43',514),(514,53,'2017-02-07 18:48:48',515),(515,53,'2017-02-07 18:48:53',516),(516,53,'2017-02-07 18:48:58',517),(517,53,'2017-02-07 18:49:03',518),(518,53,'2017-02-07 18:49:08',519),(519,53,'2017-02-07 18:49:13',520),(520,53,'2017-02-07 18:49:18',521),(521,53,'2017-02-07 18:49:23',522),(522,53,'2017-02-08 19:25:55',523),(523,53,'2017-02-08 19:25:59',524),(524,53,'2017-02-08 19:26:04',525),(525,53,'2017-02-08 19:26:09',526),(526,53,'2017-02-08 19:26:14',527),(527,53,'2017-02-08 19:26:15',528),(528,53,'2017-02-08 19:26:19',529),(529,53,'2017-02-08 19:26:24',530),(530,53,'2017-02-08 19:26:29',531),(531,53,'2017-02-08 19:26:34',532),(532,53,'2017-02-08 19:26:39',533),(533,53,'2017-02-08 19:26:44',534),(534,53,'2017-02-08 19:26:49',535),(535,53,'2017-02-08 19:26:54',536),(536,53,'2017-02-08 19:26:59',537),(537,53,'2017-02-08 19:27:04',538),(538,53,'2017-02-08 19:27:09',539),(539,53,'2017-02-08 19:27:14',540),(540,53,'2017-02-08 19:27:19',541),(541,53,'2017-02-08 19:27:24',542),(542,53,'2017-02-08 19:27:29',543),(543,53,'2017-02-08 19:28:16',544),(544,53,'2017-02-08 19:28:19',545),(545,53,'2017-02-08 19:28:21',546),(546,53,'2017-02-08 19:28:26',547),(547,53,'2017-02-08 19:28:31',548),(548,53,'2017-02-08 19:28:36',549),(549,53,'2017-02-08 19:28:41',550),(550,53,'2017-02-08 19:28:46',551),(551,53,'2017-02-08 19:28:51',552),(552,53,'2017-02-08 19:28:56',553),(553,53,'2017-02-08 19:29:01',554),(554,53,'2017-02-08 19:29:06',555),(555,53,'2017-02-08 19:29:11',556),(556,53,'2017-02-08 19:29:16',557),(557,53,'2017-02-08 19:29:21',558),(558,53,'2017-02-08 19:29:25',559),(559,56,'2017-02-08 19:34:16',560),(560,56,'2017-02-08 19:34:17',561),(561,56,'2017-02-08 19:34:21',562),(562,56,'2017-02-08 19:34:26',563),(563,56,'2017-02-08 19:34:31',564),(564,56,'2017-02-08 19:34:36',565),(565,56,'2017-02-08 19:34:41',566),(566,56,'2017-02-08 19:34:46',567),(567,56,'2017-02-08 19:34:51',568),(568,56,'2017-02-08 19:34:56',569),(569,56,'2017-02-08 19:35:01',570),(570,56,'2017-02-08 19:35:06',571),(571,56,'2017-02-08 19:35:11',572),(572,56,'2017-02-08 19:35:16',573),(573,56,'2017-02-08 19:35:21',574),(574,56,'2017-02-08 19:35:26',575),(575,56,'2017-02-08 19:35:31',576),(576,56,'2017-02-08 19:35:36',577),(577,56,'2017-02-08 19:35:41',578),(578,56,'2017-02-08 19:35:46',579),(579,56,'2017-02-08 19:35:51',580),(580,56,'2017-02-08 19:35:56',581),(581,56,'2017-02-08 19:35:57',582),(582,56,'2017-02-08 19:37:32',583),(583,56,'2017-02-08 19:37:33',584),(584,56,'2017-02-08 19:37:37',585),(585,56,'2017-02-08 19:37:42',586),(586,56,'2017-02-08 19:37:47',587),(587,56,'2017-02-08 19:37:52',588),(588,56,'2017-02-08 19:37:57',589),(589,56,'2017-02-08 19:38:00',590),(590,56,'2017-02-08 19:38:02',591),(591,56,'2017-02-08 19:38:07',592),(592,56,'2017-02-08 19:38:12',593),(593,56,'2017-02-08 19:38:17',594),(594,56,'2017-02-08 19:38:22',595),(595,56,'2017-02-08 19:38:27',596),(596,56,'2017-02-08 19:38:32',597),(597,56,'2017-02-08 19:38:37',598),(598,56,'2017-02-08 19:38:42',599),(599,56,'2017-02-08 19:38:47',600),(600,56,'2017-02-08 19:38:52',601),(601,56,'2017-02-08 19:38:57',602),(602,56,'2017-02-08 19:39:02',603),(603,56,'2017-02-08 19:39:07',604),(604,56,'2017-02-08 19:39:12',605),(605,56,'2017-02-08 19:39:17',606),(606,56,'2017-02-08 19:39:22',607),(607,56,'2017-02-08 19:41:49',608),(608,56,'2017-02-08 19:41:52',609),(609,56,'2017-02-08 19:42:26',610),(610,56,'2017-02-08 19:42:27',611),(611,56,'2017-02-08 19:42:32',612),(612,56,'2017-02-08 19:42:37',613),(613,56,'2017-02-08 19:42:42',614),(614,56,'2017-02-08 19:42:47',615),(615,56,'2017-02-08 19:43:10',616),(616,56,'2017-02-08 19:43:11',617),(617,56,'2017-02-08 19:43:16',618),(618,56,'2017-02-08 19:43:21',619),(619,56,'2017-02-08 19:43:26',620),(620,56,'2017-02-08 19:43:31',621),(621,56,'2017-02-08 19:43:36',622),(622,56,'2017-02-08 19:43:41',623),(623,56,'2017-02-08 19:43:46',624),(624,56,'2017-02-08 19:43:51',625),(625,56,'2017-02-08 19:43:56',626),(626,56,'2017-02-08 19:44:01',627),(627,56,'2017-02-08 19:44:06',628),(628,56,'2017-02-08 19:44:11',629),(629,56,'2017-02-08 19:44:16',630),(630,56,'2017-02-08 19:44:21',631),(631,56,'2017-02-08 19:44:26',632),(632,56,'2017-02-08 19:44:31',633),(633,56,'2017-02-08 19:44:36',634),(634,56,'2017-02-08 19:44:41',635),(635,56,'2017-02-08 19:44:46',636),(636,56,'2017-02-08 19:44:51',637),(637,56,'2017-02-08 19:44:51',638),(638,56,'2017-02-08 19:44:56',639),(639,56,'2017-02-08 19:45:01',640),(640,56,'2017-02-08 19:45:06',641),(641,56,'2017-02-08 19:45:11',642),(642,56,'2017-02-08 19:45:16',643),(643,56,'2017-02-08 19:45:21',644),(644,56,'2017-02-08 19:45:26',645),(645,56,'2017-02-08 19:45:31',646),(646,56,'2017-02-08 19:45:36',647),(647,56,'2017-02-08 19:45:41',648);
/*!40000 ALTER TABLE `measurementreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurementrequest`
--

DROP TABLE IF EXISTS `measurementrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurementrequest` (
  `idmeasurementrequest` int(11) NOT NULL AUTO_INCREMENT,
  `retransmitnumber` int(11) DEFAULT NULL,
  `storageCongestionPolicy` int(11) DEFAULT NULL,
  `periodicity` int(11) DEFAULT NULL,
  `nothingnewtoreport` int(11) DEFAULT NULL,
  `amfConfigPckg_id` int(11) NOT NULL,
  PRIMARY KEY (`idmeasurementrequest`),
  KEY `fk_measurementrequest_amf_idx` (`amfConfigPckg_id`),
  CONSTRAINT `fk_measurementrequest_amf` FOREIGN KEY (`amfConfigPckg_id`) REFERENCES `amfconfigpckg` (`idamfconfigpckg`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurementrequest`
--

LOCK TABLES `measurementrequest` WRITE;
/*!40000 ALTER TABLE `measurementrequest` DISABLE KEYS */;
INSERT INTO `measurementrequest` VALUES (1,0,0,5,0,1),(2,0,0,5,0,2),(3,0,0,5,0,3),(4,0,0,5,0,4),(5,0,0,5,0,5),(6,0,0,5,0,6),(7,0,0,5,0,7),(8,0,0,5,0,8),(9,0,0,5,0,9),(10,0,0,5,0,10),(11,0,0,5,0,11),(12,0,0,5,0,12),(13,0,0,5,0,13),(14,0,0,5,0,14),(15,0,0,5,0,15),(16,0,0,5,0,16),(17,0,0,5,0,17),(18,0,0,5,0,18),(19,0,0,5,0,19),(20,0,0,5,0,20),(21,0,0,5,0,21),(22,0,0,5,0,22),(23,0,0,5,0,23),(24,0,0,5,0,24),(25,0,0,5,0,25),(26,0,0,5,0,26),(27,0,0,5,0,27),(28,0,0,5,0,28),(29,0,0,5,0,29),(30,0,0,5,0,30),(31,0,0,5,0,31),(32,0,0,5,0,32),(33,0,0,5,0,33),(34,0,0,5,0,34),(35,0,0,5,0,35),(36,0,0,5,0,36),(37,0,0,5,0,37),(38,0,0,5,0,38),(39,0,0,5,0,39),(40,0,0,5,0,40),(41,0,0,5,0,41),(42,0,0,5,0,42),(43,0,0,5,0,43),(44,0,0,5,0,44),(45,0,0,5,0,45),(46,0,0,5,0,46),(47,0,0,5,0,47),(48,0,0,5,0,48),(49,0,0,5,0,49),(50,0,0,5,0,50),(51,0,0,5,0,51),(52,0,0,5,0,52),(53,0,0,5,0,53),(54,0,0,5,0,54),(55,0,0,5,0,55),(56,0,0,5,0,56);
/*!40000 ALTER TABLE `measurementrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operationalmanagement`
--

DROP TABLE IF EXISTS `operationalmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operationalmanagement` (
  `idoperationalmanagement` int(11) NOT NULL AUTO_INCREMENT,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  `operationalManagement` varchar(45) NOT NULL,
  PRIMARY KEY (`idoperationalmanagement`),
  KEY `fk_operationalmanagement_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_operationalmanagement_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operationalmanagement`
--

LOCK TABLES `operationalmanagement` WRITE;
/*!40000 ALTER TABLE `operationalmanagement` DISABLE KEYS */;
INSERT INTO `operationalmanagement` VALUES (1,2,'Acknowledgements'),(2,3,'Acknowledgements'),(3,4,'Acknowledgements'),(4,5,'Acknowledgements'),(5,6,'Acknowledgements'),(6,7,'Acknowledgements'),(7,8,'Acknowledgements'),(8,9,'Acknowledgements'),(9,10,'Acknowledgements'),(10,11,'Acknowledgements'),(11,12,'Acknowledgements'),(12,13,'Acknowledgements'),(13,14,'Acknowledgements'),(14,15,'Acknowledgements'),(15,16,'Acknowledgements'),(16,17,'Acknowledgements'),(17,18,'Acknowledgements'),(18,19,'Acknowledgements'),(19,20,'Acknowledgements'),(20,21,'Acknowledgements'),(21,22,'Acknowledgements'),(22,23,'Acknowledgements'),(23,24,'Acknowledgements'),(24,25,'Acknowledgements'),(25,26,'Acknowledgements'),(26,27,'Acknowledgements'),(27,28,'Acknowledgements'),(28,29,'Acknowledgements'),(29,30,'Acknowledgements'),(30,31,'Acknowledgements'),(31,32,'Acknowledgements'),(32,33,'Acknowledgements'),(33,34,'Acknowledgements'),(34,35,'Acknowledgements'),(35,36,'Acknowledgements'),(36,37,'Acknowledgements'),(37,38,'Acknowledgements'),(38,39,'Acknowledgements'),(39,40,'Acknowledgements'),(40,41,'Acknowledgements'),(41,42,'Acknowledgements'),(42,43,'Acknowledgements'),(43,44,'Acknowledgements'),(44,45,'Acknowledgements'),(45,46,'Acknowledgements'),(46,47,'Acknowledgements'),(47,48,'Acknowledgements'),(48,49,'Acknowledgements'),(49,50,'Acknowledgements'),(50,51,'Acknowledgements'),(51,52,'Acknowledgements'),(52,53,'Acknowledgements'),(53,54,'Acknowledgements'),(54,55,'Acknowledgements'),(55,56,'Acknowledgements'),(56,57,'Acknowledgements'),(57,58,'Acknowledgements');
/*!40000 ALTER TABLE `operationalmanagement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissionmode`
--

DROP TABLE IF EXISTS `permissionmode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissionmode` (
  `idpermissionmode` int(11) NOT NULL AUTO_INCREMENT,
  `permissionMode` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`idpermissionmode`),
  KEY `fk_permissionmode_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_permissionmode_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissionmode`
--

LOCK TABLES `permissionmode` WRITE;
/*!40000 ALTER TABLE `permissionmode` DISABLE KEYS */;
INSERT INTO `permissionmode` VALUES (1,'Internal',2),(2,'Internal',3),(3,'Internal',4),(4,'Internal',5),(5,'Internal',6),(6,'Internal',7),(7,'Internal',8),(8,'Internal',9),(9,'Internal',10),(10,'Internal',11),(11,'Internal',12),(12,'Internal',13),(13,'Internal',14),(14,'Internal',15),(15,'Internal',16),(16,'Internal',17),(17,'Internal',18),(18,'Internal',19),(19,'Internal',20),(20,'Internal',21),(21,'Internal',22),(22,'Internal',23),(23,'Internal',24),(24,'Internal',25),(25,'Internal',26),(26,'Internal',27),(27,'Internal',28),(28,'Internal',29),(29,'Internal',30),(30,'Internal',31),(31,'Internal',32),(32,'Internal',33),(33,'Internal',34),(34,'Internal',35),(35,'Internal',36),(36,'Internal',37),(37,'Internal',38),(38,'Internal',39),(39,'Internal',40),(40,'Internal',41),(41,'Internal',42),(42,'Internal',43),(43,'Internal',44),(44,'Internal',45),(45,'Internal',46),(46,'Internal',47),(47,'Internal',48),(48,'Internal',49),(49,'Internal',50),(50,'Internal',51),(51,'Internal',52),(52,'Internal',53),(53,'Internal',54),(54,'Internal',55),(55,'Internal',56),(56,'Internal',57),(57,'Internal',58);
/*!40000 ALTER TABLE `permissionmode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `samplesetidentifier`
--

DROP TABLE IF EXISTS `samplesetidentifier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `samplesetidentifier` (
  `idsamplesetidentifier` int(11) NOT NULL AUTO_INCREMENT,
  `samplesetIdentifier` varchar(45) NOT NULL,
  `measurementRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`idsamplesetidentifier`),
  KEY `fk_samplesetidentifier_mreq_idx` (`measurementRequest_id`),
  CONSTRAINT `fk_samplesetidentifier_mreq` FOREIGN KEY (`measurementRequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `samplesetidentifier`
--

LOCK TABLES `samplesetidentifier` WRITE;
/*!40000 ALTER TABLE `samplesetidentifier` DISABLE KEYS */;
INSERT INTO `samplesetidentifier` VALUES (1,'ChannelPlaying',1),(2,'ChannelPlaying',2),(3,'ChannelPlaying',3),(4,'ChannelPlaying',4),(5,'ChannelPlaying',5),(6,'ChannelPlaying',6),(7,'ChannelPlaying',7),(8,'ChannelPlaying',8),(9,'ChannelPlaying',9),(10,'ChannelPlaying',10),(11,'ChannelPlaying',11),(12,'ChannelPlaying',12),(13,'ChannelPlaying',13),(14,'ChannelPlaying',14),(15,'ChannelPlaying',15),(16,'ChannelPlaying',16),(17,'ChannelPlaying',17),(18,'ChannelPlaying',18),(19,'ChannelPlaying',19),(20,'ChannelPlaying',20),(21,'ChannelPlaying',21),(22,'ChannelPlaying',22),(23,'ChannelPlaying',23),(24,'ChannelPlaying',24),(25,'ChannelPlaying',25),(26,'ChannelPlaying',26),(27,'ChannelPlaying',27),(28,'ChannelPlaying',28),(29,'ChannelPlaying',29),(30,'ChannelPlaying',30),(31,'ChannelPlaying',31),(32,'ChannelPlaying',32),(33,'ChannelPlaying',33),(34,'ChannelPlaying',34),(35,'ChannelPlaying',35),(36,'ChannelPlaying',36),(37,'ChannelPlaying',37),(38,'ChannelPlaying',38),(39,'ChannelPlaying',39),(40,'ChannelPlaying',40),(41,'ChannelPlaying',41),(42,'ChannelPlaying',42),(43,'ChannelPlaying',43),(44,'ChannelPlaying',44),(45,'ChannelPlaying',45),(46,'ChannelPlaying',46),(47,'ChannelPlaying',47),(48,'ChannelPlaying',48),(49,'ChannelPlaying',49),(50,'ChannelPlaying',50),(51,'ChannelPlaying',51),(52,'ChannelPlaying',52),(53,'ChannelPlaying',53),(54,'ChannelPlaying',54),(55,'ChannelPlaying',55),(56,'ChannelPlaying',56);
/*!40000 ALTER TABLE `samplesetidentifier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicestarttrigger`
--

DROP TABLE IF EXISTS `servicestarttrigger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicestarttrigger` (
  `idservicestarttrigger` int(11) NOT NULL AUTO_INCREMENT,
  `serviceStartTrigger` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`idservicestarttrigger`),
  KEY `fk_servicestarttrigger_fk_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_servicestarttrigger_fk` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicestarttrigger`
--

LOCK TABLES `servicestarttrigger` WRITE;
/*!40000 ALTER TABLE `servicestarttrigger` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicestarttrigger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `starttime`
--

DROP TABLE IF EXISTS `starttime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `starttime` (
  `idstarttime` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` time NOT NULL,
  `measurementRequest_id` int(11) NOT NULL,
  PRIMARY KEY (`idstarttime`),
  KEY `fk_starttime_mreq_idx` (`measurementRequest_id`),
  CONSTRAINT `fk_starttime_mreq` FOREIGN KEY (`measurementRequest_id`) REFERENCES `measurementrequest` (`idmeasurementrequest`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `starttime`
--

LOCK TABLES `starttime` WRITE;
/*!40000 ALTER TABLE `starttime` DISABLE KEYS */;
INSERT INTO `starttime` VALUES (1,'00:00:00',1),(2,'00:00:00',2),(3,'00:00:00',3),(4,'00:00:00',4),(5,'00:00:00',5),(6,'00:00:00',6),(7,'00:00:00',7),(8,'00:00:00',8),(9,'00:00:00',9),(10,'00:00:00',10),(11,'00:00:00',11),(12,'00:00:00',12),(13,'00:00:00',13),(14,'00:00:00',14),(15,'00:00:00',15),(16,'00:00:00',16),(17,'00:00:00',17),(18,'00:00:00',18),(19,'00:00:00',19),(20,'00:00:00',20),(21,'00:00:00',21),(22,'00:00:00',22),(23,'00:00:00',23),(24,'00:00:00',24),(25,'00:00:00',25),(26,'00:00:00',26),(27,'00:00:00',27),(28,'00:00:00',28),(29,'00:00:00',29),(30,'00:00:00',30),(31,'00:00:00',31),(32,'00:00:00',32),(33,'00:00:00',33),(34,'00:00:00',34),(35,'00:00:00',35),(36,'00:00:00',36),(37,'00:00:00',37),(38,'00:00:00',38),(39,'00:00:00',39),(40,'00:00:00',40),(41,'00:00:00',41),(42,'00:00:00',42),(43,'00:00:00',43),(44,'00:00:00',44),(45,'00:00:00',45),(46,'00:00:00',46),(47,'00:00:00',47),(48,'00:00:00',48),(49,'00:00:00',49),(50,'00:00:00',50),(51,'00:00:00',51),(52,'00:00:00',52),(53,'00:00:00',53),(54,'00:00:00',54),(55,'00:00:00',55),(56,'00:00:00',56);
/*!40000 ALTER TABLE `starttime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timesampletrigger`
--

DROP TABLE IF EXISTS `timesampletrigger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timesampletrigger` (
  `idtimesampletrigger` int(11) NOT NULL AUTO_INCREMENT,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  `timeSampleTrigger` varchar(45) NOT NULL,
  PRIMARY KEY (`idtimesampletrigger`),
  KEY `fk_timesampletrigger_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_timesampletrigger_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timesampletrigger`
--

LOCK TABLES `timesampletrigger` WRITE;
/*!40000 ALTER TABLE `timesampletrigger` DISABLE KEYS */;
INSERT INTO `timesampletrigger` VALUES (1,3,'ChannelPlaying'),(2,4,'ChannelPlaying'),(3,5,'ChannelPlaying'),(4,6,'ChannelPlaying'),(5,7,'ChannelPlaying'),(6,8,'ChannelPlaying'),(7,9,'ChannelPlaying'),(8,10,'ChannelPlaying'),(9,11,'ChannelPlaying'),(10,12,'ChannelPlaying'),(11,13,'ChannelPlaying'),(12,14,'ChannelPlaying'),(13,15,'ChannelPlaying'),(14,16,'ChannelPlaying'),(15,17,'ChannelPlaying'),(16,18,'ChannelPlaying'),(17,19,'ChannelPlaying'),(18,20,'ChannelPlaying'),(19,21,'ChannelPlaying'),(20,22,'ChannelPlaying'),(21,23,'ChannelPlaying'),(22,24,'ChannelPlaying'),(23,25,'ChannelPlaying'),(24,26,'ChannelPlaying'),(25,27,'ChannelPlaying'),(26,28,'ChannelPlaying'),(27,29,'ChannelPlaying'),(28,30,'ChannelPlaying'),(29,31,'ChannelPlaying'),(30,32,'ChannelPlaying'),(31,33,'ChannelPlaying'),(32,34,'ChannelPlaying'),(33,35,'ChannelPlaying'),(34,36,'ChannelPlaying'),(35,37,'ChannelPlaying'),(36,38,'ChannelPlaying'),(37,39,'ChannelPlaying'),(38,40,'ChannelPlaying'),(39,41,'ChannelPlaying'),(40,42,'ChannelPlaying'),(41,43,'ChannelPlaying'),(42,44,'ChannelPlaying'),(43,45,'ChannelPlaying'),(44,46,'ChannelPlaying'),(45,47,'ChannelPlaying'),(46,48,'ChannelPlaying'),(47,49,'ChannelPlaying'),(48,50,'ChannelPlaying'),(49,51,'ChannelPlaying'),(50,52,'ChannelPlaying'),(51,53,'ChannelPlaying'),(52,54,'ChannelPlaying'),(53,55,'ChannelPlaying'),(54,56,'ChannelPlaying'),(55,57,'ChannelPlaying'),(56,58,'ChannelPlaying');
/*!40000 ALTER TABLE `timesampletrigger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transportprotocolmode`
--

DROP TABLE IF EXISTS `transportprotocolmode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transportprotocolmode` (
  `idtransportprotocolmode` int(11) NOT NULL AUTO_INCREMENT,
  `TransportProtocol` varchar(45) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`idtransportprotocolmode`),
  KEY `fk_transportprotocolmode_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_transportprotocolmode_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transportprotocolmode`
--

LOCK TABLES `transportprotocolmode` WRITE;
/*!40000 ALTER TABLE `transportprotocolmode` DISABLE KEYS */;
INSERT INTO `transportprotocolmode` VALUES (1,'TCP',3),(2,'UDP',3),(3,'TCP',4),(4,'UDP',4),(5,'TCP',5),(6,'UDP',5),(7,'TCP',6),(8,'UDP',6),(9,'TCP',7),(10,'UDP',7),(11,'TCP',8),(12,'UDP',8),(13,'TCP',9),(14,'UDP',9),(15,'TCP',10),(16,'UDP',10),(17,'TCP',11),(18,'UDP',11),(19,'TCP',12),(20,'UDP',12),(21,'TCP',13),(22,'UDP',13),(23,'TCP',14),(24,'UDP',14),(25,'TCP',15),(26,'UDP',15),(27,'TCP',16),(28,'UDP',16),(29,'TCP',17),(30,'UDP',17),(31,'TCP',18),(32,'UDP',18),(33,'TCP',19),(34,'UDP',19),(35,'TCP',20),(36,'UDP',20),(37,'TCP',21),(38,'UDP',21),(39,'TCP',22),(40,'UDP',22),(41,'TCP',23),(42,'UDP',23),(43,'TCP',24),(44,'UDP',24),(45,'TCP',25),(46,'UDP',25),(47,'TCP',26),(48,'UDP',26),(49,'TCP',27),(50,'UDP',27),(51,'TCP',28),(52,'UDP',28),(53,'TCP',29),(54,'UDP',29),(55,'TCP',30),(56,'UDP',30),(57,'TCP',31),(58,'UDP',31),(59,'TCP',32),(60,'UDP',32),(61,'TCP',33),(62,'UDP',33),(63,'TCP',34),(64,'UDP',34),(65,'TCP',35),(66,'UDP',35),(67,'TCP',36),(68,'UDP',36),(69,'TCP',37),(70,'UDP',37),(71,'TCP',38),(72,'UDP',38),(73,'TCP',39),(74,'UDP',39),(75,'TCP',40),(76,'UDP',40),(77,'TCP',41),(78,'UDP',41),(79,'TCP',42),(80,'UDP',42),(81,'TCP',43),(82,'UDP',43),(83,'TCP',44),(84,'UDP',44),(85,'TCP',45),(86,'UDP',45),(87,'TCP',46),(88,'UDP',46),(89,'TCP',47),(90,'UDP',47),(91,'TCP',48),(92,'UDP',48),(93,'TCP',49),(94,'UDP',49),(95,'TCP',50),(96,'UDP',50),(97,'TCP',51),(98,'UDP',51),(99,'TCP',52),(100,'UDP',52),(101,'TCP',53),(102,'UDP',53),(103,'TCP',54),(104,'UDP',54),(105,'TCP',55),(106,'UDP',55),(107,'TCP',56),(108,'UDP',56),(109,'TCP',57),(110,'UDP',57),(111,'TCP',58),(112,'UDP',58);
/*!40000 ALTER TABLE `transportprotocolmode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `videoresize`
--

DROP TABLE IF EXISTS `videoresize`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `videoresize` (
  `idvideoresize` int(11) NOT NULL AUTO_INCREMENT,
  `imagewidth` int(11) NOT NULL,
  `imageheight` int(11) NOT NULL,
  `serviceInstanceID` int(11) NOT NULL,
  `measurementReport_id` int(11) NOT NULL,
  PRIMARY KEY (`idvideoresize`),
  KEY `fk_videoresize_mr_idx` (`measurementReport_id`),
  CONSTRAINT `fk_videoresize_mr` FOREIGN KEY (`measurementReport_id`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `videoresize`
--

LOCK TABLES `videoresize` WRITE;
/*!40000 ALTER TABLE `videoresize` DISABLE KEYS */;
INSERT INTO `videoresize` VALUES (1,0,0,0,120);
/*!40000 ALTER TABLE `videoresize` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vodEvent`
--

DROP TABLE IF EXISTS `vodEvent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vodEvent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_measurement_report` int(11) NOT NULL,
  `event` varchar(45) NOT NULL,
  `serviceInstanceID` int(11) DEFAULT NULL,
  `serviceIdentifier` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vodEvent_1_idx` (`id_measurement_report`),
  CONSTRAINT `fk_vodEvent_1` FOREIGN KEY (`id_measurement_report`) REFERENCES `measurementreport` (`idmeasurementreport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vodEvent`
--

LOCK TABLES `vodEvent` WRITE;
/*!40000 ALTER TABLE `vodEvent` DISABLE KEYS */;
INSERT INTO `vodEvent` VALUES (1,560,'Videostart',2,'Pulp Fiction'),(2,580,'Videopause',2,'Pulp Fiction'),(3,583,'Videostart',2,'Pulp Fiction'),(4,589,'Videostart',2,'Pulp Fiction'),(5,607,'Videostart',2,'Pulp Fiction'),(6,609,'Videostart',2,'Pulp Fiction'),(7,615,'Videostart',2,'Pulp Fiction'),(8,636,'Videoexit',2,'Pulp Fiction');
/*!40000 ALTER TABLE `vodEvent` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-08 17:57:55
