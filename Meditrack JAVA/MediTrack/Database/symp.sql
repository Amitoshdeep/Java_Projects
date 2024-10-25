-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: symp
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dis`
--

DROP TABLE IF EXISTS `dis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dis` (
  `symp` varchar(99) DEFAULT NULL,
  `dis` varchar(99) DEFAULT NULL,
  `other_symp` varchar(255) DEFAULT NULL,
  `care` varchar(255) DEFAULT NULL,
  `cause` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dis`
--

LOCK TABLES `dis` WRITE;
/*!40000 ALTER TABLE `dis` DISABLE KEYS */;
INSERT INTO `dis` VALUES ('Cold and cough,Running Nose, Sour throut','Common cold','Running Nose, Sour throut','Bed rest,medication','Rhinovirus is the cause of Common Cold. Take rest and Stay Healthy'),('Blister,scab, ulcers or red spots , fatigue, fever or loss of appetite','ChikenPox','scab, ulcers or red spots , fatigue	, fever or loss of appetite','Vaccination only','Varicella-Zoster is the reason. It spread easily to other from 1 to 2 days before blister appears until all the blisters have crusted over.'),('Pain in abdomen,white tongue, dry cough, loss of appetite, pain occur while swalling','HIV','white tongue, dry cough, loss of appetite, pain occur while swalling','no cure','contact with infected blood ,from mother child during pregnancy , childbirth or breastFeeding'),('Chils, Fever and Sweating, fast heart rate','Malaria','Chils, Fever and Sweating, fast heart rate','Artemether-Lumerfantrine(Coartem)','Being bitten by an infective female Anopheles mosquitio'),('High fever, Stomach pain, Vomiting, loose stools','Typhoid','High fever, Stomach pain, Vomiting, loose stools','Rest , Antibiotic Medicine','Drinking contaminated water or eating food washed in contaminated water'),('Shortness of breath,Difficulty breathing,Muscle ache,body pain','Covid-19','Shortness of breath,Difficulty breathing,Muscle ache,body pain','Take anti-virus like Paxloxid,Remedesiver or Mulnupriver','Is mainly transmitted through droplets when an infected person cough, sneeze or exales');
/*!40000 ALTER TABLE `dis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opat`
--

DROP TABLE IF EXISTS `opat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opat` (
  `name` varchar(99) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `bp` varchar(7) DEFAULT NULL,
  `new_bp` varchar(7) DEFAULT NULL,
  `temp` decimal(4,1) DEFAULT NULL,
  `new_temp` decimal(4,1) DEFAULT NULL,
  `symp` varchar(99) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opat`
--

LOCK TABLES `opat` WRITE;
/*!40000 ALTER TABLE `opat` DISABLE KEYS */;
INSERT INTO `opat` VALUES ('Amitosh',17,'Male','98/150','98/150',99.0,101.0,'Pain in abdomen,white tongue, dry cough, loss of appetite, pain occur while swalling',1);
/*!40000 ALTER TABLE `opat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pat`
--

DROP TABLE IF EXISTS `pat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pat` (
  `name` varchar(99) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `mnumb` bigint DEFAULT NULL,
  `symp` varchar(99) DEFAULT NULL,
  `bp` varchar(7) DEFAULT NULL,
  `temp` decimal(4,1) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pat`
--

LOCK TABLES `pat` WRITE;
/*!40000 ALTER TABLE `pat` DISABLE KEYS */;
INSERT INTO `pat` VALUES ('Amitosh',17,'Male',9915611433,'Cold and cough,Running Nose, Sour throut','98/150',99.0,5),('suhani',17,'female',9417093922,'Pain in abdomen,white tongue, dry cough, loss of appetite, pain occur while swalling','99/130',98.0,6);
/*!40000 ALTER TABLE `pat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-01 11:32:49
