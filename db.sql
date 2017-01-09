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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amfcapabilityprofile`
--

LOCK TABLES `amfcapabilityprofile` WRITE;
/*!40000 ALTER TABLE `amfcapabilityprofile` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amfconfigpckg`
--

LOCK TABLES `amfconfigpckg` WRITE;
/*!40000 ALTER TABLE `amfconfigpckg` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amreportpackage`
--

LOCK TABLES `amreportpackage` WRITE;
/*!40000 ALTER TABLE `amreportpackage` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channellist`
--

LOCK TABLES `channellist` WRITE;
/*!40000 ALTER TABLE `channellist` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compression`
--

LOCK TABLES `compression` WRITE;
/*!40000 ALTER TABLE `compression` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configpckgrequestresponse`
--

LOCK TABLES `configpckgrequestresponse` WRITE;
/*!40000 ALTER TABLE `configpckgrequestresponse` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configurationmode`
--

LOCK TABLES `configurationmode` WRITE;
/*!40000 ALTER TABLE `configurationmode` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configurationpackagerequest`
--

LOCK TABLES `configurationpackagerequest` WRITE;
/*!40000 ALTER TABLE `configurationpackagerequest` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cryptographicprotocol`
--

LOCK TABLES `cryptographicprotocol` WRITE;
/*!40000 ALTER TABLE `cryptographicprotocol` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveryAddress`
--

LOCK TABLES `deliveryAddress` WRITE;
/*!40000 ALTER TABLE `deliveryAddress` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliverymode`
--

LOCK TABLES `deliverymode` WRITE;
/*!40000 ALTER TABLE `deliverymode` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dias`
--

LOCK TABLES `dias` WRITE;
/*!40000 ALTER TABLE `dias` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endtime`
--

LOCK TABLES `endtime` WRITE;
/*!40000 ALTER TABLE `endtime` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventtrigger`
--

LOCK TABLES `eventtrigger` WRITE;
/*!40000 ALTER TABLE `eventtrigger` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `immediatepush`
--

LOCK TABLES `immediatepush` WRITE;
/*!40000 ALTER TABLE `immediatepush` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lineartvqualififer`
--

LOCK TABLES `lineartvqualififer` WRITE;
/*!40000 ALTER TABLE `lineartvqualififer` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurementreport`
--

LOCK TABLES `measurementreport` WRITE;
/*!40000 ALTER TABLE `measurementreport` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurementrequest`
--

LOCK TABLES `measurementrequest` WRITE;
/*!40000 ALTER TABLE `measurementrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `measurementrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operationalmanagement`
--

DROP TABLE IF EXISTS `operationalmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operationalmanagement` (
  `idoperationalmanagement` int(11) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  `operationalManagement` varchar(45) NOT NULL,
  PRIMARY KEY (`idoperationalmanagement`),
  KEY `fk_operationalmanagement_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_operationalmanagement_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operationalmanagement`
--

LOCK TABLES `operationalmanagement` WRITE;
/*!40000 ALTER TABLE `operationalmanagement` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissionmode`
--

LOCK TABLES `permissionmode` WRITE;
/*!40000 ALTER TABLE `permissionmode` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `samplesetidentifier`
--

LOCK TABLES `samplesetidentifier` WRITE;
/*!40000 ALTER TABLE `samplesetidentifier` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `starttime`
--

LOCK TABLES `starttime` WRITE;
/*!40000 ALTER TABLE `starttime` DISABLE KEYS */;
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
  `timesampletriggercol` varchar(100) NOT NULL,
  `AMFCapabilityProfile_id` int(11) NOT NULL,
  PRIMARY KEY (`idtimesampletrigger`),
  KEY `fk_timesampletrigger_amf_idx` (`AMFCapabilityProfile_id`),
  CONSTRAINT `fk_timesampletrigger_amf` FOREIGN KEY (`AMFCapabilityProfile_id`) REFERENCES `amfcapabilityprofile` (`id_amf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timesampletrigger`
--

LOCK TABLES `timesampletrigger` WRITE;
/*!40000 ALTER TABLE `timesampletrigger` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transportprotocolmode`
--

LOCK TABLES `transportprotocolmode` WRITE;
/*!40000 ALTER TABLE `transportprotocolmode` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `videoresize`
--

LOCK TABLES `videoresize` WRITE;
/*!40000 ALTER TABLE `videoresize` DISABLE KEYS */;
/*!40000 ALTER TABLE `videoresize` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-09 16:35:23
