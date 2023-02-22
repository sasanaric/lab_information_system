CREATE DATABASE  IF NOT EXISTS `lab_information_system` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `lab_information_system`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: lab_information_system
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `biochemistry`
--

DROP TABLE IF EXISTS `biochemistry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `biochemistry` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `s_glucose` decimal(10,2) NOT NULL,
                                `s_urea` decimal(10,2) NOT NULL,
                                `s_creatinine` int NOT NULL,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=138 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biochemistry`
--

LOCK TABLES `biochemistry` WRITE;
/*!40000 ALTER TABLE `biochemistry` DISABLE KEYS */;
INSERT INTO `biochemistry` VALUES (1,9.00,6.00,7),(2,5.40,9.90,8),(3,9.30,8.00,6),(4,7.40,6.60,6),(5,8.00,9.00,9),(6,8.00,9.00,9),(7,8.00,9.00,7),(8,4.00,3.00,5),(9,3.00,3.00,3),(10,7.00,5.00,3),(11,9.00,1.00,0),(12,5.00,1.00,2),(13,8.00,8.00,8),(14,3.00,1.00,3),(15,3.00,1.00,8),(16,2.00,9.00,9),(17,5.00,5.00,5),(18,1.00,1.00,1),(19,8.00,8.00,5),(20,4.00,4.00,4),(21,9.00,9.00,9),(22,1.00,1.00,1),(23,8.00,8.00,8),(24,7.00,9.00,9),(25,4.00,4.00,1),(26,5.00,5.00,5),(27,8.00,1.00,1),(28,7.00,7.00,9),(29,4.00,1.00,7),(30,8.00,7.00,4),(31,7.00,6.00,5),(32,6.00,7.00,5),(33,9.00,9.00,9),(34,8.00,8.00,8),(35,2.00,9.00,6),(36,4.00,4.00,6),(37,1.00,1.00,1),(38,8.00,6.00,8),(39,5.00,7.00,3),(40,4.00,1.00,6),(41,5.00,1.00,9),(42,4.00,4.00,4),(43,2.00,5.00,4),(44,2.00,1.00,3),(45,3.00,6.00,1),(46,1.00,7.00,5),(47,2.00,1.00,1),(48,5.00,5.00,5),(49,5.00,1.00,2),(50,2.00,7.00,4),(51,8.00,7.00,9),(52,2.00,8.00,4),(53,4.00,5.00,5),(54,4.00,4.00,9),(55,7.00,7.00,7),(56,4.00,4.00,3),(57,6.00,7.00,5),(58,1.00,1.00,1),(59,2.00,1.00,1),(60,3.00,3.00,3),(61,5.00,7.00,4),(62,4.00,7.00,9),(63,3.00,7.00,4),(64,3.00,7.00,2),(65,6.00,9.00,7),(66,7.00,8.00,6),(67,3.00,4.00,6),(68,5.00,4.00,2),(69,3.00,3.00,3),(70,4.00,4.00,4),(71,3.00,6.00,2),(72,2.00,6.00,3),(73,2.00,7.00,5),(74,5.00,8.00,9),(75,2.00,3.00,2),(76,3.00,8.00,6),(77,3.00,3.00,3),(78,4.00,6.00,3),(79,7.00,8.00,8),(80,1.00,4.00,3),(81,7.00,6.00,8),(82,6.00,5.00,7),(83,3.00,4.00,7),(84,2.00,1.00,3),(85,6.00,6.00,6),(86,3.00,3.00,3),(87,3.00,3.00,3),(88,5.00,3.00,1),(89,6.00,3.00,4),(90,6.00,7.00,6),(91,5.00,7.00,3),(92,3.00,6.00,2),(93,6.00,3.00,7),(94,7.00,5.00,4),(95,6.00,4.00,7),(96,6.00,4.00,8),(97,6.00,5.00,2),(98,7.00,6.00,3),(99,3.00,6.00,1),(100,8.00,7.00,6),(101,7.00,5.00,8),(102,10.00,5.00,53),(103,6.00,3.00,9),(104,7.00,5.00,34),(105,3.00,3.00,3),(106,4.00,4.00,4),(107,5.00,6.00,4),(108,7.35,5.04,117),(109,4.87,8.62,100),(110,5.12,9.41,44),(111,7.86,6.32,39),(112,3.98,2.91,110),(113,5.53,10.17,122),(114,7.23,3.96,122),(115,5.86,2.96,123),(116,4.27,8.23,76),(117,6.98,7.03,98),(118,7.29,4.71,77),(119,3.89,5.00,121),(120,7.51,9.26,108),(121,7.31,4.36,80),(122,7.09,6.21,43),(123,6.64,10.74,63),(124,4.21,3.51,110),(125,3.11,10.49,111),(126,6.79,6.95,73),(127,6.64,9.64,85),(128,4.02,10.65,100),(129,4.45,8.36,47),(130,4.48,7.92,48),(131,3.71,7.97,125),(132,7.39,8.19,44),(133,5.10,10.75,128),(134,6.09,6.37,110),(135,4.15,3.33,70),(136,6.12,2.97,112),(137,7.01,10.04,91);
/*!40000 ALTER TABLE `biochemistry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borders`
--

DROP TABLE IF EXISTS `borders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borders` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `s_glucose_low` decimal(5,2) DEFAULT NULL,
                           `s_glucose_high` decimal(5,2) DEFAULT NULL,
                           `s_urea_low` decimal(5,2) DEFAULT NULL,
                           `s_urea_high` decimal(5,2) DEFAULT NULL,
                           `s_creatinine_low` decimal(5,2) DEFAULT NULL,
                           `s_creatinine_high` decimal(5,2) DEFAULT NULL,
                           `leukocytes_low` decimal(5,2) DEFAULT NULL,
                           `leukocytes_high` decimal(5,2) DEFAULT NULL,
                           `erythrocytes_low` decimal(5,2) DEFAULT NULL,
                           `erythrocytes_high` decimal(5,2) DEFAULT NULL,
                           `hemaglobin_low` decimal(5,2) DEFAULT NULL,
                           `hemaglobin_high` decimal(5,2) DEFAULT NULL,
                           `hematocrit_low` decimal(5,2) DEFAULT NULL,
                           `hematocrit_high` decimal(5,2) DEFAULT NULL,
                           `platelets_low` decimal(5,2) DEFAULT NULL,
                           `platelets_high` decimal(5,2) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borders`
--

LOCK TABLES `borders` WRITE;
/*!40000 ALTER TABLE `borders` DISABLE KEYS */;
INSERT INTO `borders` VALUES (1,4.10,5.90,3.00,9.10,62.00,106.00,3.90,10.20,4.40,5.70,135.00,170.00,40.00,50.00,150.00,370.00),(2,4.10,5.90,2.50,6.70,44.00,80.00,3.90,10.20,3.90,5.00,120.00,160.00,36.00,48.00,150.00,350.00);
/*!40000 ALTER TABLE `borders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hematology`
--

DROP TABLE IF EXISTS `hematology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hematology` (
                              `id` int NOT NULL AUTO_INCREMENT,
                              `leukocytes` decimal(10,2) NOT NULL,
                              `erythrocytes` decimal(10,2) NOT NULL,
                              `hemaglobin` decimal(10,2) NOT NULL,
                              `hematocrit` decimal(10,2) NOT NULL,
                              `platelets` decimal(10,2) NOT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematology`
--

LOCK TABLES `hematology` WRITE;
/*!40000 ALTER TABLE `hematology` DISABLE KEYS */;
INSERT INTO `hematology` VALUES (1,5.00,3.00,10.00,6.60,7.00),(2,5.00,3.00,10.00,7.00,7.00),(3,6.00,3.00,10.00,8.00,7.00),(4,9.40,9.66,10.70,9.30,9.30),(5,4.00,2.00,8.00,1.00,5.00),(6,1.00,2.00,3.00,4.00,5.00),(7,4.00,3.00,6.00,7.00,8.00),(8,2.00,2.00,2.00,2.00,2.00),(9,6.00,6.00,6.00,3.00,3.00),(10,5.00,4.00,1.00,6.00,9.00),(11,8.00,8.00,8.00,8.00,8.00),(12,6.30,4.60,100.00,65.00,300.00),(13,5.00,4.10,100.00,44.30,120.00),(14,6.00,4.30,100.00,30.00,100.00),(15,10.36,3.73,164.00,40.00,129.00),(16,8.16,2.62,116.00,45.00,393.00),(17,3.03,3.35,137.00,38.00,276.00),(18,6.90,3.44,138.00,49.00,271.00),(19,4.24,2.92,154.00,28.00,282.00),(20,10.35,5.47,119.00,38.00,165.00),(21,10.28,2.12,175.00,54.00,322.00),(22,6.16,5.75,135.00,33.00,120.00),(23,6.24,6.56,122.00,46.00,340.00),(24,3.87,6.79,167.00,51.00,152.00),(25,3.42,6.09,155.00,31.00,346.00),(26,5.39,6.74,167.00,41.00,400.00),(27,3.72,3.13,147.00,39.00,291.00),(28,9.11,4.71,122.00,34.00,252.00),(29,10.99,4.62,126.00,50.00,205.00),(30,5.47,5.89,152.00,31.00,395.00),(31,4.32,6.64,138.00,30.00,209.00),(32,4.02,2.80,168.00,34.00,216.00),(33,5.69,4.96,132.00,45.00,212.00),(34,11.55,2.57,166.00,41.00,370.00),(35,11.90,5.44,142.00,54.00,283.00),(36,4.24,3.74,184.00,46.00,351.00),(37,11.91,5.36,177.00,46.00,227.00),(38,11.72,3.49,174.00,56.00,213.00),(39,3.79,3.30,151.00,50.00,231.00),(40,7.84,3.76,116.00,41.00,204.00),(41,11.56,3.83,101.00,39.00,320.00),(42,5.41,5.19,132.00,47.00,399.00),(43,7.09,3.07,130.00,43.00,389.00),(44,3.92,6.86,147.00,36.00,256.00);
/*!40000 ALTER TABLE `hematology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical_record`
--

DROP TABLE IF EXISTS `medical_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_record` (
                                  `id` int NOT NULL AUTO_INCREMENT,
                                  `icd` varchar(20) NOT NULL,
                                  `is_valid` varchar(45) NOT NULL,
                                  `hematology_id` int DEFAULT NULL,
                                  `urine_id` int DEFAULT NULL,
                                  `biochemistry_id` int DEFAULT NULL,
                                  `patient_id` int NOT NULL,
                                  `user_id` int NOT NULL,
                                  `created_time` timestamp NULL DEFAULT NULL,
                                  `deleted` tinyint(1) NOT NULL DEFAULT '0',
                                  PRIMARY KEY (`id`),
                                  KEY `fk_medical_record_Hematology_idx` (`hematology_id`),
                                  KEY `fk_medical_record_Urine1_idx` (`urine_id`),
                                  KEY `fk_medical_record_Biochemistry1_idx` (`biochemistry_id`),
                                  KEY `fk_medical_record_patient1_idx` (`patient_id`),
                                  KEY `fk_medical_record_user1_idx` (`user_id`),
                                  CONSTRAINT `fk_medical_record_Biochemistry1` FOREIGN KEY (`biochemistry_id`) REFERENCES `biochemistry` (`id`),
                                  CONSTRAINT `fk_medical_record_Hematology` FOREIGN KEY (`hematology_id`) REFERENCES `hematology` (`id`),
                                  CONSTRAINT `fk_medical_record_patient1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`),
                                  CONSTRAINT `fk_medical_record_Urine1` FOREIGN KEY (`urine_id`) REFERENCES `urine` (`id`),
                                  CONSTRAINT `fk_medical_record_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_record`
--

LOCK TABLES `medical_record` WRITE;
/*!40000 ALTER TABLE `medical_record` DISABLE KEYS */;
INSERT INTO `medical_record` VALUES (88,'232','true',NULL,NULL,87,2,1,'2023-02-21 13:16:17',1),(89,'312','false',NULL,NULL,88,3,1,'2023-02-21 13:16:30',1),(90,'111','true',NULL,NULL,89,3,1,'2023-02-21 13:16:40',1),(91,'232','true',NULL,NULL,90,3,1,'2023-02-21 13:16:57',1),(92,'523','true',NULL,NULL,91,2,1,'2023-02-21 13:27:00',1),(93,'272','false',NULL,NULL,92,2,1,'2023-02-21 13:27:16',1),(94,'336','false',NULL,NULL,93,3,1,'2023-02-21 13:27:30',1),(95,'225','true',NULL,NULL,94,2,1,'2023-02-21 13:27:40',1),(96,'163','false',NULL,NULL,95,2,1,'2023-02-21 13:54:59',1),(97,'531','true',NULL,NULL,96,2,1,'2023-02-21 13:56:30',0),(98,'252','false',NULL,NULL,97,2,1,'2023-02-21 13:56:40',1),(99,'225','true',NULL,NULL,98,2,1,'2023-02-20 13:56:52',1),(100,'124','true',NULL,NULL,99,2,1,'2023-02-20 14:00:01',1),(101,'47','true',NULL,NULL,100,2,1,'2023-02-20 14:00:16',1),(102,'623','false',NULL,NULL,101,3,1,'2023-02-20 14:00:30',1),(103,'1231','false',12,18,102,2,1,'2023-02-22 09:08:16',1),(104,'1412','false',13,16,103,3,1,'2023-02-22 09:10:00',0),(105,'1512','false',14,19,104,10,1,'2023-02-22 11:03:12',0),(106,'111','false',NULL,NULL,105,2,1,'2023-02-22 11:25:15',0),(107,'222','false',NULL,NULL,106,3,1,'2023-02-22 11:25:25',1),(108,'344','false',NULL,NULL,107,9,1,'2023-02-22 11:25:36',1),(109,'739','true',15,20,108,8,1,'2023-02-16 18:04:48',0),(110,'924','true',16,21,109,9,1,'2023-01-27 12:43:37',0),(111,'905','true',17,22,110,10,1,'2023-01-24 01:41:34',0),(112,'459','false',18,23,111,11,1,'2023-02-16 10:06:11',0),(113,'070','true',19,24,112,12,1,'2023-02-08 10:46:06',0),(114,'931','false',20,25,113,8,1,'2023-02-05 01:32:54',0),(115,'154','false',21,26,114,9,1,'2023-01-25 06:51:18',0),(116,'765','true',22,27,115,10,1,'2023-01-24 01:00:43',0),(117,'480','true',23,28,116,11,1,'2023-02-15 12:18:57',0),(118,'100','false',24,29,117,12,1,'2023-02-08 03:55:34',0),(119,'740','true',25,30,118,8,1,'2023-02-17 10:32:19',0),(120,'780','false',26,31,119,9,1,'2023-02-20 16:37:48',0),(121,'127','true',27,32,120,10,1,'2023-02-17 23:39:56',0),(122,'116','false',28,33,121,11,1,'2023-01-25 15:04:12',0),(123,'793','false',29,34,122,12,1,'2023-02-21 19:13:22',1),(124,'238','false',30,35,123,8,1,'2023-02-04 01:55:00',0),(125,'263','false',31,36,124,9,1,'2023-02-14 07:19:25',0),(126,'322','true',32,37,125,10,1,'2023-02-08 22:25:49',0),(127,'676','true',33,38,126,11,1,'2023-02-21 04:24:24',0),(128,'280','false',34,39,127,12,1,'2023-02-12 10:01:04',0),(129,'675','false',35,40,128,8,1,'2023-02-05 06:02:28',0),(130,'068','true',36,41,129,9,1,'2023-02-02 00:13:22',0),(131,'298','true',37,42,130,10,1,'2023-02-21 08:06:08',0),(132,'490','true',38,43,131,11,1,'2023-02-11 14:28:21',0),(133,'474','false',39,44,132,12,1,'2023-02-04 23:46:37',0),(134,'279','false',40,45,133,8,1,'2023-02-13 08:50:17',0),(135,'853','true',41,46,134,9,1,'2023-01-25 07:09:03',0),(136,'240','false',42,47,135,10,1,'2023-02-15 09:39:27',0),(137,'137','true',43,48,136,11,1,'2023-02-19 15:54:40',0),(138,'259','true',44,49,137,12,1,'2023-01-27 23:12:19',0);
/*!40000 ALTER TABLE `medical_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `first_name` varchar(45) NOT NULL,
                           `last_name` varchar(45) NOT NULL,
                           `birth_date` date NOT NULL,
                           `jmbg` varchar(13) NOT NULL,
                           `gender` varchar(6) NOT NULL,
                           `address` varchar(100) NOT NULL,
                           `phone` varchar(15) NOT NULL,
                           `city` varchar(45) NOT NULL,
                           `family_doctor` varchar(45) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (2,'Marko','Markovic','2022-02-02','1234','M','adresa1','123345','Banja Luka','doktor1'),(3,'Ivan','Ivanovic','2022-08-02','12514','M','adresa2','127245','Banja Luka','doktor1'),(8,'Tymothy','Algie','2021-03-28','4235338575','M','6314 Novick Hill','738-155-7734','Tierralta','Tymothy Algie'),(9,'Clarke','Tort','2021-05-11','8885308643','M','223 Quincy Road','119-310-5560','Marinilla','Clarke Tort'),(10,'Bertha','Duffill','2022-05-11','2308086091','Z','4 Karstens Terrace','102-414-9019','Cimanggu Wetan','Bertha Duffill'),(11,'Retha','Bonnor','2020-12-15','5847492915','Z','684 Dakota Place','933-633-3845','Jiangmen','Retha Bonnor'),(12,'Issi','Brackpool','2021-08-09','5148875394','Z','036 Dayton Pass','479-388-4889','Nouna','Issi Brackpool'),(13,'Trenton','Fearnyough','2021-01-11','2768746145','M','28 Evergreen Junction','307-470-8278','Linjiang','Trenton Fearnyough'),(14,'Blancha','Askell','2021-07-04','3164010244','Z','822 Riverside Pass','767-233-5855','Kertosari','Blancha Askell'),(15,'Berkly','Auton','2022-08-12','6505591244','M','027 Mockingbird Plaza','717-683-5620','Ristinummi','Berkly Auton'),(16,'Davita','Kisting','2022-09-02','5433788280','Z','64 Eastlawn Road','862-952-9225','Biliran','Davita Kisting'),(17,'Tedd','Bountiff','2021-09-17','3075923188','M','962 Mcguire Road','724-101-6956','Siqiao','Tedd Bountiff'),(18,'Nelia','Dilkes','2022-07-21','2776234196','Z','4 Stang Center','350-491-8645','Listowel','Nelia Dilkes'),(19,'Joe','Longland','2022-09-29','1201276168','M','3882 Karstens Junction','863-192-8223','Põltsamaa','Joe Longland'),(20,'Connie','Pittford','2022-10-26','9503818319','Z','657 Dexter Place','184-936-2216','Xuefu','Connie Pittford'),(21,'Delinda','Rogan','2020-11-25','6155680187','Z','0065 Bartillon Terrace','505-289-0754','Nashville','Delinda Rogan'),(22,'Forster','Newvell','2023-02-18','3887511358','M','7 Hazelcrest Parkway','166-645-2173','Shāhdādkot','Forster Newvell');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urine`
--

DROP TABLE IF EXISTS `urine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `urine` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `u_proteins` varchar(60) NOT NULL,
                         `urine_sediment` varchar(100) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urine`
--

LOCK TABLES `urine` WRITE;
/*!40000 ALTER TABLE `urine` DISABLE KEYS */;
INSERT INTO `urine` VALUES (1,'uprotein1','usediment1'),(2,'uprotein2','usediment112'),(3,'uprotein4','usediment41'),(4,'uprotein5','usediment55'),(5,'m','k'),(6,'m','k'),(7,'sedpr3','sed1'),(8,'sedr2','sed1'),(9,'tg','gt'),(10,'fs','sa'),(11,'ds','sd'),(12,'gg','sf'),(13,'ggg','hhh'),(14,'d','s'),(15,'gg','hh'),(16,'ds','sd'),(17,'pr','sed'),(18,'sd2','sd1'),(19,'up','us'),(20,'hknar','hwgzz'),(21,'nhsiy','sizke'),(22,'uyvvu','chsoh'),(23,'mvefx','dyydp'),(24,'yeeah','dvbed'),(25,'qvagc','tgvem'),(26,'lmwil','bwmpp'),(27,'yhukk','bcadg'),(28,'ovcmw','mwoud'),(29,'waddo','elcvz'),(30,'rnrtz','ybana'),(31,'gwomk','hswwy'),(32,'dkblc','ktucp'),(33,'xseab','sfwfp'),(34,'uaotj','fgciz'),(35,'vixph','brsxd'),(36,'jodvp','csbmv'),(37,'fjgvo','zjmcm'),(38,'kfauo','zjqib'),(39,'uodeu','lngwv'),(40,'vylul','ojlww'),(41,'yglvw','umucf'),(42,'llrxn','tiebp'),(43,'ohhhr','cwwme'),(44,'xizof','xnllb'),(45,'vuxmt','soyqi'),(46,'vqxbm','drkep'),(47,'bscut','unsjo'),(48,'ysotk','jhbao'),(49,'vmzhm','ybkya');
/*!40000 ALTER TABLE `urine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `username` varchar(45) NOT NULL,
                        `first_name` varchar(45) NOT NULL,
                        `last_name` varchar(45) NOT NULL,
                        `specialization` varchar(100) NOT NULL,
                        `role` varchar(45) NOT NULL,
                        `password` varchar(100) NOT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'doktor1','Ivan','Ivanovic','spec','DOCTOR','root'),(7,'doktor123','DC','Markovic','none','ADMIN','$2a$10$DH7lJO1Pou1ZPMk1N1aHXOAPIJo8dcrwrUPMUiu8O2Gtf7bMo0TBq'),(8,'doktor1234','Marko','Markovic','none','DOCTOR','$2a$10$Q3V1/cRM1GntYGF5TZ5HOupiqY1iQDVUm9cZ7Ri1Au1Znb3GL6P1u'),(9,'admin','DOC','Markovic','none','ADMIN','$2a$10$8uleDtnTpjNitZP9N/UvRe8ZM25TZ.EkSuJYFMfCEg.g9IUNlpuGy'),(10,'tehnicar66','Teh','Prezime','nn','NURSE','lozinka66'),(12,'doktor22','Petar','Petrovic','nn','DOCTOR','$2a$10$ub2H7XO5H5EDASzJGrtiBed0CX9cznon1ILUGnSYI2UGrwyiuT5xS'),(14,'tehnicar','Novi','Tehnicar','nn','NURSE','$2a$10$nLcLJsCm1dnEGmX3yI3NceVRn7YtHOh3HLD/O6C6SX7vUI0iCL6Oq');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-22 18:23:14
