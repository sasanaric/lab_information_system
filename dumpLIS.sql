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
  `id` int NOT NULL,
  `s-glucose` decimal(10,0) NOT NULL,
  `s-urea` decimal(10,0) NOT NULL,
  `s-creatinine` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biochemistry`
--

LOCK TABLES `biochemistry` WRITE;
/*!40000 ALTER TABLE `biochemistry` DISABLE KEYS */;
/*!40000 ALTER TABLE `biochemistry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hematology`
--

DROP TABLE IF EXISTS `hematology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hematology` (
  `id` int NOT NULL,
  `leukocytes` decimal(10,0) NOT NULL,
  `erythrocytes` decimal(10,0) NOT NULL,
  `hemaglobin` decimal(10,0) NOT NULL,
  `hematocrit` decimal(10,0) NOT NULL,
  `platelets` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematology`
--

LOCK TABLES `hematology` WRITE;
/*!40000 ALTER TABLE `hematology` DISABLE KEYS */;
/*!40000 ALTER TABLE `hematology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical_record`
--

DROP TABLE IF EXISTS `medical_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_record` (
  `id` int NOT NULL,
  `icd` varchar(20) NOT NULL,
  `is_valid` varchar(45) NOT NULL,
  `hematology_id` int DEFAULT NULL,
  `urine_id` int DEFAULT NULL,
  `biochemistry_id` int DEFAULT NULL,
  `patient_id` int NOT NULL,
  `user_id` int NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_record`
--

LOCK TABLES `medical_record` WRITE;
/*!40000 ALTER TABLE `medical_record` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (4569,'Ivan','Ivanovic','2022-02-02','4562','M','adresa2','51513','Banja Luka','doktor2'),(79452,'Marko','Markovic','2022-01-01','12345','M','adresa1','0657','Banja Luka','doktor1');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urine`
--

DROP TABLE IF EXISTS `urine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `urine` (
  `id` int NOT NULL,
  `u-proteins` varchar(60) NOT NULL,
  `urine_sediment` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urine`
--

LOCK TABLES `urine` WRITE;
/*!40000 ALTER TABLE `urine` DISABLE KEYS */;
/*!40000 ALTER TABLE `urine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `specialization` varchar(100) NOT NULL,
  `role` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
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

-- Dump completed on 2022-12-05 17:18:28
