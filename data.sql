/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.73-community : Database - database1
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`database1` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `database1`;

/*Table structure for table `b1` */

DROP TABLE IF EXISTS `b1`;

CREATE TABLE `b1` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `b1` */

insert  into `b1`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Full','0'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Vacant','0'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `b2` */

DROP TABLE IF EXISTS `b2`;

CREATE TABLE `b2` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `b2` */

insert  into `b2`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Vacant','0'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Vacant','0'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `b3` */

DROP TABLE IF EXISTS `b3`;

CREATE TABLE `b3` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `b3` */

insert  into `b3`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Vacant','0'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Vacant','0'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `block_status` */

DROP TABLE IF EXISTS `block_status`;

CREATE TABLE `block_status` (
  `Block` varchar(2) NOT NULL,
  `NoOfRoomsVacant` int(10) DEFAULT NULL,
  `Status` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`Block`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `block_status` */

insert  into `block_status`(`Block`,`NoOfRoomsVacant`,`Status`) values ('B1',NULL,NULL),('B2',NULL,NULL),('B3',NULL,NULL),('G1',NULL,NULL),('G2',NULL,NULL);

/*Table structure for table `g1` */

DROP TABLE IF EXISTS `g1`;

CREATE TABLE `g1` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `g1` */

insert  into `g1`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Vacant','0'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Vacant','0'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','9','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `g2` */

DROP TABLE IF EXISTS `g2`;

CREATE TABLE `g2` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `g2` */

insert  into `g2`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Full','0'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Vacant','0'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `g3` */

DROP TABLE IF EXISTS `g3`;

CREATE TABLE `g3` (
  `Floor` decimal(1,0) NOT NULL,
  `Room` decimal(2,0) NOT NULL,
  `Status` varchar(10) DEFAULT 'Vacant',
  `NoOfOccupants` decimal(2,0) DEFAULT '0',
  PRIMARY KEY (`Floor`,`Room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `g3` */

insert  into `g3`(`Floor`,`Room`,`Status`,`NoOfOccupants`) values ('0','1','Full','2'),('0','2','Vacant','0'),('0','3','Vacant','0'),('0','4','Vacant','0'),('0','5','Vacant','0'),('0','6','Full','2'),('0','7','Vacant','0'),('0','8','Vacant','0'),('0','9','Vacant','0'),('0','10','Vacant','0'),('1','1','Vacant','0'),('1','2','Vacant','0'),('1','3','Vacant','0'),('1','4','Vacant','0'),('1','5','Vacant','0'),('1','6','Vacant','0'),('1','7','Vacant','0'),('1','8','Vacant','0'),('1','9','Vacant','0'),('1','10','Vacant','0'),('2','1','Vacant','0'),('2','2','Vacant','0'),('2','3','Vacant','0'),('2','4','Vacant','0'),('2','5','Vacant','0'),('2','6','Vacant','0'),('2','7','Vacant','0'),('2','8','Vacant','0'),('2','9','Vacant','0'),('2','10','Vacant','0'),('3','1','Vacant','0'),('3','2','Vacant','0'),('3','3','Vacant','0'),('3','4','Vacant','0'),('3','5','Vacant','0'),('3','6','Vacant','0'),('3','7','Vacant','0'),('3','8','Vacant','0'),('3','9','Vacant','0'),('3','10','Vacant','0'),('4','1','Vacant','0'),('4','2','Vacant','0'),('4','3','Vacant','0'),('4','4','Vacant','0'),('4','5','Vacant','0'),('4','6','Vacant','0'),('4','7','Vacant','0'),('4','8','Vacant','0'),('4','9','Vacant','0'),('4','10','Vacant','0'),('5','1','Vacant','0'),('5','2','Vacant','0'),('5','3','Vacant','0'),('5','4','Vacant','0'),('5','5','Vacant','0'),('5','6','Vacant','0'),('5','7','Vacant','0'),('5','8','Vacant','0'),('5','9','Vacant','0'),('5','10','Vacant','0');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `UserID` varchar(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNo` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`UserID`),
  CONSTRAINT `login_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `studentdb` (`StudentID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`UserID`,`Email`,`PhoneNo`,`Password`) values ('ST_5021','navya@gmail.com','9810606616','mango'),('ST_5022','aka','9101','ST_5021');

/*Table structure for table `services` */

DROP TABLE IF EXISTS `services`;

CREATE TABLE `services` (
  `ServiceID` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `Block` varchar(2) DEFAULT NULL,
  `Floor` int(11) DEFAULT NULL,
  `Room` int(11) DEFAULT NULL,
  `Service_Type` varchar(15) DEFAULT NULL,
  `Details` varchar(200) DEFAULT NULL,
  `Created_On` varchar(20) DEFAULT NULL,
  `Complaint_Status` varchar(10) DEFAULT 'Pending',
  PRIMARY KEY (`ServiceID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `services` */

insert  into `services`(`ServiceID`,`Block`,`Floor`,`Room`,`Service_Type`,`Details`,`Created_On`,`Complaint_Status`) values (00000000003,'G3',2,20,NULL,NULL,NULL,'Resolved'),(00000000004,'G3',0,1,NULL,NULL,NULL,'Resolved'),(00000000005,'G3',0,1,'carpentary','board has fallen',NULL,'Pending'),(00000000006,'G3',2,3,'Plumbing','hot water',NULL,'Pending'),(00000000007,'G2',1,2,'hel','hehe',NULL,'Pending'),(00000000008,'G1',0,1,'a','aa','03/03/2018 19:14:16','Pending'),(00000000009,'B2',2,2,'Assets','new chair needed','18/03/2018 17:03:00','Pending'),(00000000010,'G3',0,1,'Assets','','18/03/2018 17:06:22','Pending');

/*Table structure for table `studentdb` */

DROP TABLE IF EXISTS `studentdb`;

CREATE TABLE `studentdb` (
  `StudentID` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Block` varchar(2) NOT NULL,
  `Floor` varchar(1) NOT NULL,
  `RoomNo` varchar(3) NOT NULL,
  `DateofBirth` varchar(10) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `ContactNo` varchar(10) NOT NULL,
  `AddressLine1` varchar(30) NOT NULL,
  `ComplaintID` decimal(7,0) DEFAULT NULL,
  `ComplaintStatus` varchar(5) NOT NULL DEFAULT 'False',
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `studentdb` */

insert  into `studentdb`(`StudentID`,`Name`,`Block`,`Floor`,`RoomNo`,`DateofBirth`,`Gender`,`Email`,`ContactNo`,`AddressLine1`,`ComplaintID`,`ComplaintStatus`) values ('ST_5021','Akanksha','G3','0','01','6/07/1998','F','navya@gmail.com','9810606616','delhi',NULL,'False'),('ST_5022','Noni','G3','0','01','20/07/1998','F','aka','9101','delhi',NULL,'False');

/*Table structure for table `warden_login` */

DROP TABLE IF EXISTS `warden_login`;

CREATE TABLE `warden_login` (
  `UserID` varchar(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNo` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `warden_login` */

insert  into `warden_login`(`UserID`,`Email`,`PhoneNo`,`Password`) values ('W_1001','w@w.com','91010','warden');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
