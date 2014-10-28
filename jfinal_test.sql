/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : jfinal_test

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2014-10-28 20:49:15
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of count
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deviceinfo
-- ----------------------------
INSERT INTO `deviceinfo` VALUES ('74', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('75', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 07:54:48', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('76', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 19:55:49', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('77', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 19:57:32', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('78', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 19:58:56', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('79', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 20:00:10', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('80', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 20:04:49', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('81', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 20:06:18', '4.2.2', null, '0', '', '', '1');
INSERT INTO `deviceinfo` VALUES ('82', '863564020008489', '8c:77:16:93:55:99', null, 'Meitu2', 'Meitu', 'Meitu', 'Meitu2', '17', 'Meitu2', 'MK260_05_V01.0_141010', 'meitu-mobile-server', 'MeituM2', '2014-10-13 20:06:41', '4.2.2', null, '0', '', '', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------
INSERT INTO `fileinfo` VALUES ('7', 'baofengti.apk', '9b119d42-30e6-435b-9ed8-0fe76ce2734a', 'baofengti.png', 'http://192.168.43.189/upload/', 'baofengti_preview.png', 'http://192.168.43.189/upload/', '9', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);
INSERT INTO `fileinfo` VALUES ('8', 'fangzhengxiaozhuanti.apk', 'dabb6e2e-530c-48d9-a0de-bcfb2e34a9ae', 'fangzhengxiaozhuanti.png', 'http://192.168.43.189/upload/', 'fangzhengxiaozhuanti_preview.png', 'http://192.168.43.189/upload/', '3', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);
INSERT INTO `fileinfo` VALUES ('9', 'maimengzuosi.apk', 'c468ebfe-8c76-4517-aa61-6926fda02f73', 'maimengzuosi.png', 'http://192.168.43.189/upload/', 'maimengzuosi_preview.png', 'http://192.168.43.189/upload/', '6', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);
INSERT INTO `fileinfo` VALUES ('10', 'hudiejiekitty.apk', 'eac518de-0f84-49cb-ad9b-5bd725f219e4', 'hudiejiekitty.png', 'http://192.168.43.189/upload/', 'hudiejiekitty_preview.png', 'http://192.168.43.189/upload/', '9', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);
INSERT INTO `fileinfo` VALUES ('11', 'huakangshaonv.apk', '1c49ce56-9497-483e-a4d3-371057c451a1', 'huakangshaonv.png', 'http://192.168.43.189/upload/', 'huakangshaonv_preview.png', 'http://192.168.43.189/upload/', '2', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);
INSERT INTO `fileinfo` VALUES ('12', 'dingdingti.apk', '33c1b060-078e-4465-843a-6f5fdb895ad1', 'dingdingti.png', 'http://192.168.43.189/upload/', 'dingdingti_preview.png', 'http://192.168.43.189/upload/', '14', 'http://192.168.43.189/upload/', null, 'O:\\workspace\\jfinal-sgfont\\WebRoot\\upload\\', null, null, null, null);

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------

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
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nfile
-- ----------------------------
