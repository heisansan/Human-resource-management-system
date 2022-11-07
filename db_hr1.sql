/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : db_hr1

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2021-12-16 22:32:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_bumen
-- ----------------------------
DROP TABLE IF EXISTS `t_bumen`;
CREATE TABLE `t_bumen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bumenName` varchar(20) DEFAULT NULL,
  `bumenDesc` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bumen
-- ----------------------------
INSERT INTO `t_bumen` VALUES ('1', '测试部门', '试试看');
INSERT INTO `t_bumen` VALUES ('2', '销售部', '销售产品');
INSERT INTO `t_bumen` VALUES ('13', '财务部', '管理财政');

-- ----------------------------
-- Table structure for t_kaoqin
-- ----------------------------
DROP TABLE IF EXISTS `t_kaoqin`;
CREATE TABLE `t_kaoqin` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `menid` int(11) DEFAULT NULL,
  `stime` date DEFAULT NULL,
  `etime` date DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_kaoqin
-- ----------------------------
INSERT INTO `t_kaoqin` VALUES ('1', '1', '1', '2021-12-11', '2021-12-11');
INSERT INTO `t_kaoqin` VALUES ('14', '1', '1', '2021-12-12', '2021-12-12');
INSERT INTO `t_kaoqin` VALUES ('15', '1', '2', '2021-12-16', '2021-12-16');
INSERT INTO `t_kaoqin` VALUES ('16', '1', '2', '2021-12-16', '2021-12-16');
INSERT INTO `t_kaoqin` VALUES ('17', '1', '2', '2021-12-16', '2021-12-16');

-- ----------------------------
-- Table structure for t_men
-- ----------------------------
DROP TABLE IF EXISTS `t_men`;
CREATE TABLE `t_men` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `peixun` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `gongzi` float DEFAULT NULL,
  `mmDesc` varchar(100) DEFAULT NULL,
  `bumenId` int(11) DEFAULT NULL,
  `isflag` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_t_book` (`bumenId`) USING BTREE,
  CONSTRAINT `t_men_ibfk_1` FOREIGN KEY (`bumenId`) REFERENCES `t_bumen` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_men
-- ----------------------------
INSERT INTO `t_men` VALUES ('1', '测试员工1', '无', '女', '2000', '试一试', '1', '0');
INSERT INTO `t_men` VALUES ('2', '测试员工2', '技能训练', '男', '2005', '应届毕业生', '2', '0');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `userid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '123', '1', '1');
INSERT INTO `t_user` VALUES ('2', 'zhangsan', '123', '1');
INSERT INTO `t_user` VALUES ('3', '测试用户2', '123', '1');
INSERT INTO `t_user` VALUES ('4', 'uuu', '1', '1');
