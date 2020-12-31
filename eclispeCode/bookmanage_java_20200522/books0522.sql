/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 8.0.11 : Database - books
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`books` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `books`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookno` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `bookname` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `publisher` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `publishyear` year(4) DEFAULT NULL,
  `price` decimal(5,1) DEFAULT NULL,
  `state` char(2) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '未借',
  `bookstore` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`bookno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `book` */

insert  into `book`(`bookno`,`bookname`,`author`,`publisher`,`publishyear`,`price`,`state`,`bookstore`) values ('TN123 ','电路','童诗白','电子',2005,'37.0','未借','3'),('TP273-1','大数据时代','刘鹏','清华大学',2017,'40.5','未借','2'),('TP273-3','云计算','刘鹏','电子工业',2018,'39.0','借出','2'),('TP273-342','SQL SERVER 2008','王利','电子',2009,'32.0','未借','2'),('TP30101','数据库','高尚','电子',2009,'28.0','借出','2'),('TP388','计算机网络','张明','清华大学出版社',2009,'33.0','未借','1'),('TP652','三毛流浪记','张乐平','文化',1953,'25.0','借出','4'),('TP987','数据库系统概论','林美','高教',2008,'45.0','未借','2');

/*Table structure for table `borrow` */

DROP TABLE IF EXISTS `borrow`;

CREATE TABLE `borrow` (
  `readerno` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `bookno` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `borrowdate` date DEFAULT NULL,
  `returndate` date DEFAULT NULL,
  PRIMARY KEY (`bookno`),
  KEY `readerno` (`readerno`),
  CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`readerno`) REFERENCES `reader` (`readerno`),
  CONSTRAINT `borrow_ibfk_2` FOREIGN KEY (`bookno`) REFERENCES `book` (`bookno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `borrow` */

insert  into `borrow`(`readerno`,`bookno`,`borrowdate`,`returndate`) values ('111','TP273-3','2018-09-28','2019-03-28'),('004002','TP30101','2018-07-07','2018-11-07'),('003002','TP652','2018-09-10','2019-03-10');

/*Table structure for table `reader` */

DROP TABLE IF EXISTS `reader`;

CREATE TABLE `reader` (
  `readerno` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `readertype` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `borrowed_num` tinyint(3) unsigned DEFAULT NULL,
  `borrowed_limit` tinyint(3) unsigned DEFAULT NULL,
  `readername` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `readerdept` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `readerpw` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`readerno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `reader` */

insert  into `reader`(`readerno`,`readertype`,`borrowed_num`,`borrowed_limit`,`readername`,`readerdept`,`readerpw`) values ('003002','学生',1,4,'王小明','电气','123'),('004001','学生',0,4,'李笑笑','计算机','123'),('004002','学生',1,4,'张大卫','计算机','123'),('111','教师',1,10,'王闵','计算机','123'),('222','教师',0,10,'高鸿','计算机','123');

/* Procedure structure for procedure `if_borrow` */

/*!50003 DROP PROCEDURE IF EXISTS  `if_borrow` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `if_borrow`(IN rno VARCHAR(20),OUT can_borrow tinyINT)
BEGIN
IF (SELECT borrowed_limit-borrowed_num FROM reader WHERE readerno=rno)>0
THEN SET can_borrow=1;
ELSE SET can_borrow=0;
END IF;
END */$$
DELIMITER ;

/* Procedure structure for procedure `searchbook` */

/*!50003 DROP PROCEDURE IF EXISTS  `searchbook` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `searchbook`(IN bname VARCHAR(30))
BEGIN
SELECT * FROM book WHERE bookname LIKE CONCAT('%',bname,'%');
END */$$
DELIMITER ;

/*Table structure for table `borrow_info` */

DROP TABLE IF EXISTS `borrow_info`;

/*!50001 DROP VIEW IF EXISTS `borrow_info` */;
/*!50001 DROP TABLE IF EXISTS `borrow_info` */;

/*!50001 CREATE TABLE  `borrow_info`(
 `readerno` varchar(10) ,
 `readertype` char(2) ,
 `readername` varchar(15) ,
 `readerdept` varchar(15) ,
 `bookno` varchar(20) ,
 `bookname` varchar(30) ,
 `author` varchar(20) ,
 `publisher` varchar(10) ,
 `state` char(2) ,
 `borrowdate` date ,
 `returndate` date 
)*/;

/*View structure for view borrow_info */

/*!50001 DROP TABLE IF EXISTS `borrow_info` */;
/*!50001 DROP VIEW IF EXISTS `borrow_info` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `borrow_info` AS select `borrow`.`readerno` AS `readerno`,`reader`.`readertype` AS `readertype`,`reader`.`readername` AS `readername`,`reader`.`readerdept` AS `readerdept`,`borrow`.`bookno` AS `bookno`,`book`.`bookname` AS `bookname`,`book`.`author` AS `author`,`book`.`publisher` AS `publisher`,`book`.`state` AS `state`,`borrow`.`borrowdate` AS `borrowdate`,`borrow`.`returndate` AS `returndate` from ((`reader` join `borrow`) join `book`) where ((`reader`.`readerno` = `borrow`.`readerno`) and (`borrow`.`bookno` = `book`.`bookno`)) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
