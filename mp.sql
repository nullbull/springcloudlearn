/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.24 : Database - helpeachother
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`helpeachother` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `helpeachother`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `leave_name` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `leave_phone` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `location_id` tinyint(4) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `location_name` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `detail` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `address` */

insert  into `address`(`id`,`user_id`,`leave_name`,`leave_phone`,`location_id`,`status`,`location_name`,`detail`) values (1555495055684,1555664209091,'牛贞昊','7788',18,0,'B1','b14-307'),(1555664209091,1555664209091,'牛贞昊','17611233021',4,2,'B1','b14-307'),(1555680675841,1555664209091,'123','17611233021',1,0,'A1','b14-307'),(1555820687989,1555664209091,'123','17611233021',1,0,'A1','b14-307'),(1558632101981,1555664209091,'李杰','17888888888',6,2,'A6','B3');

/*Table structure for table `app_user` */

DROP TABLE IF EXISTS `app_user`;

CREATE TABLE `app_user` (
  `id` bigint(20) NOT NULL,
  `nickname` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gender` tinyint(4) DEFAULT NULL,
  `avatar_url` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `openid` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_login` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `login_ip` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_at` timestamp NULL DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT NULL,
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1普通2司机',
  `unionid` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `app_user` */

insert  into `app_user`(`id`,`nickname`,`gender`,`avatar_url`,`phone`,`content`,`point`,`openid`,`last_login`,`login_ip`,`create_at`,`update_at`,`type`,`unionid`) values (1555482638465,'张炜婷',0,'www.baidu.com','17611233021','hhhha',10,'12345568','2019-05-05 11:13:29','127.0.0.1','2019-05-05 10:53:48','2019-05-05 11:13:29',2,NULL),(1555602545080,'MrNiu',1,'www.baidu.com','17611233021',NULL,NULL,'456',NULL,NULL,'2019-05-06 20:12:15',NULL,1,NULL),(1555652232438,'Mr.Niu?',1,'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK6051S4Dm369NUPG3PJMZObxYX1icKC70AXjqHw7ZnGPDddARRNQxXuQN6uZky8rUDFhhRp98Mz8Q/132',NULL,NULL,NULL,'oJ6vX1PtMe5pAVNz6dxX3fFi6ZV0',NULL,NULL,'2019-05-07 10:00:22',NULL,1,NULL),(1555664209091,'Mr.Niu?',1,'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLvMurAoCC3zwWlH1QURVRpp6W97d7gHWiaS19FzFXP13lyMmibSxdNBHRRsyE6TH70TokGfkFXMJPA/132',NULL,NULL,NULL,'oqIsg5eHStJAGK_yt6tjgtXrxaU4','2019-05-12 10:56:46',NULL,'2019-05-12 10:56:46','2019-05-12 10:56:46',2,NULL);

/*Table structure for table `boat` */

DROP TABLE IF EXISTS `boat`;

CREATE TABLE `boat` (
  `id` bigint(20) NOT NULL,
  `small_count` tinyint(4) DEFAULT NULL,
  `normal_count` tinyint(4) DEFAULT NULL,
  `large_count` tinyint(4) DEFAULT NULL,
  `small_price` decimal(2,0) DEFAULT NULL,
  `normal_price` decimal(2,0) DEFAULT NULL,
  `large_price` decimal(2,0) DEFAULT NULL,
  `create_at` timestamp NULL DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT NULL,
  `driver_id` bigint(20) NOT NULL,
  `driver_nickname` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `begin_at` timestamp NULL DEFAULT NULL,
  `end_at` timestamp NULL DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `company_id` tinyint(4) DEFAULT NULL,
  `company_name` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `destination_name` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `boat` */

insert  into `boat`(`id`,`small_count`,`normal_count`,`large_count`,`small_price`,`normal_price`,`large_price`,`create_at`,`update_at`,`driver_id`,`driver_nickname`,`content`,`begin_at`,`end_at`,`status`,`company_id`,`company_name`,`destination_name`) values (1555432152599,0,0,1,'1','1','1','2019-05-08 09:36:13','2019-05-08 09:36:13',1555664209091,'张炜婷','hhhha','2019-05-08 05:35:08','2019-05-08 09:36:13',1,1,'中通快递','123'),(1555572796703,0,0,1,'1','1','1','2019-05-08 07:47:49','2019-05-08 07:47:49',123,'张炜婷','hhhha','2019-05-08 07:47:49','2019-05-08 07:47:49',1,1,'中通快递','456'),(1555572871942,1,1,1,'1','1','1','2019-05-08 07:47:52','2019-05-08 07:47:52',123,'张炜婷','hhhha','2019-05-08 07:47:52','2019-05-08 07:47:52',1,1,'中通快递','789'),(1555819460941,2,1,1,'1','2','3','2019-05-09 08:27:31',NULL,1555664209091,'张炜婷',NULL,'2019-05-09 09:00:00','2019-05-09 10:00:00',1,1,'中通快递','111');

/*Table structure for table `company_info` */

DROP TABLE IF EXISTS `company_info`;

CREATE TABLE `company_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `company_info` */

insert  into `company_info`(`id`,`name`,`address`,`phone`) values (1,'圆通快递','大活',''),(2,'京东快递','中心浴室',''),(3,'顺丰快递','中心浴室',''),(4,'中通快递','南门',''),(5,'申通快递','中心浴室',''),(6,'百世快递','中心浴室',''),(7,'天天快递','南门','');

/*Table structure for table `dormitory_info` */

DROP TABLE IF EXISTS `dormitory_info`;

CREATE TABLE `dormitory_info` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `part` tinyint(4) NOT NULL COMMENT '1A2B3C',
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `content` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `dormitory_info` */

insert  into `dormitory_info`(`id`,`part`,`name`,`content`) values (1,1,'A1',NULL),(2,1,'A2',NULL),(3,1,'A3',NULL),(4,1,'A4',NULL),(5,1,'A5',NULL),(6,1,'A6',NULL),(7,1,'A7',NULL),(8,1,'A8',NULL),(9,1,'A9',NULL),(10,1,'A10',NULL),(11,1,'A11',NULL),(12,1,'A12',NULL),(13,1,'A13',NULL),(14,1,'A14',NULL),(15,1,'A15',NULL),(16,1,'A16',NULL),(17,1,'A17',NULL),(18,2,'B1',NULL),(19,2,'B2',NULL),(20,2,'B3',NULL),(21,2,'B4',NULL),(22,2,'B6',NULL),(23,2,'B8',NULL),(24,2,'B10',NULL),(25,2,'B12',NULL),(26,2,'B14',NULL),(27,3,'C1',NULL),(28,3,'C2',NULL),(29,3,'C3',NULL),(30,3,'C4',NULL),(31,3,'C5',NULL),(32,3,'C6',NULL),(33,3,'C7',NULL),(34,3,'C8',NULL),(35,3,'C9',NULL),(36,3,'C10',NULL),(37,3,'C11',NULL),(38,3,'C12',NULL),(39,3,'C13',NULL),(40,3,'C14',NULL);

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `user_id` bigint(20) NOT NULL,
  `realname` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_number` varchar(18) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `school_id` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `location_message` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `picture` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `create_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `driver` */

insert  into `driver`(`user_id`,`realname`,`id_number`,`school_id`,`location_message`,`picture`,`status`,`create_at`) values (1555664209091,'张炜婷','37152419961230021X','201501060814','B12-133','www.baidu.com',2,'2019-05-08 18:57:48');

/*Table structure for table `express` */

DROP TABLE IF EXISTS `express`;

CREATE TABLE `express` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(11) NOT NULL,
  `package_type` varchar(11) NOT NULL,
  `express_type` tinyint(4) NOT NULL COMMENT '快递类型',
  `leave_nickname` varchar(32) DEFAULT NULL,
  `leave_phone` varchar(11) DEFAULT NULL,
  `get_code` varchar(10) NOT NULL COMMENT '取货码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `express` */

insert  into `express`(`id`,`order_id`,`package_type`,`express_type`,`leave_nickname`,`leave_phone`,`get_code`) values (1,1,'17611233021',1,NULL,NULL,'6666'),(2,1,'17611233021',2,NULL,NULL,'123');

/*Table structure for table `express_order` */

DROP TABLE IF EXISTS `express_order`;

CREATE TABLE `express_order` (
  `id` bigint(11) NOT NULL,
  `needer_id` bigint(20) NOT NULL,
  `needer_nickname` varchar(32) DEFAULT NULL,
  `provider_nickname` varchar(32) DEFAULT NULL,
  `provider_id` bigint(20) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `location_id` tinyint(4) DEFAULT NULL,
  `score` tinyint(4) DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `get_code` varchar(16) DEFAULT NULL,
  `get_nickname` varchar(32) DEFAULT NULL,
  `express_type` tinyint(4) DEFAULT NULL,
  `begin_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `package_type` tinyint(4) DEFAULT NULL,
  `get_phone` varchar(11) DEFAULT NULL,
  `finished_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `express_order` */

insert  into `express_order`(`id`,`needer_id`,`needer_nickname`,`provider_nickname`,`provider_id`,`price`,`location_id`,`score`,`status`,`created_at`,`updated_at`,`get_code`,`get_nickname`,`express_type`,`begin_at`,`package_type`,`get_phone`,`finished_at`) values (1,1,NULL,NULL,2,'2.50',NULL,NULL,3,'2018-09-24 16:01:04','2018-09-24 16:01:12',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ticket` */

DROP TABLE IF EXISTS `ticket`;

CREATE TABLE `ticket` (
  `id` bigint(20) NOT NULL,
  `boat_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `package_type` tinyint(4) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `express_type` tinyint(4) DEFAULT NULL,
  `leave_phone` varchar(4) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `leave_name` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `code` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_at` timestamp NULL DEFAULT NULL,
  `content` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '留言',
  PRIMARY KEY (`id`),
  KEY `address_id` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `ticket` */

insert  into `ticket`(`id`,`boat_id`,`user_id`,`price`,`package_type`,`address_id`,`express_type`,`leave_phone`,`leave_name`,`code`,`status`,`create_at`,`update_at`,`content`) values (1555827885432,1555432152599,1555664209091,'1',1,1555495055684,1,'21','12','2',3,'2019-05-09 10:47:55',NULL,'12'),(1555832483037,1555432152599,1555664209091,'1',2,1555495055684,1,'23','123','23',3,'2019-05-09 12:04:33',NULL,'23'),(1555832547576,1555432152599,1555664209091,'1',1,1555495055684,1,'123','123','123',3,'2019-05-09 12:05:37',NULL,'123'),(1555832691718,1555432152599,1555664209091,'1',2,1555495055684,1,'3','1','2',1,'2019-05-09 12:08:01',NULL,'3'),(1555832847375,1555432152599,1555664209091,'1',1,1555495055684,1,'23','123','23',1,'2019-05-09 12:10:37',NULL,'123'),(1555832922373,1555432152599,1555664209091,'1',1,1555495055684,1,'4','1','2',1,'2019-05-09 12:11:52',NULL,'5'),(1555853172708,1555432152599,1555664209091,'1',2,1555495055684,1,'123','123','123',1,'2019-05-09 17:49:22',NULL,'123'),(1556379955278,1555572796703,1555664209091,'1',1,1555495055684,1,'123','123','123',1,'2019-05-15 20:09:05',NULL,'123'),(1556446172794,1555572796703,1555664209091,'1',2,1555495055684,1,'123','123','123',1,'2019-05-16 14:32:43',NULL,'123');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(16) NOT NULL,
  `pass_word` varchar(255) NOT NULL,
  `salt` int(11) NOT NULL,
  `email` varchar(20) NOT NULL COMMENT '邮件',
  `major_id` varchar(10) DEFAULT NULL COMMENT '专业编号',
  `phone` varchar(11) NOT NULL COMMENT '手机号',
  `location_id` tinyint(4) NOT NULL COMMENT '宿舍号',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1用户2跑腿3都是',
  `alipay_id` varchar(11) DEFAULT NULL COMMENT '支付宝',
  `wechat_id` varchar(16) DEFAULT NULL COMMENT '微信',
  `qq_number` varchar(11) DEFAULT NULL COMMENT 'QQ',
  `picture` varchar(255) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT '' COMMENT '如果用户类型为2，3必填',
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `modify_by` tinyint(4) DEFAULT NULL COMMENT '1用户2系统',
  `login_ip` varchar(20) DEFAULT NULL,
  `last_login` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `nick_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`pass_word`,`salt`,`email`,`major_id`,`phone`,`location_id`,`type`,`alipay_id`,`wechat_id`,`qq_number`,`picture`,`student_id`,`created_at`,`updated_at`,`modify_by`,`login_ip`,`last_login`,`nick_name`) values (1,'zwt','$2a$10$DtnDFqC4PsZhmwqvpe58o.wcOyMHQta285snvOL75G8A7Nyj3e9fa',11111,'1129114837@qq.com','1','17611233021',1,1,NULL,NULL,NULL,NULL,'','2018-09-18 16:54:44','2019-04-12 14:46:12',NULL,'127.0.0.1','2019-04-12 14:46:12',NULL),(2,'yangxu','15dd198e986482456a43108fce74cdc7',9258,'123@qq.com',NULL,'1761123302',1,1,'hhhh','ggg','111',NULL,'','2018-10-01 18:05:35','2018-10-01 18:05:35',NULL,NULL,'2018-10-01 18:05:35',NULL);

/*Table structure for table `user_online` */

DROP TABLE IF EXISTS `user_online`;

CREATE TABLE `user_online` (
  `sessionId` varchar(50) NOT NULL DEFAULT '' COMMENT '用户会话id',
  `user_name` varchar(50) DEFAULT '' COMMENT '登录账号',
  `ipaddr` varchar(50) DEFAULT '' COMMENT '登录IP地址',
  `login_location` varchar(255) DEFAULT '' COMMENT '登录地点',
  `browser` varchar(50) DEFAULT '' COMMENT '浏览器类型',
  `os` varchar(50) DEFAULT '' COMMENT '操作系统',
  `status` varchar(10) DEFAULT '' COMMENT '在线状态on_line在线off_line离线',
  `start_timestsamp` datetime DEFAULT NULL COMMENT 'session创建时间',
  `last_access_time` datetime DEFAULT NULL COMMENT 'session最后访问时间',
  `expire_time` int(5) DEFAULT '0' COMMENT '超时时间，单位为分钟',
  PRIMARY KEY (`sessionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='在线用户记录';

/*Data for the table `user_online` */

insert  into `user_online`(`sessionId`,`user_name`,`ipaddr`,`login_location`,`browser`,`os`,`status`,`start_timestsamp`,`last_access_time`,`expire_time`) values ('008c9494-f281-4ef4-b5f1-f6f868110600','zwt','127.0.0.1','XX 内网IP','Chrome','Windows 10','在线','2018-09-15 08:50:39','2018-09-15 08:50:44',1800000),('14dc0f20-7b68-487a-a730-871cdcb34e7f','zwt','127.0.0.1','XX 内网IP','Chrome','Windows 10','在线','2018-09-21 16:43:28','2018-09-21 16:43:54',1800000),('6021f840-2a15-4025-923b-110dd7f69600','zwt','127.0.0.1','','Chrome','Windows 10','在线','2018-09-16 08:40:24','2018-09-16 08:40:27',1800000),('a623ed58-fbc8-4f44-83ce-cda902a56bf6','zwt','127.0.0.1','XX 内网IP','Chrome','Windows 10','在线','2018-09-28 14:11:25','2018-09-28 14:11:29',1800000),('b48b2072-de34-4d23-a64b-0602ccd6b006','zwt','127.0.0.1','XX 内网IP','Chrome','Windows 10','在线','2018-09-26 14:27:01','2018-09-26 14:27:08',1800000),('d00aa602-e792-46ba-8cde-629401cf5864','zwt','127.0.0.1','XX 内网IP','Chrome','Windows 10','在线','2018-09-28 14:09:16','2018-09-28 14:09:18',1800000),('fb9ef657-e7c3-4e84-beb6-cff44c3bcb92','zwt','127.0.0.1','','Chrome','Windows 10','在线','2018-09-28 14:05:12','2018-09-28 14:05:14',1800000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
