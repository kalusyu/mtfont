/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : jfinal_test

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2014-11-02 15:41:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `count`
-- ----------------------------
DROP TABLE IF EXISTS `count`;
CREATE TABLE `count` (
  `id` int(11) NOT NULL auto_increment,
  `loveNum` bigint(20) default NULL,
  `downloadNum` bigint(20) default NULL,
  `fileId` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of count
-- ----------------------------
INSERT INTO `count` VALUES ('5', '10', '10', '5');
INSERT INTO `count` VALUES ('6', '68', '44', '6');
INSERT INTO `count` VALUES ('7', '12', '10', '7');
INSERT INTO `count` VALUES ('8', '18', '32', '8');
INSERT INTO `count` VALUES ('9', '10', '10', '9');
INSERT INTO `count` VALUES ('10', '30', '24', '10');

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
-- Table structure for `freeuser`
-- ----------------------------
DROP TABLE IF EXISTS `freeuser`;
CREATE TABLE `freeuser` (
  `id` int(11) NOT NULL auto_increment,
  `imei` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of freeuser
-- ----------------------------
INSERT INTO `freeuser` VALUES ('74', '863564021102356');
INSERT INTO `freeuser` VALUES ('75', '358180058677327');
INSERT INTO `freeuser` VALUES ('76', '863564020657228');
INSERT INTO `freeuser` VALUES ('77', '863564020583374');
INSERT INTO `freeuser` VALUES ('78', '863564020217338');
INSERT INTO `freeuser` VALUES ('79', '863564020330008');
INSERT INTO `freeuser` VALUES ('80', '863564021185302');
INSERT INTO `freeuser` VALUES ('81', '863564021185302');
INSERT INTO `freeuser` VALUES ('82', '863564020013661');
INSERT INTO `freeuser` VALUES ('83', '863564020528163');
INSERT INTO `freeuser` VALUES ('84', '863564020693108');
INSERT INTO `freeuser` VALUES ('85', '863564020187747');
INSERT INTO `freeuser` VALUES ('86', '863564021234456');
INSERT INTO `freeuser` VALUES ('87', '863564020247517');
INSERT INTO `freeuser` VALUES ('88', '863564020176427');
INSERT INTO `freeuser` VALUES ('89', '863564021231361');
INSERT INTO `freeuser` VALUES ('90', '863564020671823');
INSERT INTO `freeuser` VALUES ('91', '863564021223590');
INSERT INTO `freeuser` VALUES ('92', '863564020331394');
INSERT INTO `freeuser` VALUES ('93', '863564021188991');
INSERT INTO `freeuser` VALUES ('94', '863564021231890');
INSERT INTO `freeuser` VALUES ('95', '863564020726940');
INSERT INTO `freeuser` VALUES ('96', '863564021251773');
INSERT INTO `freeuser` VALUES ('97', '863564021231429');
INSERT INTO `freeuser` VALUES ('98', '863564020294733');
INSERT INTO `freeuser` VALUES ('99', '863564021231890');
INSERT INTO `freeuser` VALUES ('100', '863564020735313');
INSERT INTO `freeuser` VALUES ('101', '863564021024451');
INSERT INTO `freeuser` VALUES ('102', '863564020629078');
INSERT INTO `freeuser` VALUES ('103', '863564021193629');
INSERT INTO `freeuser` VALUES ('104', '863564021261848');
INSERT INTO `freeuser` VALUES ('105', '863564021065025');
INSERT INTO `freeuser` VALUES ('106', '863564020568532');
INSERT INTO `freeuser` VALUES ('107', '863564020238607');
INSERT INTO `freeuser` VALUES ('108', '863564021177408');
INSERT INTO `freeuser` VALUES ('109', '863564020629078');
INSERT INTO `freeuser` VALUES ('110', '863564021213393');
INSERT INTO `freeuser` VALUES ('111', '863564020803889');
INSERT INTO `freeuser` VALUES ('112', '863564020803889');
INSERT INTO `freeuser` VALUES ('113', '863564021599411');
INSERT INTO `freeuser` VALUES ('114', '863564021599411');
INSERT INTO `freeuser` VALUES ('115', '863564020140241');
INSERT INTO `freeuser` VALUES ('116', '863564020337870');
INSERT INTO `freeuser` VALUES ('117', '863564020649134');
INSERT INTO `freeuser` VALUES ('118', '863564020587599');
INSERT INTO `freeuser` VALUES ('119', '863564020468774');
INSERT INTO `freeuser` VALUES ('120', '863564021240776');
INSERT INTO `freeuser` VALUES ('121', '863564020758208');
INSERT INTO `freeuser` VALUES ('122', '863564020171949');
INSERT INTO `freeuser` VALUES ('123', '863564020849379');
INSERT INTO `freeuser` VALUES ('124', '863564021077186');
INSERT INTO `freeuser` VALUES ('125', '863564020136249');
INSERT INTO `freeuser` VALUES ('126', '863564020630365');
INSERT INTO `freeuser` VALUES ('127', '863564021244760');
INSERT INTO `freeuser` VALUES ('128', '863564021294609');
INSERT INTO `freeuser` VALUES ('129', '863564021110136');
INSERT INTO `freeuser` VALUES ('130', '863564020589876');
INSERT INTO `freeuser` VALUES ('131', '863564021185245');
INSERT INTO `freeuser` VALUES ('132', '863564020590262');
INSERT INTO `freeuser` VALUES ('133', '863564021296455');
INSERT INTO `freeuser` VALUES ('134', '863564020354313');
INSERT INTO `freeuser` VALUES ('135', '863564021101440');
INSERT INTO `freeuser` VALUES ('136', '863564021254306');
INSERT INTO `freeuser` VALUES ('137', '863564020425311');
INSERT INTO `freeuser` VALUES ('138', '863564021560371');
INSERT INTO `freeuser` VALUES ('139', '863564021184495');
INSERT INTO `freeuser` VALUES ('140', '863564020496585');
INSERT INTO `freeuser` VALUES ('141', '863564021025938');
INSERT INTO `freeuser` VALUES ('142', '863564020279551');
INSERT INTO `freeuser` VALUES ('143', '863564020458981');
INSERT INTO `freeuser` VALUES ('144', '863564021187977');
INSERT INTO `freeuser` VALUES ('145', '863564020523990');

-- ----------------------------
-- Table structure for `group`
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `id` int(11) NOT NULL auto_increment,
  `groupName` varchar(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group` VALUES ('3', 'd9d42db3');
INSERT INTO `group` VALUES ('4', 'b02ce2db');
INSERT INTO `group` VALUES ('5', '5198fb16');

-- ----------------------------
-- Table structure for `nfile`
-- ----------------------------
DROP TABLE IF EXISTS `nfile`;
CREATE TABLE `nfile` (
  `id` int(11) NOT NULL auto_increment,
  `groupId` int(11) default NULL,
  `name` varchar(255) default NULL,
  `size` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  `downloadUrl` varchar(255) default NULL,
  `relativeUrl` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nfile
-- ----------------------------
INSERT INTO `nfile` VALUES ('5', '3', 'fangzhengmiaowu.apk', '4', 'application/octet-stream', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\fangzhengmiaowu.apk', '\\upload\\fangzhengmiaowu.apk');
INSERT INTO `nfile` VALUES ('6', '3', 'fangzhengmiaowu_p.jpg', '0', 'image/jpeg', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\fangzhengmiaowu_p.jpg', '\\upload\\fangzhengmiaowu_p.jpg');
INSERT INTO `nfile` VALUES ('7', '4', 'fangzhengshaoer.apk', '6', 'application/octet-stream', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\fangzhengshaoer.apk', '\\upload\\fangzhengshaoer.apk');
INSERT INTO `nfile` VALUES ('8', '4', 'fangzhengshaoer_p.jpg', '0', 'image/jpeg', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\fangzhengshaoer_p.jpg', '\\upload\\fangzhengshaoer_p.jpg');
INSERT INTO `nfile` VALUES ('9', '5', 'huakangshaonv.apk', '2', 'application/octet-stream', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\huakangshaonv.apk', '\\upload\\huakangshaonv.apk');
INSERT INTO `nfile` VALUES ('10', '5', 'huakangshaonv_p.png', '0', 'image/png', 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\huakangshaonv_p.png', '\\upload\\huakangshaonv_p.png');
