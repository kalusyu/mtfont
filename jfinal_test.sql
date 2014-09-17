/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : jfinal_test

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2014-09-17 20:36:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `deviceinfo`
-- ----------------------------
DROP TABLE IF EXISTS `deviceinfo`;
CREATE TABLE `deviceinfo` (
  `id` int(11) NOT NULL auto_increment,
  `imei` varchar(255) default NULL,
  `macAddress` varchar(255) default NULL,
  `imsi` varchar(255) default NULL,
  `product` varchar(255) default NULL,
  `brand` varchar(255) default NULL,
  `manufacturer` varchar(255) default NULL,
  `device` varchar(255) default NULL,
  `sdk` varchar(255) default NULL,
  `board` varchar(255) default NULL,
  `display` varchar(255) default NULL,
  `host` varchar(255) default NULL,
  `model` varchar(255) default NULL,
  `time` varchar(255) default NULL,
  `androidVersion` varchar(255) default NULL,
  `telephone` varchar(255) default NULL,
  `networkType` varchar(255) default NULL,
  `simOperatorName` varchar(255) default NULL,
  `simSerialNumber` varchar(255) default NULL,
  `simState` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deviceinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `fileinfo`
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo` (
  `id` int(11) NOT NULL auto_increment,
  `fontDisplayName` varchar(255) default NULL,
  `fontName` varchar(255) default NULL,
  `fontNamePic` varchar(255) default NULL,
  `fontNamePicUri` varchar(255) default NULL,
  `fontThumnailPic` varchar(255) default NULL,
  `fontThumnailPicUri` varchar(255) default NULL,
  `fontSize` varchar(255) default NULL,
  `fontUri` varchar(255) default NULL,
  `pictureUri` varchar(255) default NULL,
  `fontLocalPath` varchar(255) default NULL,
  `pictureLocalPath` varchar(255) default NULL,
  `packageName` varchar(255) default NULL,
  `loveNumbers` varchar(255) default NULL,
  `downloadNumbers` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


