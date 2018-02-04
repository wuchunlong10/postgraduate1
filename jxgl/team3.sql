/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.6.12 : Database - team3
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`team3` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `team3`;

/*Table structure for table `diaochab` */

DROP TABLE IF EXISTS `diaochab`;

CREATE TABLE `diaochab` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `Topic1` varchar(255) NOT NULL,
  `Option1` varchar(255) NOT NULL,
  `Topic2` varchar(255) NOT NULL,
  `Option2` varchar(255) NOT NULL,
  `Topic3` varchar(255) NOT NULL,
  `Option3` varchar(255) NOT NULL,
  `Topic4` varchar(255) NOT NULL,
  `Option4` varchar(255) NOT NULL,
  `Topic5` varchar(255) NOT NULL,
  `Option5` varchar(255) NOT NULL,
  `Topic6` varchar(255) NOT NULL,
  `Option6` varchar(255) NOT NULL,
  `Topic7` varchar(255) NOT NULL,
  `Option7` varchar(255) NOT NULL,
  `Topic8` varchar(255) NOT NULL,
  `Option8` varchar(255) NOT NULL,
  `Topic9` varchar(255) NOT NULL,
  `Option9` varchar(255) NOT NULL,
  `Topic10` varchar(255) NOT NULL,
  `Option10` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `diaochab` */

insert  into `diaochab`(`Id`,`username`,`Topic1`,`Option1`,`Topic2`,`Option2`,`Topic3`,`Option3`,`Topic4`,`Option4`,`Topic5`,`Option5`,`Topic6`,`Option6`,`Topic7`,`Option7`,`Topic8`,`Option8`,`Topic9`,`Option9`,`Topic10`,`Option10`) values (1,'小小','A1 大一','1.你所在的年级','A 一周左右','2.你平均多久登录一次教务系统','3.你经常通过什么方式登录教务网络管理系统','A 学校机房','4.你登陆学校教务系统的主要目的','A 查询课表','5.你认为目前的教务管理系统能否满足日常的需求','A5 已经满足','6.你认为教务系统对你的帮助大吗','A 很大','7.你认为教务系统有什么需要需要改进的','A 界面美观','8.遇到问题你有什么解决办法','A 联系教务员','9.解决问题所需的时间','A9 一月以内','10.学校教务管理系统的维护更新是否影响到你','A 很影响'),(4,'student','A1 大一','1.你所在的年级','B2 一月左右','2.你平均多久登录一次教务系统','3.你经常通过什么方式登录教务网络管理系统','A 学校机房','4.你登陆学校教务系统的主要目的','B 选课','5.你认为目前的教务管理系统能否满足日常的需求','B 比较满足','6.你认为教务系统对你的帮助大吗','C 很小','7.你认为教务系统有什么需要需要改进的','C7 信息布局','8.遇到问题你有什么解决办法','B 联系班委','9.解决问题所需的时间','B 三月以内','10.学校教务管理系统的维护更新是否影响到你','B10 有一些');

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `messageid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `wholeft` varchar(45) DEFAULT NULL,
  `reply` varchar(255) DEFAULT NULL,
  `lefttime` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`messageid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `message` */

insert  into `message`(`messageid`,`title`,`context`,`wholeft`,`reply`,`lefttime`) values (1,'test','test','test',NULL,NULL),(2,'testtest','testtest','testtest',NULL,NULL),(4,'hahhah','adfaf','hahha',NULL,NULL),(6,'123','fadfadf','123',NULL,NULL),(8,'123231','3122123','12332123',NULL,NULL),(10,'1','12','1','lalala',NULL),(11,'123','123','1','dfd',NULL),(12,'test','test','test','testee',NULL),(13,'q','qq','qq','dd',NULL);

/*Table structure for table `messageboardb` */

DROP TABLE IF EXISTS `messageboardb`;

CREATE TABLE `messageboardb` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(255) NOT NULL,
  `Content` varchar(255) NOT NULL,
  `Time` varchar(255) NOT NULL,
  `Author` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `messageboardb` */

insert  into `messageboardb`(`Id`,`Title`,`Content`,`Time`,`Author`) values (1,'测试','这是测试内容','2017-12-18','admin'),(2,'考试','您好，我想咨询一下关于期末考试的相关内容。','2017-12-19 11:29 ','admin');

