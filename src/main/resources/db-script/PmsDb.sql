/*
SQLyog Job Agent v12.08 (64 bit) Copyright(c) Webyog Inc. All Rights Reserved.


MySQL - 5.1.73 : Database - pmsDb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `class` */

CREATE TABLE `class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `project_id` bigint(20) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '1 service 2 Controller',
  `memo` varchar(100) DEFAULT NULL,
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `data_type` */

CREATE TABLE `data_type` (
  `id` bigint(20) NOT NULL,
  `project_id` bigint(20) NOT NULL DEFAULT '0',
  `type` int(11) NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `disabled` int(11) NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `login_account` */

CREATE TABLE `login_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户Id',
  `login_account` varchar(50) DEFAULT NULL COMMENT '登陆帐号',
  `account_type` int(11) DEFAULT '1' COMMENT '帐号类型 1普通用户名 2手机号码 3 微信OpenId',
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `method` */

CREATE TABLE `method` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `project_id` bigint(20) DEFAULT NULL,
  `class_id` bigint(20) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `return_type` int(11) DEFAULT NULL COMMENT '0 正常 1 list',
  `data_type_id` int(11) DEFAULT NULL COMMENT '返回类型',
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `page` */

CREATE TABLE `page` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `project_id` bigint(20) DEFAULT NULL,
  `dir_path` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `request_url` varchar(200) DEFAULT NULL,
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `param` */

CREATE TABLE `param` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_id` bigint(20) DEFAULT NULL,
  `method_id` bigint(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `data_type_id` bigint(20) DEFAULT NULL,
  `is_list` int(11) DEFAULT NULL,
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `project` */

CREATE TABLE `project` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `package` varchar(100) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `disabled` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `user` */

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `disabled` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
