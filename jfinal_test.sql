/*
Navicat MySQL Data Transfer

Source Server         : xmlocal
Source Server Version : 50140
Source Host           : localhost:3306
Source Database       : jfinal_test

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2014-09-17 23:42:11
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `deviceinfo`
-- ----------------------------
DROP TABLE IF EXISTS `deviceinfo`;
CREATE TABLE `deviceinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imei` varchar(255) DEFAULT NULL,
  `macAddress` varchar(255) DEFAULT NULL,
  `imsi` varchar(255) DEFAULT NULL,
  `product` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `manufacturer` varchar(255) DEFAULT NULL,
  `device` varchar(255) DEFAULT NULL,
  `sdk` varchar(255) DEFAULT NULL,
  `board` varchar(255) DEFAULT NULL,
  `display` varchar(255) DEFAULT NULL,
  `host` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `androidVersion` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `networkType` varchar(255) DEFAULT NULL,
  `simOperatorName` varchar(255) DEFAULT NULL,
  `simSerialNumber` varchar(255) DEFAULT NULL,
  `simState` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deviceinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `fileinfo`
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fontDisplayName` varchar(255) DEFAULT NULL,
  `fontName` varchar(255) DEFAULT NULL,
  `fontNamePic` varchar(255) DEFAULT NULL,
  `fontNamePicUri` varchar(255) DEFAULT NULL,
  `fontThumnailPic` varchar(255) DEFAULT NULL,
  `fontThumnailPicUri` varchar(255) DEFAULT NULL,
  `fontSize` varchar(255) DEFAULT NULL,
  `fontUri` varchar(255) DEFAULT NULL,
  `pictureUri` varchar(255) DEFAULT NULL,
  `fontLocalPath` varchar(255) DEFAULT NULL,
  `pictureLocalPath` varchar(255) DEFAULT NULL,
  `packageName` varchar(255) DEFAULT NULL,
  `loveNumbers` varchar(255) DEFAULT NULL,
  `downloadNumbers` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `freeuser`
-- ----------------------------
DROP TABLE IF EXISTS `freeuser`;
CREATE TABLE `freeuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imei` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of freeuser
-- ----------------------------