/*Table structure for table `noticeb` */

DROP TABLE IF EXISTS `noticeb`;

CREATE TABLE `noticeb` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(255) NOT NULL,
  `Abst` varchar(255) NOT NULL,
  `Url` varchar(255) NOT NULL COMMENT '路径',
  `Publisher` varchar(255) NOT NULL,
  `PublishTime` varchar(22) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

/*Data for the table `noticeb` */

insert  into `noticeb`(`Id`,`Title`,`Abst`,`Url`,`Publisher`,`PublishTime`) values (47,'助学金发放通知','关于研究生助学金发放的通知','notice4.jsp','admin','2017-11-26 15:40 '),(48,'奖学金发放通知','关于本科生发放奖学金的通知','notice5.jsp','admin','2017-11-26 15:41 '),(49,'停网通知',' 关于2017年11月11日的通知','notice1.jsp','admin','2017-12-26 15:25 '),(55,'停水通知','关于停水的通知','notice3.jsp','admin','2017-12-28 20:49 ');

/*Table structure for table `noticelog` */

DROP TABLE IF EXISTS `noticelog`;

CREATE TABLE `noticelog` (
  `LogId` int(11) NOT NULL AUTO_INCREMENT,
  `PublishName` varchar(255) NOT NULL,
  `PublishTime` varchar(255) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Ip` varchar(255) NOT NULL,
  PRIMARY KEY (`LogId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `noticelog` */

insert  into `noticelog`(`LogId`,`PublishName`,`PublishTime`,`Title`,`Ip`) values (1,'admin','2017-12-28','停水通知','0:0:0:0:0:0:0:1');

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `replyid` int(11) NOT NULL AUTO_INCREMENT,
  `messageid` int(11) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`replyid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `reply` */

insert  into `reply`(`replyid`,`messageid`,`context`) values (1,0,'dfdf'),(2,0,'test'),(3,0,'lalalal'),(4,0,'213'),(5,0,'123'),(6,0,'3423'),(7,0,'dsf'),(8,12,'testee'),(9,12,'testee'),(10,11,'dfd'),(11,13,'大凤飞飞'),(12,10,'hahah'),(13,10,'lalala'),(14,13,'dd');

/*Table structure for table `signup` */

DROP TABLE IF EXISTS `signup`;

CREATE TABLE `signup` (
  `id` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `date` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `signup` */

insert  into `signup`(`id`,`count`,`date`) values (100,1,'Tue Dec 26 16:23:00 CST 2017'),(100,1,'2017-12-26 16:47:33'),(100,1,'2017-12-26 16:49:52'),(100,1,'2017-12-26 16');

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `word` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_admin` */

insert  into `t_admin`(`id`,`name`,`password`,`age`,`sex`,`word`) values (31709119,'admin','123',24,'男','找回密码');

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `word` varchar(100) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `intake` varchar(20) DEFAULT NULL,
  `classname` varchar(20) DEFAULT NULL,
  `nation` varchar(10) DEFAULT NULL,
  `major` varchar(20) DEFAULT NULL,
  `collage` varchar(20) DEFAULT NULL,
  `birth` varchar(20) DEFAULT NULL,
  `signDate` varchar(30) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=31709130 DEFAULT CHARSET=utf8;

/*Data for the table `t_student` */

insert  into `t_student`(`userid`,`username`,`password`,`sex`,`word`,`age`,`intake`,`classname`,`nation`,`major`,`collage`,`birth`,`signDate`,`count`) values (100,'student','123','男','1',23,'','31709','汉族','软件工程','23213','2017-9','2017-12-26 17',5),(31709119,'吴春龙','123','男','1',24,'','软件工程','汉','软件工程','计算机','1997-7-7','2017-12-26 20',1),(31709122,'123','123','男','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31709123,'123213','123','12','1',22,'','231','213','231','123','213',NULL,NULL),(31709124,'张三','123','男','123',12,'发','方法','12','方法','方法','12',NULL,NULL),(31709125,'小二','123','男','小二的密码',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31709126,'小小','123','女','小小',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31709127,'tom','123','男','1234',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31709129,'aa','aa','男','aa',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) NOT NULL,
  `tpassword` varchar(32) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `word` varchar(100) DEFAULT NULL,
  `mail` varchar(32) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `dpn` int(11) DEFAULT NULL,
  `tel` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `t_teacher` */

insert  into `t_teacher`(`tid`,`tname`,`tpassword`,`age`,`sex`,`word`,`mail`,`address`,`dpn`,`tel`) values (22,'xin','123',12,'男',NULL,'asfsdf','gdfgdfg',433,'3333'),(33,'teacher','teacher',12,'男',NULL,'fdgfdgdf','dsfsdfsd',8,'123');

/*Table structure for table `tb_scrip` */

DROP TABLE IF EXISTS `tb_scrip`;

CREATE TABLE `tb_scrip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wishMan` varchar(30) DEFAULT NULL,
  `wellWisher` varchar(30) DEFAULT NULL,
  `content` varchar(30) DEFAULT NULL,
  `color` int(4) DEFAULT NULL,
  `face` int(4) DEFAULT NULL,
  `sendTime` datetime DEFAULT NULL,
  `hits` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `tb_scrip` */

insert  into `tb_scrip`(`id`,`wishMan`,`wellWisher`,`content`,`color`,`face`,`sendTime`,`hits`) values (1,'小红','小绿','小红，你好',3,0,'2017-12-28 11:07:40',0),(2,'小绿','小白','小绿，你好',0,0,'2017-12-28 11:10:29',1),(3,'小白','小黑','小白，你好',0,0,'2017-12-28 13:30:40',2),(4,'小黑','匿名','你好',0,1,'2017-12-28 18:32:03',0),(5,'小陈','小强','你好。',4,2,'2017-12-29 11:33:19',NULL),(6,'小王','小李','小王，你好',0,0,'2017-12-29 11:36:37',NULL),(7,'ewqe','ewqewqe','ewqewqewq',0,0,'2017-12-29 11:38:20',NULL),(8,'小李','小王','你好，小李。',1,5,'2017-12-29 12:38:00',NULL),(9,'小小','大大','告白墙',1,0,'2017-12-29 13:06:22',NULL),(10,'小小','大大','大大小小。',0,0,'2017-12-29 13:09:18',NULL),(11,'站点','数据库','很坑',2,0,'2017-12-29 13:14:17',NULL),(12,'wefwefewqe','ewfew','fwefewfewfwefewf tgthtr',1,0,'2017-12-29 13:17:46',NULL),(13,'123','123','123',0,0,'2017-12-29 13:49:47',NULL);

/*Table structure for table `zwt_file` */

DROP TABLE IF EXISTS `zwt_file`;

CREATE TABLE `zwt_file` (
  `fileid` int(11) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(255) DEFAULT NULL,
  `filePath` varchar(255) DEFAULT NULL,
  `fileDesc` varchar(255) DEFAULT NULL,
  `fileType` varchar(255) DEFAULT NULL,
  `fileOwnerName` varchar(255) DEFAULT NULL,
  `fileuploadDate` date DEFAULT NULL,
  PRIMARY KEY (`fileid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `zwt_file` */

insert  into `zwt_file`(`fileid`,`fileName`,`filePath`,`fileDesc`,`fileType`,`fileOwnerName`,`fileuploadDate`) values (7,'英语2.docx','D:\\Develope\\Tomcat\\apache-tomcat-7.0.53\\webapps\\team\\WEB-INF\\files\\151452344032219952.docx','11123','英语','1','2017-12-25'),(8,'英语1.docx','D:\\Develope\\Tomcat\\apache-tomcat-7.0.53\\webapps\\team\\WEB-INF\\files\\151452344032297534.docx','22223','英语','1','2017-12-28'),(9,'算法基础-专硕-1-引言.pptx','D:\\Develope\\Tomcat\\apache-tomcat-7.0.53\\webapps\\team\\WEB-INF\\files\\151452353791777935.pptx','算法ppt','算法','0','2017-12-24'),(10,'算法基础-专硕-2.pptx','D:\\Develope\\Tomcat\\apache-tomcat-7.0.53\\webapps\\team\\WEB-INF\\files\\151452365298587430.pptx','222','算法','0','2017-12-29'),(11,'算法基础教学大纲_专硕-2015.docx','D:\\Develope\\Tomcat\\apache-tomcat-7.0.53\\webapps\\team\\WEB-INF\\files\\151452618115515118.docx','qqqq','算法','0','2017-12-29');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
